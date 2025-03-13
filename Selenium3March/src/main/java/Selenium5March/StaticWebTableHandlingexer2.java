package Selenium5March;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableHandlingexer2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		List<WebElement> totalrowsincHeaders = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		List<WebElement> colums = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		List<WebElement> totalElements = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td"));

		System.out.println("Total rows: " + totalrowsincHeaders.size());
		System.out.println("Toal columns: " + colums.size());
		System.out.println("Total elements in the table: " + totalElements.size());
		String header = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[1]")).getText();
		System.out.println(header);
		int sum = 0;
		for (int i = 1; i < totalrowsincHeaders.size(); i++) {

			String price = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + (i + 1) + "]/td[4]"))
					.getText();
			
			sum += Integer.parseInt(price);

		}
		System.out.println(sum);

	}
}
