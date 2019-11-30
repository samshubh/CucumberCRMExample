$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/vt1056.SRITADS/eclipse-workspace/CucumberCRMExample/src/main/java/com/qa/feature/maps.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application",
  "description": "",
  "id": "free-crm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Passing the values by parameterization",
  "description": "",
  "id": "free-crm-application;passing-the-values-by-parameterization",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is viewing landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "landing page url is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user must enter the email and password",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "subhambiswas895@gmail.com",
        "Welcome123$"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user must click on login",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user must navigate to tasks link",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "click on add new button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "add the title and description and completion",
  "rows": [
    {
      "cells": [
        "title",
        "description",
        "completion"
      ],
      "line": 16
    },
    {
      "cells": [
        "Development",
        "Testing using maps",
        "15"
      ],
      "line": 17
    },
    {
      "cells": [
        "Kipos",
        "Testing here",
        "20"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DataDrivenMaps.user_is_viewing_landing_page()"
});
formatter.result({
  "duration": 11621629065,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenMaps.landing_page_url_is_displayed()"
});
formatter.result({
  "duration": 44487076,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenMaps.user_must_enter_the_email_and_password(DataTable)"
});
formatter.result({
  "duration": 8379202568,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenMaps.user_must_click_on_login()"
});
formatter.result({
  "duration": 4108936759,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenMaps.user_must_navigate_to_tasks_link()"
});
formatter.result({
  "duration": 4175268948,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenMaps.click_on_add_new_button()"
});
formatter.result({
  "duration": 4198084251,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenMaps.add_the_title_and_description_and_completion(DataTable)"
});
formatter.result({
  "duration": 50176823591,
  "status": "passed"
});
formatter.match({
  "location": "DataDrivenMaps.quit_the_browser()"
});
formatter.result({
  "duration": 1225903036,
  "status": "passed"
});
});