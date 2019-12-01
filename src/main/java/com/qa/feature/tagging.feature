Feature: Kipos Application


@SmokeTest @SanityTest
Scenario: Login test
Given user in landing page 
When the kipos logo is displayed 
Then click on login
Then user enters login "prashanth.burri@srijaytech.com" and "welcome123"

@SmokeTest
Scenario: Adding the products to the cart after login
Given user in homepage
When gourmet text is displayed
Then clicking on gourmet section
Then view the product description page by clicking on product image
Then add the ingredients
Then click on add to cart

@SmokeTest @SanityTest
Scenario: Viewing the cart products
Given user is in product details page
When the cart count is displaying
Then click on cart icon
Then increase the product count
Then click on checkout button

@SmokeTest @SanityTest
Scenario: viewing the checkout page
Given user is in checkout page
When checkout page text is displayed
Then select the pickup option 
Then user set the pick up date and time
Then clicks on continue button



