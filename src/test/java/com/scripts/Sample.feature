@Script1 @Regression
Feature: sample test file
	
	@sc1
  Scenario: login valid test case
    Given browser should open
    When Enter login username and password
    Then Click on login button
    And verify result

  Scenario: name of the scenario, it could be anything
    Given browser should open
    When Enter login "abc" and "123"
    When Enter login "xyz" and "456"
    When Enter login "def" and "789"
