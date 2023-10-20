package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priorityexecution {

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
		driver.get(" https://www.google.com/");
	}

	@Test(priority = 1)
	public void GoogleTitleTest() {
		String a = driver.getTitle();
		System.out.println(a);
	}

	@Test(priority = 2)
	public void Logocheck() {

		Boolean b = driver.findElement(By.xpath("  //body/div[1]/div[2]/div[1]/img[1]")).isDisplayed();
		System.out.println("logo is present");
	}

	@Test(priority = 3)
	public void Gmaillinktest() {

		Boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println("link is displayed");
	}

	@Test(priority = 4)
	public void test4() {

		System.out.println("test4");
	}

	@AfterMethod
	public void cleanUp() {
		driver.quit();
	}

}
