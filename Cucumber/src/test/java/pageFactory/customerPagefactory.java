package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import stepsMethods.CustomerBaseclass;

public class customerPagefactory extends CustomerBaseclass
{

	
	

	public void email_password(WebDriver driver) {
//		emailtxt.clear();
//		emailtxt.sendKeys("admin@yourstore.com");

//		passtxt.clear();
//		passtxt.sendKeys("admin");
		
		
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");

	}

	public void click_on_login_button(WebDriver driver) {
		//login.click();
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}

	public void click_on_logout_button(WebDriver driver) {
		//logout.click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
	
	By customer=By.xpath("//p[text()=' Customers']/ancestor::li");
	By customerSUB=By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p");
	By addnew=By.xpath("//a[@class='btn btn-primary']");
	By email=By.name("Email");
	By pass=By.name("Password");
	By Firstname=By.name("FirstName");
	By Lastname=By.xpath("//*[@id='LastName']");
	By Company=By.name("Company");
	By submit=By.name("save");
public static By verify=By.xpath("//div[@class='alert alert-success alert-dismissable']");
//static int k=150;
	
	
	
	public void customerSUBbtn(WebDriver driver)
	{
		driver.findElement(customerSUB).click();
	}
	
	public void addnew(WebDriver driver)
	{
		driver.findElement(addnew).click();
	}
	
	public void dataenter(WebDriver driver)
	{
		driver.findElement(email).sendKeys(CustomerBaseclass.RandomStrinngs()+"@gmail.com");
		driver.findElement(pass).sendKeys(CustomerBaseclass.RandomStrinngs());
		driver.findElement(Firstname).sendKeys(CustomerBaseclass.RandomStrinngs());
		driver.findElement(Lastname).sendKeys(CustomerBaseclass.RandomStrinngs());
		driver.findElement(Company).sendKeys(CustomerBaseclass.RandomStrinngs());
		
	}
	
	public void submit(WebDriver driver)
	{
		driver.findElement(submit).click();
	}

	public void customerbtnclick(WebDriver driver) {
		driver.findElement(customer).click();
	}

	
}
