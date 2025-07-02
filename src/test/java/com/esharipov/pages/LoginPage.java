package com.esharipov.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By fNameSignup = By.xpath("//input[@data-qa='signup-name']");
	By emailSignup = By.xpath("//input[@data-qa='signup-email']");
	By btnSignup = By.xpath("//button[@data-qa='signup-button']");
	By emailLogin = By.xpath("//input[@data-qa='login-email']");
	By password = By.xpath("//input[@data-qa='login-password']");
	By btnLogin = By.xpath("//button[@data-qa='login-button']");
	By errorMsgIncorrectCred = By.xpath("//p[text()='Your email or password is incorrect!']");
	By errorMsgUserExist = By.xpath("//p[text()='Email Address already exist!']");
	
	public void populatefNameSignup(String value) {
		driver.findElement(fNameSignup).sendKeys(value);
	}
	
	public void populateEmailSignup(String value) {
		driver.findElement(emailSignup).sendKeys(value);
	}
	
	public void clickBtnSignup() {
		driver.findElement(btnSignup).click();
	}
	
	public String getEmailLogin() {
		return driver.findElement(emailLogin).getText();
	}
	public String getPasswordLogin() {
		return driver.findElement(password).getText();
	}
	public String getEmailSignup() {
		return driver.findElement(emailSignup).getText();
	}
	public String getNameSignup() {
		return driver.findElement(fNameSignup).getText();
	}
	
	public void populateEmailLogin(String value) {
		driver.findElement(emailLogin).sendKeys(value);;
	}
	
	public void populatePassword(String value) {
		driver.findElement(password).sendKeys(value);;
	}
	
	public void clickBtnLogin() {
		driver.findElement(btnLogin).click();
	}
	
	public boolean isErrorMsgIncorrectCredVisible() {
		return driver.findElement(errorMsgIncorrectCred).isDisplayed();
	}
	
	public boolean isEmailExistErrorDisplayed() {
		return driver.findElement(errorMsgUserExist).isDisplayed();
	}
	
}
