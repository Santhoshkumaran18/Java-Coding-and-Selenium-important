package Selenium5March;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTableExercise {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.blazedemo.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		WebElement company=driver.findElement(By.xpath("//input[@id='company']"));
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement passwordocnfirm=driver.findElement(By.xpath("//input[@id='password-confirm']"));
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		
		name.sendKeys("Santhosh Kumaran ");
		company.sendKeys("company");
		email.sendKeys("santhosh@gmail.com");
		password.sendKeys("12345678");
		passwordocnfirm.sendKeys("12345678");
		
		submit.click();
		
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//a[text()='Login']"));
		WebElement email1=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password1=driver.findElement(By.xpath("//input[@id='password']"));
		email1.sendKeys("santhosh@gmail.com");
		password1.sendKeys("12345678");
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		WebElement submit1=driver.findElement(By.xpath("//button[@type='submit']"));
		submit1.click();
		
		
		
		
	}
}
