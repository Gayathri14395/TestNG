package com.TestNG_TDD;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyIRetryAnalyser implements IRetryAnalyzer {

	
	int count = 0, limit = 5;

	@Override
	public boolean retry(ITestResult result) {
		
		if (count<limit) {
			
			count++;
			return true;
			
		}
		
		
		return false;
	}

	
	
	
}
