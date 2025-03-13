package SeleniumRevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalStatements {
	@Test
	public void conditionalStatement() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement phone=driver.findElement(By.xpath("//label[text()='Phone:']"));
		System.out.println(phone.isDisplayed());
		
		WebElement MaleCheckBox=driver.findElement(By.xpath("//label[text()='Male']"));
		MaleCheckBox.click();
		Thread.sleep(5000);
		System.out.println(MaleCheckBox.isEnabled());
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='sunday']"));
		checkbox.click();
		Thread.sleep(5000);
		
		System.out.println(checkbox.isSelected());
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}
}
