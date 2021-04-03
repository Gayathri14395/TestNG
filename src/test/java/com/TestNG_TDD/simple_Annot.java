package com.TestNG_TDD;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class simple_Annot {

	@BeforeSuite
	private void propset() {
	
		System.out.println("set prop");

	}
	
	@BeforeTest
	private void launchbrowser() {

		System.out.println("browser launch");
	}
	
	@BeforeClass
	private void url() {

		System.out.println("url");
	}
	
	
	@BeforeMethod
	private void login() {

		System.out.println("Login");
	}
	
	@Test
	public static void laptopsearch() {
		
		System.out.println("Laptop Search");

	}

	
	@Test
	private void earphone() {
		
		System.out.println("Earphones Search");

	}
	
	@Test
	private void mobsearch() {

System.out.println("Mob Search");
		
	}
	
	@AfterMethod
	private void logout() {
	System.out.println("logout");

	}
	
	@AfterClass
	private void verifyhp() {

		System.out.println("hp");
	}
	
	@AfterTest
	private void close() {
		// TODO Auto-generated method stub
System.out.println("close");
	}
	
	@AfterSuite
	private void coookies() {
		// TODO Auto-generated method stub
System.out.println("del all cookies");
	}
}
