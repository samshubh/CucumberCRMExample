package com.qa.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\Shubham\\eclipse-workspace\\CucumberExample\\src\\main\\java\\com\\qa\\feature\\deals.feature"
		,glue= {"com.qa.stepDefinition"}
		,format= {"pretty","html:test-output","json:CRM_JSON/crm_json","junit:CRM_xml/crm_xml"}
		,dryRun=false
		,monochrome=true

		)

public class DealsRunner {

}
