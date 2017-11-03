package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class LoginPage extends ProjectWrappers {	
	
	public LoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Opentaps Open Source ERP + CRM")) {
			reportStep("This is not Login Page", "Fail");
		}		
	}
	
	
	public LoginPage enterUserName(String data){
		enterByXpath("//input[@id='username']", data);
		return this;
	}

	public LoginPage enterPassword(String data) {
		enterById("password", data);
		return this;
	}
	
	public HomePage clickLogin() {
		clickByClassName("decorativeSubmit");
		return new HomePage(driver, test);
		
	}
	
	public LoginPage clickLoginForFailure() {
		clickByClassName("decorativeSubmit");
		return this;
		
	}
	
	public LoginPage verifyErrorMsg(String text) {
		verifyTextContainsById("errorDiv", text);
		return this;
	}
	
	
	
	
	
}










