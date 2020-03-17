package com.Pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import excelutility.ExcelPage;

public class Registerandlogin {
	WebDriver driver;
	By Myaccount=By.linkText("My Account");
	By Register=By.linkText("Register");
	By FirstName=By.id("input-firstname");
	By LastName=By.id("input-lastname");
	By email=By.id("input-email");
	By telephone=By.id("input-telephone");
	By pwd=By.id("input-password");
	By cpwd=By.id("input-confirm");
	By terms=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By cont=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	By login=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By Email=By.id("input-email");
	By password=By.id("input-password");
	By loginbtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	
	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	public void HomePage() //using webdriver get visting the testing website
	{
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());
	}
	public void Register() throws IOException
	{
		driver.findElement(Myaccount).click();
		WebElement link =driver.findElement(Myaccount); // move to to element achiving by creating object
		WebElement link2=driver.findElement(Register);
		Actions action = new Actions(driver);
		action.moveToElement(link);
		action.moveToElement(link2).click().perform();
		driver.findElement(FirstName).sendKeys("kavya"); // passing the vaild mail
		driver.findElement(LastName).sendKeys("dondeti");
		driver.findElement(email).sendKeys("dondetikavya427@gmail.com");
		driver.findElement(telephone).sendKeys("9876543210");
		driver.findElement(pwd).sendKeys("kavya123");
		driver.findElement(cpwd).sendKeys("kavya123");
		driver.findElement(terms).click();
	}
	public void submitbutton() throws InterruptedException
	{
		driver.findElement(cont).click();
		driver.close();// loging button
	}
	public void Login(int a) throws IOException 
	{
		driver.findElement(Myaccount).click();
		WebElement link =driver.findElement(Myaccount); 
		WebElement link2=driver.findElement(login);
		Actions action = new Actions(driver);
		action.moveToElement(link);
		action.moveToElement(link2).click().perform();
		ExcelPage excel= new ExcelPage();
		driver.findElement(Email).sendKeys(excel.excel_Email(a));
		driver.findElement(password).sendKeys(excel.excel_password(a));
		driver.findElement(loginbtn).click();
		
	}
	public void check() throws InterruptedException
	{
		
		String store=driver.findElement(By.linkText("Your Store")).getText();
		Assert.assertEquals("Your Store", store);
		Thread.sleep(1000);
		driver.close();
	}
	public void InvalidLogin()
	{
		driver.findElement(Myaccount).click();
		WebElement account =driver.findElement(Myaccount); 
		WebElement loginto=driver.findElement(login);
		Actions action = new Actions(driver);
		action.moveToElement(account);
		action.moveToElement(loginto).click().perform();
		driver.findElement(Email).sendKeys("12345");
		driver.findElement(password).sendKeys("kavya123");
	}
	public void clickLogin() throws InterruptedException
	{
		driver.findElement(loginbtn).click();
		driver.close();
	}
	public void MandatoryFields() throws IOException
	{
		driver.findElement(Myaccount).click();
		WebElement link =driver.findElement(Myaccount); // move to to element achiving by creating object
		WebElement link2=driver.findElement(Register);
		Actions action = new Actions(driver);
		action.moveToElement(link);
		action.moveToElement(link2).click().perform();
		driver.findElement(FirstName).sendKeys("kavya"); // passing the vaild mail
		driver.findElement(LastName).sendKeys("dondeti");
		driver.findElement(email).sendKeys("dondetikavya427@gmail.com");
		//driver.findElement(telephone).sendKeys("9876543210");
		driver.findElement(pwd).sendKeys("kavya123");
		driver.findElement(cpwd).sendKeys("kavya123");
		driver.findElement(terms).click();
		
		//Screenshot("C:\\Users\\BLTuser.BLT060\\eclipse-workspace\\Project\\src\\test\\resources\\Screenshot\\register.png");
	}
	public void submit() throws InterruptedException
	{
		driver.findElement(cont).click();// loging button
		driver.close();
	}
	public void login()
	{
		driver.findElement(Myaccount).click();
		WebElement account =driver.findElement(Myaccount); 
		WebElement loginto=driver.findElement(login);
		Actions action = new Actions(driver);
		action.moveToElement(account);
		action.moveToElement(loginto).click().perform();
		driver.findElement(loginbtn).click();
	}
	public void Linksinthepage()
	{
		driver.findElement(Email).sendKeys("dondetikavya427@gmail.com");
		driver.findElement(password).sendKeys("kavya123");
		driver.findElement(loginbtn).click();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=1;i<links.size();i=i+1)
		{
			System.out.println(links.get(i).getText());
			driver.close();
		}
	}
	
}

	

