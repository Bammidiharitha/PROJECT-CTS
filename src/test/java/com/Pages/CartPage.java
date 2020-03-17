package com.Pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



import excelutility.ExcelWrite;

public class CartPage {
	WebDriver driver;
	By Myaccount=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
	By login=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By Email=By.id("input-email");
	By password=By.id("input-password");
	By loginbtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	By phones=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a");
	By addtocart=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[1]/span");
	By cart=By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span");
	By item=By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a");
	By product=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a");
	By Quantity=By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input");
	By button=By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[1]");
	By product1=By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a");
	By text=By.xpath("//*[@id=\"content\"]/div/div[2]/h1");
	By cancel=By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]/i");
	
	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver",  "D:\\SeleniumJars\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	public void homepage() //using webdriver get visting the testing website
	{
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());
	}
	public void actions() 
	{
		driver.findElement(Myaccount).click();
		WebElement link =driver.findElement(Myaccount); 
		WebElement link2=driver.findElement(login);
		Actions action = new Actions(driver);
		action.moveToElement(link);
		action.moveToElement(link2).click().perform();
		driver.findElement(Email).sendKeys("bammidiharitha11@gmail.com");
		driver.findElement(password).sendKeys("Haritha@05");
		driver.findElement(loginbtn).click();
		driver.findElement(phones).click();
		JavascriptExecutor js =(JavascriptExecutor) driver ;
		js.executeScript("window.scrollBy(0,5000)");
		
		}
	public void addcart() throws InterruptedException {
		driver.findElement(addtocart).click();
		Thread.sleep(2000);
		driver.close();
	}
	public void login() 
	{
		driver.findElement(Myaccount).click();
		WebElement link =driver.findElement(Myaccount); 
		WebElement link2=driver.findElement(login);
		Actions action = new Actions(driver);
		action.moveToElement(link);
		action.moveToElement(link2).click().perform();
		driver.findElement(Email).sendKeys("bammidiharitha11@gmail.com");
		driver.findElement(password).sendKeys("Haritha@05");
		driver.findElement(loginbtn).click();
		driver.findElement(cart).click();
	}
	public void assert1() {
		
		String item1= driver.findElement(item).getText();
		driver.navigate().to("https://demo.opencart.com/index.php?route=product/category&path=24");
		String product1=driver.findElement(product).getText();
	 Assert.assertEquals(item1, product1);
	 driver.close();
		
	}
	public void incquan() throws InterruptedException {
		driver.findElement(Quantity).clear();
		driver.findElement(Quantity).sendKeys("2");
		driver.findElement(button).click();
		Thread.sleep(1000);
		driver.close();
	}
	public void storexecel() {
		driver.findElement(product1).click();
		String s=driver.findElement(text).getText();
		ExcelWrite excel=new ExcelWrite();
		excel.write_excel(0, 0, s);
		}
	public void remove()
	{
		driver.findElement(cancel).click();
		driver.close();
	}
	
}
