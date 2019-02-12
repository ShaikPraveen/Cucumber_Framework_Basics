package com.qa.StepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC06_GuruLoginHooks_StepDefinations 
{
	public WebDriver driver;
	   
	  @Before
	  public void setUP()
	  {
		    System.setProperty("webdriver.chrome.driver", "E:\\Praveen_Automation\\Launching_Browsers\\Launching_Browsers_Latest\\New folder\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			 driver.get("https://demo.guru99.com/v4/");
			 Assert.assertEquals(driver.getTitle(), "Guru99 Bank Home Page");  
	  }
	  
	@Given("^Enter Registred username and password$")
	public void enter_Registred_username_and_password(DataTable credentials) throws Throwable
	{
		List<List<String>> data=credentials.raw();  
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1)); 
	}

	@When("^Click Login button$")
	public void click_Login_button() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@value='LOGIN']")).sendKeys(Keys.RETURN);       
	}

	@Then("^Verify Login page$")
	public void verify_Login_page() throws Throwable 
	{
	    WebElement img=driver.findElement(By.xpath("//img[@src='../images/1.gif']"));
	    
	    if (img.isDisplayed())
	    {
		   Assert.assertTrue(true);	
		   System.out.println("TEST PASS : IMAGE IS DISPLAYED");
		} else 
		{
           Assert.assertTrue(false);
           System.out.println("TEST FAIL : IMAGE IS NOT DISPLAYED");
		}
	}
	
	
	 @After
	  public void tearDown()
	  {
		  driver.close();
	  }
}
