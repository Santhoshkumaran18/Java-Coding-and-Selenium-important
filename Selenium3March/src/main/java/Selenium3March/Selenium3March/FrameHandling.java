package Selenium3March.Selenium3March;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/iframe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		WebElement iframeyoutube = driver.findElement(By.xpath("//iframe[@id='iframe-youtube']"));

		driver.switchTo().frame(iframeyoutube);

		WebElement elem = driver.findElement(By.xpath("//a[text()='Cypress in a Nutshell - 2019']"));
		elem.click();

	}
}
