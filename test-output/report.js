$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Shubham/eclipse-workspace/CucumberExample/src/main/java/com/qa/feature/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test",
  "description": "",
  "id": "free-crm-application-test;free-crm-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is in the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title is displaying as FreeCRM Pro title",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user entering the email and password",
  "rows": [
    {
      "cells": [
        "subhambiswas895@gmail.com",
        "Welcome123$"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "clicking on submit button here",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicking on deals link",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicking on new add deals button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enter title and company",
  "rows": [
    {
      "cells": [
        "Business",
        "Srijay"
      ],
      "line": 14
    },
    {
      "cells": [
        "Chips",
        "Lays"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user clicks on save button here",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "closes the browser here",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTablesForCRM.user_is_in_the_homepage()"
});
formatter.result({
  "duration": 12099997135,
  "status": "passed"
});
formatter.match({
  "location": "DataTablesForCRM.title_is_displaying_as_FreeCRM_Pro_title()"
});
formatter.result({
  "duration": 55802907,
  "status": "passed"
});
formatter.match({
  "location": "DataTablesForCRM.user_entering_the_email_and_password(DataTable)"
});
formatter.result({
  "duration": 8503980392,
  "status": "passed"
});
formatter.match({
  "location": "DataTablesForCRM.clicking_on_submit_button_here()"
});
formatter.result({
  "duration": 4173107212,
  "status": "passed"
});
formatter.match({
  "location": "DataTablesForCRM.user_clicking_on_deals_link()"
});
formatter.result({
  "duration": 4259444212,
  "status": "passed"
});
formatter.match({
  "location": "DataTablesForCRM.user_clicking_on_new_add_deals_button()"
});
formatter.result({
  "duration": 4262951833,
  "status": "passed"
});
formatter.match({
  "location": "DataTablesForCRM.user_enter_and(DataTable)"
});
formatter.result({
  "duration": 6474819926,
  "status": "passed"
});
formatter.match({
  "location": "DataTablesForCRM.user_clicks_on_save_button_here()"
});
formatter.result({
  "duration": 3176424527,
  "status": "passed"
});
formatter.match({
  "location": "DataTablesForCRM.closes_the_browser_here()"
});
formatter.result({
  "duration": 719110632,
  "status": "passed"
});
});