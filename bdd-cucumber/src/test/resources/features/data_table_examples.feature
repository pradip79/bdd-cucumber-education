# Example feature to test data tables of different types
# Sample scenarios only--------
Feature: Example to test data tables only

  Scenario: Single-row, multiple columns
    Then Below details will be displayed - one
      | Cucumber | Selenium | JMeter |

  Scenario: Multiple-row, multiple-columns
    Then Below details will be displayed - two
      | Cucumber | Selenium | JMeter |
      | Java     | Python   | Scala  |

  Scenario: Multiple-row, multiple-columns, with headers
    Then Below details will be displayed - three
      | Name     | Age | Gender |
      | Pradip   |  38 | Male   |
      | Supratim |  28 | Male   |
      | Mousumi  |  32 | Female |
