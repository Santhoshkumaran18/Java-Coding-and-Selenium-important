package SeleniumRevision;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://automationbookstore.dev/");
		List<WebElement> booksCount=driver.findElements(By.xpath("//ul[@id='productList']/li"));
		System.out.println("Books count in the page is: " + booksCount.size());
		WebElement book5=driver.findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(By.id("pid6")).below(By.id("pid1")));
		System.out.println(book5.getAttribute("id"));
		
		//To Test book2 
		WebElement books2=driver.findElement(RelativeLocator.with(By.tagName("li")).above(By.id("pid6")).toRightOf(By.id("pid1")));
		System.out.println(books2.getAttribute("id"));
	}
}
