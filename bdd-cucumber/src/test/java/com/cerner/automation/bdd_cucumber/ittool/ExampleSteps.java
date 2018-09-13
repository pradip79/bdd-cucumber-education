package com.cerner.automation.bdd_cucumber.ittool;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ExampleSteps {
	@Given("^I (?:navigate to|visit) \"([^\"]*)\"$")
	public void i_navigate_to(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside i_navigate_to. URL:"+arg1);
	}
	
	@When("^I open application in (chrome|firefox)$")
	public void i_open_application_in_chrome(String browser) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside i_open_application. Browser:"+browser);
	}
	
	@Given("^I have \\$(\\d+) in my account$")
	public void i_have_$_in_my_account(int amount) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside i_have_$. Amount:"+amount);
	}
	
	@When("^I add (\\d+.\\d+) and (\\d+.\\d+)$")
	public void i_add_and(double num1, double num2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside i_add. Sum:"+(num1+num2));
	}	

	
}
