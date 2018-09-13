package com.cerner.automation.bdd_cucumber.ittool;

import static org.testng.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SummationStepDef {
	private int sum;
	
	@Before("@webtest")
	public void setUp() {
		
	}

	@When("^I add number (\\d+) and number (\\d+)$")
	public void i_add_number_and_number(int arg1, int arg2) throws Throwable {
	    sum = arg1+arg2;
	}

	@Then("^I verify the (\\d+) in result$")
	public void i_verify_the_in_result(int arg1) throws Throwable {
	    assertEquals(sum,arg1);
	}

}
