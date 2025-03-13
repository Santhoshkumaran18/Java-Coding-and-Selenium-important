package selenium12March;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTestingExercise {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Accept All Cookies')]")));
		acceptCookies.click();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String file = "C:\\Users\\S Santhosh Kumaran\\ExerciseFile.xlsx";
		String sheetname = "sheet1";
		WebElement initialDeposit = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		WebElement lengthofcd = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		WebElement InteresetRate = driver.findElement(By.xpath("//input[@id='mat-input-2']"));
		WebElement dropdownselect = driver.findElement(By.xpath("//div[@id='mat-select-value-1']"));

		WebElement submitbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		WebElement expectedvalue = driver
				.findElement(By.xpath("(//span[@class='CIT-calc-result--item CIT-typography--bold'])[4]"));

		int rows = ExcelUtils.getRowCount(file, sheetname);
		System.out.println("Total number of rows in the excel is: " + rows);
		int columns = ExcelUtils.getcellCount(file, sheetname, 1);
		System.out.println("Total number of columsn in the excel is: " + columns);

		for (int r = 1; r <= rows; r++) {
			initialDeposit.clear();
			InteresetRate.clear();
			lengthofcd.clear();
			String idAmount = ExcelUtils.getCellData(file, sheetname, r, 0);
			String interestRate = ExcelUtils.getCellData(file, sheetname, r, 1);
			String Length = ExcelUtils.getCellData(file, sheetname, r, 2);
			String compounding = ExcelUtils.getCellData(file, sheetname, r, 3);
			String total = ExcelUtils.getCellData(file, sheetname, r, 4);

			initialDeposit.sendKeys(idAmount);
			InteresetRate.sendKeys(interestRate);
			lengthofcd.sendKeys(Length);
			dropdownselect.click();
			List<WebElement> dropdownvalues = driver.findElements(By.xpath("//div[@role='listbox']/mat-option"));
			for (WebElement d : dropdownvalues) {
				if (d.getText().equalsIgnoreCase(compounding)) {
					d.click();
					break;
				}
			}
			submitbutton.click();

			if (expectedvalue.getText().equals(total)) {
				ExcelUtils.setCellData(file, sheetname, r, 6, "PASSED");
				ExcelUtils.fillGreenColour(file, sheetname, r, 6);
			} else {
				ExcelUtils.setCellData(file, sheetname, r, 6, "FAILED");
				ExcelUtils.fillRedColour(file, sheetname, r, 6);
			}
			System.out.println("Program executed successfully");

		}
		driver.quit();
	}
}
