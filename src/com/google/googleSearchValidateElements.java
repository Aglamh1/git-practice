package com.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import objectRepository.GoogleHomePage;

public class googleSearchValidateElements {

	private WebDriver driver;

	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lam\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
	}
	
	@Test
	public void googleSearchList() {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		GoogleHomePage homepage = new GoogleHomePage(driver);
		//System.out.println(homepage.getClass()); searchBox
		WebElement findElement(By searchBox);
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
