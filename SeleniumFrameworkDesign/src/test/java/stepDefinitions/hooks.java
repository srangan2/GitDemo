package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@NetBanking")
	public void netbankingSetup()
	{
		System.out.println("*****************************");
		System.out.println("Setup the entries in Netbanking database from hooks file@before-netbanking");
	}
	@Before("@Mortgage")
	public void mortgageSetup()
	{
		
		System.out.println("Setup the entries in Mortgage database from hooks file@before-Mortgage");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Setup the entries in Mortgage databas from hooks file@After-Mortgagee");
	}

	@Before("@LocatorValidations")
	public void Locators()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hssri\\eclipse-workspace\\coreJavaTraining\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	}
}

//Before->Background->scenario->After
