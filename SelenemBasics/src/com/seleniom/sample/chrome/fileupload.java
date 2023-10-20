package com.seleniom.sample.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fileupload {

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
		driver.navigate().to("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Swathi\\Desktop\\Ridhi_Photos\\sample html file download.html");
		
		
		// check box slection
		
	}

	private static void sendkeys(String string) {
		// TODO Auto-generated method stub
		
	}}

