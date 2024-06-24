package com.maketimecountPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maketimecountUtilities.Common;

public class ManageSU {

	public ManageSU() {
		
	}
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/section/div[2]/div/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div/table/tbody/tr[2]/td[7]/div/div/a/span")
	WebElement tbdElement;
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div[1]/div[2]/div[1]/a")
	WebElement t1;
	
	public void manage() throws Exception {
		tbdElement.click();
		Thread.sleep(2000);
		
		
		JavascriptExecutor js2=(JavascriptExecutor)Common.driver;
		 js2.executeScript("arguments[0].click();",t1);
	}
}
