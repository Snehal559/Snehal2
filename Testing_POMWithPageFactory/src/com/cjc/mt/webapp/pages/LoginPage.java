package com.cjc.mt.webapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	@FindBy(name="userName")
	WebElement un;
	@FindBy(name="password")
	WebElement ps;
	@FindBy(name="submit")
	WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loginCheck(String u,String p)
	{
		un.sendKeys(u);
		ps.sendKeys(p);
		login.click();
	}

}
