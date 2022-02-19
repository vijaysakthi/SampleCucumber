package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class OrangeLoginStepDefintion {

	WebDriver driver;
	WebElement userName, passWord, loginButton;
	String Chrome_driver_key = "webdriver.chrome.driver";
	String Orange = "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
	String Chrome_driver_value = "G:\\VJ\\Software Testing\\Selenium\\drivers\\chromedriver.exe";

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty(Chrome_driver_key, Chrome_driver_value);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(Orange);
	}

	@Then("^user enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_and(String userName, String passWord) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	
	}

	@Then("^user is navigated to home page$")
	public void user_is_navigated_to_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.partialLinkText("Welcome")).isDisplayed();
		if(status) {
			System.out.println("...Welcome...");
		}else {
			System.out.println("Better Luck Next Time");
		}

	}

}
