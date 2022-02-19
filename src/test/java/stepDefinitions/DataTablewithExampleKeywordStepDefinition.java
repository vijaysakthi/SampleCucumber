package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DataTablewithExampleKeywordStepDefinition {
	
	WebDriver driver;
	WebElement userName, passWord, loginButton;
	String Chrome_driver_key = "webdriver.chrome.driver";
	String Orange = "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
	String Chrome_driver_value = "G:\\VJ\\Software Testing\\Selenium\\drivers\\chromedriver.exe";

	@Given("^proceed to login webpage$")
	public void proceed_to_login_webpage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty(Chrome_driver_key, Chrome_driver_value);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(Orange);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(arg1);
		driver.findElement(By.id("txtPassword")).sendKeys(arg2);
	}

	@Then("^click button to login$")
	public void click_button_to_login() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
		driver.close();
	}

}
