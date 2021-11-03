package com.banking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageObjects.AddCustomerPage;
import com.banking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {

	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassWord(password);
		lp.clickSubmit();

		Thread.sleep(3000);

		AddCustomerPage addcust = new AddCustomerPage(driver);

		addcust.clickAddNewCustomer();
		addcust.custName("John");
		addcust.custGender("male");
		addcust.custDob("10", "10", "1990");
		Thread.sleep(3000);
		addcust.custAddress("SomersetApt");
		addcust.custCity("SpringValley");
		addcust.custState("MS");
		addcust.custPin("45677");
		addcust.custPhno("23445678");
		Thread.sleep(3000);

		String email = randomestring() + "@gmail.com";
		Thread.sleep(3000);

		addcust.custEmail(email);
		System.out.println("Email:" + email);
		String pwd = randomestring2();
		System.out.println("pwd:" + pwd);

		addcust.custPwd(pwd);
		Thread.sleep(3000);
		addcust.custSubmit();

		Thread.sleep(3000);

		/*
		 * boolean
		 * result=driver.getPageSource().contains("Customer Rigestered Successfully!!!"
		 * ); if(result==true) { Assert.assertTrue(true);
		 * 
		 * } else { CaptureScreen(driver,"addNewCustomer"); Assert.assertTrue(false); }
		 */

	}

}
