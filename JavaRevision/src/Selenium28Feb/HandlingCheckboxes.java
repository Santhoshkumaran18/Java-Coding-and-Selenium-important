package Selenium28Feb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckboxes {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement sunday=driver.findElement(By.xpath("//input[@id='sunday']"));
		/*
		 * System.out.println("Before selection:" + sunday.isSelected());
		 * sunday.click(); System.out.println("After selection: " +
		 * sunday.isDisplayed());
		 */
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Total number of checkboxes in the page are: " + list.size());
		int checkboxsize=list.size();
		/*
		 * // for(WebElement ch:list) { // ch.click(); // }
		 */		
		for(int i=checkboxsize-4;i<checkboxsize;i++) {
			if(!list.get(i).isSelected()){
				list.get(i).click();
			}
		}
		for(int i=0;i<3;i++) {
			if(!list.get(i).isSelected()) {
				list.get(i).click();
			}
		}
		
		System.out.println("All the checkboxes are selected");
		
		
	}
}
