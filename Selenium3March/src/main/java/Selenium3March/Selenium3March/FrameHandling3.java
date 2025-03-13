package Selenium3March.Selenium3March;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.cli.Main;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/iframe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		List<WebElement> totalframe = driver.findElements(By.xpath("//iframe"));
		System.out.println("Total iframe in the page is: " + totalframe.size());
		
		WebElement frame2=driver.findElement(By.xpath("//iframe[@id='email-subscribe']"));
		driver.switchTo().frame(frame2);
		Actions a=new Actions(driver);
		a.moveToElement(frame2);
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("santhosh@gmail.com");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement subscribe = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-subscribe")));
	    subscribe.click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='success-message']")));
		
		WebElement successmessage=driver.findElement(By.xpath("//div[@id='success-message']"));
		System.out.println(successmessage.getText());
		
	}
}
