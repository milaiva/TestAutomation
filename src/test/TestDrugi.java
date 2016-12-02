package test;

import org.testng.annotations.Test;

import lib.pages.AboutUsPage;
import lib.pages.HomePage;
import lib.pages.Page;
import lib.pages.RegistrationPage;
import lib.util.Browser;

import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestDrugi {
  
	WebDriver driver;
	
	HomePage homePage;
	AboutUsPage aboutUsPage;
	RegistrationPage registrationPage;
	Page page;
	String url;
	

  
  @BeforeClass
  public void setUp() {
	  url = "http://demoqa.com/";
	  driver = Browser.openBrowser(url);
  }
  
  @Test
  public void test() {
	try {
		  homePage = new HomePage(driver);
		  aboutUsPage = homePage.clickOnAboutUsLink();
		  
		  
		  Assert.assertEquals(aboutUsPage.isDisplayedAboutUsHeader(), true);
		  Assert.assertEquals(aboutUsPage.getTextAboutUsHeader(), "About us");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}

  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
