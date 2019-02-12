Feature: Verify Login Functionality with Data Table Header

Scenario: Verify Login Functionality with Data Table Header
Given Open the Browser
When Navigate to url "https://demo.guru99.com/v4/"
And Enter registered username and password
     |username|password|
     |mngr176855|sEqAgUm|
And click login Button
Then verify Login Page
And Close The Browser