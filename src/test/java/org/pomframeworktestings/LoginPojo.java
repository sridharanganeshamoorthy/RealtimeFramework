package org.pomframeworktestings;

import org.frameworktesting.BaseClassAllMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClassAllMethods {

	public LoginPojo() {
		PageFactory.initElements(driver, this);

	}

	// FindBy Only one Locator can be use.
	@FindBy(id = "username")

	@CacheLookup // when you know the element will not change in the DOM during the page object's
					// lifetime.

	private WebElement txtEmail;
	
	

	// FindBys all the Locators should be correct and work.
	@FindBys({

			@FindBy(xpath = "//input[@id='password']"), @FindBy(xpath = "//input[@name='password']") })
	private WebElement txtPass;
	
	
	
	

	// FindAll atleast any one Locators should be correct and work.
	@FindAll({

			@FindBy(xpath = "//button[@id='submit']"), @FindBy(xpath = "//button[text()='Submit']") })
	private WebElement btnLogin;

	
	
	
	
	
	// Getters
	public WebElement getTxtUser() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
