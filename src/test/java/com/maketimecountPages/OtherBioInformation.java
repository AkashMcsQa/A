package com.maketimecountPages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.checkerframework.common.value.qual.StringVal;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;
import com.maketimecountUtilities.Common;

import io.opentelemetry.sdk.metrics.InstrumentSelectorBuilder;

public class OtherBioInformation {

	public OtherBioInformation() {
		
	}
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/main/section/div[2]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div")
    WebElement AssignTo ;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/main/section/div[2]/div/div/div/div[1]/div[2]/div[1]/div[2]/div/div/div")
	WebElement PreferredCommunication;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/main/section/div[2]/div/div/div/div[1]/div[2]/div[1]/div[3]/div/div/div/div")
	WebElement LAUExclusion;
	
	@FindBy(xpath = "//*[@id=\"rc_select_6\"]")
	WebElement religinElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_7\"]")
	WebElement immgirationStatusElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_8\"]")
	WebElement prefSpekonLanElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_9\"]")
	WebElement prefWritenlanElement;
	
	
	@FindBy(xpath = "//input[@placeholder=\"TBD 2\"]")
	WebElement tbd2;
	
	@FindBy(xpath = "//input[@placeholder='TBD 1']")
	WebElement tbd1;
	
	@FindBy(xpath = "//*[@id=\"rc_select_10\"]")
	WebElement Gender ;
	
	@FindBy(xpath = "//*[@id=\"rc_select_11\"]")
	WebElement Nationality ;
	
	@FindBy(xpath = "//*[@id=\"rc_select_12\"]")
	WebElement Ethnicity ;
	
	@FindBy(xpath = "//*[@id=\"rc_select_13\"]")
	WebElement PNCEthnicCode;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/section/div[2]/div/div/div/div[1]/div[2]/div[2]/div[7]/div/div/div/div")
	WebElement disabilityElement;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/section/div[2]/div/div/div/div[1]/div[2]/div[2]/div[8]/div/div/div/span[1]/input")
	WebElement sexualOrintationElement;
	
	
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/section/div[2]/div/div/div/div[1]/div[2]/div[2]/div[9]/div/select")
	WebElement fingerprint1;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/section/div[2]/div/div/div/div[1]/div[2]/div[2]/div[10]/div/select")
	WebElement dnaElement;
	
	@FindBy(xpath = "//input[@placeholder='TBD 3']")
	WebElement tbd3;
	
	@FindBy(xpath = "//input[@placeholder='TBD 4']")
	WebElement tbd4;
	
	@FindBy(xpath = "//input[@placeholder='TBD 5']")
	WebElement tbd5;
	
	@FindBy(xpath = "//input[@placeholder='TBD 6']")
	WebElement tbd6;
	
	@FindBy(xpath = "//input[@placeholder='TBD 7']")
	WebElement tbd7;
	
	@FindBy(xpath = "//input[@placeholder='TBD 8']")
	WebElement tbd8;
	
	@FindBy(xpath = "//input[@placeholder='TBD 9']")
	WebElement tbd9;
	
	@FindBy(xpath = "//input[@placeholder='TBD 10']")
	WebElement tbd10;
	
	@FindBy(xpath = "//input[@placeholder='TBD 11']")
	WebElement tbd11;
	
	@FindBy(xpath = "//input[@placeholder='TBD 12']")
	WebElement tbd12;
	
	@FindBy(xpath = "//input[@placeholder='TBD 13']")
	WebElement tbd13;
	
	@FindBy(xpath = "//input[@placeholder='TBD 14']")
	WebElement tbd14;
	
	@FindBy(xpath = "//input[@placeholder='TBD 15']")
	WebElement tbd15;
	
	@FindBy(xpath = "//input[@placeholder='TBD 16']")
	WebElement tbd16;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/main/section/div[2]/div/div/div/div[1]/div[2]/div[3]/div[1]/div/div/div/div/span/div/span")
	WebElement ProfileU;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/main/section/div[2]/div/div/div/div[2]/div[2]/span[3]/button")
	WebElement nextButtonElement;
	
	public void otherBInfo() throws Exception {
		AssignTo.click();
	    List<WebElement>assign=	Common.driver.findElements(By.xpath("//div[@class=\"rc-virtual-list-holder-inner\"]//div"));
		System.out.println("Total Number Of Assign Name="+assign.size());
		for(WebElement dropdown:assign) {
			if(dropdown.getText().equals("Android ADMIN")) {
				dropdown.click();
				break;
			}
		}
		PreferredCommunication.click();
	    List<WebElement>PreferredCommunication=	Common.driver.findElements(By.xpath("//div[@class=\"rc-virtual-list-holder-inner\"]//div"));
		System.out.println("Total Number Of PreferredCommunication dropdown value="+PreferredCommunication.size());
	   for(WebElement dropdown:PreferredCommunication) {
		   if(dropdown.getText().equals("Phone Call")) {
		dropdown.click();
		break;
	}
	}
	   
	
	   LAUExclusion.click();
	 List<WebElement>lauElements=  Common.driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
	   System.out.println("Total Number Of Dropdown LAUExclusion="+lauElements.size());
	  for(WebElement dropdown:lauElements) {
		  if(dropdown.getText().equals("Marvellous GIFTS")) {
			  dropdown.click();
			  break;
		  }
	  }
	  religinElement.click();
	 List<WebElement>Religion= Common.driver.findElements(By.xpath("//div[@class=\"rc-virtual-list-holder-inner\"]//div"));
	  System.out.println("Total Number Dropdown Religion="+Religion.size());
	  
	  for(WebElement dropdown:Religion) {
		  if(dropdown.getText().equals("Zoroastrian")) {
			  dropdown.click();
			  break;
		  }
	  }
	  immgirationStatusElement.click();
	 List<WebElement>immgiStatus= Common.driver.findElements(By.xpath("//div[@class=\"rc-virtual-list-holder-inner\"]//div"));
	  System.out.println("Total Number Of immgirationStatus="+immgiStatus.size());
	  for(WebElement dropdown:immgiStatus) {
		  if(dropdown.getText().equals("Working holiday makers")) {
			  dropdown.click();
			  break;
		  }
	  }
	  
	  prefSpekonLanElement.click();
	 List<WebElement>PreferredSpokenLan=Common.driver.findElements(By.xpath("//div[@class=\"rc-virtual-list-holder-inner\"]//div"));
	  System.out.println("Total Number Of Preferred Spoken Language="+PreferredSpokenLan.size());
	  for(WebElement dropdown:PreferredSpokenLan) {
		  if(dropdown.getText().equals("English")) {
			  dropdown.click();
			  break;
		  }
	  }
	  prefWritenlanElement.click();
	List<WebElement>writenElements=  Common.driver.findElements(By.xpath("//div[@class=\"rc-virtual-list-holder-inner\"]//div"));
	  System.out.println("Total Number Of Preferred Written Language="+writenElements.size());
	  for(WebElement dropdown:writenElements) {
		  if(dropdown.getText().equals("English")) {
			  dropdown.click();
			  break;
		  }
	  }
	 
	 String t2= Common.tbd2();
	  
	  tbd2.sendKeys(t2);
	  
	String t1=  Common.tbd1();
	tbd1.sendKeys(t1);
	
	Gender.click();
  List<WebElement> gen1=Common.driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
 
  System.out.println("Total Number Of Gender In Dropdown in list="+gen1.size());

  for(WebElement Dropdown:gen1) {
	  if(Dropdown.getText().equals("Male")) {
		  Dropdown.click();
		  break;
	  }
  }
 
  Nationality.click();
 List<WebElement>nati1= Common.driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
  System.out.println("Total Number Of Nationality in Dropdown="+nati1.size());
 
	
  for(WebElement Dropdown:nati1) {
	if(Dropdown.getText().equals("English")) {
		Dropdown.click();
		break;
	}
}
  Ethnicity.click();
 List<WebElement>ethnic1= Common.driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
  System.out.println("Total Number Of Ethnicity="+ethnic1.size());
  for(WebElement Dropdown:ethnic1) {
	  if(Dropdown.getText().equals("(W3) White, Gypsy or Irish Traveller")) {
		  Dropdown.click();
		  break;
	  }
  }
  PNCEthnicCode.click();
 List<WebElement>pnc1= Common.driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
  System.out.println("Total Number Of PNCEhnic Code="+pnc1.size());
  for(WebElement Dropdown:pnc1) {
	  if(Dropdown.getText().contains("White (South – Dark) European(2)")) {
		  Dropdown.click();
		  break;
	  }
  }
  
  
  JavascriptExecutor js1=(JavascriptExecutor)Common.driver;
  js1.executeScript("arguments[0].click();",disabilityElement);
  
 // disabilityElement.click();
  List<WebElement>dis1=  Common.driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
        for(WebElement Dropdown:dis1) {
	  
	     if(Dropdown.getText().equals("Long term physical health")) {
		  
		  Dropdown.click();
		  
		  break;  
	  }
	  
  }
  
        
        
        JavascriptExecutor js=(JavascriptExecutor)Common.driver;
        js.executeScript("arguments[0].click();",sexualOrintationElement);
     
       // sexualOrintationElement.click();
        List<WebElement>sexua1=  Common.driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
        
        for(WebElement Dropdown:sexua1) {
        	
        	if(Dropdown.getText().equals("Gay/Lesbian")) {
        		Dropdown.click();
        		break;
        	}
        }
  
  
  
  
  
  
  Select s2=new Select(fingerprint1);
  s2.selectByValue("2");
  
 // Select s3=new Select(dnaElement);
  //s3.selectByValue("2");
  
    String t3=   Common.tbd3();
    tbd3.sendKeys(t3);
    
    String t4=  Common.tbd4();
    tbd4.sendKeys(t4);
    
   String t5= Common.tbd5();
   tbd5.sendKeys(t5);
   
   String t6=   Common.tbd6();
   tbd6.sendKeys(t6);
   
  String t7= Common.tbd7();
  tbd7.sendKeys(t7);
  
  String t8= Common.tbd7();
  tbd8.sendKeys(t8);
  
  String t9=  Common.tbd8();
  tbd9.sendKeys(t9);
  
   String t10=  Common.tbd9();
   tbd10.sendKeys(t10);
  
  String t11= Common.tbd11();
   tbd11.sendKeys(t11);
   
  String t12= Common.tbd12();
   tbd12.sendKeys(t12);
   
 String t13=  Common.tbd13();
   tbd13.sendKeys(t13);
   
   String t14=    Common.tbd14();
   tbd14.sendKeys(t14);
   
   String t15=Common.tbd15();
   tbd15.sendKeys(t15);
   
   String t16=Common.tbd16();
   tbd16.sendKeys(t16);
   
   
   JavascriptExecutor j=(JavascriptExecutor)Common.driver;
   j.executeScript("arguments[0].click();",nextButtonElement);
   
   
    
 
  
	}
}
