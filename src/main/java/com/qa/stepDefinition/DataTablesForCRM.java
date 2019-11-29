package com.qa.stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTablesForCRM {
	
	WebDriver driver;
	
	@Given("^user is in the homepage$")
	  public void user_is_in_the_homepage() throws InterruptedException
	  {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver77\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://ui.freecrm.com/");
		Thread.sleep(4000);
	  }
	@When("^title is displaying as FreeCRM Pro title$")
	public void title_is_displaying_as_FreeCRM_Pro_title()  {
	    
		String title = driver.getTitle();
		  System.out.println(title);
		
	}

	@Then("^user entering the email and password$")
	public void user_entering_the_email_and_password(DataTable credentials) throws InterruptedException  {
	      
		 List<List<String>>  data=  credentials.raw();
		
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(data.get(0).get(0));
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get(0).get(1));
		 Thread.sleep(4000);
	}

	@Then("^clicking on submit button here$")
	public void clicking_on_submit_button_here() throws InterruptedException  {
	   
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		 Thread.sleep(4000);

	}
	
	@Then("^user clicking on deals link$")
	public void user_clicking_on_deals_link() throws InterruptedException {
	   driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
	    Thread.sleep(4000);
	}

	@Then("^user clicking on new add deals button$")
	public void user_clicking_on_new_add_deals_button() throws InterruptedException {
	   
	    driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
	      Thread.sleep(4000);
	}

	@Then("^user enter title and company$")
	public void user_enter_and(DataTable details) throws InterruptedException  {
		
		List<List<String>> data1= details.raw();
	    
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(data1.get(1).get(0));
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//div[@name='company']//input[@class='search']")).sendKeys(data1.get(1).get(1));
		  Thread.sleep(3000);
	    
	}

	@Then("^user clicks on save button here$")
	public void user_clicks_on_save_button_here() throws InterruptedException  {
	    
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		 Thread.sleep(3000);
	}

	@Then("^closes the browser here$")
	public void closes_the_browser_here() {
		
		driver.quit();
	    
	}


}
