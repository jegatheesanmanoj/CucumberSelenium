package com.automation.demo.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.parabank.pages.LoginPage;
import com.parabank.pages.RegisterPage;
import com.automation.demo.helper.Helper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Stepdefinitions {


	WebDriver driver;
	LoginPage objLoginPage;
	RegisterPage objRegisterPage;
	String randomUsername=null;
	static String registeredUser=null;
	String registeredPassword="Dhawan_123";

	@Before
	public void openSetup()
	{		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		objLoginPage= new LoginPage(driver);
		objRegisterPage= new RegisterPage(driver);
		randomUsername=new Helper().getRandomString();		
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
		objRegisterPage.typeFirstname("Shikar");
		objRegisterPage.typeLastname("Dhawan");
		objRegisterPage.typeCity("dummycity");
		objRegisterPage.typeStreet("dummyStreet");
		objRegisterPage.typeState("dummyStreet");
		objRegisterPage.typeZipCode("dummyZipcode");
		objRegisterPage.typeSSN("dummySSN");

		objRegisterPage.typeUsername(randomUsername);
		registeredUser=randomUsername;
		objRegisterPage.typePassword("Dhawan_123");
		objRegisterPage.typeRepeatedPassword("Dhawan_123");

	}


	@When("^User submits the registration")
	public void usersubmitsRegistration() {
		objRegisterPage.clickRegister();  	

	}

	@SuppressWarnings("deprecation")
	@Then("^User should able to login in the system")
	public void userShouldLoginToTheSystem() {
		String expected="Your account was created successfully. You are now logged in.";
		Assert.assertEquals(expected,objRegisterPage.getSuccessMessage());
		objRegisterPage.clickLogOut();   	

	}


	@When("User types the registeredUser in username field")
	public void userEntersUsername() {
		objLoginPage.typeUsename(registeredUser);

	}
	@When("User types the registeredPassword in password field")
	public void userEntersPassword() {
		objLoginPage.typePassword(registeredPassword);

	}

	@When("User submits the login")
	public void userSubmitsRequest() {
		objLoginPage.submitForm();

	}
	
	@SuppressWarnings("deprecation")
	@Then("User should able to navigate to accounts page")
	public void userNavigatesToAccountspage() {
		Assert.assertTrue(objRegisterPage.checkLogoutLink());
	}

}
