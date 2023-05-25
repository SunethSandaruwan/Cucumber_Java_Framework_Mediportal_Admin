Feature: Billing Summary

  Scenario: Verify the UI Interface

#    Given Open the browser and launch the application
#    When Enter a valid email and valid password
#    When Click SignIn
#    And Verify the Home page title
#    And Click on Finance main menu
    And Click on Billing Summary
   # And Verify the Finance Billing Summary Title
    And Verify the Finance medical center search box
    And Verify the Global report Configuration
    And Verify the Finance Export
    And Verify the Data and Time Range
    And Verify the Search practitioner
    And Verify the Filter by Day
    And Verify the Billing Summary Grid Column title
    Then Verify the Total Column
   # Then Driver Quit


    #Verify the Billing summary medical center drop down
    Scenario: Select medical center in billing summary dropdown

      And Verify the Finance Billing Summary Title
     # And Verify the Finance medical center search box
      And Select Billing Summary Medical Center
      And Verify the refresh Data in Billing Summary Table


      #Verify the practitioner Search Box and Selection
    Scenario: Verify the practitioner Search Box

      And Verify the Finance Billing Summary Title
     # And Verify the Finance medical center search box
      And Select Billing Summary Medical Center
      Then Select Billing Summary Practitioner Search Box
      And Enter Valid Practitioner Name 'Ashik Varghese'
      Then Verify the Practitioner vs Details
      When Click on Billing Summary

#      #Verify the billing summary practitioner name vs Yesterday
      Scenario: Verify the billing summary practitioner vs Yesterday
        When Enter a valid email and valid password
        When Click SignIn
        And Click on Billing Summary
        And Verify the Finance Billing Summary Title

        And Select Medical Center in DropDown
        Then Select Billing Summary Practitioner Search Box
        And Enter Valid Practitioner Name 'Ashik Varghese'
        Then Select Yesterday in filter by date Field
        And Verify the Practitioner vs Yesterday Details
        When Click on Billing Summary

     #Verify the billing summary practitioner name vs last 7 Days
      Scenario: Verify the billing summary practitioner name vs last 7 Days
        When Enter a valid email and valid password
        When Click SignIn
        And Click on Billing Summary
        And Verify the Finance Billing Summary Title

        Then Select Billing Summary Practitioner Search Box
        And Enter Valid Practitioner Name 'Ashik Varghese'
        Then Select last Seven Days in filter by date Field
        And Verify the Practitioner vs last Seven Days Details


     #Verify the billing summary practitioner name vs Specified year and month
      Scenario: Verify the billing summary practitioner name vs Specified year and month
        When Enter a valid email and valid password
        When Click SignIn
        And Click on Billing Summary
        And Verify the Finance Billing Summary Title

        Then Select Billing Summary Practitioner Search Box
        And Enter Valid Practitioner Name 'Ashik Varghese'
        Then Select Specified year and month in filter by date Field
        And Verify the Practitioner vs Specified year and month Details



      #Verify the billing summary practitioner Name vs Custom Date Range
      Scenario: Verify the billing summary practitioner Name vs Custom Date Range
        When Enter a valid email and valid password
        When Click SignIn
        And Click on Billing Summary
        And Verify the Finance Billing Summary Title

        Then Select Billing Summary Practitioner Search Box
        And Enter Valid Practitioner Name 'Ashik Varghese'
        Then Select Custom Date Range
        And Verify the Practitioner vs Custom Date Range

        #Verify the Billing summary practitioner Total summary






