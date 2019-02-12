package com.qa.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         //features="Features",
                 //features="E:\\Praveen_Automation\\TCS_SELENIUM\\Cucumber_Practice\\Features\\GuruLogin_WithParameters.feature",
                //features="E:\\Praveen_Automation\\TCS_SELENIUM\\Cucumber_Practice\\Features\\GuruLoginDDT.feature",
                //features="E:\\Praveen_Automation\\TCS_SELENIUM\\Cucumber_Practice\\Features\\GuruLogin_DataTable.feature",
		        //features="E:\\Praveen_Automation\\TCS_SELENIUM\\Cucumber_Practice\\Features\\GuruLogin_DataTableHeader.feature",
		          features="E:\\Praveen_Automation\\TCS_SELENIUM\\Cucumber_Practice\\Features\\GuruLoginHooks.feature",
		         glue="com.qa.StepDefinations",
                 format={"pretty","html:test-output","json:json_output/cucmber.json","junit:junit_xml_output/cucumber.xml"},
                 dryRun=false,
                 monochrome=true,
                 strict=false
		         )
                  
public class MyTestRunner {

}
