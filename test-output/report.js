$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/vt1056.SRITADS/eclipse-workspace/CucumberCRMExample/src/main/java/com/qa/feature/tagging.feature");
formatter.feature({
  "line": 1,
  "name": "Kipos Application",
  "description": "",
  "id": "kipos-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Login test",
  "description": "",
  "id": "kipos-application;login-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    },
    {
      "line": 4,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user in landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the kipos logo is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on login",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters email and password",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 11
    },
    {
      "cells": [
        "prashanth.burri@srijaytech.com",
        "welcome123"
      ],
      "line": 12
    },
    {
      "cells": [
        "jay@srijaytech.com",
        "welcome123"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "verify the user name",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggingExample.user_in_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "StepDefinition.user_enters_email_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 19,
  "name": "Adding the products to the cart after login",
  "description": "",
  "id": "kipos-application;adding-the-products-to-the-cart-after-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user in homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "gourmet text is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "click on gourmet section",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "view the product description page by clicking on product image",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "add the ingredients",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "click on add to cart",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "StepDefinition.click_on_gourmet_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 28,
  "name": "Viewing the cart products",
  "description": "",
  "id": "kipos-application;viewing-the-cart-products",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@SmokeTest"
    },
    {
      "line": 27,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user is in product details page",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "the cart count is displaying",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "click on cart icon",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "increase the product count",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "click on checkout button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 36,
  "name": "viewing the checkout page",
  "description": "",
  "id": "kipos-application;viewing-the-checkout-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@SmokeTest"
    },
    {
      "line": 35,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "user is in checkout page",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "checkout page text is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "select the pickup option",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "user set the pick up date and time",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "clicks on continue button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});