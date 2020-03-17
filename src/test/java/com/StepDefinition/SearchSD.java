package com.StepDefinition;

import org.junit.Assert;

import com.Pages.SearchPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSD {

	SearchPage search=new SearchPage();
	@Given("^the user launches the chrome browser and opens application$")
	public void the_user_launches_the_chrome_browser_and_opens_application() throws Throwable {
		search.launchApplication("https://demo.opencart.com/");

	}

	@When("^the user searches for the product$")
	public void the_user_searches_for_the_product() throws Throwable {
		search.searchItem("macbook");
	}

	@And("^Clicks on Search button$")
	public void clicks_on_Search_button() throws Throwable {
		search.clickOnSearch();

	}

	@Then("^the user should see search results$")
	public void the_user_should_see_search_results() throws Throwable {
		
		Assert.assertTrue(search.IsSearchDisplayed());
		search.quit();

	}

	@Given("^the user launches the chrome browser & opens application$")
	public void the_user_launches_the_chrome_browser_opens_application() throws Throwable {
		search.launchApplication("https://demo.opencart.com/");
	    
	}

	@When("^the user searches the his product$")
	public void the_user_searches_the_his_product() throws Throwable {
	search.searchItem("macbook");
	  
	}

	@And("^Clicks on Search button, Selects the the sort by filter$")
	public void clicks_on_Search_button_Selects_the_the_sort_by_filter() throws Throwable {
    search.clickOnSearchAndFilter();
	    
	}

	@Then("^the user should see modified results$")
	public void the_user_should_see_modified_results() throws Throwable {
		Assert.assertTrue(search.validateFilter());
		search.quit();
	 }

	@Given("^the user launches the opens chrome and Application$")
	public void the_user_launches_the_opens_chrome_and_Application() throws Throwable {
	  search.launchApplication("https://demo.opencart.com/");
	}

	@When("^the user searches for products$")
	public void the_user_searches_for_products() throws Throwable {
	  search.searchItem("macbook");
	}

	@And("^Clicks on Search Button$")
	public void clicks_on_Search_Button() throws Throwable {
	 search.clickOnSearch(); 
	}

	@Then("^user should see results$")
	public void user_should_see_results() throws Throwable {
	    search.getResults();
	    search.quit();
	}

	@Given("^the user launches the opens chrome & Application$")
	public void the_user_launches_the_opens_chrome_Application() throws Throwable {
	  search.launchApplication("https://demo.opencart.com/");
	}

	@When("^the user searches for products on Application$")
	public void the_user_searches_for_products_on_Application() throws Throwable {
	   search.searchItem("macbook");
	}

	@And("^Clicks on search button$")
	public void clicks_on_search_button() throws Throwable {
	   search.clickOnSearch();
	}

	@Then("^Compares two products$")
	public void compares_two_products() throws Throwable {
	    search.addToCompare();
	}

	@And("^the user should see results$")
	public void the_user_should_see_results() throws Throwable {
	   search.totalComparison();
	   search.scroll();
	   search.Screenshot("C:\\Users\\BLTuser.BLT059\\eclipse-workspace\\Opencartproject\\src\\test\\resources\\ScreenShot\\search.png");
	   search.quit();
	}

	@Given("^the user launches the opens chrome & application$")
	public void the_user_launches_the_opens_chrome_application() throws Throwable {
	  search.launchApplication("https://demo.opencart.com/");
	   
	}

	@When("^the user searches for products on application$")
	public void the_user_searches_for_products_on_application() throws Throwable {
		search.searchItem("macbook");
	   
	}

	@And("^Clicks on search button and click on List View$")
	public void clicks_on_search_button_and_click_on_List_View() throws Throwable {
	  search.clickOnSearch();
	  search.scroll();
	  
	   
	}

	@Then("^Results should be viewed in List View$")
	public void results_should_be_viewed_in_List_View() throws Throwable {
		search.clickOnListView();
	   Thread.sleep(2000);
		search.quit();
	}


}

