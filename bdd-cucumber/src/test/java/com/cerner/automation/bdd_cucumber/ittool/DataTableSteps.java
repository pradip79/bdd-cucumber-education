package com.cerner.automation.bdd_cucumber.ittool;


import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class DataTableSteps {
	
	@Then("^Below details will be displayed - one$")
	public void below_details_will_be_displayed_one(DataTable table) throws Throwable {
	    List<String> data = table.asList(String.class);
	    System.out.println("Data1:"+data.get(0));
	    System.out.println("Data2:"+data.get(1));
	    System.out.println("Data3:"+data.get(2));
	}

	@Then("^Below details will be displayed - two$")
	public void below_details_will_be_displayed_two(DataTable table) throws Throwable {
	    List<List<String>> data = table.asLists(String.class);
	    for(int i=0;i<data.size();i++) {
	    	System.out.println("Col1:"+data.get(i).get(0));
	    	System.out.println("Col2:"+data.get(i).get(1));
	    	System.out.println("Col3:"+data.get(i).get(2));
	    }
	}

	@Then("^Below details will be displayed - three$")
	public void below_details_will_be_displayed_three(DataTable table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String,String>> data = table.asMaps(String.class, String.class);
		
		for(int i=0;i<data.size();i++) {
			System.out.println("Name:"+data.get(i).get("Name"));
			System.out.println("Age:"+data.get(i).get("Age"));
			System.out.println("Gender:"+data.get(i).get("Gender"));
		}
	    
	}

}
