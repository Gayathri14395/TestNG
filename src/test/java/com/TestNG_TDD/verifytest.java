package com.TestNG_TDD;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class verifytest {
	
	@Test
	private void data() {
	
		String a = "Jiya";
		String e = "GM";

				SoftAssert soft = new SoftAssert();
				soft.assertEquals(a, e);
				System.out.println("Process completed");
		
	}

}
