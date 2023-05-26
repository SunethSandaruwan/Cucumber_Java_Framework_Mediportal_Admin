Feature: Finance Dashboard

## Test Case 01: Finance Dashboard in Select medical Center

  Scenario: Finance Dashboard in Select medical Center

    Given Login to Admin Successfully
    And Select Medical Center in DropDown
    And Click on Medical Center
   # And Page Scroll Down
  #  And Driver Quit


  #Verify the Finance Dashboard Download Button
  Scenario: Verify the Finance Dashboard Download button

    Given Login to Admin Successfully
#    And Select Medical Center in DropDown
#    And Click on Medical Center
    And Verify the Financial Year Title
    And Select Medical Center in DropDown
    And Click on Finance Dashboard Download button


       #Verify the Finance Dashboard Sync Button
    Scenario: Verify the Finance Dashboard Sync button
      Given Login to Admin Successfully
#      And Select Medical Center in DropDown
#      And Click on Medical Center
      And Click on Sync Button


## Test Case 02: Verify the select medical center finance dashboard in today yesterday last week last month details

  Scenario: Verify the select medical center
    #finance dashboard in today yesterday last week last month details
    #Given Open the browser and launch the application
   # When Enter a valid email and valid password
   # When Click SignIn
   # And Verify the Home page title
   # And Click on Finance main menu
   # And Click on Finance Dashboard
    Given Login to Admin Successfully
#    And Select Medical Center in DropDown
#    And Click on Medical Center
    Then Verify the select medical center finance dashboard today details
    And Verify the select medical center finance dashboard yesterday details
    And Verify the select last week medical center finance dashboard last week details
    And Verify the select last month medical center finance dashboard last month details
 #   And Driver Quit


  #Verify the Highest Billed Details

  Scenario: Verify the Highest Billed Details

#    Given Open the browser and launch the application
#    And Wait  some time
#    When Enter for login as 'AdminUser'
#    And Enter for password as'Test@123'
    # Then User filers the Admin Password form given sheetName "<SheetName>" and rowNumber <RowNumber>
    # And User filers the Admin Password form given sheetName "<SheetName>" and rowNumber <RowNumber>
#    And Click on the signin button
#    Then Navigate to the home page

#    Given Open the browser and launch the application
#    And Wait  some time
#    Then Verify the Home page title
#    And Click on Finance main menu
#    And Click on Finance Dashboard
      Given Login to Admin Successfully
#      And Select Medical Center in DropDown
#      And Click on Medical Center
      And Page Scroll Down
      And Verify the Highest Billed Today Details
      And Verify the Highest Billed Yesterday Details
      And Verify the Highest Billed Current month Details
      And Verify the Highest Billed prev month details
      And Check on Weekly Chart button
      And Check on Monthly Chart button
      And Check on Yearly Chart button
      And Check on Previous Year (Monthly)
      And Check on Previous Year (Weekly)
      Then Verify the Billed Trend Chart Title
      Then Check on Total Billed Title


    #Verify the Financial Year Details
    Scenario: Verify the Financial Year Details

      Given Login to Admin Successfully
#      And Select Medical Center in DropDown
#      And Click on Medical Center
      And Verify the Total Appointments details
      And Verify the Total Billed details
      And Verify the Group Average details
      And Verify the Total Medical Centre fees
















