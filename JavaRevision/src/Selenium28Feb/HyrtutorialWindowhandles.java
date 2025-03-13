package Selenium28Feb;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyrtutorialWindowhandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement nw=driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
//		nw.click();
		Thread.sleep(3000);
		WebElement nt=driver.findElement(By.xpath("//button[@id='newTabBtn']"));
		nt.click();
		String parentWindow=driver.getWindowHandle();
		System.out.println("Id of the parentwindow" + parentWindow);
		Set<String> windows=driver.getWindowHandles();
		for(String w:windows) {
			if(!w.equals(parentWindow)) {
				driver.switchTo().window(w);
				System.out.println(driver.getTitle() + driver.getCurrentUrl());
				break;
			}
		}
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle() + driver.getCurrentUrl());
		driver.close();
		
		
		
	}
}
