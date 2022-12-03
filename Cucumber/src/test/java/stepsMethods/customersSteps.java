package stepsMethods;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.customerPagefactory;
import pageFactory.npcpagefactory;

public class customersSteps extends CustomerBaseclass
{
	

	
	

	WebDriver driver;
	public customerPagefactory cp;
	public npcpagefactory pf;

	@Then("User can view dashboard")
	public void user_can_view_dashboard() {
		
		driver=npcCommerceClassSTEPS.driver;
		System.out.println(driver);
		String title="Dashboard / nopCommerce administration";
	    Assert.assertEquals(driver.getTitle(), title);
	}

	@When("user clicks on customers menu")
	public void user_clicks_on_customers_menu() {
		
		cp=new customerPagefactory();
	   cp.customerbtnclick(driver);
	}

	@When("clicks on customers menu item")
	public void clicks_on_customers_menu_item() {
		
		cp.customerSUBbtn(driver);
	}

	@When("click on add new button")
	public void click_on_add_new_button() {
	
		cp.addnew(driver);
	}

	@Then("user can view add new customers page")
	public void user_can_view_add_new_customers_page() {
		
		String title="Add a new customer / nopCommerce administration";
	    Assert.assertEquals(driver.getTitle(), title);
	}

	@When("user enters customers info")
	public void user_enters_customers_info() {
		
	    cp.dataenter(driver);
	}

	@When("click on save button")
	public void click_on_save_button() {
		
	    cp.submit(driver);
	}

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
		
		String title="The new customer has been added successfully.";
		//String actual=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']")).getText().substring(2,47);
		String actual=driver.findElement(customerPagefactory.verify).getText().substring(2,47);   ////for text without tags
		System.out.println(actual);
	    Assert.assertEquals(actual, title);
	}

	@Then("user closes browser")
	public void user_closes_browser() {
		
	 driver.quit();
	}
	
//	@Given("user launches browser")
//	public void user_launches_browser() {
//		System.setProperty("webdriver.chrome.driver", "C:\\seleniumsetup\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//	}
//
//	@When("user enters url {string}")
//	public void user_enters_url(String string) {
//		driver.get(string);
//		pf = new npcpagefactory();
//	}
//
//	@When("user enters email as {string} and user enters password as {string}")
//	public void user_enters_email_as_and_user_enters_password_as(String string, String string2) {
//		pf.email_password(driver);
//	}
//
//	@When("user clicks on login button")
//	public void user_clicks_on_login_button() {
//		pf.click_on_login_button(driver);
//	}

	

	
}
