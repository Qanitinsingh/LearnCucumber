Feature: Check Register form functionality

 As a guest user
 
 I want to register into the Website
 
 So that I can use it further

  Background: 
    Given User launch the chrome browser 
    And Enter the URL as "https://demo.automationtesting.in/Register.html"

  @UI
  Scenario Outline: Check Register form steps
  Given User is on "Register" page
    When User enters firstname "<Firstname>", lastname "<Lastname>", email "<Email>", password "<Password>" and confirm password "<Cpassword>"
    And Upload the user image
    And Select the Hobbies as "Cricket"
   

 Examples:

      | Firstname | Lastname | Email           | Password  | Cpassword |
      | Vandana     | Singh    | Nitin@yahoo.com | Nitin@123 | Nitin@123 |
     
      
    

  @Smoke
  Scenario Outline: Check Register form steps negative 
    Given User is on "Register" page
    When User enters firstname "<Firstname>", lastname "<Lastname>", email "<Email>", password "<Password>" and confirm password "<Cpassword>"
    And Upload the user image
       
        
      | Firstname | Lastname | Email           | Password  | Cpassword |
      | &$(*&*     | Singh    | Nitin@ yahoo.com | Nitin@123 | Nitin@1235 |
      
      
      
      
