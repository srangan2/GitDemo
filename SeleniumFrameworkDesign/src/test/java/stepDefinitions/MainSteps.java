package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    System.out.println("User landed on NetBanking Landing page");
	}
	
	
	/*
	 * @When("User login into application with Username {string} and password {string}"
	 * ) public void user_login_into_application_with_and_password(String Username,
	 * String password) { // Write code here that turns the phrase above into
	 * concrete actions System.out.println("with "+
	 * Username+"and password is "+password); }
	 */
	
	
	  @When("User login into application with Username (.+) and password (.+)$")
	  public void user_login_into_application_with_and_password(String Username,
	  String password) { // // Write code here that turns the phrase above into concrete actions //
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
}
