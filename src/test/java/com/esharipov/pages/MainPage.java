package com.esharipov.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	WebDriver driver;
	By btnLoginSignup = By.xpath("//a[contains(text(), 'Signup')]");
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickBtnLoginSignup() {
		driver.findElement(btnLoginSignup).click();
	}
}
