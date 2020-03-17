package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Feature/Testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc_16","@tc_17","@tc_18","@tc_19","@tc_20"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)
public class SearchTR {

}
