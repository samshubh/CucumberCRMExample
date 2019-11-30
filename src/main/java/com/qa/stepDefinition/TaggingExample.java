package com.qa.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggingExample {
	
	WebDriver driver;
	
	@Given("^user in landing page$")
	  public void user_in_landing_page() throws InterruptedException
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

	
	@When("^the kipos logo is displayed$")
	public void the_kipos_logo_is_displayed()  {
	   
	}

	@Then("^click on login$")
	public void click_on_login()  {
	   
	}

	@Then("^verify the user name$")
	public void verify_the_user_name()  {
	    
	}

	@Given("^user in homepage$")
	public void user_in_homepage()  {
	   
	}

	@When("^gourmet text is displayed$")
	public void gourmet_text_is_displayed() {
	   
	}

	@Then("^view the product description page by clicking on product image$")
	public void view_the_product_description_page_by_clicking_on_product_image() {
	    
	}

	@Then("^add the ingredients$")
	public void add_the_ingredients()  {
	    
	}

	@Then("^click on add to cart$")
	public void click_on_add_to_cart()  {
	    
	}

	@Given("^user is in product details page$")
	public void user_is_in_product_details_page()  {
	    
	}

	@When("^the cart count is displaying$")
	public void the_cart_count_is_displaying()  {
	   
	}

	@Then("^click on cart icon$")
	public void click_on_cart_icon()  {
	   
	}

	@Then("^increase the product count$")
	public void increase_the_product_count()  {
	    
	}

	@Then("^click on checkout button$")
	public void click_on_checkout_button()  {
	   
	}

	@Given("^user is in checkout page$")
	public void user_is_in_checkout_page()  {
	    
	}

	@When("^checkout page text is displayed$")
	public void checkout_page_text_is_displayed()  {
	    
	    
	}

	@Then("^select the pickup option$")
	public void select_the_pickup_option()  {
	    
	}

	@Then("^user set the pick up date and time$")
	public void user_set_the_pick_up_date_and_time() {
	    
	}

	@Then("^clicks on continue button$")
	public void clicks_on_continue_button() {
	   
	}


}
