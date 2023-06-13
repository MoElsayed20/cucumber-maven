package com.noorteck.qa.steps;

import org.openqa.selenium.chrome.ChromeDriver;

import com.noorteck.qa.pages.ReservationPage;
import com.noorteck.qa.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfirmationSteps {
	ReservationPage con;

	@Given("user navigates to reservation page  {string}")
	public void user_navigates_to_reservation_page(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Thread.sleep(2000);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);
		Thread.sleep(2000);
		con = new ReservationPage();

	}

	@When("user enters Full name {string}")
	public void user_enters_full_name(String name) {
		con.enterName(name);
	}

	@When("user enters adress {string}")
	public void user_enters_adress(String address) {
		con.enteraddress(address);
	}

	@When("user enters city {string}")
	public void user_enters_city(String city) {
		con.enterCity(city);
	}

	@When("user enters state {string}")
	public void user_enters_state(String state) {
		con.enterstate(state);
	}

	@When("user enters zipcode {string}")
	public void user_enters_zipcode(String zipcode) {
		con.enterzipCode(zipcode);
	}

	@When("user selects credit card type\"Visa\"")
	public void user_selects_credit_card_type_visa(String creditType) {
		con.selectCreditCard(creditType);
	}

	@When("user enters credit card number\"{int}\"")
	public void user_enters_credit_card_number(String creditCardNum) {
		con.entercreditCardNumber(creditCardNum);
	}

	@When("user enters month {string}")
	public void user_enters_month(String month) {
		con.enterMonth(month);
	}

	@When("user enters year {string}")
	public void user_enters_year(String year) {
		con.enterYear(year);
	}

	@When("user enters name on card {string}")
	public void user_enters_name_on_card(String nameOnCard) {
		con.enternameOnCard(nameOnCard);
	}

	@When("user clicks {string}")
	public void remeberMe() {
		con.rememberMeField();
	}

	@When("user clicks {string}")
	public void purchaseFlight() {
		con.purchaseBtn();
	}

	@Then("User verifies success message {string}")
	public void user_verifies_success_message(String message) throws InterruptedException {
		System.out.println(message);

		Thread.sleep(2000);
		Constants.driver.quit();

	}

}
