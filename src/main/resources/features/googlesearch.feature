Feature: Google Homepage Search
  As a User
  I want enter information in homepage
  So that search information

  Scenario: User search content in Google search
    Given user is on the Google homepage
    When User type "The name of the wind" into the search field
    And User click the Google Search button
    Then System redirect to search results page

  Scenario Outline: User search specific content in Google search
    Given user is on the Google homepage
    When User type "<textToSheard>" into the search field
    And User click the Google Search button
    Then System redirect to search results page
    And the first result is "<expectedResult>"
    When I click on the first result link
    Then System redirect to the "<redirectedPage>" page
    Examples:
      | textToSheard         | expectedResult                                          | redirectedPage                                          |
      | The name of the wind | The Name of the Wind - Patrick Rothfuss                 | Patrick Rothfuss - The Books                            |
      | The name of the wind | El nombre del viento - Wikipedia, la enciclopedia libre | El nombre del viento - Wikipedia, la enciclopedia libre |

  Scenario: User search empty content in Google search
    Given user is on the Google homepage
    When User type " " into the search field
    And User click the Google Search button
    Then The system stay in Google home page

  Scenario: User search content using the suggestions
    Given user is on the Google homepage
    When User type "The name of the w" into the search field
    And the suggestions list is displayed


  Scenario Outline: User search specific content using the suggestions
    Given user is on the Google homepage
    When User type "<textToSheard>" into the search field
    And the suggestions list is displayed
    And I click on the first suggestion in the list
    Then System redirect to search results page
    And the first result is "<expectedResult>"
    When I click on the first result link
    Then System redirect to the "<redirectedPage>" page
    Examples:
    Examples:
      | textToSheard         | expectedResult                                          | redirectedPage                                          |
      | The name of the wind | The Name of the Wind - Patrick Rothfuss                 | Patrick Rothfuss - The Books                            |
      | The name of the wind | El nombre del viento - Wikipedia, la enciclopedia libre | El nombre del viento - Wikipedia, la enciclopedia libre |










