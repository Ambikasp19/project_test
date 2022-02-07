package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Mobilescreen 
{
	String actual;
	WebDriver driver;
	public Mobilescreen(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(xpath="//*[text()=\"What's your number?\"]")  
	  WebElement MobileNumber;
	 
	 
	public void verify_mobile_screen()
	 {
		boolean a=MobileNumber.isDisplayed();
		System.out.println(a);
		
	 }

}
