Feature: Google Homepage Search
  I as User
  want enter information in homepage
  For seach information

  Scenario: User search content in Google search
    Given user is on the Google homepage
    When User type "The name of the wind" into the search field
    And User click the Google Search button
    Then System redirect to to  search results page

  Scenario: User search specific content in Google search
    Given user is on the Google homepage
    When User type "The name of the wind" into the search field
    And User click the Google Search button
    Then System redirect to to  search results page
    And the first result is "El nombre del viento - Wikipedia, la enciclopedia libre"



