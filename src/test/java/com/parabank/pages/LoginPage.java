package com.parabank.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	

    @FindBy(xpath="//input[@name='username']")
    WebElement username;
    @FindBy(xpath="//input[@name='password']")
    WebElement password;
    @FindBy(xpath="//input[@value='Log In']")
    WebElement submitLogin;
    
    
	public LoginPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    
    public void typeUsename(String usernameText)
    {
    	username.sendKeys(usernameText);
    }
    
    public void typePassword(String passwordText)
    {
    	password.sendKeys(passwordText);
    }
    
    public WebDriver getDriver()
    {
    	return this.driver;
    }
    
    public void submitForm()
    {
    	submitLogin.click();
    }

}
