Feature: Recall Reminders

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


    #Verify the Recall Reminders User Interface
  Scenario: Verify the Recall Reminders User Interface
    Given Login to Admin Successfully
    Then Click on All Reminders
    And Click on Recall Reminders
    Then Verify the Recall Reminders Page title 'Recall Reminders'
    And Click on Recall Reminders Medical Center
    And Select the Medical Center in Search box
    And Click on Recall Reminders Sync Recalls
    Then Verify the Practitioner Name Search box
    And Verify the Last sync Date and time
    And Click on Recall Reminders Patient Name Search box
    And Click on Recall Reminders Date Range
    And Click on Recall Reminders Sort By
    Then Verify the Recall Reminders Table All column Title
    And Verify the Recall Reminders Table SMS  column Title
    And Verify the Recall Reminders Table Failed SMS column Title
    And Verify the Recall Reminders Table Letters column Title
    And Verify the Recall Reminders Table Calls column Title
    Then Verify the Recall Reminders Navigation Control in Left Side
    And Verify the Recall Reminders Navigation Control in Right Side
    And Verify the Recall Reminders Navigation Control in First Page
    And Verify the Recall Reminders Navigation Control in Last Page
    Then Verify the Recall Reminders Items Per page Row Selection

    #Select the Medical Center in Recall Reminders Page
  Scenario: Verify the Select Medical Center in Recall Reminders
    Given Login to Admin Successfully
    Then Click on All Reminders
    And Click on Recall Reminders
    Then Verify the Recall Reminders Page title
    And Click on Recall Reminders Medical Center
    And Select the Medical Center in Search box

    #Verify the Recall Reminders Sync Recalls button
  Scenario: Click on Recall Reminders Sync Recalls Button
    Given Login to Admin Successfully
    Then Click on All Reminders
    And Click on Recall Reminders
    Then Verify the Recall Reminders Page title
    And Click on Recall Reminders Medical Center
    And Select the Medical Center in Search box
    Then Click on Recall Reminders Sync Recalls Button

    #Verify the Select medical Center and Enter Practitioner Name
  Scenario: Click on Select Medical Center and Enter Practitioner name
    Given Login to Admin Successfully
    Then Click on All Reminders
    And Click on Recall Reminders
    Then Verify the Recall Reminders Page title
    And Select the Medical Center in Search box
    Then Enter Recall Reminder Practitioner Name

    #Select Medical Center and Patient Name in Recall Reminders
  Scenario: Select Medical Center and Patient Name
    Given Login to Admin Successfully
    Then Click on All Reminders
    And Click on Recall Reminders
    Then Verify the Recall Reminders Page title
    And Select the Medical Center in Search box
    Then Enter Patient Name in Recall Reminders

    #Select Medical center and Patient Name vs Select Custom Date range
  Scenario: Select Medical Center and Patient Name, Select Custom Date range
    Given Login to Admin Successfully
    Then Click on All Reminders
    And Click on Recall Reminders
    Then Verify the Recall Reminders Page title
    And Select the Medical Center in Search box
    Then Enter Patient Name in Recall Reminders
    And Select Custom Date Range in Recall Reminders

    #Select the Status in Drop down
  Scenario: Select the Status in Recall Reminders
    Given Login to Admin Successfully
    Then Click on All Reminders
    And Click on Recall Reminders
    Then Verify the Recall Reminders Page title
    And Select the Medical Center in Search box
    And Click on Status in Recall Reminders
    And Select Recall Reminders Status name in Drop down

    #Select the Sort By in Recall Reminders
  Scenario: Select the Sort by in Recall Reminders
    Given Login to Admin Successfully
    Then Click on All Reminders
    And Click on Recall Reminders
    Then Verify the Recall Reminders Page title
    And Select the Medical Center in Search box
    And Click on Sort by drop down in Recall Reminders

    #Select the Medical Center in patient Name , Custom Date rage , Status
  Scenario: Select the Medical Center , Patient Name , Custom Date Range , Status
    Given Login to Admin Successfully
    Then Click on All Reminders
    And Click on Recall Reminders
    Then Verify the Recall Reminders Page title
    And Select the Medical Center in Search box
    And Enter Patient Name in Recall Reminders
    And Select Custom Date Range in Recall Reminders
    And Click on Sort by drop down in Recall Reminders

    #Click On Recall Reminders Export Button
  Scenario: Click on Recall Reminders Export Button
    Given Login to Admin Successfully
    Then Click on All Reminders
    And Click on Recall Reminders
    Then Verify the Recall Reminders Page title
    And Select the Medical Center in Search box
    Then Click on Recall Reminders Export Button
    And Verity the Success Message in Recall Reminders




