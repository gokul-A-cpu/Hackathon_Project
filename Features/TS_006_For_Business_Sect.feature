Feature: TS_006 Checking the operation and availability of form to be filled

  @smoke
  Scenario Outline: TC_FBS_01 Check the availability of For Businesses section
    Given Enter "<row_index1>" data in the search text box
    When Enter "<row_index2>" into the search box
    Then The For Businesses Section should be present

    Examples: 
      | row_index1 | row_index2 |
      |          7 |          8 |

  @regression
  Scenario Outline: TC_FBS_02 Validate the working of For Businesses Section hyperlink
    Given Enter "<row_index1>" data in the search text box
    When Enter "<row_index2>" into the search box
    And Click the hyperlink of for business
    Then Navigates to the business page

    Examples: 
      | row_index1 | row_index2 |
      |          7 |          8 |

  @regression
  Scenario Outline: TC_FBS_03 Check Whether the form to be filled is displayed or not
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    Then The required form should be present

    Examples: 
      | row_index1 | row_index2 |
      |          7 |          8 |

  @regression
  Scenario Outline: TC_FBS_04 Check the availability and working of First Name input field by valid input
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Submit the form
    Then The field should be present and accept the "<row_index3>" input value

    Examples: 
      | row_index1 | row_index2 | row_index3 |
      |          7 |          8 |          9 |

  @regression
  Scenario Outline: TC_FBS_05 Check the availability and working of First Name input field by not filling
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Submit the form
    Then The respective "<row_index3>" error message should be displayed

    Examples: 
      | row_index1 | row_index2 | row_index3 |
      |          7 |          8 |         10 |

  @regression
  Scenario Outline: TC_FBS_06 Check the availability and working of Last  Name input field
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Submit the form
    Then The last name field should be present and accept the "<row_index4>" input value

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 |
      |          7 |          8 |          9 |         11 |

  @regression
  Scenario Outline: TC_FBS_07 Check the availability and working of Last Name input field by not filling
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Submit the form
    Then The respective "<row_index4>" error message of last name should be displayed

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 |
      |          7 |          8 |          9 |         10 |

  @regression
  Scenario Outline: TC_FBS_08 Check the availability and working of Email Address input field
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Fill the Email Address field of the form by "<row_index5>"
    And Submit the form
    Then The email field should be present and accept the "<row_index5>" input value

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 |
      |          7 |          8 |          9 |         11 |         12 |

  @regression
  Scenario Outline: TC_FBS_09 Check the availability and working of Email Address input field by not filling
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Submit the form
    Then The respective "<row_index5>" error message of email should be displayed

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 |
      |          7 |          8 |          9 |         11 |         13 |

  @regression
  Scenario Outline: TC_FBS_10 Check the availability and working of Phone Number input field
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Fill the Email Address field of the form by "<row_index5>"
    And Fill the Phone Number field of the form by "<row_index6>"
    And Submit the form
    Then The phone field should be present and accept the "<row_index6>" input value

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 |
      |          7 |          8 |          9 |         11 |         12 |         14 |

  @regression
  Scenario Outline: TC_FBS_11 Check the availability and working of Phone Number input field by not filling
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Fill the Email Address field of the form by "<row_index5>"
    And Submit the form
    Then The respective "<row_index6>" error message of phoneno should be displayed

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 |
      |          7 |          8 |          9 |         11 |         12 |         15 |

  #	Scenario Outline: TC_FBS_12 Check the availability and working of Company Name input field
  #		Given Enter "<row_index1>" data in the search text box
  #And Enter "<row_index2>" into the search box
  #When Navigate to the For Business Section
  #And Fill the First name field of the form by "<row_index3>"
  #And Fill the Last Name field of the form by "<row_index4>"
  #And Fill the Email Address field of the form by "<row_index5>"
  #And Fill the Phone Number field of the form by "<row_index6>"
  #And Fill the Company Name field of the form by "<row_index7>"
  #And Submit the form
  #Then The company field should be present and accept the "<row_index7>" input value
  #
  #Examples:
  #			| row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 | row_index7 |
  #|    7	     |     8      |     9      |    11      |     12     |      14    |      16    |
  #	Scenario Outline: TC_FBS_13 Check the availability and working of Company Name input field by not filling
  #		Given Enter "<row_index1>" data in the search text box
  #And Enter "<row_index2>" into the search box
  #When Navigate to the For Business Section
  #And Fill the First name field of the form by "<row_index3>"
  #And Fill the Last Name field of the form by "<row_index4>"
  #And Fill the Email Address field of the form by "<row_index5>"
  #And Fill the Phone Number field of the form by "<row_index6>"
  #And Submit the form
  #Then The respective "<row_index7>" error message of companyName should be displayed
  #
  #Examples:
  #| row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 | row_index7 |
  #|    7	     |     8      |     9      |    11      |     12     |      14    |     10     |
  #
  #	Scenario Outline: TC_FBS_14 Check the availability and working of Company Size input field
  #		Given Enter "<row_index1>" data in the search text box
  #And Enter "<row_index2>" into the search box
  #When Navigate to the For Business Section
  #And Fill the First name field of the form by "<row_index3>"
  #And Fill the Last Name field of the form by "<row_index4>"
  #And Fill the Email Address field of the form by "<row_index5>"
  #And Fill the Phone Number field of the form by "<row_index6>"
  #And Fill the Company Name field of the form by "<row_index7>"
  #And Fill the Company Size field of the form by "<row_index8>"
  #And Submit the form
  #Then The company size field should be present and accept the "<row_index8>" input value
  #
  #Examples:
  #			| row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 | row_index7 | row_index8 |
  #|    7	     |     8      |     9      |    11      |     12     |      14    |      16    |            |
  #
  #	Scenario Outline: TC_FBS_15 Check the availability and working of Company Size input field by not filling
  #		Given Enter "<row_index>" data in the search text box
  #And Enter "<row_index>" into the search box
  #When Navigate to the For Business Section
  #And Fill the First name field of the form by "<row_index>"
  #And Fill the Last Name field of the form by "<row_index>"
  #And Fill the Email Address field of the form by "<row_index>"
  #And Fill the Phone Number field of the form by "<row_index>"
  #And Fill the Company Name field of the form by "<row_index>"
  #	  And Submit the form
  #Then The respective error message should be displayed
  #
  #Examples:
  #			| row_index |
  #| 1	        |
  @regression
  Scenario Outline: TC_FBS_16 Check the availability and working of Job Title input field
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Fill the Email Address field of the form by "<row_index5>"
    And Fill the Phone Number field of the form by "<row_index6>"
    #And Fill the Company Name field of the form by "<row_index7>"
    #And Fill the Company Size field of the form by "<row_index8>"
    And Fill the Job Title field of the form by "<row_index9>"
    And Submit the form
    Then The job title field should be present and accept the "<row_index9>" input value

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 | row_index7 | row_index8 | row_index9 |
      |          7 |          8 |          9 |         11 |         12 |         14 |         16 |         17 |         18 |

  @regression
  Scenario Outline: TC_FBS_17 Check the availability and working of Job Title input field by not filling
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Fill the Email Address field of the form by "<row_index5>"
    And Fill the Phone Number field of the form by "<row_index6>"
    #And Fill the Company Name field of the form by "<row_index7>"
    #And Fill the Company Size field of the form by "<row_index8>"
    And Submit the form
    Then The respective "<row_index7>" error message of jobTitle should be displayed

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 | row_index7 |
      |          7 |          8 |          9 |         11 |         12 |         14 |         10 |

  @regression
  Scenario Outline: TC_FBS_18 Check the availability and working of No of Learners input field
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Fill the Email Address field of the form by "<row_index5>"
    And Fill the Phone Number field of the form by "<row_index6>"
    #And Fill the Company Name field of the form by "<row_index7>"
    #And Fill the Company Size field of the form by "<row_index8>"
    And Fill the Job Title field of the form by "<row_index9>"
    And Fill the No of Learners field of the form by "<row_index10>"
    And Submit the form
    Then The NoOf Learners field should be present and accept the "<row_index10>" input value

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 | row_index7 | row_index8 | row_index9 | row_index10 |
      |          7 |          8 |          9 |         11 |         12 |         14 |         16 |         17 |         18 | 1-4         |

  @regression
  Scenario Outline: TC_FBS_19 Check the availability and working of No of Learners input field by not filling
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Fill the Email Address field of the form by "<row_index5>"
    And Fill the Phone Number field of the form by "<row_index6>"
    #And Fill the Company Name field of the form by "<row_index7>"
    #And Fill the Company Size field of the form by "<row_index8>"
    And Fill the Job Title field of the form by "<row_index9>"
    And Submit the form
    Then The respective "<row_index10>" error message of No of Learners should be displayed

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 | row_index7 | row_index8 | row_index9 | row_index10 |
      |          7 |          8 |          9 |         11 |         12 |         14 |         16 |         17 |         18 |          10 |

  @regression
  Scenario Outline: TC_FBS_20 Validate the operationality of checkbox
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Fill the Email Address field of the form by "<row_index5>"
    And Fill the Phone Number field of the form by "<row_index6>"
    #And Fill the Company Name field of the form by "<row_index7>"
    #And Fill the Company Size field of the form by "<row_index8>"
    And Fill the Job Title field of the form by "<row_index9>"
    And Fill the No of Learners field of the form by "<row_index10>"
    And Fill the checkbox field of the form
    And Submit the form
    Then The field should be selected

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 | row_index7 | row_index8 | row_index9 | row_index10 |
      |          7 |          8 |          9 |         11 |         12 |         14 |         16 |         17 |         18 | 1-4         |

  @regression
  Scenario Outline: TC_FBS_21 Check the availability and working of Country input field
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Fill the Email Address field of the form by "<row_index5>"
    And Fill the Phone Number field of the form by "<row_index6>"
    #And Fill the Company Name field of the form by "<row_index7>"
    #And Fill the Company Size field of the form by "<row_index8>"
    And Fill the Job Title field of the form by "<row_index9>"
    And Fill the No of Learners field of the form by "<row_index10>"
    And Fill the checkbox field of the form
    And Fill the Country field of the form by "<row_index11>"
    And Submit the form
    Then The country field should be present and accept the "<row_index11>" input value

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 | row_index7 | row_index8 | row_index9 | row_index10 | row_index11 |
      |          7 |          8 |          9 |         11 |         12 |         14 |         16 |         17 |         18 | 1-4         |          20 |

  @regression
  Scenario Outline: TC_FBS_22 Check the availability and working of Country input field by not filling
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Fill the Email Address field of the form by "<row_index5>"
    And Fill the Phone Number field of the form by "<row_index6>"
    #And Fill the Company Name field of the form by "<row_index7>"
    #And Fill the Company Size field of the form by "<row_index8>"
    And Fill the Job Title field of the form by "<row_index9>"
    And Fill the No of Learners field of the form by "<row_index10>"
    And Fill the checkbox field of the form
    And Submit the form
    Then The respective "<row_index11>" error message of country should be displayed

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 | row_index7 | row_index8 | row_index9 | row_index10 | row_index11 |
      |          7 |          8 |          9 |         11 |         12 |         14 |         16 |         17 |         18 | 1-4         |          10 |

  @regression
  Scenario Outline: TC_FBS_23 Check the availability and working of State input field
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Fill the Email Address field of the form by "<row_index5>"
    And Fill the Phone Number field of the form by "<row_index6>"
    #And Fill the Company Name field of the form by "<row_index7>"
    #And Fill the Company Size field of the form by "<row_index8>"
    And Fill the Job Title field of the form by "<row_index9>"
    And Fill the No of Learners field of the form by "<row_index10>"
    And Fill the checkbox field of the form
    And Fill the Country field of the form by "<row_index11>"
    And Fill the State field of the form by "<row_index12>"
    And Submit the form
    Then The state field should be present and accept the "<row_index12>" input value

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 | row_index7 | row_index8 | row_index9 | row_index10 | row_index11 | row_index12 |
      |          7 |          8 |          9 |         11 |         12 |         14 |         16 |         17 |         18 | 1-4         |          20 |          22 |

  @regression
  Scenario Outline: TC_FBS_24 Check the availability and working of State input field by not filling
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Fill the Email Address field of the form by "<row_index5>"
    And Fill the Phone Number field of the form by "<row_index6>"
    #And Fill the Company Name field of the form by "<row_index7>"
    #And Fill the Company Size field of the form by "<row_index8>"
    And Fill the Job Title field of the form by "<row_index9>"
    And Fill the No of Learners field of the form by "<row_index10>"
    And Fill the checkbox field of the form
    And Fill the Country field of the form by "<row_index11>"
    And Fill the State field of the form by "<row_index12>"
    And Submit the form
    Then The respective "<row_index13>" error message of state should be displayed

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 | row_index7 | row_index8 | row_index9 | row_index10 | row_index11 | row_index12 | row_index13 |
      |          7 |          8 |          9 |         11 |         12 |         14 |         16 |         17 |         18 | 1-4         |          20 |          22 |          10 |

  @regression
  Scenario Outline: TC_FBS_25 Check the availability and working of Need dropdown field
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Fill the Email Address field of the form by "<row_index5>"
    And Fill the Phone Number field of the form by "<row_index6>"
    #And Fill the Company Name field of the form by "<row_index7>"
    #And Fill the Company Size field of the form by "<row_index8>"
    And Fill the Job Title field of the form by "<row_index9>"
    And Fill the No of Learners field of the form by "<row_index10>"
    And Fill the checkbox field of the form
    And Fill the Country field of the form by "<row_index11>"
    And Fill the State field of the form by "<row_index12>"
    And Fill the Need dropdown and agreement checkbox fields of the form by "<row_index13>"
    And Submit the form
    Then The need dropdown field should be present and accept the "<row_index13>" input value

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 | row_index7 | row_index8 | row_index9 | row_index10 | row_index11 | row_index12 | row_index13 |
      |          7 |          8 |          9 |         11 |         12 |         14 |         16 |         17 |         18 | 1-4         |          20 |          22 |          23 |

  @regression
  Scenario Outline: TC_FBS_26 Check the availability and working of Need dropdown field by not filling
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Fill the Email Address field of the form by "<row_index5>"
    And Fill the Phone Number field of the form by "<row_index6>"
    #And Fill the Company Name field of the form by "<row_index7>"
    #And Fill the Company Size field of the form by "<row_index8>"
    And Fill the Job Title field of the form by "<row_index9>"
    And Fill the No of Learners field of the form by "<row_index10>"
    And Fill the checkbox field of the form
    And Fill the Country field of the form by "<row_index11>"
    And Fill the State field of the form by "<row_index12>"
    And Submit the form
    Then The respective "<row_index13>" error message of need dropdown should be displayed

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 | row_index7 | row_index8 | row_index9 | row_index10 | row_index11 | row_index12 | row_index13 |
      |          7 |          8 |          9 |         11 |         12 |         14 |         16 |         17 |         18 | 1-4         |          20 |          22 |          10 |

  @regression
  Scenario Outline: TC_FBS_27 Validate the working of submit button of the form after filled all details
    Given Enter "<row_index1>" data in the search text box
    And Enter "<row_index2>" into the search box
    When Navigate to the For Business Section
    And Fill the First name field of the form by "<row_index3>"
    And Fill the Last Name field of the form by "<row_index4>"
    And Fill the Email Address field of the form by "<row_index5>"
    And Fill the Phone Number field of the form by "<row_index6>"
    #And Fill the Company Name field of the form by "<row_index7>"
    #And Fill the Company Size field of the form by "<row_index8>"
    And Fill the Job Title field of the form by "<row_index9>"
    And Fill the No of Learners field of the form by "<row_index10>"
    And Fill the checkbox field of the form
    And Fill the Country field of the form by "<row_index11>"
    And Fill the State field of the form by "<row_index12>"
    And Fill the Need dropdown and agreement checkbox fields of the form by "<row_index13>"
    And Submit the form
    Then Redirects to a new page and "<row_index14>" success message is displayed

    Examples: 
      | row_index1 | row_index2 | row_index3 | row_index4 | row_index5 | row_index6 | row_index7 | row_index8 | row_index9 | row_index10 | row_index11 | row_index12 | row_index13 | row_index14 |
      |          7 |          8 |          9 |         11 |         12 |         14 |         16 |         17 |         18 | 1-4         |          20 |          22 |          23 |          24 |
