package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import lib.data.Properties;
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
	  driver = Browser.openBrowser(Properties.URL);
  }
  
  
  @Test
  public void test() {
	  try {
		  homePage = new HomePage(driver);
		  registrationPage = homePage.clickOnRegistrationLink();
		  
		  registrationPage.sendKeysToFirstNameInput("Neko");
		  registrationPage.sendKeysToLastNameInput("Nesto");
		  
		  registrationPage.selectMaritalStatus("Divorced");
		  registrationPage.checkHobbyDancing(true);
		  
		  registrationPage.selectCountry("Laos");
		  registrationPage.selectMonth("12");
		  registrationPage.selectDay("2");
		  registrationPage.selectYear("1967");
		  		  
		  registrationPage.sendKeysToPhoneInput("00381692583697");
		  registrationPage.sendKeysToEmailInput("anonimno@tod.com");
		  registrationPage.sendKeysToUsernameInput("anonimno");
		  registrationPage.sendKeysToPasswordInput("miNismoNormalni2016");
		  registrationPage.sendKeysToConfirmPasswordInput("miNismoNormalni2016");
			  
		  Sleeper.sleepTightInSeconds(5);
		  registrationPage.clickOnSubmitButton();
		  
		  Sleeper.sleepTightInSeconds(5);
		  Assert.assertEquals(registrationPage.isDisplayedSuccessRegistrationMsg(), true);
		  
	  } catch (Exception e) {
		  e.printStackTrace();
	  }
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
