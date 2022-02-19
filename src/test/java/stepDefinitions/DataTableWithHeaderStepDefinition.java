package stepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithHeaderStepDefinition {
	
	WebDriver driver;
	WebElement userName, passWord, loginButton;
	String Chrome_driver_key = "webdriver.chrome.driver";
	String Orange = "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
	String Chrome_driver_value = "G:\\VJ\\Software Testing\\Selenium\\drivers\\chromedriver.exe";
	
	@Given("^Enter url and land in login page$")
	public void enter_url_and_land_in_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty(Chrome_driver_key, Chrome_driver_value);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(Orange);
	}

	@When("^Enter correct login details$")
	public void enter_correct_login_details(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)	
		
		List<Map<String,String>> loginDetails = dataTable.asMaps(String.class, String.class);
		String Username= loginDetails.get(0).get("UserName");
		String Password= loginDetails.get(0).get("Password");
		
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
	   
	}

	@When("^click login button$")
	public void click_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}


}
