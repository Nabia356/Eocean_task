package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


@Test
@CucumberOptions(
		features = "src/test/java/Features",
		glue = {"StepsDefinitions"},
//		The HTML-Report.html have test case execution report file
		plugin = {"html:target/HTML-Report.html", "json:target/cucumber.json","pretty"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
	@BeforeSuite
	public void beforeSuit(){}
}

 