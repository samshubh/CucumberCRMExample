Feature: Kipos Login Test

Scenario: Login Test for Kipos

Given user is already in Landing Page
When the title of the page is Kipos Collective
Then user click on login button
Then user enters email and password
Then user click on submit button



Scenario: View all the products page

Given user is already in homepage
When user is in gourmet section
Then click on gourmet section
Then add the bowl to the cart 
Then close the browser