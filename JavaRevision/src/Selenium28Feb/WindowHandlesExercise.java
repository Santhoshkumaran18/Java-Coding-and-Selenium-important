package Selenium28Feb;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesExercise {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.leafground.com/window.xhtml");
		
		WebElement open=driver.findElement(By.xpath("//button[@id='j_idt88:new']"));
		open.click();
		String window=driver.getWindowHandle();
		Set<String> win=driver.getWindowHandles();
		for(String w:win) {
			if(!w.equals(window)) {
				driver.switchTo().window(w);
				System.out.println(driver.getTitle() +driver.getCurrentUrl());
				break;
			}
		}
		driver.close();
		driver.switchTo().window(window);
		Thread.sleep(4000);
		System.out.println(driver.getTitle() + driver.getCurrentUrl());
		
		driver.quit();
		
	}
}
