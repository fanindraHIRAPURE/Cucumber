package stepsMethods;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import io.cucumber.junit.Cucumber;
import pageFactory.searchCustomerPage;

public class CustomerBaseclass 
{
	
	
	searchCustomerPage spg;


	

public static String RandomStrinngs()
{
	String generatealphabets=RandomStringUtils.randomAlphabetic(5);
	return generatealphabets;
	
}

 public static void waitkajugaad() throws InterruptedException
{
	Thread.sleep(9000);
}

}
