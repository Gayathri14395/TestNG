package com.TestNG_TDD;

import javax.sound.midi.SysexMessage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignore_test {

	
	@BeforeMethod
	private void login() {
		// TODO Auto-generated method stub
System.out.println("login");
	}
	@Test
	private void laptopsearch() {
		// TODO Auto-generated method stub
		System.out.println("Lap search");
	}
	
	@Test
	private void musicsearch() {
		// TODO Auto-generated method stub
System.out.println("Mus search");
	}
	
	
	@Test(enabled=false)
	private void earphone() {
		// TODO Auto-generated method stub
System.out.println("Earphone test");
	}
	
	@Ignore
	@Test
	private void mobsearch() {
		// TODO Auto-generated method stub
System.out.println("Mob search");
	}
	
	@AfterMethod
	private void logout() {
		// TODO Auto-generated method stub
System.out.println("logout");
	}

}
