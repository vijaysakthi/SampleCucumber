package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ThanosActions {
	
	@Given("^Thanos with infinity stones$")
	public void thanos_with_infinity_stones() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Thanos with infinity stones");
	}

	@When("^Thanos snaps his fingers$")
	public void thanos_snaps_his_fingers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Thanos snaps his fingers");
	}

	@Then("^Half living things turns into ashes$")
	public void half_living_things_turns_into_ashes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Half living things turns into ashes");
	}



}
