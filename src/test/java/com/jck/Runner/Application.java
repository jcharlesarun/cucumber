package com.jck.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "./Resources/Features",
		glue = "com.jck.StepDefinitions",
		dryRun = false,
		monochrome = true
		)

public class Application {

}
