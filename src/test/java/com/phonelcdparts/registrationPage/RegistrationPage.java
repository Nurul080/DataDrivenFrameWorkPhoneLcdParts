package com.phonelcdparts.registrationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {//cronstractor
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CLASS_NAME, using = "user-act")
	public WebElement myAcountLocator;// pom style coding

	public void myAcountMethod() {
		myAcountLocator.click();
		
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"html-body\"]/div[2]/div[1]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/a[2]/button")
	public WebElement crateAccount;
	
	public void crateAccountMethod() {
		crateAccount.click();
		
	}
	@FindBy(how =How.ID, using = "firstname")
	public WebElement firstName;
	
	public WebElement firstNameMethod(String enterfirstName) {
		firstName.sendKeys(enterfirstName);
		return firstName;
		
	}
	@FindBy(how = How.ID, using = "lastname")
	public WebElement lastName;
	
	public WebElement lastNameMethod(String enterlastName) {
		lastName.sendKeys(enterlastName);
		return lastName;
		
	}
	@FindBy(how = How.NAME, using = "email")
	public WebElement email;
	
	public WebElement emailMethod(String enterEmail) {
		email.sendKeys(enterEmail);
		return email;
		
	}
	@FindBy(how = How.NAME, using = "password")
	public WebElement password;
	
	public WebElement passwordMethod(String enterPassword) {
		password.sendKeys(enterPassword);
		return password;
		
	}
	@FindBy(how = How.NAME, using = "password_confirmation")
	public WebElement confirmpassword;
	
	public WebElement confirmpasswordMethod(String enterconfirmpassword) {
		confirmpassword.sendKeys(enterconfirmpassword);
		return confirmpassword;
		
	}
	@FindBy(how = How.NAME, using = "next")
	public WebElement crateaccount;
	
	public void crateaccountMethod() {
		crateaccount.submit();
	}
	
	
	
	
	
	
		
	
}


