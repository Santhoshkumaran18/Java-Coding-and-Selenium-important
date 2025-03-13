package SeleniumRevision;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebtableREvision {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> columns=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		
		List<WebElement> totalElements=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td"));
		
		System.out.println("Total rows: " + rows.size());
		System.out.println("Total columns: " + columns.size());
		System.out.println("Total element: " + totalElements.size());
		
		
		for(int r=2;r<=rows.size();r++) {
			for(int c=1;c<=columns.size();c++) {
				WebElement ele=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]"));
				System.out.print(ele.getText() + "|");
			}
			System.out.println();
		}
		
	}
}
