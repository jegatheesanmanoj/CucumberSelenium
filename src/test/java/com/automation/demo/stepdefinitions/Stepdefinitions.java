package com.automation.demo.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.parabank.pages.LoginPage;
import com.parabank.pages.RegisterPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitions {
	
	
	WebDriver driver;
	LoginPage objLoginPage;
	RegisterPage objRegisterPage;
	
	@Before
	public void openSetup()
	{		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		objLoginPage= new LoginPage(driver);
		objRegisterPage= new RegisterPage(driver);
		System.out.println("Driver initialized!");
	}
	
	@After
	public void closeSetup()
	{		
			driver.quit();
	}
	
    @Given("User navigates to bank home page")
    public void userNavigatesToHomePage() {
    	objLoginPage.getDriver().get("https://parabank.parasoft.com");
       
    }
    @Given("User types the required registration details")
    public void userEntersRegistrationDetails() {
    	objLoginPage.clickOnRegistration();
    	objRegisterPage.typeFirstname(null);
    	objRegisterPage.typeLastname(null);
    	objRegisterPage.typeCity(null);
    	objRegisterPage.typeStreet(null);
    	objRegisterPage.typeState(null);
    	objRegisterPage.typeZipCode(null);
    	objRegisterPage.typeSSN(null);
    	
    	objRegisterPage.typeUsername(null);
    	objRegisterPage.typePassword(null);
    	objRegisterPage.typeRepeatedPassword(null);
    	objRegisterPage.clickRegister();
    }
    @When("^User types the \"(.*)\" in username field")
    public void userEntersUsername(String username) {
    	objLoginPage.typeUsename(username);
       
    }
    @When("^User types the \"(.*)\" in password field")
    public void userEntersPassword(String password) {
    	objLoginPage.typePassword(password);
       
    }
    @Then("User should abe able to login in the system")
    public void userSubmitsRequest() {
    	objLoginPage.submitForm();
       
    }

}
