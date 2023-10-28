Feature: Search and Place the order for products
  I want to use this template for my feature file

 
  Scenario: Search Experience for product search in both home and offers page
    Given User is on GreenCart Landing page
    When user searched with shortname "Tom" and extracted actual name of product
   Then user searched with shortname "Tom" in offer page to 
   And check if product exist same name
   

