package Selenium28Feb;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandlesExercise2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@class='wikipedia-search-input']"));
		searchBox.sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		Thread.sleep(4000);
		WebElement elementselectio=driver.findElement(By.xpath("//a[text()='Selenium']"));
		elementselectio.click();
		List<WebElement> totalLinks=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
		System.out.println("Total links in the page: " + totalLinks.size());
		String parentwindow=driver.getWindowHandle();
		
		for(WebElement l:totalLinks) {
			l.click();
			Set<String> windows=driver.getWindowHandles();
			for(String w:windows) {
				if(!w.equals(parentwindow)) {
					driver.switchTo().window(w);
					System.out.println("Title:  " + "ID= " + w +  driver.getTitle());
					System.out.println(w);
					driver.close();
				}
				
			}
			driver.switchTo().window(parentwindow);
			
			
		}
		driver.quit();
		
		
		
	}
}
