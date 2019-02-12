Feature: Verify Login Functionality with Cucumber Hooks

  Scenario: Verfify Login Fuctionality with Hooks
    Given Enter Registred username and password
      | mngr176855 | sEqAgUm |
    When Click Login button
    Then Verify Login page
