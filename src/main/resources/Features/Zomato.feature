Feature: Checkout the zomato order process 

As a user 
I want to login into Zomoto app 
So that I can order food 


Scenario: Check the zomato login 

Given I am on login page
And I enter my email as "Nitin@gmail.com" and Password as "Nitin@123"
When I click on the login button 
Then I should login into the portal 