package com.maketimecountPages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maketimecountUtilities.Common;

public class Info {

	public Info() {
		
	}
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/section/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[1]/textarea")
	WebElement notElement;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/section/div[2]/div/div/div/div[2]/div[2]/span[3]/button")
	WebElement finishElement;
	
	public void inform() throws Exception {
		
	String n1=Common.note();
	notElement.sendKeys(n1);
	
	//finishElement.click();
	
	Thread.sleep(2000);
	
	  JavascriptExecutor js2=(JavascriptExecutor)Common.driver;
  	 js2.executeScript("arguments[0].click();",finishElement);
		
	}
}
