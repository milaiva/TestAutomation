package lib.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends Page{

	private String single = "Single";
	private String married = "Married";
	private String divorced = "Divorced";
	
	
	@FindBy(id = "name_3_firstname")
	private WebElement firstNameInput;
	
	@FindBy(id = "name_3_lastname")
	private WebElement lastNameInput;
	
	@FindBy(id = "phone_9")
	private WebElement phoneInput;
	
	@FindBy(id = "username")
	private WebElement usernameInput;
	
	@FindBy(id = "email_1")
	private WebElement emailInput;
	
	@FindBy(id = "password_2")
	private WebElement passwordInput;
	
	@FindBy(id = "confirm_password_password_2")
	private WebElement confirmPasswordInput;
	
	@FindBy(xpath = "id('pie_registered')/li[3]/div/div/input[1]")
	private WebElement hobbyDancing;
	
	@FindBy(xpath = "id('pie_registered')/li[3]/div/div/input[2]")
	private WebElement hobbyReading;
	
	@FindBy(xpath = "id('pie_registered')/li[3]/div/div/input[3]")
	private WebElement hobbyCricket;
	
	@FindBy(id = "dropdown_7")
	private WebElement selectCountry;

	@FindBy(id="mm_date_8")
	private WebElement selectMonth;
	
	@FindBy(id="dd_date_8")
	private WebElement selectDay;
	
	@FindBy(id="yy_date_8")
	private WebElement selectYear;
	
	@FindBy(xpath = "id('pie_register')/li[14]/div/input")
	private WebElement submitButton;
	
	@FindBy(xpath = "id('post-49')/div/p")
	private WebElement successRegistrationMsg;
	
	public void selectCountry(String country){
		Select select = new Select(selectCountry);
		select.selectByValue(country);
	}
	
	public void selectMonth(String month){
		Select select = new Select(selectMonth);
		select.selectByValue(month);
	}
	
	public void selectDay(String day){
		Select select = new Select(selectDay);
		select.selectByValue(day);
	}
	
	public void selectYear(String year){
		Select select = new Select(selectYear);
		select.selectByValue(year);
	}
	
	public void clickOnSubmitButton(){
		submitButton.click();
	}

	public void selectMaritalStatus(String maritalStatus) {
		List<WebElement> listOfInputs = driver.findElements(By.xpath("id('pie_registered')/li[2]/div/div/input"));
		if(maritalStatus.equalsIgnoreCase(this.single )){
			listOfInputs.get(0).click();
		}
		else if (maritalStatus.equalsIgnoreCase(this.married )){
			listOfInputs.get(1).click();
		}
		else {
			listOfInputs.get(2).click();
		}
	}

	
	public void sendKeysToFirstNameInput(String firstName){
		firstNameInput.sendKeys(firstName);
	}
	
	public void sendKeysToLastNameInput(String lastName){
		lastNameInput.sendKeys(lastName);
	}
	
	public void sendKeysToPhoneInput(String phone){
		phoneInput.sendKeys(phone);
	}
	
	public void sendKeysToUsernameInput(String username){
		usernameInput.sendKeys(username);
	}
	
	public void sendKeysToEmailInput(String email){
		emailInput.sendKeys(email);
	}
	
	public void sendKeysToPasswordInput(String password){
		passwordInput.sendKeys(password);
	}
	
	
	public void sendKeysToConfirmPasswordInput(String confirmPassword){
		confirmPasswordInput.sendKeys(confirmPassword);
	}
	
	
	public void checkHobbyDancing(boolean bValue){
		if(bValue != hobbyDancing.isSelected()){
			hobbyDancing.click();
		}
	}
	
	public void checkHobbyReading(boolean bValue){
		if(bValue != hobbyReading.isSelected()){
			hobbyReading.click();
		}
	}
	
	public void checkHobbyCricket(boolean bValue){
		if(bValue != hobbyCricket.isSelected()){
			hobbyCricket.click();
		}
	}
		
	public boolean isDisplayedSuccessRegistrationMsg(){
		try {
			return successRegistrationMsg.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
