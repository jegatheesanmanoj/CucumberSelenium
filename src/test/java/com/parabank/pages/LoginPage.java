package com.parabank.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	

    @FindBy(xpath="//input[@name='username']")
    private WebElement username;
    @FindBy(xpath="//input[@name='password']")
    private WebElement password;
    @FindBy(xpath="//input[@value='Log In']")
    private WebElement submitLogin;
    @FindBy(xpath="//a[text()='Register']")
    private WebElement registerLink;
    
    
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
