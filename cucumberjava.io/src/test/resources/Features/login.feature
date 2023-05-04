@SmokeFeature
Feature: feature to test the login functionality
@SmokeTest
  Scenario: Check login is succesful with valid credentials
    Given user is on login page
    When user enter username and password
    And clicks on login button
    Then User is navigate to the homepage
    


