#Sample Feature Definition Template
Feature: Sample outline feature
  I want to use this template for my feature file

  Scenario Outline: Example scenario for outline and examples
    When I add number <num1> and number <num2>
    Then I verify the <sum> in result

    Examples: 
      | num1 | num2 | sum |
      |    5 |    4 |   9 |
      |    6 |    7 |  13 |
      |    4 |    3 |   9 |

  Scenario Outline: Example scenario for login
    When I login with username <userName> and password <password>
    Then I will see welcome page

    Examples: 
      | userName | password |
      | abc      | abc@123  |
      | gfd      | gfd@345  |
