package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.RegisterationPage;

public class RegisterationPageTest extends TestBase2{

	RegisterationPage registerationPage;
	
	
	@DataProvider(name = "testData")
	public static Object[][] CreateStoreData() {
	    return new Object[][]
	            {
	                    {"Sahar", "Hassan" , "saherhassan_99@hotmail.com" , "London@10" ,}};
	            }	
	@Test(dataProvider = "testData")
	public void RegisterationSteps(String fNama, String lName, String Email, String pswd) throws Exception{
		registerationPage = new RegisterationPage(driver);
		registerationPage.RegisterationSteps(fNama, lName,Email,pswd);
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
	     registerationPage.clickRegisterBtn();
	     Thread.sleep(5000);
	     registerationPage.registerationSuccessMessage();
	}
}
