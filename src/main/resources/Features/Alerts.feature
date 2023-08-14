Feature: Verify Alerts 

As a user 
I want to see the different alerts 
So that I can automate in future

@Urgent
Scenario: Handle multiple types of Alert
 Given User is on registration page "https://demoqa.com/alerts"
 When User clicks on the Simple Alert 
 And User clicks on the time based alert
 And User clicks on the confirmation alert 
 And User clicks on the prompt alert and enter text as "Vaibhav"