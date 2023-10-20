package com.seleniom.sample.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBasicBrowserLaunch {

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
		driver.navigate().to("http://www.google.com/");

		// Click on the search text box and send value
		driver.findElement(By.id("APjFqb")).sendKeys("javatpoint tutorials");

		// Click on the search button
		// driver.findElement(By.name("btnK")).click(); -- Not working since its a
		// button.
		driver.findElement(By.name("btnK")).submit(); // for submit actions... you have to use Submit instead of click..
														// Click is used for Menu Items..

	}
}
