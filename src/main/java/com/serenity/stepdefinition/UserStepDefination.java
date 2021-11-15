package com.serenity.stepdefinition;

import com.serenity.steps.RegistrationStep;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class UserStepDefination {
	
	
	@Steps
	RegistrationStep reg;

	@Given("I am on travel portal")
	public void i_am_on_travel_portal() {
		reg.i_am_on_travel_page();
	}


}
