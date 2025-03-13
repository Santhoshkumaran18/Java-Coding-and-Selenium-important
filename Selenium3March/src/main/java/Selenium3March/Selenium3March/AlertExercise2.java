package Selenium3March.Selenium3March;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExercise2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement jsconfirm=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		jsconfirm.click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		WebElement result=driver.findElement(By.xpath("//p[@id='result']"));
		System.out.println(result.getText());
		
		driver.quit();
	}
}
