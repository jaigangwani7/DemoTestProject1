package com.NewProject.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.NewProject.constant.Constant;
import com.NewProject.helper.WaitHelper;
import com.NewProject.pageObject.LoginPage;
import com.NewProject.pageObject.NavigationMenu;
import com.NewProject.pageObject.ProductCategoryPage;
import com.NewProject.pageObject.ShoppinCartSummaryPage;
import com.NewProject.testBase.TestBase;


public class TillPaymentPage extends TestBase
{
	@Test
	public void testTillPaymentPage()
	{
		LoginPage loginTest = new LoginPage();
		loginTest.loginToApplication(Constant.userName,Constant.passWord);
		NavigationMenu menu = new NavigationMenu();
		menu.mouseOver("Women");
		menu.clickOnIntem("Women");
		ProductCategoryPage page = new ProductCategoryPage();
		Actions action = new Actions(Constant.driver);
		String test = "//*[@id='center_column']/ul/li[4]/div/div[1]/div";
		WebElement target = Constant.driver.findElement(By.xpath(test));
		action.moveToElement(target).perform();
		WaitHelper.explicitlyWaitTimeWaitTime(10, "//*[@id='center_column']/ul/li[4]/div/div[2]/div[2]/a[1]/span");
		page.clickOnAddToCart();

		
		WaitHelper.explicitlyWaitTimeWaitTime(10, "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");
		page.clickOnProceedTocheckOut();
		
		ShoppinCartSummaryPage shop = new ShoppinCartSummaryPage();
		shop.clickOnProceedTocheckOutInCart();
		shop.clickOnProceedTocheckOutInAddress();
		shop.clickOnTermsOfService();
		shop.clickOnProceedTocheckOutInShipping();
	}
}
