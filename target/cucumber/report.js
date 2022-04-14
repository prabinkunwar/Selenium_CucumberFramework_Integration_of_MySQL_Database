$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechfiosLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios billing Login Functionality Validation",
  "description": "",
  "id": "techfios-billing-login-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TF_LoginFeature"
    },
    {
      "line": 1,
      "name": "@Login_Test_Regression"
    }
  ]
});
formatter.before({
  "duration": 2475098800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Techfios_login_page()"
});
formatter.result({
  "duration": 1257710000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User should be able to login with valid credentials from the Database",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;user-should-be-able-to-login-with-valid-credentials-from-the-database",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@TF_login2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User enters \"username\" from the database",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enters \"password\" from the database",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User clicks signin button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_from_the_database(String)"
});
formatter.result({
  "duration": 2432789600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_from_the_database(String)"
});
formatter.result({
  "duration": 2092175900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_signin_button()"
});
formatter.result({
  "duration": 2637685800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 179363200,
  "status": "passed"
});
formatter.after({
  "duration": 974005200,
  "status": "passed"
});
});