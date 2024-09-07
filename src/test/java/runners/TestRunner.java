package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/Users/gurleenpadda/Desktop/QA/Selenium_Workspace/CucumberProject/src/test/java/features/Amazonlogin.feature"},//the path of the feature files
		
		glue={"stepdefinations"},//step Defination Package Name
		dryRun = false,
		monochrome = true

		)
public class TestRunner{
	
}
