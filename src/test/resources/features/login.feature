@ParaBankSelenium
Feature: Para Bank Login Functionality

  @Logintest
  Scenario: Login to the Parabank application with valid CREDS
    Given User navigates to bank home page
    When User types the "demouser" in username field
    And User types the "rest_123" in password field
    Then User should able to login in the system