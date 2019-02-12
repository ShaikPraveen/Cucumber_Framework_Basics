package com.qa.StepDefinations;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC05_GuruLogin_DataTableHeader_StepDefinations
{
	  public WebDriver driver;  
	
	@Given("^Open the Browser$")
	public void open_the_Browser() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Praveen_Automation\\Launching_Browsers\\Launching_Browsers_Latest\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);          
	}

	@When("^Navigate to url \"([^\"]*)\"$")
	public void navigate_to_url(String url) throws Throwable 
	{
		driver.get(url);
		 Assert.assertEquals(driver.getTitle(), "Guru99 Bank Home Page"); 
	}

	@And("^Enter registered username and password$")
	public void enter_registered_username_and_password(DataTable credentials) throws Throwable 
	{
		List<Map<String,String>> data=credentials.asMaps(String.class, String.class);
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(data.get(0).get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get("password"));      
	}

	@And("^click login Button$")
	public void click_login_Button() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@value='LOGIN']")).sendKeys(Keys.RETURN);         
	}

	@Then("^verify Login Page$")
	public void verify_Login_Page() throws Throwable 
	{
		WebElement manager=driver.findElement(By.xpath("//a[contains(text(),'Manager')]"));
	     
		if (manager.isDisplayed()) 
		{
		  Assert.assertTrue(true);	
		  System.out.println("TEST PASS : MANAGER LINK IS AVAILABLE");
		} else
		{
          Assert.assertTrue(false);
          System.out.println("TEST FAIL : MANAGER LINK IS NOT AVAILABLE");
		}
	}

	@And("^Close The Browser$")
	public void close_The_Browser() throws Throwable 
	{
	 driver.close();   
	}
}
