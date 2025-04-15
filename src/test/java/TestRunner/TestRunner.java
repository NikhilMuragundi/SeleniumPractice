package TestRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
//import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\Resources",
        glue = {"StepDefinition"},
        publish = true,
        //tags = "@test",
        plugin = {
                "pretty",
                "junit:target/site/junit.xml",
                "html:target/site/cucumber-html-report.html",
                "json:target/site/cucumber.json",
                "html:target/site/cucumber-pretty.html",
                "rerun:rerun/failed_scenarios.txt"
        })

public class TestRunner extends AbstractTestNGCucumberTests {
	 @Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
}
