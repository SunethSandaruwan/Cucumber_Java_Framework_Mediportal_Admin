Feature: Billing Summary

  Scenario: Verify the UI Interface
    Then Open the browser and launch the application
    And Wait  some time
    When Enter for login as 'AdminUser'
    And Enter for password as'Test@123'
    And Click on the signin button
   #And Driver Close

    Then Open the browser and launch the application
    And Wait  some time
    And Verify the Home page title
    And Click on Finance main menu
    And Click on Billing Summary
    And Verify the Finance Billing Summary Title
   # And Verify the Finance medical center search box
    And Verify the Global report Configuration
    And Verify the Finance Export
    And Verify the Data and Time Range
    And Verify the Search practitioner
    And Verify the Filter by Day
    And Verify the Billing Summary Grid Column title
    Then Verify the Total Column
    And Driver Close


    #Verify the Billing summary medical center drop down
#    Scenario: Select medical center in billing summary dropdown
#      And Open the browser and launch the application
#      And Wait  some time
#      When Enter for login as 'AdminUser'
#      And Enter for password as'Test@123'
#      And Click on the signin button
#
#      Then Open the browser and launch the application
#      And Wait  some time
#      And Verify the Home page title
#      And Click on Finance main menu
#      And Click on Billing Summary
#      And Verify the Finance Billing Summary Title
#      And Verify the Medical Center Dropdown
#      And Select Billing Summary Medical Center
#      And Verify the refresh Data in Billing Summary Table
#      Then Driver Close

      #Verify the practitioner Search Box
#    Scenario: Verify the practitioner Search Box
#      And Open the browser and launch the application
#      And Wait  some time
#      When Enter for login as 'AdminUser'
#      And Enter for password as'Test@123'
#      And Click on the signin button
#
#      Then Open the browser and launch the application
#      And Wait  some time
#      And Verify the Home page title
#      And Click on Finance main menu
#      And Click on Billing Summary
#      And Verify the Finance Billing Summary Title

      #Verify the Filter by date
    Scenario: Verify the Filter by date
      And Open the browser and launch the application
      And Wait  some time
      When Enter for login as 'AdminUser'
      And Enter for password as'Test@123'
      And Click on the signin button








