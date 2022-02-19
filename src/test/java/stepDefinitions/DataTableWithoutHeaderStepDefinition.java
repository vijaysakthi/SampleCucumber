package stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithoutHeaderStepDefinition {
	
	WebDriver driver;
	WebElement userName, passWord, loginButton;
	String Chrome_driver_key = "webdriver.chrome.driver";
	String Orange = "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
	String Chrome_driver_value = "G:\\VJ\\Software Testing\\Selenium\\drivers\\chromedriver.exe";
	
	@Given("^you are on login page$")
	public void you_are_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty(Chrome_driver_key, Chrome_driver_value);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(Orange);
	}

	@When("^you enter login credentials$")
	public void you_enter_login_credentials(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		//Convert dataTable as List of Strings ,then fetch its data
		List<String> credentials = dataTable.asList(String.class);
		String username = credentials.get(0);
		String password = credentials.get(1);
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	    
	}

	@When("^you now click the login button$")
	public void you_now_click_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	    
	}

	

}
