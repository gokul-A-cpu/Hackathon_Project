Feature: TS_003 Validate the working of language and level filters for web development courses

	@smoke
  Scenario: TC_LL_01 Checking whether the language and level check box is displayed.
    Given the URL navigates to the homePage
    And search for "<row_index1>"
    Then Validate whether language checkBox is displayed
    And Validate whether level checkBox is displayed
    
    Examples:
    		| row_index1 |
        |    7	     |
        
	@regression
  Scenario: TC_LL_02 Checking whether the language and level check box is Clickable.
    Given the URL navigates to the homePage
    And search for "<row_index1>"
    Then Validate whether language checkBox is Clickable
    And Validate whether level checkBox is Clickable
    
    Examples:
    		| row_index1 |
        |    7	     |
        
	@regression
  Scenario: TC_LL_03 Validation by selecting the required check box and whether it displays the results of it.
    Given the URL navigates to the homePage
    And search for "<row_index1>"
    When selecting the Language checkBox
    And respective results of language is shown
    Then selecting the Level checkBox 
    Then respective results of Level is shown
    
    Examples:
    		| row_index1 |
        |    7	     |
