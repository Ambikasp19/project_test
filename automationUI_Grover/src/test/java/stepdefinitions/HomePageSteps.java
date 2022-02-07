package stepdefinitions;

import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.pageobjects.grover.Homepage;
import com.pages.Cartpage;
import com.pages.HomePage;
import com.pages.Mobilescreen;
import com.pages.Signup_page;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	private static String title;
    HomePage homePage = new HomePage(DriverFactory.getDriver());
	private ConfigReader configReader;
	Properties prop;
	WebDriver driver;
	
	Cartpage cartage;
	Signup_page signup;
	Mobilescreen screen;
	
	String UserName="sureshvatil020@gmail.com";
	String Password="Suru@1234";
	
	String PRODUCT="HP";
	
	 

	    @When("^I search Product HP$")
	 
	    public void i_search_product_hp() throws Throwable 
	    {
	    	
	    	homepage.Search_product(PRODUCT);  
	    }
	    @Then("^the Appropriate search should contain the search input$")
	    public void the_appropriate_search_should_contain_the_search_input() throws Throwable
	    {
	    	try {
			
	    	List<WebElement> After = 
					driver.findElements(By.xpath("//*[@class='verticalStyles__Name-sc-1je3l7s-6 iSfTtA']"));
			
			System.out.println(After.size());
			for(int i = 0; i<After.size();i++) {
				String temp = After.get(i).getText();
				SoftAssert Assert = new SoftAssert();
				if ((temp.toLowerCase().contains(PRODUCT.toLowerCase()))){
					Assert.assertTrue(true);
					System.out.println(PRODUCT +" is displayed on product title Product Title: " + temp);
					Assert.assertTrue(true, PRODUCT +" is displayed on product title Product Title: " + temp);
					//System.out.println("pass");
				}else {
					Assert.assertTrue(false, PRODUCT + " is not displayed on product title Product Title: " + temp);
					//System.out.println("fail");
		
				}
				
			}
			
	 }catch(Exception e) {
			Assert.assertTrue(false);;	
			
		}
	       
	    }

	    @When("^I click on Cart Button$")
	    public void i_click_on_cart_button() throws Throwable
	    {
	    	
	    	cartage=new Cartpage(driver);
	    	cartage.click_continue();
	    	
	     }

	   
	    @And("^I Enter Sign_up Details$")
	    public void i_enter_signup_details() throws Throwable 
	    {
	    	signup=new Signup_page(driver);
	    	signup.login_signup(UserName,Password);
	    }
	    
	   
	    
	    @And("^Mobile confirmation should display$")
	    public void mobile_confirmation_should_display() throws Throwable 
	    {
	    	screen=new Mobilescreen(driver);
	    	screen.verify_mobile_screen();
	    	
	    	
	    }
}
