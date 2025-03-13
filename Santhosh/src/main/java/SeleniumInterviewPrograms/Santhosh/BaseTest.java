package SeleniumInterviewPrograms.Santhosh;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	 static WebDriver driver;
	
	public  WebDriver BaseTest() {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		return driver;
		
	}
	
	@FindBy(id = "id")
	WebElement elementid;
	
	
	@FindBy(xpath = "//tag[@attribute='value']")
	WebElement path;
	
	@FindBy(css = "input[tagName='Value']")
	WebElement maths;
	
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.id(""))).build().perform();
		a.clickAndHold().release().moveToElement(null).build().perform();
		
		String ParentWindow=driver.getWindowHandle();
		
		Set<String> windows=driver.getWindowHandles();
		for(String windowshandles:windows) {
			driver.switchTo().window(ParentWindow);
		}
		
		Iterator<String> it=windows.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public static void WebDriverWaitCondition(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("id")));
	}

	// Fluent Wait
	FluentWait<WebDriver> fluentwait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(4000))
			.pollingEvery(Duration.ofSeconds(4000)).ignoring(Exception.class);

	WebElement element = fluentwait.until(new Function<WebDriver, WebElement>() {

		@Override
		public WebElement apply(WebDriver driver) {
			WebElement el = driver.findElement(By.id("id"));
			if (el.isDisplayed()) {
				System.out.println("It is displayed");
				return el;
			}
			return null;
		}

	});
	
	

		
		
}
