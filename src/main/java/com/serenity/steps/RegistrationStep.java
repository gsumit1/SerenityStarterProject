package com.serenity.steps;

import java.util.Map;

import com.serenity.pages.HomePage;
import com.serenity.pages.RegistrationPage;
import com.serenity.pages.RegistrationSuccess;
import net.thucydides.core.annotations.Step;


@SuppressWarnings("serial")
public class RegistrationStep extends CommonStep {

	HomePage home;
	RegistrationPage reg;
	RegistrationSuccess regSuccess;

	@Step
	public void i_am_on_travel_page() {
		home.getDriver().get("http://demo.guru99.com/test/newtours/index.php");
		home.rEGISTER.click();
	}
	
	
	@Step
	public void i_am_on_registered_page(Map<String, String> userDetails) {
		reg.register_user(userDetails);
	}

}
