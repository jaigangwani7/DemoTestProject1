package com.NewProject.testScript;

import org.testng.annotations.Test;

import com.NewProject.constant.Constant;
import com.NewProject.pageObject.LoginPage;
import com.NewProject.testBase.TestBase;


public class LoginTest extends TestBase
{
	@Test
	public void testValidLogin()
	{
		LoginPage loginTest = new LoginPage();
		loginTest.loginToApplication(Constant.userName,Constant.passWord);
	}
}
