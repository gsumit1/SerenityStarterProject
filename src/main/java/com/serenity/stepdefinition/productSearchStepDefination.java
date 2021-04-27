package com.serenity.stepdefinition;

import com.serenity.steps.SearchProductStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class productSearchStepDefination {
	
	@Steps
	SearchProductStep searchStep;
	
	@Given("^I am on the Noon$")
	public void i_am_on_the_Noon() throws InterruptedException {
		searchStep.openApp();
	}

	@When("^I search Beverages$")
	public void i_search_Beverages() throws InterruptedException {
		searchStep.navigateToMenu();
	}

	@When("^I sort by price \"([^\"]*)\"$")
	public void i_sort_by_price(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^publish the top five item prices$")
	public void publish_the_top_five_item_prices() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
