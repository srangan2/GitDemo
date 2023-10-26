package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@NetBanking")
	public void netbankingSetup()
	{
		System.out.println("*****************************");
		System.out.println("Setup the entries in Netbanking database");
	}
	@Before("@Mortgage")
	public void mortgageSetup()
	{
		
		System.out.println("Setup the entries in Mortgage database");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Setup the entries in Mortgage database");
	}



}

//Before->Background->scenario->After
