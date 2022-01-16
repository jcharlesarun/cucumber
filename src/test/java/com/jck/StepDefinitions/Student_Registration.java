package com.jck.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Student_Registration {
	@Given("user enters the regsitration page")
	public void user_enters_the_regsitration_page() {
	    System.out.println("user enters the regsitration page");
	}

	@When("user fills all the mandatory fields")
	public void user_fills_all_the_mandatory_fields() {
		System.out.println("user fills all the mandatory fields");
	}

	@When("click on submit field")
	public void click_on_submit_field() {
		System.out.println("click on submit field");
	}

	@Then("user registration for student should be successfull")
	public void user_registration_for_student_should_be_successfull() {
		System.out.println("user registration for student should be successfull");
	}
}
