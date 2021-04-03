package com.TestNG_TDD;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametrised_test {
	
	@Test
	@Parameters({"username", "pwd"})
	private void credential(@Optional("GM")String username, int pwd ) {
		
		System.out.println("UN is "+username);
		System.out.println("Pwd is "+pwd);
	}

}
