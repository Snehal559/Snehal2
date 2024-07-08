package com.cjc.mt.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageDataProvider {
	WebDriver driver;
	@FindBy(name="userName")
	WebElement un;
	@FindBy(name="password")
	WebElement ps;
	@FindBy(name="submit")
	WebElement login;
	
	public LoginPageDataProvider(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@Test(dataProvider = "getData")
	public void loginCheck(String u,String p) throws Exception
	{
		un.sendKeys(u);
		ps.sendKeys(p);
		login.click();
		driver.navigate().back();
		Thread.sleep(2000);
		un.clear();
		ps.clear();
	}
	@DataProvider
	public Object [][] getData()
	{
		return new Object [][] {
			new Object []{"aaaaa","AAAAA"},
			new Object []{"bbbbb","BBBBB"}
		};
		
	}

}
