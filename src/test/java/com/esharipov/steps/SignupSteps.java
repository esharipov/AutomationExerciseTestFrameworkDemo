package com.esharipov.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.esharipov.pages.LoginPage;
import com.esharipov.pages.MainPage;
import com.esharipov.pages.SignupPage;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.junit.Assert;

public class SignupSteps {

	
	WebDriver driver = DriverManager.getDriver();
	MainPage mainPage = new MainPage(driver);
	LoginPage loginPage = new LoginPage(driver);
	SignupPage signupPage = new SignupPage(driver);
	
	@Given("user is on the main page")
	public void user_is_on_the_main_page() {
		driver.get("https://www.automationexercise.com/");
		Assert.assertEquals("Page Name", "Automation Exercise", driver.getTitle());
	}

	@When("user navigates to login and signup page")
	public void user_navigates_to_login_and_signup_page() {
		mainPage.clickBtnLoginSignup();
		Assert.assertEquals("Page Name", "Automation Exercise - Signup / Login", driver.getTitle());
	}

	@Given("user enters {string} and {string}")
	public void user_enters_their_name_and_email_address(String name, String emailAddress) {
	   loginPage.populateEmailSignup(emailAddress);
	   loginPage.populatefNameSignup(name);
	   
	}

	@Given("user clicks signup")
	public void user_clicks_signup() {
		loginPage.clickBtnSignup();
	}

	@And("user populates All Information on the next page")
	public void user_populates_all_information_on_the_next_page() {
	   signupPage.setPassword("password123");
	   signupPage.setDOB("11", "July", "1996");
	   signupPage.setFirstName("Emil");
	   signupPage.setLastName("Sharipov");
	   signupPage.setAddress1("1033 Bay Street");
	   signupPage.setCity("Toronto");
	   signupPage.setState("Ontario");
	   signupPage.setZipCode("M5S 3A5");
	   signupPage.setCountry("Canada");
	   signupPage.setPhoneNUmber("647-505-0305");
	}

	@And("user clicks create account")
	public void user_clicks_create_account() {
	   signupPage.clickBtnCreateAccount();
	}

	@Then("user is registered")
	public void user_is_registered() {
	 
	}
	
	@Then("user cannot proceed to registration form")
	public void user_cannot_proceed_to_registration_form() {
		Assert.assertEquals("Page Name", "Automation Exercise - Signup / Login", driver.getTitle());
		if(loginPage.getEmailSignup().length() > 0 || loginPage.getNameSignup().length() > 0) {
			Assert.assertTrue(loginPage.isEmailExistErrorDisplayed());
		}
		
	}





}
