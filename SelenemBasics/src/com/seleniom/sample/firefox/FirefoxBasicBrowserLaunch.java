package com.seleniom.sample.firefox;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import org.openqa.selenium.WebDriver;

public class FirefoxBasicBrowserLaunch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.gecko.driver", "C:\\SwathiMura_Work\\Drivers\\geckodriver.exe");


		File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
		//WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		
		

		//WebDriver driver = new FirefoxDriver();
		// driver.get("http://www.google.com/");

		// Launch website
		//driver.navigate().to("http://www.google.com/");

		// Click on the search text box and send value
		//driver.findElement(By.id("APjFqb")).sendKeys("javatpoint tutorials");

		// Click on the search button
		//driver.findElement(By.name("btnK")).click();

	}

}
