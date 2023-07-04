Feature: Verify the login process

As a registered user 

I want to login into the flipcart portal 

So that I can purchase some products

Scenario: Verify the successful login into the portal with email and password 

Given User launch the Chrome Browser 112 on window 11
And Enter the URL "https://www.flipkart.com/" 
And Login with Email as "Nitin@gmail.com" and Password is "Nitin@123" 
When User clicks on the login submit button 
Then User should login into the portal 
And User should land on the application Home Page 

