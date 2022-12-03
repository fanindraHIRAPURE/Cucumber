package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class customertestrunnerTest {
	@RunWith(Cucumber.class)
	@CucumberOptions
	(
		features = "src/test/resources/featurefiles",
		glue={"stepsMethods","pageFactory"},
		tags = ("@runallCustomers"),
		monochrome = true,
		dryRun=false,
		//plugin={"pretty","html:test-output"}
		plugin = {"pretty","json:target/cucumber-reports/reports.json",

	            "junit:target/cucumber-reports/Cucumber.xml",

	            "html:target/cucumber-reports/reports2.html"}
		

		
		)

	public class customertestrunner1 {

	}
	
}
