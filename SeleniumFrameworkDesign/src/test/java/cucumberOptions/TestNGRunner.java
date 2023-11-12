package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features= "src/test/java/features",
glue ="stepDefinitions", monochrome=true, tags="@LocatorTest",
plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"})

//@SmokeTest or @RegressionTest
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
