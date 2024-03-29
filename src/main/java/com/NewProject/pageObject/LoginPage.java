package com.NewProject.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NewProject.constant.Constant;
import com.NewProject.helper.LoggerHelper;
import com.NewProject.testBase.TestBase;

public class LoginPage 
{
	private final Logger log = LoggerHelper.takeLogger(LoginPage.class);
	@FindBy(xpath="//*[contains(@title,'Log in to your customer account')]")
	WebElement signin;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement emailAddress;
	
	@FindBy(xpath="//*[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='SubmitLogin']")
	WebElement submitLogin;
	
	@FindBy(xpath="//*[@id='email_create']")
	WebElement registrationEmailAddress;
	
	@FindBy(xpath="//*[@id='SubmitCreate']")
	WebElement createAnAccount;
	
	@FindBy(xpath ="//a[@title='Log me out']")
	WebElement logout;
	

	
	public LoginPage()
	{
		PageFactory.initElements(Constant.driver, this);
		log.info("Login Page Object Created");
		TestBase.logExtentReport("Login Page Object Created");
	}
	
	
	public void clickOnSignInLink(){
		log.info("clicked on sign in link...");
		TestBase.logExtentReport("clicked on sign in link...");
		signin.click();
		}
	
	public void enterEmailAddress(String emailAddress){
		log.info("entering email address...."+emailAddress);
		TestBase.logExtentReport("entering email address...."+emailAddress);
		this.emailAddress.sendKeys(emailAddress);
		}
	
	public void enterPassword(String password){
		log.info("entering password...."+password);
		TestBase.logExtentReport("entering password...."+password);
		this.password.sendKeys(password);
	}
	
	public void clickOnSubmitButton(){
		log.info("clicking on submit button...");
		TestBase.logExtentReport("clicking on submit button");
		submitLogin.click();
		}
	
	
	
	public void loginToApplication(String emailid, String pwd)
	{
		clickOnSignInLink();
		enterEmailAddress(emailid);
		enterPassword(pwd);
		clickOnSubmitButton();
	}
	public void enterRegistrationEmail()
	{
		String email = System.currentTimeMillis()+"@gmail.com";
		log.info("entering registration email.."+email);
		TestBase.logExtentReport("entering registration email.."+email);
		registrationEmailAddress.sendKeys(email);
		}
	
	public void clickOnCreateAnAccount()
	{
		log.info("clicking on create an account button...");
		TestBase.logExtentReport("clicking on create an account button..");
		createAnAccount.click();	

	}
	
	public void clickOnLogout()
	{
		log.info("Logging out from App...");
		TestBase.logExtentReport("Logging out from App...");
		logout.click();
		
	}
}
