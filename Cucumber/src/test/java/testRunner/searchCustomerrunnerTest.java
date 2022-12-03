package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class searchCustomerrunnerTest
{
	public class customertestrunner {
		@RunWith(Cucumber.class)
		@CucumberOptions
		(
			features = "src/test/resources/featurefiles",
				//features = {"src/test/resources/featurefiles/searchCustomer.feature","src/test/resources/featurefiles/customers.feature","src/test/resources/featurefiles/npccommerce.feature"},
			glue={"stepsMethods"},
			tags = ("@runallsearch"),
			monochrome = true,
			dryRun=false,
					//plugin={"pretty","html:target/cucumber-reports"}
					plugin = {"pretty","json:target/cucumber-reports/reports.json",

				            "junit:target/cucumber-reports/Cucumber.xml",

				            "html:target/cucumber-reports/reports2.html"}

			
			)

		public class searchcustomertestrunner1 {

		}
}
}
