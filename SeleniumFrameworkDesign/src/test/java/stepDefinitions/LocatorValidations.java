package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LocatorValidations {
	
	@Given("while on the sign in screen")
	public void while_on_the_sign_in_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("enter user name and password")
	public void enter_user_name_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("check box remeber by username")
	public void check_box_remeber_by_username() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hssri\\eclipse-workspace\\coreJavaTraining\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	}
	@When("check box remeber by I agree to the terms and privacy policy")
	public void check_box_remeber_by_i_agree_to_the_terms_and_privacy_policy() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("click on Sign in")
	public void click_on_sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Error message comes and get text")
	public void error_message_comes_and_get_text() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
