
Feature: Application Login

Background:
When launch the browser from config variables
And hit the home page url of banking site



 

 #Resuable
 @RegressionTest @NetBanking
  Scenario: User page default Login
    Given User is on NetBanking landing page
    When User login into application with Username 12345 and password 0953
    Then Home page is displayed
    And Cards are displayed
    
  @SmokeTest @RegressionTest @Mortgage
  Scenario Outline: Mortgage User Page default Login
    Given User is on NetBanking landing page
    When User login into application with Username "<Username>" and password "<Password>"
    Then Home page is displayed
    And Cards are displayed
    
    Examples:
    |Username | Password|
    |debituser| hello12 |
    |credituser| lpo213 |
    
   
  


    
    