Feature: user story
Background: 
Given alex must be in login page
When alex enters "Lalitha" and "Password123"
Then alex should be in home page
Scenario: without adding any item in cart
Given Alex should be logged in and in home page
When Alex search for headphones in search field 
And try to proceed with the payment without adding any item in the cart
Then testme doesn't display the cart icon
Scenario: adding atleast one item in cart
Given Alex should be logged in and in home page
When Alex search for headphones in search field 
And try to proceed with the payment after adding any item in the cart
Then testme should display the cart icon