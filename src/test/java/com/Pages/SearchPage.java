package com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import excelutility.ExcelSearch;

public class SearchPage {
	WebDriver driver;
	By searchbar = By.name("search");
	By searchbutton = By.xpath("//*[@id='search']/span/button");
	By SearchHeader = By.xpath("//*[@id='content']/h1");
	By filterbutton1 = By.id("input-sort");
	String filter="Rating (Highest)";
	By product1 = By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[3]//i[1]");
	By product2 = By.xpath("//div[@id='product-search']//div[2]//div[1]//div[2]//div[2]//button[3]//i[1]");
	By totalComparision = By.id("compare-total");
	By listview = By.id("list-view");
	
	public void launchApplication(String URL) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	public void searchItem(String searchitem) {
		driver.findElement(searchbar).sendKeys(searchitem);
	}

	public void clickOnSearch() {
		driver.findElement(searchbutton).click();
	}

	public boolean IsSearchDisplayed() {
		
		return driver.findElement(SearchHeader).isDisplayed();
		
	}
	public void quit() {
		driver.close();
	}

	public void clickOnSearchAndFilter() {
		driver.findElement(searchbutton).click();
		WebElement filterbutton = driver.findElement(By.id("input-sort"));
		driver.findElement(filterbutton1).click();
		Select select = new Select(filterbutton);
		select.selectByVisibleText("Rating (Highest)");
	}

	public boolean validateFilter() {
		boolean Option = false;
		WebElement filterbutton = driver.findElement(By.id("input-sort"));
		Select select = new Select(filterbutton);
		String selectdfilter = select.getFirstSelectedOption().getText();
		if (filter.equalsIgnoreCase(selectdfilter)) {
			Option = true;
		}
		return Option;
	}
	public void getResults() {
		List<WebElement> results = driver.findElements(By.cssSelector("[class='product-thumb']"));
		for(int i=0;i<results.size();i++) {
			String s3=results.get(i).getText();
			ExcelSearch utility = new ExcelSearch();
		    utility.write_excel(i,0,s3);
		}
	}

	public void addToCompare() {
		driver.findElement(product1).click();
		driver.findElement(product2).click();
	}

	public void totalComparison() {
		driver.findElement(totalComparision).click();
	}

	public void Screenshot(String path) throws IOException{
		TakesScreenshot ts =((TakesScreenshot)driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File(path));
	}
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}
	public void clickOnListView() {
		driver.findElement(listview).click();
	}


}
