package com.seleniom.sample.chrome;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;
	
import org.openqa.selenium.Keys;

public class ChromeFromSubmittion {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\SwathiMura_Work\\Drivers\\chromedriver.exe");
		// Below two lines are added to resolve Web Socket error.
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");

		//WebDriver driver = new ChromeDriver(options);
		// driver.get("http://www.google.com/");
		
		 System.setProperty("webdriver.ie.driver", "C:\\SwathiMura_Work\\Drivers\\IEDriverServer.exe");  
         
	      // Instantiate a IEDriver class.     
	 WebDriver driver=new InternetExplorerDriver();  
	 //driver.get("http://www.google.com/");

		// Launch website
	 driver.get(" https://mail.rediff.com/cgi-bin/login.cgi   ");

		driver.findElement(By.linkText("Create a new account")).click();

		driver.findElement(By.xpath(" //tbody/tr[3]/td[3]/input[1]")).sendKeys("Tom");

		driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]")).sendKeys("Tom.cruise");

		driver.findElement(By.xpath(" //tbody/tr[7]/td[3]/input[2]")).click();

		// Click on the search text box and send value
		driver.findElement(By.id("APjFqb")).sendKeys("javatpoint tutorials");
		driver.close();

		// Click on the search button
		// driver.findElement(By.name("btnK")).click(); -- Not working since its a
		// button.
		driver.findElement(By.name("btnK")).submit(); // for submit actions... you have to use Submit instead of click..
														// Click is used for Menu Items..

	}
}
