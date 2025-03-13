package SeleniumMarch6Evening;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderRange {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Slider.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement slider=driver.findElement(By.xpath("//div[@id='slider']"));
		WebElement sliderx=driver.findElement(By.xpath("//a[contains(@class,'ui-slider-handle')]"));
		System.out.println(slider.getLocation());
		System.out.println(sliderx.getLocation());
		Actions a=new Actions(driver);
		a.dragAndDropBy(sliderx, 300, 0).build().perform();
		
	}
}
