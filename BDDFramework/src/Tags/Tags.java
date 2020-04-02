package Tags;
import cucumber.api.java.en.Given;

public class Tags { 
   @Given("^Sample Tags test line 1$") 	
   public void sampleTagsTestLine1() { 
      System.out.println("Sample Tags test line 1 from 'Tags' step definition");
   }
   @Given("^Sample Tags test line 2$") 	
   public void sampleTagsTestLine2() { 
      System.out.println("Sample Tags test line 2 from 'Tags' step definition");
   }
}