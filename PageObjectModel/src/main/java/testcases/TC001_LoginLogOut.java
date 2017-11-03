package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC001_LoginLogOut extends ProjectWrappers{
	
	@BeforeClass
	public void setData() {
		testCaseName = "LoginLogout";
		testDescription = "Login and LogOut in LeafTaps";
		authors = "Bala";
		category = "Smoke";
		dataSheetName = "TC001";
		browserName = "chrome";
	}
	
	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String verfiyLoginName) {
		
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd).clickLogin()
		.verfiyUserName(verfiyLoginName);
		//.clickLogOut();
		
		
	}

}












