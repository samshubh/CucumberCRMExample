Feature: Free CRM Application Test

Scenario Outline: Free CRM Login Test

Given user is in the home page
When title is displaying as FreeCRM Pro
Then user enters the "<email>" and "<password>"
Then click submit button
Then user clicks on contacts link
Then user clicks on new add button contact
Then user enter "<firstname>" and "<lastname>"
Then user clicks on save button
Then closing the browser

Examples:

  |email|password|firstname|lastname|
  |subhambiswas895@gmail.com|Welcome123$|Sangeeta|Biswas|
  |subhambiswas895@gmail.com|Welcome123$|Annushree|Biswas|
  |subhambiswas895@gmail.com|Welcome123$|Prashanta|Biswas|
