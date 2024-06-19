package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\features\\"},	 
		glue = {"step_definitions"}, 
		tags = {},
		//tags = {"@Smoke","@MyPersonal","@Regression"},
		//tags = {"@Regression"},
		//tags = {"@Sanity"},
        plugin = {"pretty", "html:test-output", "json:target/cucumber-report/cucumber.json" }
)
public class Runner {

}

/*
-Page Object Model
-Cucumber - Feature
-Scenario Outline - with background
-Properties
-Excel
-Tags
-Screenshot

-Allure
-multiBrowser
-Headless Execution
-ParallelExecution

-Git push pull
-Jenkins Job

-With Page Factory

- Class Schedule
- Sun 8:30pm CST
- Mon 11am CST 
- Wed 8:30pm CST
- Thu 11am CST

*/
