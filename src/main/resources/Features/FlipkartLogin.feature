@UserManagement
Feature: Verify login process of the application

  Background: 
    Given User is on landing page
    When User clicks on the login button

  @High @Critical @functional @Uslogin @SmokeTest @November @UserManagement
  Scenario: Verify user login with Valid email id and password
    And Enter the email id as "Nitin@gmail.com" and password as "Nitin@123"
    And Click on the login button
    Then User should be login into system successfully
    And Logout button should display to user

  @Low @low @functional @Uslogin
  Scenario: Verify user login with Invalid details
    And Enter the email id as "Nitin@gmail.com" and password as "Nitin @123"
    And Click on the login button
    Then User should get a validation message "Password is not correct"

  @High @Critical @functional @Uslogin
  Scenario: Verify user login with Facebook
    And Click on the Facbook Icon
    And Enters the Facebook Login details as "Nitin@yahoo.com" and Password is "Nitin@123"
    And Clicks on Login button on the facebook screen
    Then User should successfully authencate from Facebook
    And Redirect into the filpkart system
    And Facebook Profile photo should display as user image in flipkart


    
    

    
    
    