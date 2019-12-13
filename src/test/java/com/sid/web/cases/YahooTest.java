package com.sid.web.cases;

import org.junit.jupiter.api.Test;

import com.shopee.web.utils.BaseTest;

class YahooTest extends BaseTest {

	String testUrl = "https://sg.yahoo.com";

	@Test
	void testYahoo() {

		driver.get(testUrl);
		driver.manage().window().maximize();

		String expectedTitle = "Yahoo Singapore | News, Finance and Lifestyle";
		String actualTitle = driver.getTitle();

		System.out.println("expectedTitle is : " + expectedTitle);
		System.out.println("actualTitle is : " + actualTitle);
	}

}
