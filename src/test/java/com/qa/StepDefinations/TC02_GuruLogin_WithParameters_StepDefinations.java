package com.qa.StepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC02_GuruLogin_WithParameters_StepDefinations
{
	public WebDriver driver;
	
	@Given("^open browser$")
	public void open_browser() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Praveen_Automation\\Launching_Browsers\\Launching_Browsers_Latest\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
	}

	@When("^navigate to URL \"([^\"]*)\"$")
	public void navigate_to_URL(String url) throws Throwable 
	{
	    driver.get(url);
	    Assert.assertEquals(driver.getTitle(), "Guru99 Bank Home Page");
	}

	@And("^enter registered username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_registered_username_and_password(String un, String pwd) throws Throwable 
	{
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);   
	}

	@And("^click login button$")
	public void click_login_button() throws Throwable
	{
		driver.findElement(By.xpath("//input[@value='LOGIN']")).sendKeys(Keys.RETURN); 
	}

	@Then("^verify Login page$")
	public void verify_Login_page() throws Throwable 
	{
		String welcomeText=driver.findElement(By.xpath("//marquee[@class='heading3']")).getText();
	     
		if (welcomeText.contains("Welcome To Manager's"))
		{
			Assert.assertTrue(true);
			System.out.println("TEST PASS : WELCOME TEXT IS DISPLAYED "+welcomeText);
			
		} else
		{
           Assert.assertTrue(false);
           System.out.println("TEST FAIL : WELCOME TEXT IS NOT DISPLAYED "+welcomeText);
		}
	}

	@And("^close the Browser$")
	public void close_the_Browser() throws Throwable 
	{
		driver.close();
	}
}
