package com.qa.testRunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		   features ="C:\\Users\\vt1056.SRITADS\\eclipse-workspace\\CucumberCRMExample\\src\\main\\java\\com\\qa\\feature\\tagging.feature"
		   ,glue="com.qa.stepDefinition"
		   ,format= {"pretty","html:test-output","json:CRM_JSON/crm_json_output","junit:CRM_xml/crm_xml_output"}
		   ,monochrome= true
		   ,strict= false
		   ,dryRun= true
	
		)


public class tagsRunner {

}
