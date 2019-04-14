@Script2 @Regression
Feature: Tools QA Automation Practice Form

  #  Background:
  #    Given Browser should open
  #    When Page should be loaded
  #  Scenario: Practice Form Feature file
  #    And Enter firstname as "Selenium"
  #    And Enter lastname as "Automation"
  #    And Enter Geneder as "Male"
  #   And Enter Year of exprience 5
  #    And Enter Profession as "Automation"
  #    And Enter current date
  #    Then Close browser
  #  Scenario: Practice Form Feature file - 2
  #   And Enter firstname as "Deepak"
  #   And Enter lastname as "Rathod"
  ##   And Enter Geneder as "Male"
  #   And Enter Year of exprience 8
  #   And Enter Profession as "Automation"
  #   And Enter current date
  #   Then Close browser
  #  Scenario: Practice Form Feature file - 3
  #    And Enter firstname as "Bhagirath"
  #    And Enter lastname as "Maheta"
  #    And Enter Geneder as "Male"
  #    And Enter Year of exprience 5
  #    And Enter Profession as "Automation"
  #    And Enter current date
  #    Then Close browser
  Scenario Outline: Fill practice form date with multiple test data
    Given Browser should open
    When Page should be loaded
    And Enter firstname as "<firstname>"
    And Enter lastname as "<lastname>"
    And Enter Geneder as "Male"
    And Enter Year of exprience 5
    And Enter Profession as "Automation"
    And Enter current date
    Then Close browser

    Examples: 
      | firstname | lastname   | gender | exprience | profession |
      | Selenium  | Automation | Female |         3 | Manual     |
      | Deepak    | Rathod     | Male   |         7 | Automation |
      | Bhagirath | Maheta     | Male   |         5 | Automation |
