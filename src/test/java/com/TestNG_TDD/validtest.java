package com.TestNG_TDD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class validtest {

	@Test
	private void credential() {
		String actual = "Jiya";
		String expected="GM";
		
		//Assert.assertEquals(actual, expected);
		
		Assert.assertNotEquals(actual, expected);
		
//		Assert.assertNull(actual);
//		
//		Assert.assertNotNull(expected);
		
		
			
		
		System.out.println("process completed");
		
		
	}
}
