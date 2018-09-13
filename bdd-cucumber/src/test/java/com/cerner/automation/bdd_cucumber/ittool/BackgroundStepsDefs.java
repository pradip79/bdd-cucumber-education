package com.cerner.automation.bdd_cucumber.ittool;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundStepsDefs {
	@Given("^I have done this$")
	public void i_have_done_this() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside i_have_done_this");
	}

	@Given("^I have done that$")
	public void i_have_done_that() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside i_have_done_that");
	}

	@When("^I complete first action$")
	public void i_complete_first_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside i_complete_first_action");
	}

	@Then("^I validate first outcome$")
	public void i_validate_first_outcome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside i_validate_first_outcome");
	}

	@When("^I complete second action$")
	public void i_complete_second_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside i_complete_second_action");
	}

	@Then("^I validate second outcome$")
	public void i_validate_second_outcome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside i_validate_second_outcome");
	}



}
