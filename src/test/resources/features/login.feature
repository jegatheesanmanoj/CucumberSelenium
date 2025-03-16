@ParaBankSelenium
Feature: Para Bank Login Functionality


  @Registrationtest @Sanity @Regression
  Scenario: Register to the Parabank application with valid details
    Given User navigates to bank home page
    When User types the required registration details
    And User submits the registration
    Then User should able to login in the system
    
  @Logintest @Regression
  Scenario: Login to the Parabank application with valid CREDS
    Given User navigates to bank home page
    When User types the registeredUser in username field
    And User types the registeredPassword in password field
    And User submits the login
    Then User should able to navigate to accounts page