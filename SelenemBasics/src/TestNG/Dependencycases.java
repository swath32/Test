package TestNG;

import org.testng.annotations.Test;

public class Dependencycases {

	@Test
	public void Logintest() {
   System.out.println("login test");
	


	}

	@Test(dependsOnMethods = "Logintest")

	public void Homepagetest() {
      System.out.println("home page test");

	}

}
