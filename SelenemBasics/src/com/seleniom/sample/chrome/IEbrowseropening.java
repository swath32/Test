package com.seleniom.sample.chrome;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class IEbrowseropening {
	
    public static void main(String[] args) {  
	
	
	System.setProperty("webdriver.ie.driver", "C:\\SwathiMura_Work\\Drivers\\IEDriverServer.exe"); 

	//Creating an object of InternetExplorerDriver
	  WebDriver driver=new InternetExplorerDriver();  



	//Deleting all the cookies
	driver.manage().deleteAllCookies();

	//Specifiying pageLoadTimeout and Implicit wait
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//launching the specified URL
	driver.get("https://www.google.com/");

}}

