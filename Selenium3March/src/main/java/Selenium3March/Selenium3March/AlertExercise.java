package Selenium3March.Selenium3March;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;



import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExercise {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement jsalert=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		jsalert.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='result']")));
		String successmessage=driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		Assert.assertEquals(successmessage, "You successfully clicked an alert");
		driver.quit();
		
		
		
	}
}
