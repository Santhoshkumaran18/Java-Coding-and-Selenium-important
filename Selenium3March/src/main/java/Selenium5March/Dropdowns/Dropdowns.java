package Selenium5March.Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(5000);
		WebElement pip=driver.findElement(By.xpath("(//span[contains(@class,'oxd-text')])[2]"));
		pip.click();
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]"));
		ele.click();
		
		System.out.println("Dropdown is selected");
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@role='option']"));
		System.out.println(list.size());
		for(WebElement li:list) {
			if(li.getText().equals("Chief Financial Officer")) {
				li.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
