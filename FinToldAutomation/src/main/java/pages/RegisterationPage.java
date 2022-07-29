package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends PageBase  {

	public RegisterationPage(WebDriver driver)
	{
		super(driver);
	}
	

	@FindBy(xpath="//*[@name=\"FirstName\"]")
	WebElement firstName;
	@FindBy(xpath="//*[@name=\"LastName\"]")
	WebElement lastName;
	@FindBy(xpath="//*[@name=\"Email\"]")
	WebElement email;
	@FindBy(xpath="//*[@name=\"Password\"]")
	WebElement password;
	@FindBy(xpath="//*[contains(text(),'Sign up now')]")
	WebElement signUpBtn;
	@FindBy(xpath="//*[contains(text(), \"Do it later\")] ")
	WebElement doItLaterBtn;
	@FindBy(xpath="//*[contains(text(),'Getting started with fintold.')]")
	WebElement successMsg;
	
	
	
	public void RegisterationSteps(String fNama, String lName, String Email, String pswd) throws Exception {
		SendText(firstName, fNama);
		SendText(lastName, lName);
		SendText(email, Email);
		SendText(password, pswd);
		Thread.sleep(4000);
	}
	public void clickRegisterBtn() throws InterruptedException {
		Thread.sleep(4000);
		ClickButton(signUpBtn);
		Thread.sleep(9000);
		ClickButton(doItLaterBtn);
	}
	
	public void registerationSuccessMessage() {
		Dispaly(driver, successMsg);
	}}

