package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowsercode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	public void CrossBrowsercodes()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hssri\\eclipse-workspace\\coreJavaTraining\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//FireFox Launch
	
/*	System.setProperty("webdriver.gecko.driver", "C:\\Users\\hssri\\eclipse-workspace\\coreJavaTraining\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
			
	*/		
	//edge Launch
/*	System.setProperty("webdriver.edge.driver", "C:\\Users\\hssri\\eclipse-workspace\\coreJavaTraining\\Drivers\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	*/
	}
}
