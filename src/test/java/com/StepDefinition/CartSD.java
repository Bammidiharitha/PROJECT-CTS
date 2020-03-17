package com.StepDefinition;

import com.Pages.CartPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CartSD {
	CartPage cart=new CartPage();
	@Given("^the url opens in Chrome application$")
	public void the_url_opens_in_Chrome_application() throws Throwable {
	    cart.url();
	}

	@When("^the user clicks on phones$")
	public void the_user_clicks_on_phones() throws Throwable {
	    cart.homepage();
	}

	@Then("^the user selects the product$")
	public void the_user_selects_the_product() throws Throwable {
	    cart.actions();
	}

	@Then("^clicks on add to cart$")
	public void clicks_on_add_to_cart() throws Throwable {
	    cart.addcart();
	}

	@Given("^url opens in chrome browser$")
	public void url_opens_in_chrome_browser() throws Throwable {
		cart.url();
	}

	@When("^the user clicks on Cart option$")
	public void the_user_clicks_on_Cart_option() throws Throwable {
		cart.homepage();
	   	}

	@Then("^the user checks the product$")
	public void the_user_checks_the_product() throws Throwable {
	    cart.login();
	}

	@Then("^confirms the product we added is present or not$")
	public void confirms_the_product_we_added_is_present_or_not() throws Throwable {
	    cart.assert1();
	}

	@Given("^the url open in chrome browser$")
	public void the_url_open_in_chrome_browser() throws Throwable {
		cart.url();
	}

	@When("^user click on cart option$")
	public void user_click_on_cart_option() throws Throwable {
		cart.homepage();
	}

	@Then("^increase the quantity of the product$")
	public void increase_the_quantity_of_the_product() throws Throwable {
	   cart.login();
	}

	@Then("^click on refresh button$")
	public void click_on_refresh_button() throws Throwable {
	    cart.incquan();
	}

	@Given("^url open in chrome browser$")
	public void url_open_in_chrome_browser() throws Throwable {
		cart.url();
	}

	@When("^the user clicks on cart option$")
	public void the_user_clicks_on_cart_option() throws Throwable {
		cart.homepage();
	}

	@Then("^clicks on the selected product$")
	public void clicks_on_the_selected_product() throws Throwable {
	    cart.login();
	}

	@Then("^store the product name into excel$")
	public void store_the_product_name_into_excel() throws Throwable {
	   cart.storexecel();
	}

	@Given("^the url opens in the chrome browser$")
	public void the_url_opens_in_the_chrome_browser() throws Throwable {
		cart.url();
	}

	@When("^the user click on cart option$")
	public void the_user_click_on_cart_option() throws Throwable {
		cart.homepage();
	}

	@Then("^user selects the product$")
	public void user_selects_the_product() throws Throwable {
	    cart.login();
	}

	@Then("^clicks on remove$")
	public void clicks_on_remove() throws Throwable {
	   cart.remove();
	}



}
