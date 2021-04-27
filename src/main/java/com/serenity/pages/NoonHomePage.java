package com.serenity.pages;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class NoonHomePage extends PageObject{

	@FindBy(xpath = "//a[@href='/uae-en/all-products']")
	public WebElement allCategories;

	@FindBy(xpath = "(//a[contains(.,'Grocery')])[1]")
	public WebElement grocery;

	@FindBy(xpath = "(//a[contains(.,'Beverages')])[1]")
	public WebElement beverages;

}
