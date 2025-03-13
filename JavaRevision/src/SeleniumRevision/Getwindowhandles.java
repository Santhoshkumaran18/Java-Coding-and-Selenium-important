package SeleniumRevision;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getwindowhandles {
	
	@Test
	void windowhandlewin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("PopUp")));
		
		WebElement popup=driver.findElement(By.id("PopUp"));
		popup.click();
		String ParentWindow=driver.getWindowHandle();
		System.out.println(ParentWindow);//it will generate the window id
		Thread.sleep(5000);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		for(String win:windows) {
			if(!win.equals(parentwindow)) {
				System.out.println(driver.switchTo().window(win).getTitle());
			}
		}
		
		String title=driver.switchTo().window(childwindow).getTitle();
		System.out.println("Title of the page is : " + title);
	}
}
