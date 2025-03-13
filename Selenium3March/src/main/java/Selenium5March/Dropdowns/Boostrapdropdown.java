package Selenium5March.Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Boostrapdropdown {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		DriverClasss d=new DriverClasss();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		Thread.sleep(4000);
		List<WebElement> ele=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		System.out.println(ele.size());
		for(WebElement li:ele) {
			System.out.println(li.getText());
			if(li.getText().equals("CSS")) {
				li.click();
			}
		}
		
		Thread.sleep(4000);
			
			
			
	
		
		
	}
}
