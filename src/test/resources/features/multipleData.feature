Feature: Testing with multiple data
  @multiple
  Scenario: Testing data
    Given User goes on amazon
    And User verifies following search departments
    |Alexa Skills|
    |Computers   |
    |Digital Music|
    |Courses      |
    |Baby         |
    Then User closes the amazon