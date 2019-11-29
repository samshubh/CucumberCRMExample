package com.qa.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CRMExamplesKeyword {
	

	WebDriver driver;
	
	@Given("^user is in the home page$")
	  public void user_is_in_the_home_page() throws InterruptedException
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
	
	@When("^title is displaying as FreeCRM Pro$")
	public void title_is_displaying_as_FreeCRM_Pro()  {
	    
		String title = driver.getTitle();
		  System.out.println(title);
		
	}

	@Then("^user enters the \"(.*)\" and \"(.*)\"$")
	public void user_enters_the_and(String email, String password) throws InterruptedException  {
	    
		
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(email);
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		 Thread.sleep(4000);
	}

	@Then("^click submit button$")
	public void click_submit_button() throws InterruptedException  {
	   
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		 Thread.sleep(4000);

	}
	
	@Then("^user clicks on contacts link$")
	public void user_clicks_on_contacts_link() throws InterruptedException {
	   driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
	    Thread.sleep(4000);
	}

	@Then("^user clicks on new add button contact$")
	public void user_clicks_on_new_add_button_contact() throws InterruptedException {
	   
	    driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
	      Thread.sleep(4000);
	}

	@Then("^user enter \"(.*)\" and \"(.*)\"$")
	public void user_enter_and(String firstname, String lastname) throws InterruptedException  {
	    
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
		  Thread.sleep(3000);
	    
	}

	@Then("^user clicks on save button$")
	public void user_clicks_on_save_button() throws InterruptedException  {
	    
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		 Thread.sleep(3000);
	}

	@Then("^closing the browser$")
	public void closing_the_browser() {
		
		driver.quit();
	    
	}

}
