package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Feature/Testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc11_selectingitem","@tc12_shownumber","@tc13_sorting","@tc14_storetoexcellsheet","@tc15_storetowishlist"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)
public class desktopTR {

}
