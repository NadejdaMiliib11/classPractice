Feature: Etsy search feature
  @etsy
  Scenario: Etsy title verification using search feature
    Given User is on Etsy Homepage
    When User types "Wooden Spoons" in the search box
    And User clicks seach button
    Then User sees "Wooden Spoons" is in the title