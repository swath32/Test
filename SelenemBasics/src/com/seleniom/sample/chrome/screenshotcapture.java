package com.seleniom.sample.chrome;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class screenshotcapture {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// declaration and instantiation of objects/variables
		//System.setProperty("webdriver.chrome.driver", "C:\\SwathiMura_Work\\Drivers\\chromedriver.exe");
		// Below two lines are added to resolve Web Socket error.
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//WebDriver driver = new ChromeDriver(options);
		
		

		 
		 System.setProperty("webdriver.ie.driver", "C:\\SwathiMura_Work\\Drivers\\IEDriverServer.exe");  
		           
		      // Instantiate a IEDriver class.     
		 WebDriver driver=new InternetExplorerDriver();  
	
		

		// Launch websit
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		  driver.manage().window().maximize();
		  Thread.sleep(10000);
		  
		  
		  File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshot, new File("C:\\SwathiMura_Work\\eclipse-workspace\\SelenemBasics\\src\\com\\seleniom\\sample\\chromehomePageScreenshot.png"));
		  
		  

}}
