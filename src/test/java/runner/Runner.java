package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@CucumberOptions(
				 features = "featureFiles", //runs all feature files
				 glue = "stepDefinitions", //runs java file that matches feature file
				 dryRun=true, //If true, finds unmatched methods before actual execution
				 strict=false, //If true, finds unmatched methods after actual execution
				 monochrome=true, //If true, converts console msgs to readable type
				 //plugin= {"html:report/WebReport","json:report/jsonreport.json"} //Getting reports 
				 //format= {"junit:report/XMLreport.xml"}, //Getting reports 
				 //tags= {"@SimpleLogin"} //Runs only this tag
				 //tags= {"@SimpleLogin,@DataDriven"} //Clubbing tags(OR type-Runs all cases)
				 tags= {"@SimpleLogin","@DataDriven"} //Clubbing tags(AND type-Runs only cases)
				 //tags= {"~@SimpleLogin"} //Runs other tags except this specified tagname
				 )
@RunWith(Cucumber.class)
public class Runner {
	
	//This class combines feature file and step definition
	//Runner define
	
}

//@CucumberOptions(features="featureFiles/DataTablewithExampleKeyword.feature", glue="stepDefinitions")
//@CucumberOptions(features="featureFiles/DataTableWithHeader.feature", glue="stepDefinitions")
//@CucumberOptions(features="featureFiles/DataTablewithoutHeader.feature", glue="stepDefinitions")
//@CucumberOptions(features="featureFiles/Expression.feature", glue="stepDefinitions")
//@CucumberOptions(features = "featureFiles/LoginOrange.feature", glue = "stepDefinitions")