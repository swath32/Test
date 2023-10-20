package TestNG;

import org.testng.annotations.Test;
public class Exceptionaltimeout {
	

@Test(expectedExceptions = NumberFormatException.class)
	public void test1() {
		String x= "100A";
		Integer.parseInt(x);
	}

}
