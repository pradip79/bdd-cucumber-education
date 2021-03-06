# This is our first feature for ITTool
Feature: Landing page for ITTool users
  In order to access IT Tool
  As a Soarian User
  I want a landing page

  Scenario: Launch Landing Page
    When User navigates to the URL "https://sfet-nprodnstg.dm50.dev.smed.net/sf-ittool/ITTool_Perf/Landing"
    Then ITTool landing page is opened

  Scenario: View user options
    Given User is on landing page
    Then Below ITTool options are available
      | Generate HL7 from default view |
      | Inbound existing HL7 script    |
