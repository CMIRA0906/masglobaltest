# crtest
This project have the automation respect to Tecnica test wih google search

Scenarios implemented

Feature: Google Homepage Search
  I as User
  want enter information in homepage
  For seach information

  Scenario: User search content in Google search
    Given user is on the Google homepage
    When User type "The name of the wind" into the search field
    And User click the Google Search button
    Then System redirect to search results page

  Scenario: User search specific content in Google search
    Given user is on the Google homepage
    When User type "The name of the wind" into the search field
    And User click the Google Search button
    Then System redirect to search results page
    And the first result is "The Name of the Wind - Patrick Rothfuss"
    When I click on the first result link
    Then System redirect to the "Patrick Rothfuss - The Books" page

  Scenario: User search empty content in Google search
    Given user is on the Google homepage
    When User type " " into the search field
    And User click the Google Search button
    Then The system stay in Google home page

  Scenario: User search content using the suggestions
    Given user is on the Google homepage
    When User type "The name of the w" into the search field
    And the suggestions list is displayed


  Scenario: User search specific content using the suggestions
    Given user is on the Google homepage
    When User type "The name of the w" into the search field
    And the suggestions list is displayed
    And I click on the first suggestion in the list
    Then System redirect to search results page
    And the first result is "The Name of the Wind - Patrick Rothfuss"
    When I click on the first result link
    Then System redirect to the "Patrick Rothfuss - The Books" page









