package com.phonelcdparts.loginTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phonelcdparts.base.BaseTest;
import com.phonelcdparts.loginPages.LoginPage;
import com.phonelcdparts.utilities.ExcelReader;


public class LoginTest2 extends BaseTest {
	LoginPage loginPage;
	ExcelReader er;
	String file = "src/test/resources/RegistrationData.xlsx";
	String sheetName = "Sheet1";
	

	@BeforeMethod(groups={"Smoke","Regression"})
	public void openApplication() {
		OpenApp();
	}

	
	@Test(priority=0,groups={"Smoke","Regression"})
	public void loginTest() {
		er = new ExcelReader(file, sheetName);
		loginPage = new LoginPage(driver);
		loginPage.myAcountMethod();
		loginPage.loginButtonMethod();
		loginPage.userNameMethod(er.getStringCellValue(2, 2));
		loginPage.passwordMethod(er.getStringCellValue(2, 3));
		loginPage.singInMethod();
	}

	@AfterMethod(groups={"Smoke","Regression"})
	public void closeApplication() {
		closeApp();

	}

}
