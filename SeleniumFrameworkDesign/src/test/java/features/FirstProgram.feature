
Feature: Application Login

Background:
Given setup the entries in database
When launch the browser from config variables
And hit the home page url of banking site


 
 @RegressionTest 
 Scenario: Admin page default Login
    Given User is on NetBanking landing page
    When User login into application with Username "admin" and password "1234"
    Then Home page is displayed
    And Cards are displayed

 #Resuable
 @MobileTest  
  Scenario: User page default Login
    Given User is on NetBanking landing page
    When User login into application with Username 12345 and password 0953
    Then Home page is displayed
    And Cards are displayed
    
  @SmokeTest  
  Scenario Outline: User page default Login
    Given User is on NetBanking landing page
    When User login into application with Username "<Username>" and password "<Password>"
    Then Home page is displayed
    And Cards are displayed
    
    Examples:
    |Username | Password|
    |debituser| hello12 |
    |credituser| lpo213 |
    
    @SmokeTest @RegressionTest
    Scenario: User Page default Sign up
    Given User is on Practice Landing page
    When User signup into application
    |Rahul|
    |Shetty|
    |contact@email.com|
    |9886189639|
    Then Home page is displayed
    And Cards are displayed
  


    
    