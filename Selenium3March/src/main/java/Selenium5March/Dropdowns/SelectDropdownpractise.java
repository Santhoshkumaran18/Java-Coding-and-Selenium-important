package Selenium5March.Dropdowns;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownpractise {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement staticDropdown=driver.findElement(By.xpath("//select[@id='country']"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(5);
		Thread.sleep(2000);
		dropdown.selectByValue("germany");
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Brazil");
		
		List<WebElement> dropdownvalues=dropdown.getOptions();
		System.out.println("Total number of dropdown values: " + dropdownvalues.size());
		String values;
		String[] v=new String[dropdownvalues.size()];
		for(int i=0;i<dropdownvalues.size();i++) {
			values=dropdownvalues.get(i).getText();
			v[i]=String.valueOf(values);
			
		}
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));
		
		driver.quit();
		
		
		
		
	}
}
