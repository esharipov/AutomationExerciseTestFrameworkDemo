package com.esharipov.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {
	
	WebDriver driver;
	
	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}

	By dayOfBirth = By.id("days");
	By monthOfBirth = By.id("months");
	By yearOfBirth = By.id("years");
	By password = By.id("password");
	By firstName = By.id("first_name");
	By lastName = By.id("last_name");
	By address1 = By.id("address1");
	By country = By.id("country");
	By state = By.id("state");
	By city = By.id("city");
	By zipcode = By.id("zipcode");
	By phoneNumber = By.id("mobile_number");
	By btnCreateAccount = By.xpath("//button[@data-qa='create-account']");
	By errorMsgUserExist = By.xpath("//p[text()='Email Address already exist!']");
	
	public void setDOB(String day, String month, String year) {
		Select dayOfBirthDropDown = new Select(driver.findElement(dayOfBirth));
		Select monthOfBirthDropDown = new Select(driver.findElement(monthOfBirth));
		Select yearOfBirthDropDown = new Select(driver.findElement(yearOfBirth));
		
		dayOfBirthDropDown.selectByValue(day);
		monthOfBirthDropDown.selectByContainsVisibleText(month);
		yearOfBirthDropDown.selectByValue(year);
		
		
	}
	
	public void setPassword(String value) {
		driver.findElement(password).sendKeys(value);
	}
	
	public void setFirstName(String value) {
		driver.findElement(firstName).sendKeys(value);
		
	}
	public void setLastName(String value) {
		driver.findElement(lastName).sendKeys(value);
	}
	
	public void setAddress1(String value) {
		driver.findElement(address1).sendKeys(value);
	}
	
	public void setCountry(String value) {
		Select countryDropDown = new Select(driver.findElement(country));
		countryDropDown.selectByContainsVisibleText(value);
	}
	
	public void setState(String value) {
		driver.findElement(state).sendKeys(value);
	}
	
	public void setCity(String value) {
		driver.findElement(city).sendKeys(value);
	}
	
	public void setZipCode(String value) {
		driver.findElement(zipcode).sendKeys(value);
	}
	
	public void setPhoneNUmber(String value) {
		driver.findElement(phoneNumber).sendKeys(value);
	}
	
	public void clickBtnCreateAccount() {
		driver.findElement(btnCreateAccount).click();
	}
	
	
	
}
