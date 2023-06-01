Feature: Recall Manager

  #Test case: BAP-1688: Verify records syncing properly
  Scenario: Test case 1688 Verify records syncing properly
    Given Login to Admin Successfully
    And Click on Follow up care
    And Click on All Recalls
    And Click on Recall Manager
    And Verify the Recall Manager Page Title
    Then Select Dropdown in hospital name

    #Test case: BAP-1032: The validation of the client database data in fetching recall manager screen
   Scenario: Test case 1032 The validation of the client database data in fetching recall manager screen
     Given Login to Admin Successfully
     And Click on Follow up care
     And Click on All Recalls
     And Click on Sync Recalls
     And Validate in Sync

