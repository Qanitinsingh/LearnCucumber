Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given User is on "Register" page
    When User enters firstname "<Firstname>", lastname "<Lastname>", email "<Email>", password "<Password>" and confirm password "<Cpassword>"
    And Upload the user image
    And Select the Hobbies as "Cricket"
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
