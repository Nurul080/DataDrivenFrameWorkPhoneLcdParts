package com.phonelcdparts.registrationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phonelcdparts.base.BaseTest;
import com.phonelcdparts.registrationPage.RegistrationPage;
import com.phonelcdparts.utilities.ExcelReader;

public class RegistrationTest2 extends BaseTest {
	RegistrationPage rPage;
	ExcelReader er;
	String file = "src/test/resources/RegistrationData.xlsx";
	String sheetName = "Sheet2";
	
	
	@BeforeMethod(groups={"Smoke","Regression"})
	public void openApplication() {
		OpenApp();
	}
	
	
	@Test(priority=0,groups="Regression")
	public void dupurRegistrationTest() {
		rPage = new RegistrationPage(driver);
		er = new ExcelReader(file, sheetName);
		rPage.myAcountMethod();
		rPage.crateAccountMethod();
		rPage.firstNameMethod(er.getStringCellValue(3, 0));
		rPage.lastNameMethod(er.getStringCellValue(3, 1));
		rPage.emailMethod(er.getStringCellValue(3, 2));
		rPage.passwordMethod(er.getStringCellValue(3, 3));
		//rPage.confirmpasswordMethod(er.getStringCellValue(3, 4));
		rPage.crateaccountMethod();
	}
	@Test(priority=1,groups="Smoke")
	public void bikelRegistrationTest() {
		rPage = new RegistrationPage(driver);
		er = new ExcelReader(file, sheetName);
		rPage.myAcountMethod();
		rPage.crateAccountMethod();
		rPage.firstNameMethod(er.getStringCellValue(4, 0));
		rPage.lastNameMethod(er.getStringCellValue(4, 1));
		rPage.emailMethod(er.getStringCellValue(4, 2));
		rPage.passwordMethod(er.getStringCellValue(4, 3));
		//rPage.confirmpasswordMethod(er.getStringCellValue(4, 4));
		rPage.crateaccountMethod();
	}
	
	@AfterMethod(groups={"Smoke","Regression"})
	public void closeApplication() {
		closeApp();
		
	}

}
