package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC003_HmePagePositive extends ProjectWrappers{

	@BeforeClass
	public void setData() {
		testCaseName = "TC003_HmePagePositive";
		testDescription = "Verifing the created data";
		authors = "Jayasree";
		category = "Smoke";
		dataSheetName = "TC003";
		browserName = "chrome";
	}

	@Test(dataProvider = "fetchData")
	public void createLead(String uName, String pwd, String verfiyLoginName,String CN,String FN,String LN) {

		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd).clickLogin()
		.verfiyUserName(verfiyLoginName)
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeads()
		.enterCompanyName(CN)
		.enterFirstName(FN)
		.enterLastName(LN)
		.clickCreateButton()
		.verifyCompanyName(CN);
		
	}
	
}



