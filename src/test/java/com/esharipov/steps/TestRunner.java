package com.esharipov.steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"com.esharipov"},
tags= "not @alpha", 
monochrome = true, 
plugin = {"pretty", "html:target/HTMLReports"})
public class TestRunner {
	
}
