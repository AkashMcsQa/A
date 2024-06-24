package com.maketimecountPages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maketimecountUtilities.Common;

public class AccommodationVerify {
	
	public AccommodationVerify() {
		
	}
	@FindBy(xpath = "//*[@id=\"rc_select_18\"]")
	WebElement AccommodationStatusatStart;
	
	@FindBy(xpath = "//*[@id=\"rc_select_19\"]")
	WebElement AccommodationatEndofinteraction ;
	
	@FindBy(xpath = "//input[@placeholder=\"Education / Training Start Notes\"]")
	WebElement educationTrainingStartNotesElement;
	
	@FindBy(xpath = "//input[@placeholder=\"Education / Training End Notes\"]")
	WebElement educationTrainingEndNotesElement;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/section/div[2]/div/div/div/div[2]/div[2]/span[3]/button")
	WebElement nextButtonElement;
	
    public void accommodation() throws Exception {
    	AccommodationStatusatStart.click();
  List<WebElement>acc1=Common.driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		
  for(WebElement Dropdown:acc1) {
	  
	  if(Dropdown.getText().equals("No fixed Address")) {
		  
		  Dropdown.click();
		  break;
	  }
  }
  AccommodationatEndofinteraction.click();
  
 List<WebElement>acc= Common.driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
  
  for(WebElement Dropdown:acc) {
	  
	  if(Dropdown.getText().equals("Rental, Authority")) {
		  
		  Dropdown.click();
		  break;
	  }
  }
  
            String ac1=  Common.accmodaStartNotes();
           educationTrainingStartNotesElement.sendKeys(ac1);

          String aen1=   Common.accomatEndNotes();
          educationTrainingEndNotesElement.sendKeys(aen1);
          
          JavascriptExecutor js2=(JavascriptExecutor)Common.driver;
     	 js2.executeScript("arguments[0].click();",nextButtonElement);
	}

}
