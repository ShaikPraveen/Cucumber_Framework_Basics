package com.qa.StepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC01_GuruLogin_StepDefinations 
{
	public WebDriver driver;
	
	
	@Given("^Open Browser$")
	public void open_Browser() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Praveen_Automation\\Launching_Browsers\\Launching_Browsers_Latest\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^navigate to url \"([^\"]*)\"$")
	public void navigate_to_url(String url) throws Throwable 
	{
	   driver.get(url); 
	   Assert.assertEquals(driver.getTitle(), "Guru99 Bank Home Page");
	}

	@And("^enter registered username and password$")
	public void enter_registered_username_and_password() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr176855");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sEqAgUm");
	}

	@And("^click on login button$")
	public void click_on_login_button() throws Throwable
	{
		driver.findElement(By.xpath("//input[@value='LOGIN']")).sendKeys(Keys.RETURN);
	    	}

	@Then("^verify login page$")
	public void verify_login_page() throws Throwable 
	{
		String mngrid=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText();
		 
		 if (mngrid.contains("mngr176855")) 
		 {
			 System.out.println("TEST PASS : MANAGER ID IS AVAILABLE  "+mngrid);
			 Assert.assertTrue(true);
			
		} else 
		{   
			System.out.println("TEST FAIL : MANAGER ID IS NOT AVAILABLE "+mngrid);
			Assert.assertTrue(false);
		}
	 }

	@And("^close the browser$")
	public void close_the_browser() throws Throwable
	{
		driver.close();
	}
}
