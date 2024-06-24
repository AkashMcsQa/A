package com.maketimecountPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maketimecountUtilities.Common;

public class ClothingVerify {

	public ClothingVerify() {
		
	}
	@FindBy(xpath = "//*[@id=\"rc_select_22\"]")
	WebElement clothingSizElement;
	
	@FindBy(xpath = "//*[@id=\"rc_select_23\"]")
	WebElement shoesSizElement;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/main/section/div[2]/div/div/div/div[2]/div[2]/span[3]/button")
	WebElement nextButtonElement;
	
	public void clothi() {
		clothingSizElement.click();
		
	List<WebElement>clo1=Common.driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		
	for(WebElement Dropdown:clo1) {
		
		if(Dropdown.getText().equals("XL")) {
			Dropdown.click();
			break;
		}
	}
	shoesSizElement.click();
	
List<WebElement>shoe1=	Common.driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
	
for(WebElement Dropdown:shoe1) {
	
	if(Dropdown.getText().equals("8")) {
		Dropdown.click();
		break;
		
	}
}
JavascriptExecutor js2=(JavascriptExecutor)Common.driver;
 js2.executeScript("arguments[0].click();",nextButtonElement);
	
	}
}
