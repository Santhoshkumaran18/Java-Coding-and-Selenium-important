package SeleniumRevision;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenshotsofPage {
//	@Test
	public void screenshot() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destionation=new File(System.getProperty("user.dir") + "/reports/report.png");
		FileUtils.copyFile(src, destionation);
		
	}
	
//	@Test
	public void screenshotofPageinSection() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement section=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//		highlightWebElemnet(section, driver);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=section.getScreenshotAs(OutputType.FILE);
		File destionation=new File(System.getProperty("user.dir") + "/reports/section.png");
		FileUtils.copyFile(src, destionation);
		
		
	}
	
	/*
	 * public void highlightWebElemnet(WebElement element,WebDriver driver) {
	 * JavascriptExecutor js=(JavascriptExecutor)driver;
	 * js.executeScript("arguments[0].style.border='3px solid red'",element); }
	 */
	
	
	@Test
	public void RobotClasss() throws AWTException, IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement alertup=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		alertup.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Robot robot=new Robot();
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screensize);
		BufferedImage source= robot.createScreenCapture(rectangle);
		File destination=new File(System.getProperty("user.dir") + "/reports/alert.png");
		ImageIO.write(source, "png", destination);
		System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
		
		
		
		
	}

}
