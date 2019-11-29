package com.qa.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\Shubham\\eclipse-workspace\\CucumberExample\\src\\main\\java\\com\\qa\\feature\\login.feature"
		,glue = {"com.qa.stepDefinition"}
		, format = {"pretty","html:test-output"}
		
		)
public class MyRunner {

	
}
