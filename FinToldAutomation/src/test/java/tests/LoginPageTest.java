package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	
	@DataProvider(name = "loginData")
	public static Object[][] CreateStoreData() {
	    return new Object[][]
	            {
	                    {"saherhassan_99@hotmail.com" , "London@10" ,}};
	            }	
	
	@Test(dataProvider = "loginData")
	public void LoginSteps(String Email, String pswd) throws Exception{
		loginPage = new LoginPage(driver);
		loginPage.LoginSteps(Email, pswd);
		Thread.sleep(6000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(2000);
        loginPage.Save();
	}
}

