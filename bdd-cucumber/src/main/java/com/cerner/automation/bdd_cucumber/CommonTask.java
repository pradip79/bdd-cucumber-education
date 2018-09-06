package com.cerner.automation.bdd_cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonTask {
	
	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");		
	    WebDriver driver = new InternetExplorerDriver();
	    return driver;
	}

	public static void navigateTo(WebDriver driver, String appURL) {
		// TODO Auto-generated method stub
		driver.get(appURL);		
	}

}
