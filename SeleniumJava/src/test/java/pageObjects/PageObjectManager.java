package pageObjects;
import org.openqa.selenium.WebDriver;
public class PageObjectManager {

	public LandingproductpageName landingPage;
	public OffersPage offersPage;
	public WebDriver driver;
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	
	
	public LandingPage getLandingPage()
	{
	
	 landingPage= new LandingPage(driver);
	 return landingPage;
	}
	
	public OffersPage OffersPage()
	{
		offersPage = new OffersPage(driver);
		return offersPage;
	}
	
	
}
