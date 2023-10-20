package com.seleniom.sample.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdownselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaration and instantiation of objects/variables
		//System.setProperty("webdriver.chrome.driver", "C:\\SwathiMura_Work\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\SwathiMura_Work\\Drivers\\ChromeDriver_ForChrome_118\\chromedriver.exe");
		
		// Below two lines are added to resolve Web Socket error.
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		// driver.get("http://www.google.com/");

		// Launch website
		driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");
		// check box slection

		driver.findElement(By.xpath(
				"//body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[15]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]"))
				.click();

// by index

		WebElement categoriesDropDown = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/select[1]"));

		System.out.println("The dropdown options are -");

		Select categories = new Select(categoriesDropDown);

		List<WebElement> optionsList = categories.getOptions();

		for (WebElement option : optionsList) {
			System.out.println("Select Option :" + option.getText());
		}
		categories.selectByVisibleText("What is your exact time of birth?");

		driver.findElement(By.xpath(
				"//body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[16]/td[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/input[1]"))
				.sendKeys("Duttons");
		driver.findElement(By.xpath("//tbody/tr[6]/td[3]/input[1]")).sendKeys("mutti");

		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("123546577");
		
		
		WebElement dobDateDropdown = driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[1]"));
		Select dobDateList = new Select(dobDateDropdown);
//		List<WebElement> dobDateoptionsList = dobDateList.getOptions();
//		for (WebElement option : dobDateoptionsList) {
//			System.out.println("DOB Select Option :" + option.getText());
//		}
		dobDateList.selectByVisibleText("02");
		
		WebElement dobMonthDropdown = driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[2]"));
		Select dobMonthList = new Select(dobMonthDropdown);
//		List<WebElement> dobMonthoptionsList = dobMonthList.getOptions();
//		for (WebElement option : dobDateoptionsList) {
//			System.out.println("DOB Select Option :" + option.getText());
//		}
		dobMonthList.selectByVisibleText("FEB");
		
		WebElement dobYearDropdown = driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[3]"));
		Select dobYearList = new Select(dobYearDropdown);
//		List<WebElement> dobYearoptionsList = dobDateList.getOptions();
//		for (WebElement option : dobDateoptionsList) {
//			System.out.println("DOB Select Option :" + option.getText());
//		}
		dobYearList.selectByVisibleText("2016");

	}

}