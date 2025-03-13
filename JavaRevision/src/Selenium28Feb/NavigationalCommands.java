package Selenium28Feb;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommands {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		URL url=new URL("https://testautomationpractice.blogspot.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://the-internet.herokuapp.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to(url);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		
		
		Thread.sleep(5000);
		driver.quit(); //it closes all the browser instance in 
		//which the webdriver has the instance
	}
}
