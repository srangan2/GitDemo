package stepDefinitions;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenKartStepDefinition {
public WebDriver driver;
	@Given("User is on GreenCart Landing_page")
	public void user_is_on_green_cart_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hssri\\GitX\\SeleniumJava\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	}
	@When("user searched with shortname {String} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String string) {
	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("Tom");
	String productName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
	System.out.println(productName +" is extracted from Home page");
	
		
	}
	@Then("user searched with shortname {String} in offer page to check if product exist")
	public void user_searched_with_shortname_in_offer_page_to_check_if_product_exist() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a[@href=\"#/offers\"]")).click();
	    Set<String> s1 =driver.getWindowHandles();
	    Iterator<String> i1 =s1.iterator();
	    
	    
	    
	}
	
	
}
