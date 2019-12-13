package com.shopee.web.utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
	protected WebDriver driver;
	protected PropertyUtil prop = new PropertyUtil("src/test/resources/config.properties");

	@BeforeEach
	public void setup() {

		// Create a Chrome driver. All test classes use this.
		//long id = Thread.currentThread().getId();
		//System.out.println("setup() method. Thread id is: " + id);
		try {
			driver = BrowserFactory.getDriver("chrome");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Maximize Window
		// driver.manage().window().maximize();
	}

	@AfterEach
	public void teardown() {
		driver.quit();
	}
}
