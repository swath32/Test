package com.seleniom.sample.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.NoAlertPresentException;	
import org.openqa.selenium.Alert;

public class popuphandle {

	public static void main(String[] args) throws InterruptedException {
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
				// check box slection
				
				driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/div[1]/input[2]\r\n"
						+ "")).click();
				
               Thread.sleep(5000);

				  Alert alert = driver.switchTo().alert();		
	        		
			        // Capturing alert message.    
			        String alertMessage= driver.switchTo().alert().getText();		
			        		
			        // Displaying alert message		
			        System.out.println(alertMessage);
			        
	}}
			        
			        //if(alertMessage.equals("please enter a valid user name"));
			       // {
			       // System.out.println("correctmessage"); }

			       // else{
			       // 	 System.out.println("not a correctmessage");



