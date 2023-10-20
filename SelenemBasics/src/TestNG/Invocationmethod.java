package TestNG;

import org.testng.annotations.Test;

public class Invocationmethod {

	@Test(invocationCount = 3)
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("sum is  == " + c);
	}

}
