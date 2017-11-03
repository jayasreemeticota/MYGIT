package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class CreateLeadPage extends ProjectWrappers {	

	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Create Lead | opentaps CRM")) {
			reportStep("This is not CreateLeads Page", "Fail");
		}		
	}

	public CreateLeadPage enterCompanyName(String data)
	{
		enterById("createLeadForm_companyName", data);
		return this;
	}

	public CreateLeadPage enterFirstName(String data)
	{
		enterById("createLeadForm_firstName", data);
		return this;
	}

	public CreateLeadPage enterLastName(String data)
	{
		enterById("createLeadForm_lastName", data);
		return this;
	}

	public ViewLeadPage clickCreateButton() {

		clickByClassName("smallSubmit");
		return new ViewLeadPage(driver, test);
	}


	public CreateLeadPage clickCreateButtonForFailure()
	{
		clickByClassName("smallSubmit");
		return this;

	}


	public CreateLeadPage verifyErrMsg(String EM)
	{
		verifyTextContainsByXpath("//li[@class='errorMessage']", EM);
		return this;
	}



}










