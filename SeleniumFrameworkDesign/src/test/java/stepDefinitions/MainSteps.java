package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    System.out.println("User landed on NetBanking Landing page");
	}
	
	@Given("User is on landing page")
	public void user_is_on_landing_page()
	{
		System.out.println("User is on Practice landed on Landing page");
	}
	

	@Given("User is on Practice Landing page")
	public void user_is_on_practice_landing_page()
	{
		System.out.println("User is on Practice landed on Landing page");
	}
	
	
	
	
	
//	  @When("User login into application with Username {string} and password {string}"
//	) public void user_login_into_application_with_and_password(String Username,
//	  String password) { // Write code here that turns the phrase above into concrete actions 
//		  System.out.println("with "+ Username+"and password is "+password); }
	
	
	@When ("User signup into application")
	public void User_signup_into_application(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		
	}
	
  @When("User login into application with Username (.+) and password (.+)$")
	  public void user_login_into_application_with_and_password(String Username, String password) 
  { // // Write code here that turns the phrase above into concrete actions //
		  System.out.println("with "+
	  Username+"and password is "+password); }
	 		
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Cards are displayed");
	  
	}
	
	@Given("setup the entries in database")
	public void setupEntries()
	{
		System.out.println("*************************");
		System.out.println("setup the entries in database");
	}
	
	@When("launch the browser from config variables")
	public void launchbrowser()
	{
		System.out.println("*************************");
		System.out.println("launch the browser from config variables");
	}
	
	@When("hit the home page url of banking site")
	public void hiturl()
	{
		System.out.println("hit the home page url of banking site");
	}
	
}
