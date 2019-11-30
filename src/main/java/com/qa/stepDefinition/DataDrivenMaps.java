package com.qa.stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataDrivenMaps {
	
	WebDriver driver;
	
	@Given("^user is viewing landing page$")
	 public void user_is_viewing_landing_page() throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vt1056.SRITADS\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://ui.freecrm.com/");
		Thread.sleep(4000);
	 }

	
	@When("^landing page url is displayed$")
	public void landing_page_url_is_displayed()  {
		
		 String url = driver.getCurrentUrl();
		  System.out.println(url);
	   
	}

	@Then("^user must enter the email and password$")
	public void user_must_enter_the_email_and_password(DataTable credentials) throws InterruptedException  {
	    
	for(Map<String,String> data: credentials.asMaps(String.class,String.class)) {
		
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(data.get("email"));
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get("password"));
		 Thread.sleep(4000);
	}
	}

	@Then("^user must click on login$")
	public void user_must_click_on_login() throws InterruptedException  {
	    
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		 Thread.sleep(4000);
	}
	

	@Then("^user must navigate to tasks link$")
	public void user_must_navigate_to_tasks_link() throws InterruptedException  {
	    
		driver.findElement(By.xpath("//span[contains(text(),'Tasks')]")).click();
		 Thread.sleep(4000);
	}

	@Then("^click on add new button$")
	public void click_on_add_new_button() throws InterruptedException {
	    
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		 Thread.sleep(4000);
	}

	@Then("^add the title and description and completion$")
	public void add_the_title_and_description_and_completion(DataTable taskDetails) throws InterruptedException  {
	    
		for (Map<String, String> dealsData : taskDetails.asMaps(String.class, String.class)) 
		{
		
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(dealsData.get("title"));
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(dealsData.get("description"));
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//input[@name='completion']")).sendKeys(dealsData.get("completion"));
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//span[contains(text(),'Tasks')]")).click();
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		 Thread.sleep(4000);
	     }
	}


	@Then("^quit the browser$")
	public void quit_the_browser() {
		
		driver.quit();
	}


}
