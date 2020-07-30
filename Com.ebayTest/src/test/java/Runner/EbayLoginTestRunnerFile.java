package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/EbayFeaturesFile",
		glue="StepDefination",
				plugin = {"pretty","html:targe/cucumber-html-report"},
		
		dryRun=false)








public class EbayLoginTestRunnerFile {
	
	

}
