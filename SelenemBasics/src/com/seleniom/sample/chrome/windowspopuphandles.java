package com.seleniom.sample.chrome;


	import java.util.Iterator;		
	import java.util.Set;		
	import org.openqa.selenium.By;		
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;		

	public class windowspopuphandles {
			

	    public static void main(String[] args) throws InterruptedException {									
	    	System.setProperty("webdriver.chrome.driver", "C:\\SwathiMura_Work\\Drivers\\chromedriver.exe");
			// Below two lines are added to resolve Web Socket error.
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			WebDriver driver = new ChromeDriver(options);
	        //Launching the site.				
	            driver.get("https://demo.guru99.com/popup.php");			
	        driver.manage().window().maximize();		
	                		
	driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
	        		
	        //String MainWindow=driver.getWindowHandle();		
	        		
	        // To handle all new opened window.				
	        // store all window handle
	Thread.sleep(2000);
	        
	        Set<String> a = driver.getWindowHandles();
	        // iterate through handles
	        Iterator<String> it = a.iterator();
	        String chlwnd = it.next();
	        String pwnd = it.next();
	        // switch to child window
	        
	        driver.switchTo().window(chlwnd);
	        System.out.println("Page title "+ driver.getTitle());
	        // switch to parent window
	        
	    	Thread.sleep(2000);
	        
	        driver.switchTo().window(pwnd);
	        System.out.println("Page title "+ driver.getTitle());
	        
	    	Thread.sleep(2000);
	        driver.close();
	    }}