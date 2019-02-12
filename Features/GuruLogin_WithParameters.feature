Feature: Verify Login Functionality with Parameters

  Scenario: Verify Login Functionality with Parameters
    Given open browser
    When navigate to URL "https://demo.guru99.com/v4/"
    And enter registered username "mngr176855" and password "sEqAgUm"
    And click login button
    Then verify Login page
    And close the Browser
