package TestRunner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)				

@CucumberOptions(
		features="Selenium_Tags",
		glue={"Tags"}, 
		monochrome = true, 
		tags={"@Regression"},
		format = {"pretty", "html:target/Destination"} 
		) 		

public class RunnerTagsPretty 				
{		
	 @AfterClass
	    public static void writeExtentReport() {
	        Reporter.loadXMLConfig(new File("config/report.xml"));
	    }
}
