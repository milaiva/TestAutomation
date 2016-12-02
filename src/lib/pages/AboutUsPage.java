package lib.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends Page {

	@FindBy(xpath = "id('post-156')/header/h1")
	private WebElement aboutUsHeader;
	
	public AboutUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//isDisplayed methods
	public boolean isDisplayedAboutUsHeader(){
		try {
			return aboutUsHeader.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	
	//getText methods
	public String getTextAboutUsHeader(){
		return aboutUsHeader.getText();
	}

}
