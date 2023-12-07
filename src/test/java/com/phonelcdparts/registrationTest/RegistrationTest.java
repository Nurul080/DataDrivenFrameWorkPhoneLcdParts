package com.phonelcdparts.registrationTest;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.phonelcdparts.base.BaseTest;
import com.phonelcdparts.registrationPage.RegistrationPage;
import com.phonelcdparts.utilities.ExcelReader;

public class RegistrationTest extends BaseTest {
	RegistrationPage rPage;
	ExcelReader er;
	String file = "src/test/resources/RegistrationData.xlsx";
	String sheetName = "Sheet2";
	
	
	@BeforeMethod(groups={"Smoke","Regression"})
	public void openApplication() {
		OpenApp();
	}
	
	
	@Test(priority=0,groups="Smoke")
	public void aloRegistrationTest() {
		rPage = new RegistrationPage(driver);
		er = new ExcelReader(file, sheetName);
		rPage.myAcountMethod();
		rPage.crateAccountMethod();
		rPage.firstNameMethod(er.getStringCellValue(1, 0));
		rPage.lastNameMethod(er.getStringCellValue(1, 1));
		rPage.emailMethod(er.getStringCellValue(1, 2));
		rPage.passwordMethod(er.getStringCellValue(1, 3));
		//rPage.confirmpasswordMethod(er.getStringCellValue(1, 4));
		rPage.crateaccountMethod();
	}
	@Test(priority=1,groups="Regression")
	public void sokalRegistrationTest() {
		rPage = new RegistrationPage(driver);
		er = new ExcelReader(file, sheetName);
		rPage.myAcountMethod();
		rPage.crateAccountMethod();
		rPage.firstNameMethod(er.getStringCellValue(2, 0));
		rPage.lastNameMethod(er.getStringCellValue(2, 1));
		rPage.emailMethod(er.getStringCellValue(2, 2));
		rPage.passwordMethod(er.getStringCellValue(2, 3));
		//rPage.confirmpasswordMethod(er.getStringCellValue(2, 4));
		rPage.crateaccountMethod();
		String actualTile="hello";
		String expentedTitle = driver.getTitle();
		Assert.assertEquals(actualTile, expentedTitle);
		
	}
	@Test(priority=2,groups="Regression")
	public void testSkiped(){
		throw new SkipException("Skipping this exception");
		
	}
	
	
	@AfterMethod(groups={"Smoke","Regression"})
	public void closeApplication() {
		closeApp();
		
	}

}
