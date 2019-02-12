package com.qa.StepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC04_GuruLogin_DataTable_StepDefinations 
{
	public WebDriver driver;
	
	@Given("^launch Browser$")
	public void launch_Browser() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Praveen_Automation\\Launching_Browsers\\Launching_Browsers_Latest\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      
	}

	@When("^navigate to Url \"([^\"]*)\"$")
	public void navigate_to_Url(String url) throws Throwable
	{
		 driver.get(url);
		 Assert.assertEquals(driver.getTitle(), "Guru99 Bank Home Page");
	    
	}

	@And("^enter register username and password$")
	public void enter_register_username_and_password(DataTable credentials) throws Throwable
	{
		List<List<String>> data=credentials.raw();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1));  
	 }

	@And("^Click login button$")
	public void click_login_button() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@value='LOGIN']")).sendKeys(Keys.RETURN);     
	}

	@Then("^Verify login page$")
	public void verify_login_page() throws Throwable
	{
	   if (driver.getTitle().contains("Guru99"))
	   {
		   Assert.assertTrue(true);
		   System.out.println("TEST PASS : TITLE MATCHED");
		
	} else
	{
		Assert.assertTrue(false);
		System.out.println("TEST FAIL : TITLE NOT MATCHED");
	}    
	}

	@And("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.close();
	}
}
