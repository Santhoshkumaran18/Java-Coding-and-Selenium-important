package Selenium28Feb;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConditions {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class);
		
		WebElement element=wait.until(new Function<WebDriver,WebElement>(){
			@Override
			public WebElement apply(WebDriver driver) {
				WebElement element=driver.findElement(By.id(""));
				if(element.isDisplayed()) {
					System.out.println("Element is visible");
				}else {
					System.out.println("Element is not visible");
				}
				return null;
			}
		});
				
	}
}
