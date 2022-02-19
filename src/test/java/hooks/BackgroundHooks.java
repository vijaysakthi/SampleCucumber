package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BackgroundHooks {
	
	@Before
	public void beforeScenario() {
		System.out.println("Before Scenario");
	}
	
	@After
	public void afterScenario() {
		System.out.println("After Scenario");
	}

}
