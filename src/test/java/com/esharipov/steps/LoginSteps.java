package com.esharipov.steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

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

public class LoginSteps {
	
	WebDriver driver = DriverManager.getDriver();
	MainPage mainPage = new MainPage(driver);
	LoginPage loginPage = new LoginPage(driver);
	
	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String userName, String password) {
		loginPage.populateEmailLogin(userName);
		loginPage.populatePassword(password);
	}
	
	@When("user does not enter credentials")
	public void user_does_not_enter_credentials() {
		
	}
	
	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickBtnLogin();
	}
	@Then("user is logged in")
	public void user_is_logged_in() {
		Assert.assertEquals("URL", "https://www.automationexercise.com/", driver.getCurrentUrl());
	}
	
	@Then("user is unable to login")
	public void user_is_unable_to_login() {
		if(loginPage.getEmailLogin().length() > 0 && loginPage.getPasswordLogin().length() > 0)
		{
			Assert.assertTrue(loginPage.isErrorMsgIncorrectCredVisible());
		}
		Assert.assertEquals("Page Name", "Automation Exercise - Signup / Login", driver.getTitle());
		
	}
	
}
