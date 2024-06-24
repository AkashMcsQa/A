package com.maketimecountPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.github.dockerjava.api.model.Driver;
import com.maketimecountUtilities.Common;

public class YOTVerify {
	
	public YOTVerify() {
		
	}
	
	@FindBy(xpath = "//*[@id=\"rc_select_20\"]")
	WebElement yotElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_21\"]")
	WebElement lacStatusElement;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/section/div[2]/div/div/div/div[2]/div[2]/span[3]/button")
	WebElement nextButtonElement;
	
	public void yot() throws Exception {
		
		yotElement.click();
		
       List<WebElement>yot1=Common.driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		
       for(WebElement Dropdown:yot1) {
	
	   if(Dropdown.getText().equals("Yot2")) {
		
	   Dropdown.click();
		Thread.sleep(2000);

		break;
		
		
	}
}
       lacStatusElement.click();
     List<WebElement>lac1=Common.driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
       
     for(WebElement Dropdown:lac1) {
    	 
    	 if(Dropdown.getText().equals("Other Local New")) {
    		 Dropdown.click();
    			Thread.sleep(2000);

    		 break;
    	 }
     }
     
     JavascriptExecutor js2=(JavascriptExecutor)Common.driver;
 	 js2.executeScript("arguments[0].click();",nextButtonElement);
	}

}
