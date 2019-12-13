package com.sid.web.cases;

import org.junit.jupiter.api.Test;

import com.shopee.web.utils.BaseTest;

class GoogleTest extends BaseTest {

	String testUrl = "https://timesofindia.indiatimes.com";

	@Test
	void testGoogle() {

		
		driver.get(testUrl);
		driver.manage().window().maximize();

		String expectedTitle = "News: Breaking News, National news, Latest Bollywood News, Sports News, Business News and Political News | Times of India";
		String actualTitle = driver.getTitle();

		System.out.println("expectedTitle is : " + expectedTitle);
		System.out.println("actualTitle is : " + actualTitle);
	}

}
