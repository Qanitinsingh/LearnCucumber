Feature: Verify the product purchase functionality 

As a Registered user 
I want to login into the portal
So that I can purchase the product 

Scenario: Checkout the product with Gpay

Given User launch the Chrome Browser 112 on window 11
And Enter the URL "https://www.flipkart.com/" 
And Login with Email as "Nitin@gmail.com" and Password is "Nitin@123" 
When User clicks on the login submit button 
And  User should login into the portal 
   And Select the Hobbies as "Cricket"

And User click on Add to cart button on "Nike Shoes 123"
And Click on the Checkout button 
And Enter the Billing Address as <FirstName> , <LastName> , <Delivery adresss> ,<Phone> and <ZIP> 

|FirstName| |LastName| |Delivery adresss| |Phone     |    |  ZIP | 
|Nitin    | |Singh   | |Homeland MOhali| |8557037939|     |160065|

Then User is able to place the Order 
