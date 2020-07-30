package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue="StepDefination",
		plugin = {"pretty","html:targe/cucumber-html-report","json:target/cucumber-reports/Cucumber.json",
				 "junit:target/cucumber-reports/Cucumber.xml"},
		monochrome=true,
		strict=true,//it will check if any steps are not defined in step defination file
				dryRun=false)//to check mapping between feature file and step defination)

public class TestRunner{
	
}
