# This is our second feature for ITTool
Feature: Send transactions through default view 
  In order to send HL7 transactions
  As a Soarian User
  I want a default view

  Scenario: Open default view
    Given User navigated to the URL "https://sfet-nprodnstg.dm50.dev.smed.net/sf-ittool/ITTool_Perf/Landing"
    And User is on landing page
    When User chooses default view option
    Then ITTool default view will be opened
