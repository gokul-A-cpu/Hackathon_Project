Feature: TS_004 Details of First Two Courses

  @smoke
  Scenario: TC_FTC_01 Checking the availability of required details of first two courses after the search and filteration
    Given Search for "Web Development Courses"
    And Select the required check box
    Then Click the first course
    And The first course page should be opened

  @regression
  Scenario: TC_FTC_02 Checking whether the course header, rating and learning hours of first course is displayed
    Given Search for "Web Development Courses"
    And Select the required check box
    Then Click the first course
    And The first course header, rating and learning hours should be displayed

  @smoke
  Scenario: TC_FTC_03 Validate the navigation of second course link of the searched courses
    Given Search for "Web Development Courses"
    And Select the required check box
    When Click the second course
    Then The second course page should be opened

  @regression
  Scenario: TC_FTC_04 Checking whether the course header, rating and learning hours of second course is displayed
    Given Search for "Web Development Courses"
    And Select the required check box
    When Click the second course
    And The second course header, rating and learning hours should be displayed
