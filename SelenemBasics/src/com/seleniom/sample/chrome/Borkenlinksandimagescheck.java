package com.seleniom.sample.chrome;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Borkenlinksandimagescheck {
	public static void main(String[] args) throws Exception, IOException{
		// TODO Auto-generated method stub
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "C:\\SwathiMura_Work\\Drivers\\chromedriver.exe");
		// Below two lines are added to resolve Web Socket error.
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		// driver.get("http://www.google.com/");

		driver.get("https://advantageonlineshopping.com//");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		System.out.println("size of full links and images ---> " + linksList.size());

		linksList.addAll(driver.findElements(By.tagName("imag")));

		List<WebElement> Activelinks = new ArrayList<WebElement>();

		for (int i = 0; i < linksList.size(); i++) {
			System.out.println(linksList.get(i).getAttribute("href"));

			if (linksList.get(i).getAttribute("href") != null   &&  linksList.get(i).getAttribute("href").contains("javascript")) {

				Activelinks.add(linksList.get(i));
			}
		}
		System.out.println("size of active links and images ---> " + Activelinks.size());

		for (int j = 0; j < Activelinks.size(); j++) {

			HttpURLConnection Connection = (HttpURLConnection) new URL(Activelinks.get(j).getAttribute("href"))
					.openConnection();
			Connection.connect();
			String response = Connection.getResponseMessage();
			Connection.disconnect();
			System.out.println(Activelinks.get(j).getAttribute("href") + "---> " + response);
		}
	}
}
