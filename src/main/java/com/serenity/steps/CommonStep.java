package com.serenity.steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class CommonStep extends ScenarioSteps {

	void moveToFrame(String name) {
		getDriver().switchTo().frame(name);
	}

	

}
