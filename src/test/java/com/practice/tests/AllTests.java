package com.practice.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AllTests {
	@BeforeSuite
	private void propset() {
	System.out.println();
		System.out.println("set prop");
		System.out.println();


	}
	
	@BeforeTest
	private void launchbrowser() {

		System.out.println("browser launch");
		System.out.println();

	}
	
	@BeforeClass
	private void url() {

		System.out.println("url");
		System.out.println();

	}
	
	
	@BeforeMethod
	private void login() {

		System.out.println("Login");
		

	}
	
	@Test(dataProvider = "userdata",groups="credentials")
		private void login(String un, String pwd ) 
	{
		System.out.println("Un is "+un);
		System.out.println("pwd is "+pwd);
	}
	
	@DataProvider
	private Object[][] userdata() {
		
		return new Object[][]
				{
						
						{"Jiya","abc123"},
						{"Gaya3","abc456"}
	};
}
	
	@Test(priority = -1, groups = "school")
	private void studDetails() {
		System.out.println("Student detials");
	}
	
	@Test(groups="credentials")
	private void cred() {
System.out.println("credentials");
	}
	
	@Test(groups = "loan")
	private void carLoan() {
System.out.println("Car loan");
	}
	
	@Test(groups = "loan")
	@Ignore
	private void eduLoan() {
System.out.println("Education loan");
	}
	
	
	@Test(enabled = false,groups = "loan")
	private void homeLoan() {
System.out.println("Home loan");
	}
	
	@Test(groups = "loan")
	private void sysLoan() {
System.out.println("System loan");
	}
	
	@Test
	@Parameters({"no"})
	private void carNo(@Optional("143")int no) {
System.out.println("Car no"+no);
	}
	
	@Test(groups = "school")
	private void marks() {
		System.out.println("Marks");
	}
	
	@Test(invocationCount = 3)
	private void course() {
System.out.println("course1");		// TODO Auto-generated method stub

	}
	
	@Test
	private void course2() {
System.out.println("course2");		// TODO Auto-generated method stub

	}
	
	@Test
	private void movie() {
System.out.println("Movies");
	}
	
	@Test
	private void valid() {
		String ab = "ab";
		String bc = "bc";
		
		Assert.assertEquals(ab, bc);
		System.out.println("Process completed");
		
	}
	
	
	@Test(timeOut = 2000)
	private void verify() {
		String ab = "ab";
		String bc = "bc";
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(ab,bc);
		System.out.println("Process completed");
		
	}
	@AfterMethod
	private void logout() {
		System.out.println("logout");
		System.out.println();
	}
	
}