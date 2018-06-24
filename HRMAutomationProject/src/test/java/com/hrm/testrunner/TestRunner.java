package com.hrm.testrunner;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunner {

	@CucumberOptions(features = { "Features" }, glue = { "com.hrm.stepdef"}, 
			plugin = { "pretty","html:target/cucumber-htmlreport", "json:target/cucumber-report.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, 
			tags={"@chrome"})

			@Test
			public class LoginRunner extends AbstractTestNGCucumberTests {

	}
	
	}


	
	