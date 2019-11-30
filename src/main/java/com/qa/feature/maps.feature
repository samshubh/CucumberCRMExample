Feature: Free CRM Application

Scenario: Passing the values by parameterization

Given user is viewing landing page 
When landing page url is displayed
Then user must enter the email and password
 
|email|password|
|subhambiswas895@gmail.com|Welcome123$|

Then user must click on login
Then user must navigate to tasks link
Then click on add new button
Then add the title and description and completion
|title|description|completion|
|Development|Testing using maps|15|
|Kipos|Testing here|20|

Then quit the browser
