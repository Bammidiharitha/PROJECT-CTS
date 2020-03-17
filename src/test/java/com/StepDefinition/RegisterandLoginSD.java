package com.StepDefinition;

import com.Pages.Registerandlogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterandLoginSD {
Registerandlogin RegisterLogin= new Registerandlogin();
	@Given("^the Opencart application opens in chrome browser$")
	public void the_Opencart_application_opens_in_chrome_browser() throws Throwable {
	   RegisterLogin.url();
	}

	@When("^the user clicks on register$")
	public void the_user_clicks_on_register() throws Throwable {
		RegisterLogin.HomePage();
	}

	@Then("^the user fills all the details$")
	public void the_user_fills_all_the_details() throws Throwable {
	   RegisterLogin.Register();
	}

	@Then("^the user clicks on submit$")
	public void the_user_clicks_on_submit() throws Throwable {
	   RegisterLogin.submitbutton();
	}

	@Given("^the application opens in browser$")
	public void the_application_opens_in_browser() throws Throwable {
		RegisterLogin.url();
	}

	@When("^the user clicks on Login$")
	public void the_user_clicks_on_Login() throws Throwable {
		RegisterLogin.HomePage();
	}

	@Then("^the user gives valid credentials$")
	public void the_user_gives_valid_credentials() throws Throwable {
	   for(int i =1;i<4;i++)
		   {
		   RegisterLogin.Login(i);
		   if(i<3)
		   {
		   RegisterLogin.url();
		   RegisterLogin.HomePage();
		   }
		   }
	}

	@Then("^clicks on Login button$")
	public void clicks_on_Login_button() throws Throwable {
	   RegisterLogin.check();
	}

	@Given("^the application will open in chrome browser$")
	public void the_application_will_open_in_chrome_browser() throws Throwable {
		RegisterLogin.url();
	}

	@When("^the user clicks on login$")
	public void the_user_clicks_on_login() throws Throwable {
		RegisterLogin.HomePage();
	}

	@Then("^the user tries to login with invalid details$")
	public void the_user_tries_to_login_with_invalid_details() throws Throwable {
	   RegisterLogin.InvalidLogin();
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
	   RegisterLogin.clickLogin();
	}

	@Given("^the application opens in chrome browser$")
	public void the_application_opens_in_chrome_browser() throws Throwable {
		RegisterLogin.url();
	}

	@When("^the user clicks on register button$")
	public void the_user_clicks_on_register_button() throws Throwable {
		RegisterLogin.HomePage();
	}

	@Then("^the user fills the details by leaving one mandatory field$")
	public void the_user_fills_the_details_by_leaving_one_mandatory_field() throws Throwable {
	    RegisterLogin.MandatoryFields();
	}

	@Then("^clicks on submit button$")
	public void clicks_on_submit_button() throws Throwable {
	   RegisterLogin.submit();
	}

	@Given("^the application opens$")
	public void the_application_opens() throws Throwable {
		RegisterLogin.url();
	}

	@When("^the user login to the application$")
	public void the_user_login_to_the_application() throws Throwable {
		RegisterLogin.HomePage();
	}

	@Then("^the homepage opens$")
	public void the_homepage_opens() throws Throwable {
	   RegisterLogin.login();
	}

	@Then("^get all the links in that page$")
	public void get_all_the_links_in_that_page() throws Throwable {
	   RegisterLogin.Linksinthepage();
	}


}
