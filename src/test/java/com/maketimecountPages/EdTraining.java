package com.maketimecountPages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.maketimecountUtilities.Common;

public class EdTraining {
	public EdTraining() {
		
	}
	@FindBy(xpath = "//*[@id=\"rc_select_16\"]")
	WebElement EducationTrainingStartDescription;
	
	@FindBy(xpath = "//input[@placeholder='Education / Training Start Hours']")
	WebElement EducationTrainingStartHours;
	
	@FindBy(xpath = "//input[@placeholder='Education / Training Start Notes']")
	WebElement EducationTrainingStartNotes;
	
	@FindBy(xpath = "//input[@placeholder='Education / Training End Notes']")
	WebElement EducationTrainingEndNotes;
	
	@FindBy(xpath = "//*[@id=\"rc_select_17\"]")
	WebElement EducationTrainingEndDescription;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/main/section/div[2]/div/div/div/div[1]/div[2]/div/div[6]/div/input")
	WebElement EducationTrainingEndHours;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/main/section/div[2]/div/div/div/div[2]/div[2]/span[3]/button")
	WebElement nextButtonElement;
	
	public void edTraining() throws Exception {
		
		EducationTrainingStartDescription.click();
		Thread.sleep(2000);
		//EducationTrainingStartDescription.sendKeys(Keys.ENTER);
		
		//JavascriptExecutor js1=(JavascriptExecutor)Common.driver;
	    //js1.executeScript("arguments[0].click();",EducationTrainingStartDescription);
	
	    
	   List<WebElement>EduTS1=	Common.driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
	    System.out.println("Total Number Of EducationTrainingStartDescription Dropdown In list="+EduTS1.size());
		for(WebElement Dropdown:EduTS1) {
			if(Dropdown.getText().equals("Physically incapable")) {
				Dropdown.click();
				break;
			}
		}
		
		
	String ed1=	Common.educationtrainingSH();
	EducationTrainingStartHours.sendKeys(ed1);
	
   String etStartNote1= Common.educationTrainSNotes();
   EducationTrainingStartNotes.sendKeys(etStartNote1);
   
     String etEndNoteS=  Common.educationTraingEndNote();
     EducationTrainingEndNotes.sendKeys(etEndNoteS);
     
		
		EducationTrainingEndDescription.click();
	List<WebElement>EduTraEndDes1=	Common.driver.findElements(By.xpath("//*[@class=\"rc-virtual-list-holder-inner\"]//div"));
		System.out.println("Total Number Of EducationTrainingEndDescription="+EduTraEndDes1.size());
	for(WebElement Dropdown:EduTraEndDes1) {
		if(Dropdown.getText().equals("Recalled to custody")) {
			Dropdown.click();
			break;
		}
	}
	String eEndHour=Common.edutraEndHours();
	EducationTrainingEndHours.sendKeys(eEndHour);
	
	Thread.sleep(2000);
	JavascriptExecutor js2=(JavascriptExecutor)Common.driver;
	 js2.executeScript("arguments[0].click();",nextButtonElement);
		
	}


}
