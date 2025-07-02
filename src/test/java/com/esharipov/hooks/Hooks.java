package com.esharipov.hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


	@After
	public void tearDown() {
		DriverManager.quitDriver();
	}
	
}
