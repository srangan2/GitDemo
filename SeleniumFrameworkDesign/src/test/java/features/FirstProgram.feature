
Feature: Application Login
  
 Scenario: Admin page default Login
    Given User is on NetBanking landing page
    When User login into application with Username "admin" and password "1234"
    Then Home page is displayed
    And Cards are displayed

 #Resuable   
  Scenario: User page default Login
    Given User is on NetBanking landing page
    When User login into application with Username 12345 and password 0953
    Then Home page is displayed
    And Cards are displayed
    
  Scenario Outline: User page default Login
    Given User is on NetBanking landing page
    When User login into application with Username "<Username>" and password "<Password>"
    Then Home page is displayed
    And Cards are displayed
    
    Examples:
    |Username | Password|
    |debituser| hello12 |
    |credituser| lpo213 |
  


    
    