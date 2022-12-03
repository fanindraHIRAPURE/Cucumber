package stepsMethods;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.npcpagefactory;

public class npcCommerceClassSTEPS {

	public static WebDriver driver;
	public npcpagefactory pf;
	public static Logger logger=LogManager.getLogger(npcCommerceClassSTEPS.class);
//	@Given("user launches browser")
//	public void user_launches_browser() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.setProperty("webdriver.chrome.driver", "C:\\seleniumsetup\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
//	}

	@Given("user launches browser")
	public void user_launches_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumsetup\\chromedriver_win32\\chromedriver.exe");
		
		PropertyConfigurator.configure("C:\\Users\\FANINDRA HIRAPURE\\eclipse-workspace\\Cucumber\\src\\test\\resources\\log4j2.properties");
    	
		logger.info("launching browser");
		 driver = new ChromeDriver();

	}

	@When("user enters url {string}")
	public void user_enters_url(String string) {
		logger.info("entering url");
		driver.get(string);
		pf = new npcpagefactory();
	}

	@When("user enters email as {string} and user enters password as {string}")
	public void user_enters_email_as_and_user_enters_password_as(String string, String string2) {
		logger.info("entering email and password");
		
		pf.email_password(driver);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		logger.info("clicks on login button");
		pf.click_on_login_button(driver);
	}

	@Then("validate the page title {string}")
	public void validate_the_page_title(String string) {
		logger.info("validate page titile");
		String title = "Dashboard / nopCommerce administration";
		Assert.assertEquals(driver.getTitle(), title);
	}

	@When("user clicks on logout button")
	public void user_clicks_on_logout_button() {
		
		pf.click_on_logout_button(driver);
	}

	@Then("title should be {string}")
	public void title_should_be(String string) {
		String title = "Your store. Login";
		Assert.assertEquals(driver.getTitle(), title);
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	}
	
	
	
}

