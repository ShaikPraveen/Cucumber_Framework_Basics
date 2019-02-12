Feature: Verify Login Functionality using Data Driven Testing

  Scenario Outline: Verify Guru Login Functionality with DDT
    Given Open browser
    When Navigate to Url "https://demo.guru99.com/v4/"
    And Enter Registered username "<username>" and password "<password>"
    And Click Loginin Button
    Then Verify Login Page
    And Close the Browser

    Examples: 
      | username   | password |
      | mngr176855 | sEqAgUm  |
      | mngr176855 | sEqAgUm  |
      | mngr176855 | sEqAgUm  |
      | mngr176855 | sEqAgUm  |
      | mngr176855 | sEqAgUm  |
      