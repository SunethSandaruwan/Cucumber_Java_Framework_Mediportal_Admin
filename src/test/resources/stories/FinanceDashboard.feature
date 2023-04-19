Feature: Finance

  #Select Medical center in drop down
  Scenario Outline: Finance Dashboard in Select medical Center

    Given Open the browser and launch the application
      And Wait  some time
      When Enter for login as 'AdminUser'
      And Enter for password as'Test@123'
     # Then User filers the Admin Password form given sheetName "<SheetName>" and rowNumber <RowNumber>
     # And User filers the Admin Password form given sheetName "<SheetName>" and rowNumber <RowNumber>
      And Click on the signin button
      Then Navigate to the home page

    Given Open the browser and launch the application
      And Wait  some time
      And Verify the Home page title
      And Click on Finance main menu
      And Click on Finance Dashboard
      And Verify on Finance Dashboard
      And Select Medical Center in DropDown


    Examples:
      | SheetName | RowNumber |
      | LoginDetails          |   0       |

    #Verify the Today finance Dashboard elements
    #Verify the Yesterday finance Dashboard elements
    #Verify the last week finance Dashboard elements
    #Verify the Last month finance Dashboard elements

  Scenario Outline: Verify the select medical center finance dashboard in today / yesterday / last week / last month details

    Given Open the browser and launch the application
    And Wait  some time
    When Enter for login as 'AdminUser'
    And Enter for password as'Test@123'
    #Then User filers the Admin Password form given sheetName "<SheetName>" and rowNumber <RowNumber>
    #And User filers the Admin Password form given sheetName "<SheetName>" and rowNumber <RowNumber>
    And Click on the signin button
    Then Navigate to the home page

    Given Open the browser and launch the application
    And Wait  some time
    And Verify the Home page title
    And Click on Finance main menu
    And Click on Finance Dashboard
    Then Verify the select medical center finance dashboard today details
    And Verify the select medical center finance dashboard yesterday details
    And Verify the select last week medical center finance dashboard last week details
    And Verify the select last month medical center finance dashboard last month details


    Examples:
      | SheetName | RowNumber |
      | LoginDetails          |   0       |
      | BookAppointment       |   0       |

    #Highest Billed Details - Today details
    #Highest Billed Details - Yesterday details
    #Highest Billed Details - Current months details
    #Highest Billed Details - prev Month details

  Scenario Outline: Verify the Highest Billed Details

      Given Open the browser and launch the application
      And Wait  some time
      When Enter for login as 'AdminUser'
      And Enter for password as'Test@123'
     # Then User filers the Admin Password form given sheetName "<SheetName>" and rowNumber <RowNumber>
     # And User filers the Admin Password form given sheetName "<SheetName>" and rowNumber <RowNumber>
      And Click on the signin button
      Then Navigate to the home page

      Given Open the browser and launch the application
      And Wait  some time
      Then Verify the Home page title
      And Click on Finance main menu
      And Click on Finance Dashboard
     # And Verify the Highest Billed Details Title in given sheetName "<SheetName>" and rowNumber <RowNumber>
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
      When Driver Close



      Examples:
        | SheetName | RowNumber |
        | LoginDetails          |   0       |
        | BookAppointment       |   0       |

      Scenario Outline: Verify the Financial Year Details

        Given Open the browser and launch the application
        And Wait  some time
        Then User filers the Admin Password form given sheetName "<SheetName>" and rowNumber <RowNumber>
        And User filers the Admin Password form given sheetName "<SheetName>" and rowNumber <RowNumber>
        And Click on the signin button
        Then Navigate to the home page

        Given Open the browser and launch the application
        And Wait  some time
        Then Verify the Home page title
        And Click on Finance main menu
        And Click on Finance Dashboard
        And Verify the Financial Year Title
        And Verify the Total Appointments details
        And Verify the Total Billed details
        And Verify the Group Average details
        And Verify the Total Medical Centre fees


        Examples:
          | SheetName | RowNumber |
          | LoginDetails          |   0       |
          | BookAppointment       |   0       |

        Scenario: Verify the Finance Dashboard Sync button

          Given Open the browser and launch the application
          And Wait  some time
          And