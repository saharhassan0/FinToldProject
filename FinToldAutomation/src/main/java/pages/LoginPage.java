package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
	public LoginPage (WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[contains(text(),\"Login now\")]")
	WebElement loginBtn;
	@FindBy(xpath="//*[@name=\"email\"] ")
	WebElement email;
	@FindBy(xpath="//*[@name=\"password\"] ")
	WebElement password;
	@FindBy(xpath="//*[contains(@class, 'mainButton main')]")
	WebElement saveBtn;
	
	
	public void LoginSteps(String Email, String pswd) throws InterruptedException {
		ClickButton(loginBtn);
		Thread.sleep(4000);
		SendText(email, Email);
		SendText(password, pswd);
		Thread.sleep(2000);		
	}
	
	public void Save() {
		ClickButton(saveBtn);
	}
}
