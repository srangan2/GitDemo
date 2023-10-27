Feature: Search and Place the order for products
  I want to use this template for my feature file

  @tag1
  Scenario: Search Experience for product search in both home and offers page
    Given User is on GreenCart Landing page
    When user searched with shortname "Tom" and extracted actual name of product
   Then user searched with shortname "Tom" in offer page to check if product exist
   

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
