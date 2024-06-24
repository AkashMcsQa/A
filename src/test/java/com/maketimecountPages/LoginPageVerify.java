package com.maketimecountPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maketimecountUtilities.Common;

public class LoginPageVerify {

	public LoginPageVerify() {
		
	}
	@FindBy(xpath = "//input[@placeholder='Email address']")
	WebElement un1;
	
	@FindBy(xpath = "//input[@id='passwordField']")
	WebElement psElement;
	
	@FindBy(xpath = "//button[@title='Login']")
	WebElement buttonElement;
	
	public void loginVerify() throws Exception {
	String un=	Common.userName();
		String ps=Common.setPassword();
		un1.sendKeys(un);
		psElement.sendKeys(ps);
		buttonElement.click();
	}
}
