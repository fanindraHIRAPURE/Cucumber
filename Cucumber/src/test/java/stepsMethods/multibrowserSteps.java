package stepsMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class multibrowserSteps {
	WebDriver driver;
	Properties configprop = new Properties();

	@Given("launch the browsers")
	public void launch_the_browsers() throws IOException {
		FileInputStream configfile = new FileInputStream("multibrowserconfig.properties");
		configprop.load(configfile);

		String br = configprop.getProperty("browser");
		if (br.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", configprop.getProperty("chromepath"));
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.gecko.driver", configprop.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
		}

	}

	@When("open url {string}")
	public void open_url(String string) {
		driver.get(string);
	}

	@Then("validate title")
	public void validate_title() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Register");
	}

	@Then("close the brosers")
	public void close_the_brosers() {
		driver.quit();
	}
}
