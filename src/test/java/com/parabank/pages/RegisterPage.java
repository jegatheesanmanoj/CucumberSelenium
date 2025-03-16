package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.internal.com.google.protobuf.Duration;

public class RegisterPage {

	WebDriver driver;

	@FindBy(xpath="//input[@name='customer.firstName']")
	private WebElement firstName;
	@FindBy(xpath="//input[@name='customer.lastName']")
	private WebElement lastname;
	@FindBy(xpath="//input[@name='customer.address.street']")
	private WebElement street;
	@FindBy(xpath="//input[@name='customer.address.city']")
	private WebElement city;
	@FindBy(xpath="//input[@name='customer.address.state']")
	private WebElement state;
	@FindBy(xpath="//input[@name='customer.address.zipCode']")
	private WebElement zipCode;
	@FindBy(xpath="//input[@name='customer.ssn']")
	private WebElement ssn;
	@FindBy(xpath="//input[@name='customer.username']")
	private WebElement username;
	@FindBy(xpath="//input[@name='customer.password']")
	private WebElement password;
	@FindBy(xpath="//input[@name='repeatedPassword']")
	private WebElement repeatedPassword;
	@FindBy(xpath="//input[@value='Register']")
	private WebElement register;



	@FindBy(xpath="//div[@id='rightPanel']//following::h1[@class='title']/following-sibling::p")
	WebElement successMessage;
	@FindBy(xpath="//a[text()='Log Out']")
	private WebElement logOut;


	WebDriverWait wait;



	public RegisterPage (WebDriver driver)
	{
		this.driver=driver;
		wait= new WebDriverWait(driver, 50);
		PageFactory.initElements(driver, this);


	}

	public void typeFirstname(String firstName)
	{
		wait.until(ExpectedConditions.visibilityOf(this.firstName));
		this.firstName.sendKeys(firstName);
	}
	public void typeLastname(String lastname)
	{
		this.lastname.sendKeys(lastname);
	}
	public void typeStreet(String street)
	{
		this.street.sendKeys(street);
	}
	public void typeCity(String city)
	{
		this.city.sendKeys(city);
	}
	public void typeState(String state)
	{
		this.state.sendKeys(state);
	}
	public void typeZipCode(String zipCode)
	{
		this.zipCode.sendKeys(zipCode);
	}
	public void typeSSN(String ssn)
	{
		this.ssn.sendKeys(ssn);
	}
	public void typeUsername(String username)
	{
		this.username.sendKeys(username);
	}
	public void typePassword(String password)
	{
		this.password.sendKeys(password);
	}
	public void typeRepeatedPassword(String repeatedPassword)
	{
		this.repeatedPassword.sendKeys(repeatedPassword);
	}

	public void clickRegister()
	{
		register.click();
	}
	public String getSuccessMessage()
	{
		wait.until(ExpectedConditions.visibilityOf(successMessage));
		return successMessage.getText();
	}

	public void clickLogOut()
	{
		wait.until(ExpectedConditions.visibilityOf(logOut));
		logOut.click();
	}
	
	public Boolean checkLogoutLink()
	{
		wait.until(ExpectedConditions.visibilityOf(logOut));		
		return logOut.isDisplayed();
	}
	


}
