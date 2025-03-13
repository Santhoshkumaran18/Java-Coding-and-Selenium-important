package SeleniumRevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SvgElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement searchbox=driver.findElement(By.xpath("//*[local-name()='svg' and @width='24' and @height='24']"));
		WebElement textbox=driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Iphone");
		Thread.sleep(5000);
		searchbox.click();
		
		
		
		
	}
}
