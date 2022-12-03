package stepsMethods;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.searchCustomerPage;

public class searchCustomerSteps extends CustomerBaseclass
{
	static WebDriver driver;
	
	@When("user enters email in fields")
	public void user_enters_email_in_fields() 
	{
System.out.println("entering email");

	}

	@Then("user clicks search and validated customers email")
	public void user_clicks_search_and_validated_customers_email() 
	{
		driver=npcCommerceClassSTEPS.driver;
		spg=new searchCustomerPage(driver);
		spg.enterEmail();
	}
}
