package com.phonelcdparts.loginTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.phonelcdparts.base.BaseTest;
import com.phonelcdparts.loginPages.LoginPage;
import com.phonelcdparts.utilities.ExcelReader;


public class LoginTest extends BaseTest {
	LoginPage loginPage;
	ExcelReader er;
	String file = "src/test/resources/RegistrationData.xlsx";
	String sheetName = "Sheet1";
	
	
	@BeforeSuite
	public void startSuite() {
		System.out.println("Runing Suite");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("End Suite");
		
	}

	@BeforeMethod(groups={"Smoke","Regression"})
	public void openApplication() {
		OpenApp();
	}

	
	@Test(priority=0, groups="Smoke")
	public void loginTest() {
		er = new ExcelReader(file, sheetName);
		loginPage = new LoginPage(driver);
		loginPage.myAcountMethod();
		loginPage.loginButtonMethod();
		loginPage.userNameMethod(er.getStringCellValue(1, 2));
		loginPage.passwordMethod(er.getStringCellValue(1, 3));
		loginPage.singInMethod();
	}
	
	@Test(priority=1, groups="Regression")
	public void loginTest2() {
		er = new ExcelReader(file, sheetName);
		loginPage = new LoginPage(driver);
		loginPage.myAcountMethod();
		loginPage.loginButtonMethod();
		loginPage.userNameMethod(er.getStringCellValue(3, 2));
		loginPage.passwordMethod(er.getStringCellValue(3, 3));
		loginPage.singInMethod();
		String actualTile="hello";
		String expentedTitle = driver.getTitle();
		Assert.assertEquals(actualTile, expentedTitle);
	}

	@AfterMethod(groups={"Smoke","Regression"})
	public void closeApplication() {
		closeApp();

	}

}
