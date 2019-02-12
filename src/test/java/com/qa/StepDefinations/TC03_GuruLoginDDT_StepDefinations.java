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

public class TC03_GuruLoginDDT_StepDefinations 
{ 
	public WebDriver driver;
	
	@Given("^Open browser$")
	public void open_browser() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Praveen_Automation\\Launching_Browsers\\Launching_Browsers_Latest\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}

	@When("^Navigate to Url \"([^\"]*)\"$")
	public void navigate_to_Url(String url) throws Throwable {
	   
		   driver.get(url); 
		   Assert.assertEquals(driver.getTitle(), "Guru99 Bank Home Page");
	}

	@And("^Enter Registered username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_Registered_username_and_password(String uname, String pwd) throws Throwable
	{
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd); 
	}

	@And("^Click Loginin Button$")
	public void click_Loginin_Button() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@value='LOGIN']")).sendKeys(Keys.RETURN);   
	}

	@Then("^Verify Login Page$")
	public void verify_Login_Page() throws Throwable
	{
	    String url=driver.getCurrentUrl();
	    
	    if (url.contains("Managerhomepage.php"))
	    {
		     Assert.assertTrue(true);
		     System.out.println("TEST PASS : CORRECT URL => "+url);
		} else 
		 {
             Assert.assertTrue(false);
             System.out.println("TEST FAIL : WRONG  URL => "+url);
		}
	}

	@And("^Close the Browser$")
	public void close_the_Browser() throws Throwable {
	   driver.close();
	}

}
