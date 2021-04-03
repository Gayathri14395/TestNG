package com.TestNG_TDD;

import org.testng.annotations.Test;

public class timeout_test {

	@Test(timeOut = 1000)
	private void loginbtn() throws InterruptedException {
System.out.println("login btn click");

Thread.sleep(2000);

System.out.println("navigate");
	}
	
}
