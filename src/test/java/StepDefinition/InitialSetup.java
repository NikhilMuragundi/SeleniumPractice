package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InitialSetup {

	@Given("Initialize web deriver and open the google site")
	public void fun() {
		System.out.println("Given executed");
	}
	
	@When("execute when")
	public void testWhen() {
		System.out.println("When executed");
	}
	
	@Then("execute Then")
	public void testThen() {
		System.out.println("Then executed");
	}
   
}
