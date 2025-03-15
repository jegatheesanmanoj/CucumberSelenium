@ParaBankSelenium
Feature: Para Bank Login Functionality


  @Registrationtest
  Scenario: Register to the Parabank application with valid details
    Given User navigates to bank home page
    When User types the required registration details
    And User submits the registration
    Then User should able to login in the system
    
  @Logintest
  Scenario: Login to the Parabank application with valid CREDS
    Given User navigates to bank home page
    When User types the "demouser" in username field
    And User types the "rest_123" in password field
    Then User should able to login in the system