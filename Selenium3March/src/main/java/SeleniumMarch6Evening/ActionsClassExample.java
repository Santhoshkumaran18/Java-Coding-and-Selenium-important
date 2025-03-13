package SeleniumMarch6Evening;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		Actions a = new Actions(driver);
		/*
		 * WebElement
		 * computer=driver.findElement(By.xpath("(//a[text()='Computers '])[1]"));
		 * WebElement
		 * desktop=driver.findElement(By.xpath("(//a[contains(text(),'Notebooks')])[1]")
		 * );
		 * a.moveToElement(computer).moveToElement(desktop).click().build().perform();
		 */

		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));

		a.contextClick(rightclick).build().perform();
		List<WebElement> elements = driver
				.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li"));
		System.out.println(elements.size());
		for (WebElement li : elements) {
			if (li.getText().equals("Edit")) {
				li.click();
				break;
			}
		}
		driver.switchTo().alert().accept();

		/*
		 * driver.navigate().to("https://testautomationpractice.blogspot.com/");
		 * WebElement fied1=driver.findElement(By.xpath("//input[@id='field1']"));
		 * fied1.clear(); fied1.sendKeys("Santhosh is part of the project"); WebElement
		 * copytext=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']")
		 * ); a.doubleClick(copytext).build().perform(); WebElement
		 * field2=driver.findElement(By.xpath("//input[@id='field2']"));
		 * Thread.sleep(5000); String expected=field2.getAttribute("value");
		 * Assert.assertEquals(expected,"Santhosh is part of the project");
		 */

		/*
		 * driver.navigate().to("https://testautomationpractice.blogspot.com/");
		 * WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
		 * WebElement droppable=driver.findElement(By.xpath("//div[@id='droppable']"));
		 * a.dragAndDrop(draggable, droppable).build().perform(); Thread.sleep(5000);
		 * WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		 * WebElement
		 * text=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//div[@id='droppable']/p"))); String droppedText=text.getText();
		 * Assert.assertEquals(droppedText, "Dropped!"); driver.quit();
		 */

		/*
		 * driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		 * WebElement frame=driver.findElement(By.xpath("(//iframe[@width='700'])[1]"));
		 * driver.switchTo().frame(frame); Thread.sleep(6000); List<WebElement>
		 * li=driver.findElements(By.xpath("//li[contains(@class,'ui-widget-content')]")
		 * );
		 * 
		 * System.out.println(li.size()); for(WebElement l:li) { WebElement
		 * droppable=driver.findElement(By.xpath("//div[@id='trash']"));
		 * a.dragAndDrop(l, droppable).build().perform(); Thread.sleep(3000); }
		 */

	}
}
