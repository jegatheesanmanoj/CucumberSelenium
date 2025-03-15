package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='customer.firstName']")
	private WebElement firstName;
	@FindBy(xpath="//input[@name='customer.lastname']")
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
	
	
	
	public RegisterPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void typeFirstname(String firstName)
	{
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
		this.password.sendKeys(repeatedPassword);
	}
	
	 public void clickRegister()
	{
		register.click();
	}

}
