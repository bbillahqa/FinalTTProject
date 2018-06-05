package TestNGRunnerClass;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	
	@CucumberOptions(

			features= {"MyFeature"},
			
			glue = {"com.StepDef","login.utility"},
			
tags = {"@chrome"})

			
	@Test
	        public class TestNgRunner extends AbstractTestNGCucumberTests{
		
		
}
