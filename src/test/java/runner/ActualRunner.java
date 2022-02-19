package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
				features="featureFiles",
				//glue= {"stepDefinitions"},
				glue= {"stepDefinitions","hooks"}, //considers two folders to glue with features
				dryRun=false,
				strict=false,
				monochrome=true,
				tags= {"@UsingBackground "}
				)
@RunWith(Cucumber.class)
public class ActualRunner {

}
