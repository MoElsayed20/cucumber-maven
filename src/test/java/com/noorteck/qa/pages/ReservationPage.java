package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.qa.utils.Constants;

public class ReservationPage {

	@FindBy(id = "inputName")
	WebElement nameField;

	@FindBy(id = "address")
	WebElement addressField;

	@FindBy(id = "city")
	WebElement cityField;

	@FindBy(id = "state")
	WebElement stateField;

	@FindBy(id = "zipCode")
	WebElement zipcodeField;

	@FindBy(id = "cardType")
	WebElement cardTypeField;

	@FindBy(id = "creditCardNumber")
	WebElement creditCardNumField;

	@FindBy(id = "creditCardMonth")
	WebElement monthField;

	@FindBy(id = "creditCardYear")
	WebElement yearField;

	@FindBy(id = "nameOnCard")
	WebElement nameOnCardField;

	@FindBy(id = "rememberMe")
	WebElement rememberMeField;

	@FindBy(xpath = "//input[@value='Purchase Flight']")
	WebElement purchaseBtn;

	public ReservationPage() {
		PageFactory.initElements(Constants.driver, this);

	}

	public void enterName(String name) {
		nameField.sendKeys(name);
	}

	public void enteraddress(String address) {
		addressField.sendKeys(address);
	}

	public void enterCity(String city) {
		cityField.sendKeys(city);
	}

	public void enterstate(String state) {
		stateField.sendKeys(state);
	}

	public void enterzipCode(String zipCode) {
		zipcodeField.sendKeys(zipCode);
	}

	public void selectCreditCard(String creditCardType) {
		Select select = new Select(cardTypeField);
		select.deselectByVisibleText(creditCardType);
	}

	public void entercreditCardNumber(String creditCardNum) {
		creditCardNumField.sendKeys(creditCardNum);
	}

	public void enterMonth(String month) {
		monthField.sendKeys(month);
	}

	public void enterYear(String year) {
		yearField.sendKeys(year);
	}

	public void enternameOnCard(String nameOnCard) {
		nameOnCardField.sendKeys(nameOnCard);
	}

	public void rememberMeField() {
		rememberMeField.click();
		;
	}

	public void purchaseBtn() {
		purchaseBtn.click();
		;
	}

}
