package SeleniumRevision;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationBlogspotautomation {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("email")).sendKeys("santhoshkumaran@gmail.com");
		driver.findElement(By.id("textarea")).sendKeys("9876543210");
		
		driver.findElement(By.linkText("Home")).click();
		
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
		System.out.println("Total number of links in the google search is: " + list.size());
		List<WebElement> img=driver.findElements(By.tagName("im"));
		System.out.println("Total number of images in the webpage is: " + img.size());
		
		
		
	}
}
