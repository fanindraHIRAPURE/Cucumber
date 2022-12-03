package logpackage;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class A 
{
	public static void main(String[] args) {
		Logger logger=LogManager.getLogger(A.class);
		PropertyConfigurator.configure("C:\\Users\\FANINDRA HIRAPURE\\eclipse-workspace\\Cucumber\\src\\test\\resources\\log4j2.properties");
		logger.info("i am bot");
		logger.info("i am pro player");
		
	}

}
