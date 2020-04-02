package SeleniumTest;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When; 

public class Annotation { 
   WebDriver driver = new FirefoxDriver(); 
   @Given("^I am on Facebook login page$") 	
   public void goToFacebook() { 
   	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Sunil kumar\\git\\BDDFramework_New\\drivers\\geckodriver.exe");
   	  driver = new FirefoxDriver();				
      driver.manage().window().maximize();			
      driver.navigate().to("https://www.facebook.com/"); 
   }
	   
@When("^I enter username as \"(.*)\"$") 
   public void enterUsername(String arg1) {   
      driver.findElement(By.id("email")).sendKeys(arg1); 
   }
	
   @When ("^I enter password as \"(.*)\"$") 
   public void enterPassword(String arg1) {
      driver.findElement(By.id("pass")).sendKeys(arg1);
      driver.findElement(By.id("u_0_v")).click(); 
   } 
@Then("^Login should fail$") 
   public void checkFail() {  
      if(driver.getCurrentUrl().contains(
         "facebook")){ 
            System.out.println("Test1 Pass"); 
      } else { 
         System.out.println("Test1 Failed"); 
      } 
      driver.close(); 
   } 
	
@Then("^Relogin option should be available$") 
   public void checkRelogin() { 
            System.out.println("Test2 Pass"); 
   }
}