package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertion {

	WebDriver driver;

	@Test
	public void assertionFailure() {

		SoftAssert softAssertion = new SoftAssert();
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
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");

		String actualTitle = "rediffmail";

		String expectedTitle = driver.getTitle();
		String expectedText1 = driver.findElement(By.xpath("//span[contains(text(),'mail')]")).getText();

		/* Soft Assert */
		System.out.println("Verify Title");
		softAssertion.assertEquals(expectedTitle, actualTitle, "Incorrect page title");

		System.out.println("Verify Text");
		softAssertion.assertEquals("Don't have a Rediffmail ID?", expectedText1);

		driver.quit();
	}

	@Test
	public void print() {
		System.out.println("Soft Assertion is displayed");
	}
	

@AfterMethod
public void cleanUp() {
	driver.quit();
}

}