package com.cerner.automation.bdd_cucumber.ittool;

import org.openqa.selenium.WebDriver;
import com.cerner.automation.bdd_cucumber.CommonTask;
import com.cerner.automation.bdd_cucumber.SharedClass;
import com.cerner.automation.bdd_cucumber.SharedDriver;
import com.cerner.automation.bdd_cucumber.ittool.pages.LandingPage;
import static org.testng.Assert.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ITToolStepDefs {
	
	private WebDriver driver;
	private LandingPage landingPage;
	SharedClass sharedClass;
	
	public ITToolStepDefs(SharedDriver driver) {
		this.driver = driver;
	}	
	
	@When("^User navigates to the URL \"([^\"]*)\"$")
	public void user_navigates_to_the_URL(String appURL) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    CommonTask.navigateTo(driver, appURL);
	}

	@Then("^ITTool landing page is opened$")
	public void ittool_landing_page_is_opened() throws Throwable {
		
		landingPage = new LandingPage(driver);		
		assertEquals("Inbound Transaction Tool", landingPage.getPageHeader());		
	    
	}
	
	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    landingPage = new LandingPage(driver);
	}

	@Then("^ITTool options are available$")
	public void ittool_options_are_available() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		landingPage = new LandingPage(driver);		
	    assertEquals(landingPage.isDefaultViewOptionDisplayed(), true);
	    assertEquals(landingPage.isImportViewOptionDisplayed(), true);
	}
	
	@Then("^Close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

}
