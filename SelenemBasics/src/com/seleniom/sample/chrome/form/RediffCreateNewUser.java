package com.seleniom.sample.chrome.form;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class RediffCreateNewUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "C:\\SwathiMura_Work\\Drivers\\chromedriver.exe");
		// Below two lines are added to resolve Web Socket error.
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		// driver.get("http://www.google.com/");

		// Launch website
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.linkText("Create a new account")).click();

		driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]")).sendKeys("Tom");

		driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]")).sendKeys("Tom.cruise");

		driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[2]")).click();

		// Table
		int Row_count = driver
				.findElements(By.xpath(
						"//body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[8]/td[3]/div[1]/table[1]/tbody[1]/tr"))
				.size();
		System.out.println("Number Of Rows = " + Row_count);
		int Col_count = driver.findElements(By.xpath(
				"//body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[8]/td[3]/div[1]/table[1]/tbody[1]/tr[1]/td"))
				.size();
		System.out.println("Number Of Columns = " + Col_count);

		// divided xpath In three parts to pass Row_count and Col_count values.
		String first_part = "//body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[8]/td[3]/div[1]/table[1]/tbody[1]/tr[";
		String second_part = "]/td[";
		String third_part = "]";

		Boolean selectedUserNameOption = false;
		// Used for loop for number of rows.
		for (int i = 1; i <= Row_count; i++) {
			// Used for loop for number of columns.
			if (!selectedUserNameOption) {
				for (int j = 1; j <= Col_count; j++) {
					// Prepared final xpath of specific cell as per values of i and j.
					String final_xpath = first_part + i + second_part + j + third_part;
					// Will retrieve value from located cell and print It.
					String Table_data = driver.findElement(By.xpath(final_xpath)).getText();
					System.out.print(Table_data + "  ");
					if (i == 1 && j == 1) {
						System.out.print(Table_data + "Now Clicking");
						driver.findElement(By.xpath(final_xpath)).click();
						selectedUserNameOption = true;
						break;
					}
				}
			} else {
				break;
			}
			System.out.println("");

		}

		driver.findElement(By.id("newpasswd")).sendKeys("sandhya");
		driver.findElement(By.id("newpasswd1")).sendKeys("sandhya");
		driver.findElement(By.xpath(" //tbody/tr[1]/td[3]/input[1]")).sendKeys("tom.cru@gmail.com");
		// check box selection

		driver.findElement(By.xpath(
				"//body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[15]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]"))
				.click();

		// Select code= new Select(driver.findElement(By.xpath(
		// "//tbody/tr[1]/td[3]/div[2")));

		// code.selectByVisibleText("USA/Canada ");//

		Select que = new Select(driver.findElement(By.xpath("//tbody/tr[2]/td[3]/select[1]")));

		que.selectByIndex(2);

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
		List<WebElement> dobDateoptionsList = dobDateList.getOptions();
		for (WebElement option : dobDateoptionsList) {
			System.out.println("DOB Select Option :" + option.getText());
		}
		dobDateList.selectByVisibleText("02");

		WebElement dobMonthDropdown = driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[2]"));
		Select dobMonthList = new Select(dobMonthDropdown);
		List<WebElement> dobMonthoptionsList = dobMonthList.getOptions();
		for (WebElement option : dobMonthoptionsList) {
			System.out.println("DOB Select Option :" + option.getText());
		}
		dobMonthList.selectByVisibleText("FEB");

		WebElement dobYearDropdown = driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[3]"));
		Select dobYearList = new Select(dobYearDropdown);
		List<WebElement> dobYearoptionsList = dobDateList.getOptions();
		for (WebElement option : dobYearoptionsList) {
			System.out.println("DOB Select Option :" + option.getText());
		}
		dobYearList.selectByVisibleText("2016");

		driver.findElement(By.xpath("//tbody/tr[24]/td[3]/input[2]")).click();
		
		WebElement contryDropdown = driver.findElement(By.xpath("//select[@id='country']"));
		Select contryList = new Select(contryDropdown);
		contryList.selectByVisibleText("Aruba");
		
		driver.findElement(By.xpath("//tbody/tr[32]/td[3]/input[1]")).sendKeys("captha");
		
		//driver.findElement(By.xpath("//input[@id='Register']")).click();
		
	}

}
