package com.cucumber.practice3.com.cucumber.practice3;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Cucumber options

	@CucumberOptions(features = {"src/test/resources/FeatureFolder"},
			plugin = { "json:target/cucumber.json"},
			glue ="StepDefination"
		)
	
	public class TestRunnerClass extends AbstractTestNGCucumberTests {
	
@BeforeTest

		@AfterTest
		
}

