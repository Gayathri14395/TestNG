package com.TestNG_TDD;

import org.testng.annotations.Test;

public class invocation_test {
	
	@Test(priority=-1)
	private void url() {
		System.out.println("URL");

	}

	@Test(invocationCount = 3)
	private void refresh() {
		System.out.println("Refresh");
// TODO Auto-generated method stub

	}
@Test(priority=1)
	private void login() {
		// TODO Auto-generated method stub
		System.out.println("Login");

	}
}
