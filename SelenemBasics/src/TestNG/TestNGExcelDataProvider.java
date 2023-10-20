package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.seleniom.sample.excel.ReadExcelUtil;

public class TestNGExcelDataProvider {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		// TODO Auto-generated method stub
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "C:\\SwathiMura_Work\\Drivers\\chromedriver.exe");
		// Below two lines are added to resolve Web Socket error.
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		// driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/");
	}
	
	@DataProvider
	public Object[][] getLoginData() {
		Object[][] data =ReadExcelUtil.getTestDataDifferentMethod("UserLoginDetails");
		return data;
	}

	@Test(dataProvider = "getLoginData")
	public void logintest(String userName, String password) {
		
		driver.findElement(By.xpath("//input[@name= 'username' and @type = 'text']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@name= 'password' and @type = 'password']")).sendKeys(password);
		// login button
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit'}]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
