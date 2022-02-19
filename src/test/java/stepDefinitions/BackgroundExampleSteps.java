package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundExampleSteps {

	@Given("^the student finishes high school$")
	public void the_student_finishes_high_school() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("\nthe student finishes high school");
	}

	@Given("^scored managable marks for college$")
	public void scored_managable_marks_for_college() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("scored managable marks for college\n");
	}

	@Given("^student applied for medical course$")
	public void student_applied_for_medical_course() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("student applied for medical course");
	}

	@When("^student cleared the entrance exam$")
	public void student_cleared_the_entrance_exam() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("student cleared the entrance exam");
	}

	@Then("^student eligible for joining medical institute$")
	public void student_eligible_for_joining_medical_institute() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("student eligible for joining medical institute");
	}

	@Given("^student applied for engineering course$")
	public void student_applied_for_engineering_course() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("student applied for engineering course");
	}

	@When("^student has a managable cutoff$")
	public void student_has_a_managable_cutoff() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("student has a managable cutoff");
	}

	@Then("^student eligible for joining engineering institute$")
	public void student_eligible_for_joining_engineering_institute() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("student eligible for joining engineering institute");
	}

}
