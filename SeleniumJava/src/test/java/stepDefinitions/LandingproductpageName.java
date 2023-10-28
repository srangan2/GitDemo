package stepDefinitions;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class LandingproductpageName {
public WebDriver driver;
public String LandingproductpageName;
public String offerpageProductName;
TestContextSetup testContextSetup;

public LandingproductpageName(TestContextSetup testContextSetup)
{
	this.testContextSetup=testContextSetup;
}

	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hssri\\GitX\\SeleniumJava\\Drivers\\chromedriver.exe");
		testContextSetup.driver = new ChromeDriver();
		testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	}
	@When("user searched with shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		testContextSetup.driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(shortName);
	Thread.sleep(5000);
	testContextSetup.LandingproductpageName = testContextSetup.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
	System.out.println(LandingproductpageName+"is extracted from Home page");
	
		
	}
	
	   
	    
	}
	
	

