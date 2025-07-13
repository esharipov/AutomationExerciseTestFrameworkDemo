package com.esharipov.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class MainPage {
	WebDriver driver;
	By btnLoginSignup = By.xpath("//a[contains(text(), 'Signup')]");
	By btnLogout = By.xpath("//a[contains(text(), 'Logout')]");
	By btnProducts = By.xpath("//a[contains(text(), 'Products')]");
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickBtnLoginSignup() {
		driver.findElement(btnLoginSignup).click();
	}
	public void clickBtnLogout() {
		driver.findElement(btnLogout).click();
	}
	public void clickBtnProducts() {
		driver.findElement(btnProducts).click();
	}
	
	public boolean isBtnLoginSignupDisplayed() {
		try {
			return driver.findElement(btnLoginSignup).isDisplayed();
		} catch(NoSuchElementException e) {
			return false;
		}
	}
	public boolean isBtnLogoutDisplayed() {
		try {
			return driver.findElement(btnLogout).isDisplayed();
		} catch(NoSuchElementException e) {
			return false;
		}
	}
}
