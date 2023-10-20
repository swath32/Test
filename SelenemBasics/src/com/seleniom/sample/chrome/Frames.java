package com.seleniom.sample.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {

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
				driver.navigate().to("https://demoqa.com/frames");
				driver.switchTo().frame(0);
				
				 WebElement	frame1Heading   =   driver.findElement(By.id("sampleHeading"));
                
                //Finding the text of the frame1 heading
                String frame1Text=frame1Heading.getText();
                Thread.sleep(5000);
                //Print the heading
                System.out.println("Text of the frame "+frame1Text);
                
                //closing the driver
                driver.close();
		
		

	}

}
