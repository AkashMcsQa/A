package com.maketimecountPages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maketimecountUtilities.Common;

public class RefNumbers {
	public RefNumbers() {
		
	}
	@FindBy(xpath = "//input[@placeholder='Pnc']")
	WebElement pncElement;
	
	@FindBy(xpath = "//input[@placeholder='Oypid']")
	WebElement oypidElement;
	
	@FindBy(xpath = "//input[@placeholder='Offender ID']")
	WebElement offenderIdElement;
	
	@FindBy(xpath = "//input[@placeholder='Pnomis']")
	WebElement pnomicElement;
	
	
	
	@FindBy(xpath = "//input[@placeholder='NICHE PERSON ID']")
	WebElement nichePersonIdElement;
	
	@FindBy(xpath = "//input[@placeholder='Other 2']")
	WebElement other2;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/section/div[2]/div/div/div/div[2]/div[2]/span[3]/button")
	WebElement nextbuttonElement;
	
	
	public void refNumber() throws Exception {
	
	String p1=	Common.pnc();
	pncElement.sendKeys(p1);
		
    String o1=	Common.oypid();
	oypidElement.sendKeys(o1);
	
    String off1=	Common.offenderID();
	offenderIdElement.sendKeys(off1);
	
    String pnm1=	Common.pnomis();
	pnomicElement.sendKeys(pnm1);
	
    String ni1=	Common.nicheID();
	nichePersonIdElement.sendKeys(ni1);
	
    String othe1=	Common.other();
	other2.sendKeys(othe1);
	

	Thread.sleep(3000);
	//nextbuttonElement.click();
	JavascriptExecutor js2=(JavascriptExecutor)Common.driver;
	 js2.executeScript("arguments[0].click();",nextbuttonElement);
	
	}

}
