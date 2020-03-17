package com.StepDefinition;

import com.Pages.Desktoppage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DesktopSD {

	Desktoppage desktop=new Desktoppage();
	@Given("^the user launched the chrome browser$")
	public void the_user_launched_the_chrome_browser() throws Throwable {
	    desktop.url();
	}

	@When("^the user opens the OPenCart homepage$")
	public void the_user_opens_the_OPenCart_homepage() throws Throwable {
	   desktop.HomePage();
	}

	@Then("^the user select desktop$")
	public void the_user_select_desktop() throws Throwable {
	    desktop.desktopselect();
	}

	@Then("^the user select on the item$")
	public void the_user_select_on_the_item() throws Throwable {
	   desktop.item();
	}

	@Given("^the user launched the chrome$")
	public void the_user_launched_the_chrome() throws Throwable {
		desktop.url();
	}

	@When("^the user opens the OPenCart$")
	public void the_user_opens_the_OPenCart() throws Throwable {
		 desktop.HomePage();
	}

	@Then("^the user select desktop icon$")
	public void the_user_select_desktop_icon() throws Throwable {
		desktop.desktopselect();
	}

	@Then("^the user selects the number$")
	public void the_user_selects_the_number() throws Throwable {
	    desktop.shownumbers();
	}

	@Given("^the user launched the chrome window$")
	public void the_user_launched_the_chrome_window() throws Throwable {
		desktop.url();
	}

	@When("^the user opens the OPenCart page$")
	public void the_user_opens_the_OPenCart_page() throws Throwable {
		 desktop.HomePage();
	}

	@Then("^the user select desktop iccon$")
	public void the_user_select_desktop_iccon() throws Throwable {
		desktop.desktopselect();
	}

	@Then("^the user selects the type of sorting$")
	public void the_user_selects_the_type_of_sorting() throws Throwable {
		desktop.sorting();
	}

	@Given("^the user launched the chrome page$")
	public void the_user_launched_the_chrome_page() throws Throwable {
		desktop.url();
	}

	@When("^the user opens the OPenCart window$")
	public void the_user_opens_the_OPenCart_window() throws Throwable {
		 desktop.HomePage();
	}

	@Then("^the user select desktop button$")
	public void the_user_select_desktop_button() throws Throwable {
		desktop.desktopselect();
	}

	@Then("^the user adds the details of items to excelsheet$")
	public void the_user_adds_the_details_of_items_to_excelsheet() throws Throwable {
	   desktop.exceldata();
	}

	@Given("^the user launched the chrome session$")
	public void the_user_launched_the_chrome_session() throws Throwable {
		desktop.url();
	}

	@When("^the user opens the OPenCart windowpage$")
	public void the_user_opens_the_OPenCart_windowpage() throws Throwable {
		desktop.HomePage();
	}

	@Then("^the user select desktop buttonclick$")
	public void the_user_select_desktop_buttonclick() throws Throwable {
		desktop.desktopselect();
	}

	@Then("^the item to wishlist$")
	public void the_item_to_wishlist() throws Throwable {
	    desktop.wish();
	}


}
