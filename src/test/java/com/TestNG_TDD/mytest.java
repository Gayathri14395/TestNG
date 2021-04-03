package com.TestNG_TDD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class mytest {

@Test
private void credentials() {

	String actual="Jiya";
	String expected = "Gaya3";
	
	//to check assert is used
	
	Assert.assertEquals(actual,expected);
	
}
@Test(retryAnalyzer = MyIRetryAnalyser.class)
private void pwd() {

	String actualpwd="Jiya298";
	String expectedpwd = "Gaya3143";
	
	//to check assert is used
	
	Assert.assertEquals(actualpwd,expectedpwd);
	
	
}



}
