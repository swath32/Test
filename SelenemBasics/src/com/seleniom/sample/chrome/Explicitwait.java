package com.seleniom.sample.chrome;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "C:\\SwathiMura_Work\\Drivers\\chromedriver.exe");
		// Below two lines are added to resolve Web Socket error.
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
	
		

		// Launch website 

		  driver.manage().window().maximize();
		 // driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS) ;
		  //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		  
		  
			driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi ");
		  
		  
		 driver.findElement(By.linkText("Create a new account"));
		 click();
		  Thread.sleep(10000);
	}

	private static void click() {
		// TODO Auto-generated method stub
		
	}



//
	//private static void clickon(WebDriver driver, WebElement  locator, int timeout) {
		// TODO Auto-generated method stub
		//new  WebDriverWait(driver,timeout).ignoring(StaleElementReferenceExceptional.class).until(ExpectedConditions.elementToBeClickable(locator));
	//	locator.click();
		
		
	}
	


	


