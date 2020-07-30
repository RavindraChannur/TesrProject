$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("1.Login.feature");
formatter.feature({
  "line": 1,
  "name": "Ebay login Feature.",
  "description": "",
  "id": "ebay-login-feature.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Ebaly Login page scenario.",
  "description": "",
  "id": "ebay-login-feature.;ebaly-login-page-scenario.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User is into ebay login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Title is ebay login",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User has enterd \"\u003csname\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User is clicked on sign button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User should navigate home page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "close driver",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "ebay-login-feature.;ebaly-login-page-scenario.;",
  "rows": [
    {
      "cells": [
        "sname",
        "password"
      ],
      "line": 11,
      "id": "ebay-login-feature.;ebaly-login-page-scenario.;;1"
    },
    {
      "cells": [
        "ravindra.channur@gmail.com",
        "Admin@123"
      ],
      "line": 12,
      "id": "ebay-login-feature.;ebaly-login-page-scenario.;;2"
    },
    {
      "cells": [
        "ravindra.channur1@gmail.com",
        "Admin@123"
      ],
      "line": 13,
      "id": "ebay-login-feature.;ebaly-login-page-scenario.;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Ebaly Login page scenario.",
  "description": "",
  "id": "ebay-login-feature.;ebaly-login-page-scenario.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User is into ebay login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Title is ebay login",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User has enterd \"ravindra.channur@gmail.com\" and \"Admin@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User is clicked on sign button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User should navigate home page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "close driver",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_into_ebay_login_page()"
});
formatter.result({
  "duration": 6150486800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_is_ebay_login()"
});
formatter.result({
  "duration": 474223,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ravindra.channur@gmail.com",
      "offset": 17
    },
    {
      "val": "Admin@123",
      "offset": 50
    }
  ],
  "location": "LoginStepDefination.user_has_enterd_username_and_password(String,String)"
});
formatter.result({
  "duration": 17447571,
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefination.LoginStepDefination.user_has_enterd_username_and_password(LoginStepDefination.java:58)\r\n\tat ✽.Then User has enterd \"ravindra.channur@gmail.com\" and \"Admin@123\"(1.Login.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_clicked_on_sign_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.user_should_navigate_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.close_driver()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 13,
  "name": "Ebaly Login page scenario.",
  "description": "",
  "id": "ebay-login-feature.;ebaly-login-page-scenario.;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User is into ebay login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Title is ebay login",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User has enterd \"ravindra.channur1@gmail.com\" and \"Admin@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User is clicked on sign button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User should navigate home page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "close driver",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_into_ebay_login_page()"
});
formatter.result({
  "duration": 1444266618,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_is_ebay_login()"
});
formatter.result({
  "duration": 65777,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ravindra.channur1@gmail.com",
      "offset": 17
    },
    {
      "val": "Admin@123",
      "offset": 51
    }
  ],
  "location": "LoginStepDefination.user_has_enterd_username_and_password(String,String)"
});
formatter.result({
  "duration": 505333,
  "error_message": "java.lang.NullPointerException\r\n\tat StepDefination.LoginStepDefination.user_has_enterd_username_and_password(LoginStepDefination.java:58)\r\n\tat ✽.Then User has enterd \"ravindra.channur1@gmail.com\" and \"Admin@123\"(1.Login.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_clicked_on_sign_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.user_should_navigate_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.close_driver()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("2.Home.feature");
formatter.feature({
  "line": 1,
  "name": "Ebay Home Feature.",
  "description": "",
  "id": "ebay-home-feature.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Ebaly Home page scenario.",
  "description": "",
  "id": "ebay-home-feature.;ebaly-home-page-scenario.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is into ebay Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Title is ebay Home",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User has enterd click button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User is clicked on Next button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User should navigate logout page",
  "keyword": "And "
});
formatter.match({
  "location": "HomeStepdefination.user_is_into_ebay_Home_page()"
});
formatter.result({
  "duration": 972890,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepdefination.title_is_ebay_Home()"
});
formatter.result({
  "duration": 105778,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepdefination.user_has_enterd_click_button()"
});
formatter.result({
  "duration": 92001,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepdefination.user_is_clicked_on_Next_button()"
});
formatter.result({
  "duration": 87111,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepdefination.user_should_navigate_logout_page()"
});
formatter.result({
  "duration": 75111,
  "status": "passed"
});
});