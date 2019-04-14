package com.stepfdefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/com/scripts/"},
		glue = {"com.stepfdefination"},
		tags={"@Script1"},
		plugin = { "pretty", "html:target/cucumber-reports"},
		monochrome=true
		)

public class RunnerClass {
}
