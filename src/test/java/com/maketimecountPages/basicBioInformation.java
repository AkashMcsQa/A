package com.maketimecountPages;

import java.io.IOException;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.github.dockerjava.api.model.Driver;
import com.maketimecountUtilities.Common;

public class basicBioInformation {

	public basicBioInformation(){
		
	}
	@FindBy(xpath = "//*[@id=\"rc_select_1\"]")
	WebElement serviceusertypElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_2\"]")
	WebElement titlesElement;
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement fnElement;
	
	@FindBy(xpath = "//input[@placeholder='Middle Name']")
	WebElement mnamElement;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lnamElement;
	
	@FindBy(xpath = "//input[@placeholder='Preferred Name']")
	WebElement preferrednamElement;
	
	@FindBy(xpath = "//input[@placeholder='Previous Name']")
	WebElement previenamElement;
	
	@FindBy(xpath = "//input[@placeholder='Contact No (Mobile)']")
	WebElement mNumberElement;
	
	@FindBy(xpath = "//input[@placeholder='Contact No (Home)']")
	WebElement homeNumberElement;
	
	@FindBy(xpath = "//input[@placeholder='Contact No (Work)']")
	WebElement workNumberElement;
	
	//@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/main/section/div[2]/div/div/div/div[1]/div[2]/div[4]/div[1]/div/div[1]/div/div[2]/label/span[1]/input")
	//WebElement addressElement;
	
	@FindBy(xpath = "//input[@placeholder='e.g House number and street name']")
	WebElement addressElement;
	
	@FindBy(xpath = "//input[@placeholder='Select date']")
	WebElement dateOfBirthdayElement;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement emailElement;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passwordElement;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/main/section/div[2]/div/div/div/div[2]/div[2]/span[2]/button")
	WebElement nextButtonElement;
	
	@FindBy(xpath = "/html/body/div[7]/div/div[2]/div/div[2]/div/div[2]/button[2]")
	WebElement addFuInfoElement;
	
	public void basicInformation() throws Exception {
		serviceusertypElement.click();
	List<WebElement>sUTypElements=	Common.driver.findElements(By.xpath("//div[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement dropdown:sUTypElements) {
			if(dropdown.getText().equals("Initial Police report made")) {
				dropdown.click();
				break;
			}
			
		}
		titlesElement.click();
	List<WebElement>title=Common.driver.findElements(By.xpath("//div[@class=\"rc-virtual-list-holder-inner\"]//div"));
		for(WebElement dropdown:title) {
			if(dropdown.getText().equals("Mrs")) {
				dropdown.click();
				break;
			}
		}
		
    String fn=	Common.firstName();	
    fnElement.sendKeys(fn);

    String mname=  Common.mName();
    mnamElement.sendKeys(mname);
 
    String ln= Common.lastName();
    lnamElement.sendKeys(ln);
    
    String prename= Common.prefeName();
    preferrednamElement.sendKeys(prename);
 
    String previ= Common.previName();
    previenamElement.sendKeys(previ);
    
    String mn=Common.MobileNumber();
    mNumberElement.sendKeys(mn);
    
   String hnumber=Common.HomeNumber();
   homeNumberElement.sendKeys(hnumber);
  
  String wN= Common.WorkNumber();
  workNumberElement.sendKeys(wN);
  
  //JavascriptExecutor js1=(JavascriptExecutor)Common.driver;
  //js1.executeScript("arguments[0].click();",addressElement);	
  
addressElement.sendKeys("Southampton, Southampton, United Kingdom");
Thread.sleep(2000);
addressElement.sendKeys(Keys.ENTER);
    Thread.sleep(2000);
  String date=Common.DOB();
  dateOfBirthdayElement.sendKeys(date);
  
 String mail= Common.email();
 emailElement.sendKeys(mail);
 
 String ps=Common.password();
 passwordElement.sendKeys(ps);
 
 
 
 JavascriptExecutor js=(JavascriptExecutor)Common.driver;
 js.executeScript("arguments[0].click();",nextButtonElement);
 
 Thread.sleep(3000);
 JavascriptExecutor js2=(JavascriptExecutor)Common.driver;
 js2.executeScript("arguments[0].click();",addFuInfoElement);
}
}
