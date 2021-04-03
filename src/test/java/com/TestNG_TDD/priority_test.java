package com.TestNG_TDD;

import org.testng.annotations.Test;

public class priority_test {

	@Test(priority=-1)
	private void mussearch() {
		System.out.println("Music Search");


	}
	
	@Test(priority=-3)
	public static void laptopsearch() {
		
		System.out.println("Laptop Search");

	}

	
	@Test(priority=-3)
	private void earphone() {
		
		System.out.println("Earphones Search");

	}
	
	@Test
	private void mobsearch() {

System.out.println("Mob Search");
	}}