
Feature: Checking mvn repository search functionality

  Scenario: Verify Java is the first result
    When User is on mvnrepository website
    And User searches for "cucumber java"
    Then User should see "java" is in the first result
