package com.maketimecountPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.maketimecountUtilities.Common;

public class CreateNewSUser {

	public CreateNewSUser() {
}
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/section/div[1]/div/div[2]/div/div[2]/button")
	WebElement addButtonElement;
	
	@FindBy(xpath = "/html/body/div[2]/div/ul/li[2]/span")
	WebElement sUserElement;
	
	public void addUser() {
		
		System.out.println("cHECK TWO");
		System.out.println(addButtonElement);
		Actions ac1=new Actions(Common.driver);
		ac1.moveToElement(addButtonElement).build().perform();
		
		JavascriptExecutor js=(JavascriptExecutor)Common.driver;
	     js.executeScript("arguments[0].click();",sUserElement);
	}
}