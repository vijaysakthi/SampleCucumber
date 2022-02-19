package stepDefinitions;

import cucumber.api.java.en.Given;

public class ExpressionStepDefintion {
	
	@Given("^I have (\\d+) Laptop$") //this expression \\d+ represents integer numbers (0-9)
	public void I_have_1_laptop(int count) {
		System.out.println("Laptop count: "+count);
	}
	
	@Given("^I have (\\d+\\.\\d+) CGPA$") 
	public void i_have_CGPA(float arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(arg1);
	}
	
	/* Here  \"([^\"]*)\" is equlas to (or) same as \"(.*?)\"   */			
	
	@Given("^\"(.*?)\" is elder to \"(.*?)\" and \"([^\"]*)\"$")
	public void is_elder_to_and(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(arg1+" is elder to "+arg2+" and "+arg3);
	}
}
