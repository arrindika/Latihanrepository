$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TopUp/TopUp.feature");
formatter.feature({
  "name": "TopUp E-money",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Android"
    },
    {
      "name": "@TopUp"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Top Up",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TUP-06"
    }
  ]
});
formatter.step({
  "name": "User is on E-money Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User input email \"mas@boy.com\" on email or phone text field",
  "keyword": "When "
});
formatter.step({
  "name": "User input password \"P@ssw0rd\" on password text field",
  "keyword": "And "
});
formatter.step({
  "name": "User click sign in button on Sign In page",
  "keyword": "And "
});
formatter.step({
  "name": "User is on top up e-money homepage",
  "keyword": "And "
});
formatter.step({
  "name": "User input \u003cKeyword\u003e on card number text field",
  "keyword": "When "
});
formatter.step({
  "name": "User chose \u003cKeyword1\u003e on top up amount option",
  "keyword": "And "
});
formatter.step({
  "name": "User see payment details with total payment is \u003cKeyword2\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User choose \u003cKeyword3\u003e payment option",
  "keyword": "And "
});
formatter.step({
  "name": "User click pay button",
  "keyword": "And "
});
formatter.step({
  "name": "User see top up payment is successfull",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Keyword",
        "Keyword1",
        "Keyword2",
        "Keyword3"
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"10000\"",
        "\"Rp11.000\"",
        "\"Bank Transfer\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"20000\"",
        "\"Rp21.500\"",
        "\"Bank Transfer\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"50000\"",
        "\"Rp51.500\"",
        "\"Bank Transfer\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"100000\"",
        "\"Rp102.000\"",
        "\"Bank Transfer\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"150000\"",
        "\"Rp152.500\"",
        "\"Bank Transfer\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"200000\"",
        "\"Rp203.500\"",
        "\"Bank Transfer\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"10000\"",
        "\"Rp11.000\"",
        "\"Merchant\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"20000\"",
        "\"Rp21.500\"",
        "\"Merchant\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"50000\"",
        "\"Rp51.500\"",
        "\"Merchant\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"100000\"",
        "\"Rp102.000\"",
        "\"Merchant\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"150000\"",
        "\"Rp152.500\"",
        "\"Merchant\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"200000\"",
        "\"Rp203.000\"",
        "\"Merchant\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"10000\"",
        "\"Rp11.000\"",
        "\"Wallet Balance\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"20000\"",
        "\"Rp21.500\"",
        "\"Wallet Balance\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"50000\"",
        "\"Rp51.500\"",
        "\"Wallet Balance\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"100000\"",
        "\"Rp102.000\"",
        "\"Wallet Balance\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"150000\"",
        "\"Rp152.500\"",
        "\"Wallet Balance\""
      ]
    },
    {
      "cells": [
        "\"6032123432123210\"",
        "\"200000\"",
        "\"Rp203.000\"",
        "\"Wallet Balance\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Top Up",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Android"
    },
    {
      "name": "@TopUp"
    },
    {
      "name": "@TUP-06"
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
  "name": "User input email \"mas@boy.com\" on email or phone text field",
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
  "name": "User is on top up e-money homepage",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps.TopUpStepsDefinition.userIsOnTopUpEMoneyHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input \"6032123432123210\" on card number text field",
  "keyword": "When "
});
formatter.match({
  "location": "demo.steps.TopUpStepsDefinition.userInputOnCardNumberTextField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User chose \"10000\" on top up amount option",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps.TopUpStepsDefinition.userChoseOnTopUpAmountOption(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see payment details with total payment is \"Rp11.000\"",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps.TopUpStepsDefinition.userSeePaymentDetailsWithTotalPaymentIs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User choose \"Bank Transfer\" payment option",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps.TopUpStepsDefinition.userChoosePaymentOption(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click pay button",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps.TopUpStepsDefinition.userClickPayButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see top up payment is successfull",
  "keyword": "Then "
});
formatter.match({
  "location": "demo.steps.TopUpStepsDefinition.userSeeTopUpPaymentIsSuccessfull()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Top Up",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Android"
    },
    {
      "name": "@TopUp"
    },
    {
      "name": "@TUP-06"
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
  "name": "User input email \"mas@boy.com\" on email or phone text field",
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
  "name": "User is on top up e-money homepage",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps.TopUpStepsDefinition.userIsOnTopUpEMoneyHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input \"6032123432123210\" on card number text field",
  "keyword": "When "
});
formatter.match({
  "location": "demo.steps.TopUpStepsDefinition.userInputOnCardNumberTextField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User chose \"20000\" on top up amount option",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps.TopUpStepsDefinition.userChoseOnTopUpAmountOption(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see payment details with total payment is \"Rp21.500\"",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps.TopUpStepsDefinition.userSeePaymentDetailsWithTotalPaymentIs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User choose \"Bank Transfer\" payment option",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps.TopUpStepsDefinition.userChoosePaymentOption(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click pay button",
  "keyword": "And "
});
formatter.match({
  "location": "demo.steps.TopUpStepsDefinition.userClickPayButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see top up payment is successfull",
  "keyword": "Then "
});
formatter.match({
  "location": "demo.steps.TopUpStepsDefinition.userSeeTopUpPaymentIsSuccessfull()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Top Up",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Android"
    },
    {
      "name": "@TopUp"
    },
    {
      "name": "@TUP-06"
    }
  ]
});
