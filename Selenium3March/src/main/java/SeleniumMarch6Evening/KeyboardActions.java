package SeleniumMarch6Evening;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebElement slider=driver.findElement(By.xpath("//div[@id='slider-range']"));
		WebElement sliderrange=driver.findElement(By.xpath("//div[contains(@class,'ui-slider-range')]"));
		System.out.println("Full slider:" + slider.getLocation());
		System.out.println("Slider range: " + sliderrange.getLocation());
		Actions a=new Actions(driver);
		a.dragAndDropBy(slider, 822,1974).build().perform();
		
		System.out.println(slider.getSize());
	}
}
