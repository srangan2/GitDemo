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
//Single responsibility class
//loosly coupled class
public class OfferPageStepDefinition {
public WebDriver driver;
public String LandingproductpageName;
public String offerpageProductName;
TestContextSetup testContextSetup;
public OfferPageStepDefinition(TestContextSetup testContextSetup)
{
	this.testContextSetup=testContextSetup;
}
	
	@Then("user searched with shortname {string} in offer page to")
	public void user_searched_with_shortname_in_offer_page_to_check_if_product_exist(String shortName) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	
	
	   testContextSetup.driver.findElement(By.xpath("//input[@id=\"search-field\"]")).sendKeys(shortName);
	   Thread.sleep(3000);
	   System.out.println(offerpageProductName = testContextSetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText());
	   Thread.sleep(3000);
	}   
	
	public void switchtoOfferpage() {
		if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"));
		testContextSetup.driver.findElement(By.xpath("//a[@href=\"#/offers\"]")).click();
	    Set<String> s1 =testContextSetup.driver.getWindowHandles();
	    Iterator<String> i1 =s1.iterator();
	    String Parentwindow = i1.next();
	   String ChildWindow1 = i1.next();
	   testContextSetup.driver.switchTo().window(ChildWindow1);
	}
	   @Then("check if product exist same name")
	   public void check_if_product_exist_same_name() throws InterruptedException
	   {
		   
		   Assert.assertEquals(offerpageProductName, testContextSetup.LandingproductpageName);
		   Thread.sleep(3000);
		   testContextSetup.driver.quit();
	   }
	   
	    
	}
	
	

