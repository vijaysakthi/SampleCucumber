package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenUrlStepDefinitions {
	
	WebDriver driver;
	String Chrome_driver_key = "webdriver.chrome.driver";
	String GOOGLE ="http://www.google.com/";
	String Chrome_driver_value ="G:\\VJ\\Software Testing\\Selenium\\drivers\\chromedriver.exe";
	
	@Given("^user is entering google url$")
	public void user_is_entering_google_url() throws Throwable {
		
	   // Write code here that turns the phrase above into concrete actions
		System.setProperty(Chrome_driver_key, Chrome_driver_value);
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(GOOGLE);
	    
	}

	@When("^user is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String searchTerm) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(searchTerm);
	}

	@When("^enters the return key$")
	public void enters_the_return_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("^the user should see the search results$")
	public void the_user_should_see_the_search_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    boolean status=driver.findElement(By.partialLinkText("vijay")).isDisplayed();
	    if(status) {
	    	System.out.println("Result Displayed");
	    }
	}

}
