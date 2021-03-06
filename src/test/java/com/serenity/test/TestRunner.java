package com.serenity.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = {"pretty:target/cucumber/cucumber.txt", 
				"html:target/cucumber/cucumber-html-report",
				"json:target/cucumber/cucumber.json"
				}
		,features= {"features"}
		,glue = {"com.serenity.stepdefinition"}
		//,dryRun = true
		,monochrome = true
		,tags="@Noon"
		)
public class TestRunner {

}
