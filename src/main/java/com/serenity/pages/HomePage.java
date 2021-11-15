package com.serenity.pages;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.support.FindBy;

public abstract class HomePage extends Page{
	
	@FindBy(xpath = "//a[contains(.,'Home')]")
	public WebElementFacade home;

	@FindBy(xpath = "//a[contains(.,'REGISTER')]")
	public WebElementFacade rEGISTER;

	@FindBy(xpath = "//a[contains(.,'Flights')]")
	public WebElementFacade lnk_flight;

	@FindBy(xpath = "//a")
	public List<WebElementFacade> all;

	public void clickOnRegistration() {
		System.out.println(all.size());
		rEGISTER.click();
	}

	@Override
	public WebElementFacade uniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
