package Selenium3March.Selenium3March;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.navigate().refresh();
		Thread.sleep(1000);
		WebElement male=driver.findElement(By.xpath("//label[text()='Male']"));
		WebElement female=driver.findElement(By.xpath("//label[text()='Female']"));
		male.click();
		Thread.sleep(2000);
		female.click();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
