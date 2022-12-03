package pageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchCustomerPage 
{
	WebDriver driver;
	public searchCustomerPage (WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy (id="SearchEmail")
WebElement emailtxt;

@FindBy (xpath="//button[@id='search-customers']")
WebElement searchbtn;

@FindBy (id ="customers-grid")
WebElement table;

@FindBy (xpath ="//tbody/tr")
List <WebElement> allrows;

@FindBy (xpath ="(//table)[1]/thead/tr/th")
List <WebElement> allcolumns;

@FindBy (xpath ="(//table)[2]/tbody/tr/td[2]")
WebElement emailafterclick;

//@FindBy (xpath ="(//table)[2]/tbody/tr["+i+"/td[3]")
//WebElement notemailafterclick;

public void enterEmail()
{
	for (int i=1;i<=allrows.size();i++) 
	{
		
	String emailsintable=driver.findElement(By.xpath("(//table)[2]/tbody/tr["+i+"]/td[2]")).getText();
	emailtxt.sendKeys(emailsintable);
	searchbtn.click();
	String emailvald=emailafterclick.getText();

//	try {
//		Thread.sleep(10000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}

	
	//WebElement wait=new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(emailafterclick));
	
	//String emailvald=driver.findElement(By.xpath("(//table)[2]/tbody/tr["+i+"]/td[2]")).getText();
	if(emailsintable.equals(emailvald))
	{
		System.out.println(emailsintable);
		System.out.println(emailvald);
		System.out.println("test passed");
		Assert.assertEquals(emailvald, emailsintable);
		
	}
	else
	{
		System.out.println(emailsintable);
		System.out.println(emailvald);
		System.out.println("test failed");
	}
	
	emailtxt.clear();
	searchbtn.click();
	
	
	}
		
}

}
