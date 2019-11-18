package com.capgemini.selenium.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = "{com.capgemini.selenium.rstepdefination.LoginStepDefination}")
public class Runner {

}
