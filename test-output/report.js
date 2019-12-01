$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Shubham/eclipse-workspace/CucumberCRMExample/src/main/java/com/qa/feature/tagging.feature");
formatter.feature({
  "line": 1,
  "name": "Kipos Application",
  "description": "",
  "id": "kipos-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20273810908,
  "status": "passed"
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
  "name": "user enters login \"prashanth.burri@srijaytech.com\" and \"welcome123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggingExample.user_in_landing_page()"
});
formatter.result({
  "duration": 160591275,
  "status": "passed"
});
formatter.match({
  "location": "TaggingExample.the_kipos_logo_is_displayed()"
});
formatter.result({
  "duration": 103043185,
  "status": "passed"
});
formatter.match({
  "location": "TaggingExample.click_on_login()"
});
formatter.result({
  "duration": 4184080587,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prashanth.burri@srijaytech.com",
      "offset": 19
    },
    {
      "val": "welcome123",
      "offset": 56
    }
  ],
  "location": "TaggingExample.user_enters_login_email_and_password(String,String)"
});
formatter.result({
  "duration": 14733497695,
  "status": "passed"
});
formatter.after({
  "duration": 742580634,
  "status": "passed"
});
formatter.before({
  "duration": 14598966361,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Adding the products to the cart after login",
  "description": "",
  "id": "kipos-application;adding-the-products-to-the-cart-after-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user in homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "gourmet text is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "clicking on gourmet section",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "view the product description page by clicking on product image",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "add the ingredients",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "click on add to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggingExample.user_in_homepage()"
});
formatter.result({
  "duration": 196136576,
  "status": "passed"
});
formatter.match({
  "location": "TaggingExample.gourmet_text_is_displayed()"
});
formatter.result({
  "duration": 27370,
  "status": "passed"
});
formatter.match({
  "location": "TaggingExample.clicking_on_gourmet_section()"
});
formatter.result({
  "duration": 31647,
  "status": "passed"
});
formatter.match({
  "location": "TaggingExample.view_the_product_description_page_by_clicking_on_product_image()"
});
formatter.result({
  "duration": 29081,
  "status": "passed"
});
formatter.match({
  "location": "TaggingExample.add_the_ingredients()"
});
formatter.result({
  "duration": 35923,
  "status": "passed"
});
formatter.match({
  "location": "TaggingExample.click_on_add_to_cart()"
});
formatter.result({
  "duration": 35067,
  "status": "passed"
});
formatter.after({
  "duration": 776534208,
  "status": "passed"
});
formatter.before({
  "duration": 19426419596,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Viewing the cart products",
  "description": "",
  "id": "kipos-application;viewing-the-cart-products",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@SmokeTest"
    },
    {
      "line": 20,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user is in product details page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "the cart count is displaying",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "click on cart icon",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "increase the product count",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "click on checkout button",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggingExample.user_is_in_product_details_page()"
});
formatter.result({
  "duration": 60299,
  "status": "passed"
});
formatter.match({
  "location": "TaggingExample.the_cart_count_is_displaying()"
});
formatter.result({
  "duration": 30791,
  "status": "passed"
});
formatter.match({
  "location": "TaggingExample.click_on_cart_icon()"
});
formatter.result({
  "duration": 25231,
  "status": "passed"
});
formatter.match({
  "location": "TaggingExample.increase_the_product_count()"
});
formatter.result({
  "duration": 93656,
  "status": "passed"
});
formatter.match({
  "location": "TaggingExample.click_on_checkout_button()"
});
formatter.result({
  "duration": 33357,
  "status": "passed"
});
formatter.after({
  "duration": 731707964,
  "status": "passed"
});
formatter.before({
  "duration": 16566507437,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "viewing the checkout page",
  "description": "",
  "id": "kipos-application;viewing-the-checkout-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@SmokeTest"
    },
    {
      "line": 28,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user is in checkout page",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "checkout page text is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "select the pickup option",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user set the pick up date and time",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "clicks on continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggingExample.user_is_in_checkout_page()"
});
formatter.result({
  "duration": 27798,
  "status": "passed"
});
formatter.match({
  "location": "TaggingExample.checkout_page_text_is_displayed()"
});
formatter.result({
  "duration": 23521,
  "status": "passed"
});
formatter.match({
  "location": "TaggingExample.select_the_pickup_option()"
});
formatter.result({
  "duration": 26942,
  "status": "passed"
});
formatter.match({
  "location": "TaggingExample.user_set_the_pick_up_date_and_time()"
});
formatter.result({
  "duration": 23094,
  "status": "passed"
});
formatter.match({
  "location": "TaggingExample.clicks_on_continue_button()"
});
formatter.result({
  "duration": 20528,
  "status": "passed"
});
formatter.after({
  "duration": 764364036,
  "status": "passed"
});
});