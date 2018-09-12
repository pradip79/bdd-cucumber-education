package com.cerner.automation.bdd_cucumber.ittool.pages;

import java.util.ArrayList;
import java.util.List;

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

	public List<String> getUserOptions() {
		// TODO Auto-generated method stub
		List<WebElement> options = driver.findElements(By.xpath("//button[contains(@title,'Perform HL7 Inbound Transaction')]"));
		
		List<String> optionTexts = new ArrayList<String>();
		optionTexts.add(options.get(0).getText());
		optionTexts.add(options.get(2).getText());		
		return optionTexts;				
	}

	public void chooseDefaultViewOption() {
		WebElement defaultViewButton = driver.findElement(By.xpath("//button[@title='Perform HL7 Inbound Transaction under a default form view']"));
		defaultViewButton.click();		
	}
		

}
