package Selenium28Feb;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitConditions {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://www.saucedemo.com/v1/");
		WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File(System.getProperty("users.dir") + "//testoutpus/test.png");
		FileUtils.copyFile(src,destination);
		Waitforimpl(driver, 10);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id")));
		
	
			
		}
		
		
	
	
	public static Timeouts Waitforimpl(WebDriver driver,int s) {
			return driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}
	
	public static void waitforExpl(WebDriver driver,WebDriverWait wait) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
}
