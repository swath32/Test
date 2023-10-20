package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;  

public class Testngbasics {

@BeforeSuite

public void Setup() {
	System.out.println("System property for chrome");
}



@BeforeClass

public void launchBrowser() {
	System.out.println("Luacnh the browser");
}

@BeforeTest

public void Login() {
	System.out.println("login to app");
}


@BeforeMethod

public void enterURL() {
	System.out.println("enter the URL");}
	
	@Test
	

public void googletitletest() {
	System.out.println("google title test");
}
@AfterMethod
	
	public void Logout() {
		System.out.println("logout from  app");
	}


@AfterTest

public void deleteAllcookies() {
	System.out.println("delete the coockies");
	
}

@AfterClass
public void closebrowser() {
	System.out.println("close browser");
}

@AfterSuite
public void generateTestreport() {
	System.out.println("generate report");
}}



