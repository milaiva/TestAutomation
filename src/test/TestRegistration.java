package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import lib.pages.AboutUsPage;
import lib.pages.HomePage;
import lib.pages.Page;
import lib.pages.RegistrationPage;
import lib.util.Browser;

public class TestRegistration {

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
		  registrationPage = homePage.clickOnRegistrationLink();
		  
		  registrationPage.sendKeysToFirstNameInput("");
		  registrationPage.sendKeysToLastNameInput("");
		  registrationPage.sendKeysToPhoneInput("");
		  registrationPage.sendKeysToEmailInput("");
		  registrationPage.sendKeysToUsernameInput("");
		  registrationPage.sendKeysToPasswordInput("");
		  registrationPage.sendKeysToConfirmPasswordInput("");
		  
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
