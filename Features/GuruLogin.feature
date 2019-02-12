Feature: Verifying Login Functionality without Parameters
Description: I am Testing My Account Login Functionality

  #SIMPLE LOGIN FEATURE FILE WITHOUT PARAMETERS
  Scenario: Login with Valid Username and Valid Password
    Given Open Browser
    When navigate to url "https://demo.guru99.com/v4/"
    And enter registered username and password
    And click on login button
    Then verify login page
    And close the browser
