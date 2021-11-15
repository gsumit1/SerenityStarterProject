package com.serenity.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class RegistrationSuccess extends HomePage{
	
	@FindBy(xpath = "//*[contains(text(),' Thank you ')]")
	public WebElement  successMessage;

	@Override
	public WebElementFacade uniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}

}
