$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Users should be able to login with given credentials",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "Login as a guest",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the  login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the \"username\" and \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.the_user_enters_the_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the welcome text",
  "keyword": "Then "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.the_user_should_see_the_welcome_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to logout by clicking logout button",
  "keyword": "And "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.theUserShouldBeAbleToLogoutByClickingLogoutButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with different username and passwords",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the  login page",
  "keyword": "Given "
});
formatter.step({
  "name": "the users enters \"\u003cusername\u003e\" \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the users should get warning message as Invalid Email or Password",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "",
        ""
      ]
    },
    {
      "cells": [
        "",
        "etete"
      ]
    },
    {
      "cells": [
        "ette",
        ""
      ]
    },
    {
      "cells": [
        "user@phtravels.com",
        "54664"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with different username and passwords",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the  login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users enters \"\" \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.the_users_enters(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users should get warning message as Invalid Email or Password",
  "keyword": "Then "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.theUsersShouldGetWarningMessageAsInvalidEmailOrPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with different username and passwords",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the  login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users enters \"\" \"etete\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.the_users_enters(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users should get warning message as Invalid Email or Password",
  "keyword": "Then "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.theUsersShouldGetWarningMessageAsInvalidEmailOrPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with different username and passwords",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the  login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users enters \"ette\" \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.the_users_enters(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users should get warning message as Invalid Email or Password",
  "keyword": "Then "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.theUsersShouldGetWarningMessageAsInvalidEmailOrPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with different username and passwords",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the  login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users enters \"user@phtravels.com\" \"54664\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.the_users_enters(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users should get warning message as Invalid Email or Password",
  "keyword": "Then "
});
formatter.match({
  "location": "com.wefox.stepdefinitons.LoginStepDefinitions.theUsersShouldGetWarningMessageAsInvalidEmailOrPassword()"
});
formatter.result({
  "status": "passed"
});
});