package com.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddCustomer;
	
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how=How.NAME, using="rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how=How.NAME, using="dob")
	@CacheLookup
	WebElement txtDob;
	
	@FindBy(how=How.NAME, using="addr")
	@CacheLookup
	WebElement txtAddr;
	
	@FindBy(how=How.NAME, using="city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(how=How.NAME, using="state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how=How.NAME, using="pinno")
	@CacheLookup
	WebElement txtPin;
	
	@FindBy(how=How.NAME, using="telephoneno")
	@CacheLookup
	WebElement txtPhno;
	
	@FindBy(how=How.NAME, using="emailid")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how=How.NAME, using="password")
	@CacheLookup
	WebElement txtPwd;
	
	@FindBy(how=How.NAME, using="sub")
	@CacheLookup
	WebElement btnSubmit;
	
	
	public void clickAddNewCustomer()
	{
		lnkAddCustomer.click();
	}
	
	public void custName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	public void custGender(String cgender)
	{
		rdGender.sendKeys(cgender);
	}
	
	public void custDob(String mm, String dd, String yy)
	{
		txtDob.sendKeys(mm);
		txtDob.sendKeys(dd);
		txtDob.sendKeys(yy);
	}
	
	public void custAddress(String cadress)
	{
		txtAddr.sendKeys(cadress);
	}
	
	public void custCity(String ccity)
	{
		txtCity.sendKeys(ccity);
	}
	public void custState(String cstate)
	{
		txtState.sendKeys(cstate);
	}
	public void custPin(String cpin)
	{
		txtPin.sendKeys(String.valueOf(cpin));
	}
	public void custPhno(String cphno)
	{
		txtPhno.sendKeys(cphno);
	}
	
	public void custEmail(String cemail)
	{
		txtEmail.sendKeys(cemail);
	}
	public void custPwd(String cpwd)
	{
		txtPwd.sendKeys(cpwd);
	}
	public void custSubmit()
	{
		btnSubmit.click();
	}
	
	
	
	
	
	
	
	
	
	

}
