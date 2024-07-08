package com.cjc.mt.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cjc.mt.webapp.pages.LoginPage;

public class LoginTest {
	WebDriver driver; 
	@Test
	public void loginTest()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\cromedriver-seleniumTesting\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.loginCheck("aaaa", "AAAA");
	
	}
}
