package com.sid.web.cases;

import org.junit.jupiter.api.Test;

import com.shopee.web.utils.BaseTest;

import static org.junit.jupiter.api.Assertions.*;

class MicroSoftTest extends BaseTest {

	String testUrl = "https://www.microsoft.com";

	@Test
	void testGoogle() {

		driver.get(testUrl);
		driver.manage().window().maximize();

		String expectedTitle = "Microsoft - Official Home Page";
		String actualTitle = driver.getTitle();

		System.out.println("expectedTitle is : " + expectedTitle);
		System.out.println("actualTitle is : " + actualTitle);
		assertEquals(actualTitle, expectedTitle);

	}

}
