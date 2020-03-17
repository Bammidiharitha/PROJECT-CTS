package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Feature/Testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC06_AddtoCart","@TC07_Checkcart","@TC08_priceupdate","@TC09_storingProductDetails","@TC10_RemovefromCart"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)
public class CartTR {

}
