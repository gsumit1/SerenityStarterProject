package com.serenity.stepdefinition;

import static org.junit.Assert.assertTrue;

import java.util.Map;
import com.serenity.pages.RegistrationSuccess;
import com.serenity.steps.RegistrationStep;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class registrationStepDefination {

	@Steps
	RegistrationStep reg;

	RegistrationSuccess regSuccess;;


	@When("I register with details")
	public void i_register_with_details(DataTable dataTable) {
		Map<String, String> userDetails = dataTable.asMap(String.class, String.class);
		reg.i_am_on_registered_page(userDetails);
	}

	@Then("I should be successfully register")
	public void i_should_be_successfully_register() {
		assertTrue("Fail to register user", regSuccess.successMessage.isDisplayed());

	}

}
