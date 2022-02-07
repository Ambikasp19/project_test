package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_page 
{
	
	WebDriver driver;
	 
	 
	public Signup_page(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	 
	 
	@FindBy(xpath="//*[@id='login-email-input']")

    WebElement UserName;

    @FindBy(xpath="//*[@id='login-password-input']")

    WebElement UserPassword;    

    @FindBy(xpath="//*[text()='Log in']")

    WebElement loginButton;
    
   
	 
	public void login_signup(String uid,String pass)
	{
		UserName.sendKeys(uid);
		UserPassword.sendKeys(pass);
		loginButton.click();
		

}}
