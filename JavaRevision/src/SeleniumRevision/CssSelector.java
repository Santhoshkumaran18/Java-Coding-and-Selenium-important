package SeleniumRevision;

import java.time.Duration;
import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		WebElement element=driver.findElement(By.cssSelector("input#name"));
		element.sendKeys("Santhosh Kumaran S");
		List<WebElement> elements=driver.findElements(By.cssSelector(".form-control"));
		System.out.println(elements.size());
		
		System.out.println("Height: " + element.getRect().getDimension().getHeight());
		System.out.println("Width: " + element.getRect().getDimension().getWidth());
		System.out.println("X" + element.getRect().getX());
		System.out.println("Y" + element.getRect().getY());
		System.out.println("Location: " + element.getLocation());
		
		
		
		
		
	}
}
