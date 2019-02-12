Feature: Verify Login Functionality with Data Table

  Scenario: Verifying Login Functionality with Data Table
    Given launch Browser
    When navigate to Url "https://demo.guru99.com/v4/"
    And enter register username and password
      | mngr176855 | sEqAgUm |
    And Click login button
    Then Verify login page
    And Close the browser
