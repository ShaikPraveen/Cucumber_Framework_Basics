$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Praveen_Automation/TCS_SELENIUM/Cucumber_Practice/Features/GuruLoginHooks.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Login Functionality with Cucumber Hooks",
  "description": "",
  "id": "verify-login-functionality-with-cucumber-hooks",
  "keyword": "Feature"
});
formatter.before({
  "duration": 47673209600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verfify Login Fuctionality with Hooks",
  "description": "",
  "id": "verify-login-functionality-with-cucumber-hooks;verfify-login-fuctionality-with-hooks",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Enter Registred username and password",
  "rows": [
    {
      "cells": [
        "mngr176855",
        "sEqAgUm"
      ],
      "line": 5
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click Login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Verify Login page",
  "keyword": "Then "
});
formatter.match({
  "location": "TC06_GuruLoginHooks_StepDefinations.enter_Registred_username_and_password(DataTable)"
});
formatter.result({
  "duration": 4052197100,
  "status": "passed"
});
formatter.match({
  "location": "TC06_GuruLoginHooks_StepDefinations.click_Login_button()"
});
formatter.result({
  "duration": 5991338700,
  "status": "passed"
});
formatter.match({
  "location": "TC06_GuruLoginHooks_StepDefinations.verify_Login_page()"
});
formatter.result({
  "duration": 96871700,
  "status": "passed"
});
formatter.after({
  "duration": 283188300,
  "status": "passed"
});
});