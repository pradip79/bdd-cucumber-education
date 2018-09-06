package com.cerner.automation.bdd_cucumber.ittool.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	private WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;		
	}

	public String getPageHeader() {
		WebElement pageHeader = driver.findElement(By.xpath("//span[@class='toolTitle']"));
		return pageHeader.getText();
	}
	
	public boolean isDefaultViewOptionDisplayed() {
		WebElement defaultViewButton = driver.findElement(By.xpath("//button[@title='Perform HL7 Inbound Transaction under a default form view']"));		
		return defaultViewButton.isDisplayed();
	}
	
	public boolean isImportViewOptionDisplayed() {
		WebElement importViewButton = driver.findElement(By.xpath("//button[@title='Perform HL7 Inbound Transaction using an existing HL7 script']"));		
		return importViewButton.isDisplayed();
	}
		

}
