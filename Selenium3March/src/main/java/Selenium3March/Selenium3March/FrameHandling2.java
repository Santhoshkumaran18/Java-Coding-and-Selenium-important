package Selenium3March.Selenium3March;

import java.time.Duration;
import java.util.List;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/iframe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		List<WebElement> totalframe = driver.findElements(By.xpath("//iframe"));
		System.out.println("Total iframe in the page is: " + totalframe.size());
		WebElement frame2=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		for(WebElement l:totalframe) {
			String frameid=l.getAttribute("id");
			System.out.println(l.getAttribute("id"));
			if(frameid.equals("mce_0_ifr")) {
				driver.switchTo().frame(frame2);
				WebElement text=driver.findElement(By.xpath("//body[@id='tinymce']"));
				text.clear();
				text.sendKeys("I am Santhosh Kumaran S");
				Thread.sleep(5000);
				
			}
		}
	}
}
