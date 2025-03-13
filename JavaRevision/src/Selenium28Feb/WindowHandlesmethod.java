package Selenium28Feb;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesmethod {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		WebElement window=driver.findElement(By.xpath("//button[@id='PopUp']"));
		window.click();
		String parentWindow=driver.getWindowHandle(); //Returns the current parent windowid
		System.out.println(parentWindow);
		System.out.println(driver.getTitle());
		Set<String> windows=driver.getWindowHandles();
		System.out.println("Total number of browsers opened: " + windows.size());
		for(String win:windows) {
			System.out.println(win);
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			
		}
		ArrayList<String> list=new ArrayList<>(windows);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		driver.quit();
		
		
		
	}
}
