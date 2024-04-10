Feature: TS_005 Language Learning Search with Filters

  @smoke
  Scenario: TC_LLS_01 Validation of required valid data into search text box.
    Given Search for "Web Development Courses"
    And Clear Search
    When Enter "Language Learning" data to the search box
    And Click Search sButton
    Then Getting the courses based on the search

  @regression
  Scenario: TC_LLS_02 Validation of required invalid data into search text box.
    Given Search for "Web Development Courses"
    And Clear Search
    When Enter "Language Learning" data to the search box
    And Click Search sButton
    Then Invalid search error message

  @regression
  Scenario: TC_LLS_03 Check whether the language and level section is present or not
    Given Search for "Web Development Courses"
    And Clear Search
    When Enter "Language Learning" data to the search box
    And Click Search sButton
    Then The Language and Level filters section should be present

  @regression
  Scenario: TC_LLS_04 Check the availability and operationality of Show more hyperlink inside language filter
    Given Search for "Web Development Courses"
    And Clear Search
    When Enter "Language Learning" data to the search box
    And Click Search sButton
    Then The seeAll hyperlink should be present under language filter section
