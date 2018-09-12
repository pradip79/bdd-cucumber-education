package com.cerner.automation.bdd_cucumber.ittool.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DefaultViewPage {
	private WebDriver driver;

	public DefaultViewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageHeader() {
		WebElement header = driver.findElement(By.xpath("//div[@id='defaultHeaderInfo']/h3"));
		return header.getText();
	}

}
