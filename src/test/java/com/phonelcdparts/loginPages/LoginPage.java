package com.phonelcdparts.loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CLASS_NAME, using = "user-act")
	public WebElement myAcountLocator;// pom style coding

	public void myAcountMethod() {
		myAcountLocator.click();
		
	}
	

	@FindBy(how = How.CLASS_NAME, using = "login")
	public WebElement loginButtonLocator;

	public void loginButtonMethod() {
	loginButtonLocator.click();
	}
	

	@FindBy(how = How.ID, using = "email")
	WebElement userNameId;

	public WebElement userNameMethod(String enterYourUserName) {
		userNameId.sendKeys(enterYourUserName);
		return userNameId;

	}

	@FindBy(how = How.ID, using = "pass")
	WebElement passWordLocators;

	public WebElement passwordMethod(String enterYourPassWord) {
		passWordLocators.sendKeys(enterYourPassWord);
		return passWordLocators;

	}

	@FindBy(how = How.NAME, using = "send")
	WebElement singInLocator;

	public WebElement singInMethod() {
		singInLocator.submit();
		return singInLocator;

	}

	@FindBy(how = How.LINK_TEXT, using = "Forgot Your Password?")
	WebElement forgetPassword;

	public WebElement forgetPasswordMethod() {
		forgetPassword.submit();
		return forgetPassword;

	}

	@FindBy(how = How.LINK_TEXT, using = "Create an Account")
	WebElement createNewAccout;

	public WebElement createNewAccoutMethod() {
		createNewAccout.click();
		return createNewAccout;

	}

}
