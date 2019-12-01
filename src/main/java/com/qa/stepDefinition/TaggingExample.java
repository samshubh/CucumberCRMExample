package com.qa.stepDefinition;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggingExample {
	
	WebDriver driver;
	
	
	@Before
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver77\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.kiposcollective.com/#/");
		Thread.sleep(4000);
	  }
		
	@After
	  public void tearDown()
	  {
		driver.quit();
	  }

	@Given("^user in landing page$")
	  public void user_in_landing_page() throws InterruptedException
	  {
		String title = driver.getTitle();
		  System.out.println(title);
	  }

	
	@When("^the kipos logo is displayed$")
	public void the_kipos_logo_is_displayed()  {
	   
		boolean  b =driver.findElement(By.xpath("//div[@class='col-lg-3 col-xl-3 col-md-3 col-sm-4 col-4 logo-block navbar-left order-aline-1 ng-scope']//img")).isDisplayed();
		  System.out.println(b);
	}

	@Then("^click on login$")
	public void click_on_login() throws InterruptedException  {
	   
		driver.findElement(By.xpath("//div[@class='col-lg-4 col-xl-4 col-md-5 col-sm-4 col-8 sign-right order-aline-2 ng-scope']//span[@class='btn btn-sign'][contains(text(),'Login')]")).click();
		 Thread.sleep(4000);
	}
	
	@Then("^user enters login \"(.*)\" and \"(.*)\"$")
	public void user_enters_login_email_and_password(String email, String password) throws InterruptedException  {
		
		
	      driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//input[@id='password_login']")).sendKeys(password);
	         Thread.sleep(3000);
	         
	         driver.findElement(By.xpath("//form[@id='vm.frmLogin']//button[contains(@class,'pull-right btn-action btn btn-cart btn-kipos')][contains(text(),'Submit')]")).click();
	           Thread.sleep(4000);
	            
	          String username= driver.findElement(By.xpath("//div[@class='col-lg-4 col-xl-4 col-md-5 col-sm-4 col-8 sign-right order-aline-2 ng-scope']//a[@class='dropdown-toggle text-cart ng-binding'][contains(text(),'prashanth')]")).getText();
	           System.out.println(username);
	           Thread.sleep(4000);
      
	}  
	
	@Given("^user in homepage$")
	public void user_in_homepage()  {
	    // Write code here that turns the phrase above into concrete actions
	    String title=driver.getTitle();
	    System.out.println(title);
	}

	@Then("^gourmet text is displayed$")
	public void gourmet_text_is_displayed()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^clicking on gourmet section$")
	public void clicking_on_gourmet_section() {
	    ;
	}

	@Then("^view the product description page by clicking on product image$")
	public void view_the_product_description_page_by_clicking_on_product_image()  {
	    
	}

	@Then("^add the ingredients$")
	public void add_the_ingredients(){
	    
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
	public void select_the_pickup_option() {
	    
	}

	@Then("^user set the pick up date and time$")
	public void user_set_the_pick_up_date_and_time()  {
	   
	}

	@Then("^clicks on continue button$")
	public void clicks_on_continue_button()  {
	   
	}


}