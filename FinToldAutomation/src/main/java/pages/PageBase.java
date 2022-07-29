package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	protected WebDriver driver;
	
	// Create Contractor 
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// sleep method
	public static void sleep(int seconds)
	{
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	// click method 
	public void ClickButton (WebElement button)
	{
		button.click();
	}
	// sendkey method
	protected static void SendText (WebElement TextElement , String Value)
	{
		TextElement.clear();
		TextElement.sendKeys(Value);
	}

	protected  static void SelElemetText_IncludeKeysEnter(WebElement TextElement, String Value)
	{
		TextElement.clear();
		TextElement.sendKeys(Value, Keys.ENTER);
	}


	public void Dispaly(WebDriver driver, WebElement element) {
		element.isDisplayed();
	}
	



	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, Math.max(document.documentElement.scrollHeight, document.body.scrollHeight, document.documentElement.clientHeight));");

	}
	public void scrollToElement(WebElement webElement) throws Exception {
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoViewIfNeeded()", webElement);
	    Thread.sleep(500);
	}
	
	
}