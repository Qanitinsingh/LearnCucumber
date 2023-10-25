Feature: Verify the signup process of the application

  @Signup @High @Critical
  Scenario Outline: Verify the signup process of the application
    Given User is on landing page
    When User clicks on the Signup button
    And Enter the "<Email>" , "<Password>" , and "<OTP>"
    And Clicks on the signup button
    Then User should be able to signup into the system

    Examples: 
      | Email |  | Password |  | OTP |
