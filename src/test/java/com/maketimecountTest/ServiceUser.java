package com.maketimecountTest;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.util.Args;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.maketimecountPages.AccommodationVerify;
import com.maketimecountPages.ClothingVerify;
import com.maketimecountPages.CreateNewSUser;
import com.maketimecountPages.EdTraining;
import com.maketimecountPages.Info;
import com.maketimecountPages.LoginPageVerify;
import com.maketimecountPages.ManageSU;
import com.maketimecountPages.OtherBioInformation;
import com.maketimecountPages.RefNumbers;
import com.maketimecountPages.YOTVerify;
import com.maketimecountPages.basicBioInformation;
import com.maketimecountUtilities.Common;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceUser {

	@BeforeSuite
	public void openBrowser() throws Exception {
		FileInputStream fis=Common.filecall();
		Common.pro.load(fis);
		WebDriverManager.firefoxdriver().setup();
		Common.driver=new FirefoxDriver();
		
		System.out.println("Open Browser");
	}
	@BeforeTest
	public void enterUrl() {
		Common.driver.get(Common.pro.getProperty("url"));
		System.out.println("Enter Url");
	}
	@BeforeClass
	public void timeout() {
		Common.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Common.driver.manage().window().maximize();
		System.out.println("Timeout succesfuuly update");
	}
	@BeforeMethod(enabled = false)
	public void getCookies() {
	Set<Cookie>coo1=Common.driver.manage().getCookies();
		for(Cookie cookies:coo1) {
			System.out.println("Total Number Of Cookies="+coo1.size());
			
			System.out.println("Name="+cookies.getName());
			
		    System.out.println("Domain="+cookies.getDomain());
		    
		    System.out.println("Path="+cookies.getPath());
		    
		    System.out.println("SameSite="+cookies.getSameSite());
		    
		    System.out.println("Value="+cookies.getValue());
		    
		    System.out.println("Class="+cookies.getClass());
		    
		    System.out.println("Expiry="+cookies.getExpiry());
		  
		
		}
	}
	@Test(priority = 1)
	public void loginPage() throws Exception {
		
		LoginPageVerify login=PageFactory.initElements(Common.driver,LoginPageVerify.class);
		login.loginVerify();
		System.out.println("Login page ");
	}
	@Test(priority = 2)
	public void CreateServiceUser() throws Exception {
	//	Thread.sleep(3000);
		System.out.println("create service user");

		CreateNewSUser user1=PageFactory.initElements(Common.driver,CreateNewSUser.class);
		user1.addUser();
		
		System.out.println("Create Service uiser");
	}
	@Test(priority = 3)
	public void basicBioInfo() throws Exception {
		Thread.sleep(3000);
		basicBioInformation b1=PageFactory.initElements(Common.driver,basicBioInformation.class);
	b1.basicInformation();	
	System.out.println("basic in formation update");
	}
	
	@Test(priority = 4)
	public void otherBioInfo() throws Exception {
		Thread.sleep(3000);
		OtherBioInformation other1=PageFactory.initElements(Common.driver,OtherBioInformation.class);
	other1.otherBInfo();	
	System.out.println("other information update");
	
	}
	
	@Test(priority = 5)
	public void RefNumbersVerify() throws Exception {
		Thread.sleep(3000);
		RefNumbers r1=PageFactory.initElements(Common.driver,RefNumbers.class);
		r1.refNumber();
		
		System.out.println("RefNumber verify");
	}
	
	@Test(priority = 6)
	
	public void EdTrainingVerify () throws Exception  {
		Thread.sleep(3000);
		EdTraining ed=PageFactory.initElements(Common.driver,EdTraining.class);
		ed.edTraining();
		System.out.println("Ed training verify");
	}
	

	@Test(priority = 7)
	public void Accommodation () throws Exception, Exception {
		Thread.sleep(3000);
		AccommodationVerify a1=PageFactory.initElements(Common.driver,AccommodationVerify.class);
		a1.accommodation();
		System.out.println("accommodation verify");
	}
	
	
	@Test(priority = 8)
	
	public void YOT() throws Exception {
		Thread.sleep(3000);
    YOTVerify y1=PageFactory.initElements(Common.driver,YOTVerify.class);
    y1.yot();
    System.out.println("yot verify");
		
	}
	
	@Test(priority = 9)
	public void Clothing() throws Exception {
		Thread.sleep(3000);
		
		ClothingVerify ve1=PageFactory.initElements(Common.driver,ClothingVerify.class);
		ve1.clothi();
	}
	@Test(priority = 10)
	public void Information() throws Exception {
		Thread.sleep(3000);
        Info i1=PageFactory.initElements(Common.driver,Info.class);
        i1.inform();
		
	}
	
	@Test(priority = 11,enabled = false)
	public void ManageServiceUser() throws Exception {
		Thread.sleep(3000);
		ManageSU m1=PageFactory.initElements(Common.driver,ManageSU.class);
		m1.manage();
	}
	@AfterMethod
	public void deleteCookies() {
		Common.driver.manage().deleteAllCookies();
		
	}
	@AfterClass
	public void getScreenshot() throws Exception {
		File src=((TakesScreenshot)Common.driver).getScreenshotAs(OutputType.FILE);
		File srcFile=new File("src\\test\\resources\\Screenshot\\Fail.png");
		FileUtils.copyFileToDirectory(src, srcFile);
		
	}
	@AfterTest()
	public void closeBrowser() {
		//Common.driver.close();
		
		
	}
}

