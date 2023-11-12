
Feature: Locators testing on Rahul Shetty academy
  I want to use this template for my feature file
  

@LocatorTest
  Scenario: Login to application through Selenium locators by getting password
    Given while on the sign in screen 
    When enter user name and password
    And check box remeber by username
    And check box remeber by I agree to the terms and privacy policy
    And click on Sign in
    Then Error message comes and get text