package com.scobi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.scobi.genericlibrary.BaseTest;

public class CreateLeadPage {

	@FindBy(name = "property(saltName)")
	private WebElement salutationDropdown;

	public CreateLeadPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getSalutationDropdown() {
		return salutationDropdown;

	}

}
