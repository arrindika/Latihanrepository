$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/signin/Signin.feature");
formatter.feature({
  "name": "Sign In",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Android"
    },
    {
      "name": "@SignIn"
    }
  ]
});
formatter.scenario({
  "name": "User Sign In with correct email and correct password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Android"
    },
    {
      "name": "@SignIn"
    },
    {
      "name": "@Check"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on E-money Sign In Page",
  "keyword": "Given "
});
formatter.match({
  "location": "demo.steps_definition.SignInStepDefinitions.userIsOnEMoneySignInPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input email \"ltfrzky@gmail.com\" on email or phone text field",
  "keyword": "When "
});
formatter.match({
  "location": "demo.steps_definition.SignInStepDefinitions.userInputEmailOnEmailOrPhoneTextField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input password \"P@ssw0rd\" on password text field",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps_definition.SignInStepDefinitions.userInputPasswordOnPasswordTextField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click sign in button on Sign In page",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps_definition.SignInStepDefinitions.userClickSignInButtonOnSignInPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "demo.steps_definition.SignInStepDefinitions.userIsInHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});