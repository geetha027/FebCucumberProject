$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Demoqa.feature");
formatter.feature({
  "name": "To validate registration form functionality of demoqa application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenario({
  "name": "To verify the registration form with invalid details of demoqa application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Scenario1"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To pass the url of demoqa application",
  "keyword": "When "
});
formatter.match({
  "location": "DemoqaRegistrationForm.toPassTheUrlOfDemoqaApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass invalid firstname into firstname field",
  "keyword": "And "
});
formatter.match({
  "location": "DemoqaRegistrationForm.toPassInvalidFirstnameIntoFirstnameField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass invalid lastname into lastname field",
  "keyword": "And "
});
formatter.match({
  "location": "DemoqaRegistrationForm.toPassInvalidLastnameIntoLastnameField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass invalid email into emailfield",
  "keyword": "And "
});
formatter.match({
  "location": "DemoqaRegistrationForm.toPassInvalidEmailIntoEmailfield()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.DemoqaRegistrationForm.toPassInvalidEmailIntoEmailfield(DemoqaRegistrationForm.java:43)\r\n\tat ✽.To pass invalid email into emailfield(src/test/resources/Demoqa.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To choose gender in gender radio button field",
  "keyword": "And "
});
formatter.match({
  "location": "DemoqaRegistrationForm.toChooseGenderInGenderRadioButtonField()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To pass invalid mobilenumber into mobilenumber field",
  "keyword": "And "
});
formatter.match({
  "location": "DemoqaRegistrationForm.toPassInvalidMobilenumberIntoMobilenumberField()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/FacebookLogin.feature");
formatter.feature({
  "name": "To validate login functionality of facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "To validate invalid username and invalid password of fb login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Scenario2"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookFunctionality.to_launch_the_url_of_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass invalid username into email field",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality.to_pass_invalid_username_into_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass invalid password into password field",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality.to_pass_invalid_password_into_password_field()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.FacebookFunctionality.to_pass_invalid_password_into_password_field(FacebookFunctionality.java:41)\r\n\tat ✽.To pass invalid password into password field(src/test/resources/FacebookLogin.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To click login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality.to_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To check whether navigate to home page or not",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality.to_check_whether_navigate_to_home_page_or_not()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate the positive and negative combinations",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Scenario3"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user has to launch the url of application",
  "keyword": "When "
});
formatter.step({
  "name": "user has to pass the \"\u003cemaildata\u003e\"email data in email field",
  "keyword": "And "
});
formatter.step({
  "name": "user has to pass the \"\u003cpassworddata\u003e\"password data in password field",
  "keyword": "And "
});
formatter.step({
  "name": "user has to click the login button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emaildata",
        "passworddata"
      ]
    },
    {
      "cells": [
        "java@gmail.com",
        "12345"
      ]
    },
    {
      "cells": [
        "cucumber@gmail.com",
        "6789"
      ]
    },
    {
      "cells": [
        "framework@gmail.com",
        "101112"
      ]
    },
    {
      "cells": [
        "sql@gmail.com",
        "sql004"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the positive and negative combinations",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Scenario3"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch the url of application",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToLaunchTheUrlOfApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the \"java@gmail.com\"email data in email field",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToPassTheEmailDataInEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the \"12345\"password data in password field",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToPassThePasswordDataInPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combinations",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Scenario3"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch the url of application",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToLaunchTheUrlOfApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the \"cucumber@gmail.com\"email data in email field",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToPassTheEmailDataInEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the \"6789\"password data in password field",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToPassThePasswordDataInPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combinations",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Scenario3"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch the url of application",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToLaunchTheUrlOfApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the \"framework@gmail.com\"email data in email field",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToPassTheEmailDataInEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the \"101112\"password data in password field",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToPassThePasswordDataInPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combinations",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Scenario3"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch the url of application",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToLaunchTheUrlOfApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the \"sql@gmail.com\"email data in email field",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToPassTheEmailDataInEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to pass the \"sql004\"password data in password field",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToPassThePasswordDataInPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookFunctionality2.userHasToClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});