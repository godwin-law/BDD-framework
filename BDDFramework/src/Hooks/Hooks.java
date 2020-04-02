package Hooks;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
public class Hooks {
	@Before
	public void setUp() {
		System.out.println("Before Hook");
	}
	@Given("^Sample Hooks test line 1$")
	public void sampleTagsTestLine1() {
		System.out.println("Sample Hooks test line 1 from 'Hooks' step definition");
	}
	@Given("^Sample Hooks test line 2$")
	public void sampleTagsTestLine2() {
		System.out.println("Sample Hooks test line 2 from 'Hooks' step definition");
	}
	@After
	public void close() {
		System.out.println("After Hook");
	}
}