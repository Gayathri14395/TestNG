package com.TestNG_TDD;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovidertest {
	

	@Test(dataProvider = "testdata")
	
	private void credential(String username, int pwd ) {
		
		System.out.println("UN is "+username);
		System.out.println("Pwd is "+pwd);
	}

	@DataProvider
	private Object[][] testdata() {
		
		return new Object[][] {
			 
		
			{"Jiya",123},
			{"GM",456}
		};
		}
		}

