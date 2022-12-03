package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class npcpagefactory {



//	public npcpagefactory(WebDriver d) {
//		driver = d;
//		PageFactory.initElements(d, this);
//	}
//
//	@FindBy(name = "Email")
//	WebElement emailtxt;
//
//	@FindBy(name = "Password")
//	WebElement passtxt;
//
//	@FindBy(xpath = "//button[contains(text(),'Log in')]")
//	WebElement login;
//
//	@FindBy(linkText = "Logout")
//	WebElement logout;

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
}
