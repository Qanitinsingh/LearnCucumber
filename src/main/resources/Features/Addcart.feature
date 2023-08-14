Feature: Add to cart testing
  
  As a user 
  I want to add product into cart 
  So that I can purchase those later

  Background: 
    Given User is on home page
    And User is already logged in into portal
@UI
  Scenario: Test with valid input
    When User clicks on "Nike AIR MAX" shoes on the home page
    And select the quantity as "1"
    And Click on Add to cart button
    Then Product should add into the cart
@SmokeTest
  Scenario: Continue purchasing product from cart with credit card
    And User go to the add to cart screen
    When User clicks on proceed to buy button
    And Enter the billing address as follows
      | Varun |  | Sharma |  | Varun@gmail.com |  | 4564546546 |  | SBP MOhali |  | 160062 |
    And Select the payment option as "Credit card"
    And Enter the card number as "646546456545460" and Expiry date as "12/24" and CVV as "123"
    And Click on the place order button
    Then Order should placed successfully
    And User should get notification on regsitered email ID and MOibile number
    And Track order button should display on the "Order Page"
    And Product should same as we have ordered with all details

  Scenario Outline: 
    When User clicks on the add billing address button
    And Enter <FirstName> , <LastName> , <BillingAddress> , <ShippingAddress> and <Zip>
    And clicks on the save button
    Then Billing address should save into the system

    Examples: 
      | FirstName |  | LastName |  | BillingAddress |  | ShippingAddress |  | Zip    |
      | Nitin     |  | Singh    |  | SBP            |  | Mohali          |  | 160063 |
     