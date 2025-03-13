package Selenium3March.Selenium3March;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadanddownload {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement fileUpload=driver.findElement(By.xpath("//input[@type='file']"));
		String file ="C:\\Users\\S Santhosh Kumaran\\HR Discussion Round Documents\\Resume\\Santhosh_Kumaran_S_Automation_QA_Test_Engineer_4years.pdf";
		fileUpload.sendKeys(file);
		
		
		
		
	}
}
