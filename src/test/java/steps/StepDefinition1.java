package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 {
	

	    @Given("User is given 2 numbers  1 and 2")
	    public void integer_no(Integer int1) {
	        // Write code here that turns the phrase above into concrete actions
	       System.out.println(" this is from given");
	    }
	    @When("User adds 1,2")
	    public void add_with(String string, String string2) {
	        // Write code here that turns the phrase above into concrete actions
	        System.out.println(" this is from when");
	    }
	    @Then("User should get 3")
	    public void result_is(String string) {
	        // Write code here that turns the phrase above into concrete actions
	        System.out.println(" this is from then");
	    }

	    
	    
	    //2nd given 
	    
	    



}
