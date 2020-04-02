package SeleniumTest;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class SeleniumTest {				

    WebDriver driver;			
    		
    @Given("^Open the Firefox and launch the application$")					
    public void openbrowser() throws Throwable							
    {		
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\Sunil kumar\\git\\BDDFramework_New\\drivers\\geckodriver.exe");
    	driver = new FirefoxDriver();				
       driver.manage().window().maximize();			
       driver.get("http://newtours.demoaut.com/");					
    }		

    @Then("^Reset the credential$")					
    public void	Reset_the_credential() throws Throwable 							
    {		
//       driver.findElement(By.name("btnReset")).click();					
    }	
    
	@Given("^Open the Chrome and launch the application$")					
    public void openChromebrowser() throws Throwable							
    {		
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunil kumar\\git\\BDDFramework_New\\drivers\\chromedriver.exe");
          driver = new ChromeDriver();
          driver.get("http://newtours.demoaut.com/");					
    }	
    
    @Given("^Open the IE and launch the application$")					
    public void ieBrowser() throws Throwable							
    {		
    	 System.setProperty("webdriver.ie.driver", "C:\\Users\\Sunil kumar\\git\\BDDFramework_New\\drivers\\IEDriverServer.exe");
         driver = new InternetExplorerDriver();
          driver.get("http://newtours.demoaut.com/");					
    }	
    
    @When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")			
    public void login(String username,String password) throws Throwable 							
    {		
    	 driver.findElement(By.name("userName")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);					
    }	
    
    @Then("^Click login button$")					
    public void	clicklogin() throws Throwable 							
    {		
       driver.findElement(By.name("login")).click();
       driver.quit();
    }	

    
}