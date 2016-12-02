package lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
	
	protected WebDriver driver;
	//private string url;
	
	//MAPPING WEB ELEMENTS
	@FindBy(id = "menu-item-158")
	private WebElement aboutUsLink;
	
	@FindBy(xpath = "id('post-155')")
	private WebElement servicesLink;
	
	
	//======================================
	
	@FindBy(id = "menu-item-374")
	private WebElement registrationLink;
	
	//Constructor initializing web driver
	//And initializing web elements on current page
	public Page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//clickOn Methods 
	public RegistrationPage clickOnRegistrationLink(){
		registrationLink.click();
		Sleeper.sleepTightInSeconds(2);
		return new RegistrationPage(driver);
	}
	
	public AboutUsPage clickOnAboutUsLink(){
		aboutUsLink.click();
		Sleeper.sleepTightInSeconds(2);
		return new AboutUsPage(driver);
	}
}
