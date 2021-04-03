package com.TestNG_TDD;

import org.testng.annotations.Test;

public class grouping {
	
	@Test(groups = "Electronics")
	private void lapsearch() {
		System.out.println("laptop Search");

	}
	@Test(groups = "Electronics")
	private void mobsearch() {
		System.out.println("mob Search");

	}
	
	@Test(groups = "Entertainment")
private void musicsearch() {
		System.out.println("Music Search");

	}
	
	@Test(groups = "Education")
	private void booksearch() {
		System.out.println("Book Search");

	}
	@Test(groups = "Entertainment")
	private void moviesearch() {
		System.out.println("Movie Search");

	}
	@Test(groups = "Electronics")
	private void earphonesearch() {
System.out.println("Earphone Search");
	}

}
