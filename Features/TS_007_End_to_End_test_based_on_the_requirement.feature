Feature: TS_007 End to End test based on the requirement

  
  Scenario: TC_ETE_01 The respective error message should be displayed
    Given Search for "Web Development Courses"
    Then Click English Language checkbox
    And Click Beginners level checkbox
    Then Click the first course
    And Extract the First course name, total learning hours and rating
    When Click the second course
    And Extract the Second course names, total learning hours and rating
    And Clear Search
    When Enter "Language Learning" data to the search box
    And Click Search sButton
    Then Click seeAll in language tag
    And Extract all the languages with count
    And Close the seeAll
    And Extract Different levels with count
    And Return to Home Page
    And Go to For Enterprise
    And Look for Ready to transform form
    And Fill the form with credentials with invalid email
    And Click Register sbutton
    And Capture the error message and display
