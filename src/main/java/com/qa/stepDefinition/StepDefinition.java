package com.qa.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("^user is already in Landing Page$")
	  public void user_is_already_in_Landing_Page() throws InterruptedException
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
	
	@When("^the title of the page is Kipos Collective$")
	public void the_title_of_the_page_is_Kipos_Collective() {
	    
		String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("Kipos Collective", title);
	    
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws InterruptedException  {
     
		driver.findElement(By.xpath("//div[@class='col-lg-4 col-xl-4 col-md-5 col-sm-4 col-8 sign-right order-aline-2 ng-scope']//span[@class='btn btn-sign'][contains(text(),'Login')]")).click();
	      Thread.sleep(4000);

	}

	@Then("^user enters email and password$")
	public void user_enters_email_and_password() throws InterruptedException  {
	   
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prashanth.burri@srijaytech.com");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='password_login']")).sendKeys("welcome123");
		Thread.sleep(4000);
	    
	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button() throws InterruptedException  {
	    
		driver.findElement(By.xpath("//form[@id='vm.frmLogin']//button[contains(@class,'pull-right btn-action btn btn-cart btn-kipos')][contains(text(),'Submit')]")).click();
		  Thread.sleep(3000);
	    
	}

	@Given("^user is already in homepage$")
	  public void user_is_already_in_homepage() throws InterruptedException
	  {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver77\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.kiposcollective.com/#/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='col-lg-4 col-xl-4 col-md-5 col-sm-4 col-8 sign-right order-aline-2 ng-scope']//span[@class='btn btn-sign'][contains(text(),'Login')]")).click();
	      Thread.sleep(4000);
	    
	      driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prashanth.burri@srijaytech.com");
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//input[@id='password_login']")).sendKeys("welcome123");
			Thread.sleep(4000);	
			
			driver.findElement(By.xpath("//form[@id='vm.frmLogin']//button[contains(@class,'pull-right btn-action btn btn-cart btn-kipos')][contains(text(),'Submit')]")).click();
			  Thread.sleep(3000);
			
	  }

	@When("^user is in gourmet section$")
	public void user_is_in_gourmet_section()  {

		String text = driver.findElement(By.xpath("//section[@class='banner-block container pt-30 ng-scope']//h3[contains(text(),'PROTEIN BOWLS')]")).getText();
		  System.out.println(text);
	}

	@Then("^click on gourmet section$")
	public void click_on_gourmet_section() throws InterruptedException  {
	    driver.findElement(By.xpath("//section[1]//div[1]//div[1]//div[1]//div[1]//p[3]//a[1]")).click();
	    Thread.sleep(4000);
	}

	@Then("^add the bowl to the cart$")
	public void add_the_bowl_to_the_cart() throws InterruptedException  {
	    driver.findElement(By.xpath("//body[@id='fpws']//div[@class='row']//div[@class='row']//div[1]//div[1]//div[2]//div[1]//div[2]//button[1]")).click();
	      Thread.sleep(3000);
	}
	@Then("^close the browser$")
	public void close_the_browser()  {
	   
		driver.close();
	    
	}
	
	
}
