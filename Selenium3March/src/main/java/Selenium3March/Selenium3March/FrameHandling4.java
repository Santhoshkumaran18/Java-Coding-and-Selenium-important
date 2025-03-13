package Selenium3March.Selenium3March;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		List<WebElement> totalframe = driver.findElements(By.xpath("//iframe"));
		System.out.println("Total iframe in the page is: " + totalframe.size());
		WebElement close=driver.findElement(By.xpath("//div[@class='tox-icon']/*[local-name()='svg']"));
		close.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement frame = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mce_0_ifr")));
        driver.switchTo().frame(frame);
		driver.switchTo().frame(frame);
		Thread.sleep(4000);
		WebElement content=driver.findElement(By.xpath("//body[@id='tinymce']"));
		content.clear();
		content.sendKeys("Santhosh Kuamran");
	}
}
