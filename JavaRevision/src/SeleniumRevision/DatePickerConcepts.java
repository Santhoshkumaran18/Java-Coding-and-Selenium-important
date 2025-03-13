package SeleniumRevision;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerConcepts {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions a=new Actions(driver);
		WebElement slider=driver.findElement(By.xpath("//div[@id='slider-range']"));
		System.out.println(slider.getLocation());
		
		a.dragAndDropBy(slider, 100,0).build().perform();
		a.contextClick().build().perform();
		a.doubleClick().perform();
		
		
		/*
		 * WebElement datepic=driver.findElement(By.xpath("//input[@id='datepicker']"));
		 * datepic.click(); Thread.sleep(3000);
		 * 
		 * 
		 * String month="July"; String date="26"; String year="2026";
		 * 
		 * 
		 * 
		 * while(true) { WebElement
		 * datecl=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		 * String Monthandyear=datecl.getText(); System.out.println(Monthandyear);
		 * String[] monthsplityear=Monthandyear.split(" ");
		 * System.out.println(Arrays.toString(monthsplityear)); String
		 * actualMonth=monthsplityear[0]; String actualYear=monthsplityear[1];
		 * if(month.equalsIgnoreCase(actualMonth) && year.equalsIgnoreCase(actualYear))
		 * break; else driver.findElement(By.xpath("//span[text()='Next']")).click(); }
		 * 
		 * List<WebElement> list=driver.findElements(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']/tbody/tr/td")); for(WebElement
		 * li:list) { if(li.getText().equalsIgnoreCase(date)){
		 * System.out.println(li.getText()); li.click(); break; } }
		 */
		}
	
		
		
	}

