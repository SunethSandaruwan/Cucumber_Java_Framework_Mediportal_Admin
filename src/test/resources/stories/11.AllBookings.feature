Feature: All Bookings

  # TestCase 401: Verify that search option is available
  Scenario: TestCase 401: Verify that search option is available
    Given Open the browser and launch the application
    Then Wait  some time
    And Enter for login as 'sunethNew'
    And Enter for password as'Test@123'
    And Click on the signin button
    Then Navigate to the home page

    Given Open the browser and launch the application
    Then Wait  some time
    And Click on Appointments
    And Click on Bookings
    And Verify the All Bookings page title
    Then Verify that display in keyword and date ranges text field

    #TestCase 7556: Verify the UI of the Booking View with Update Refund info
  Scenario: TestCase 7556: Verify the UI of the Booking View with Update Refund info
    Given Open the browser and launch the application
    Then Wait  some time
    And Enter for login as 'sunethNew'
    And Enter for password as'Test@123'
    And Click on the signin button
    Then Navigate to the home page

    Given Open the browser and launch the application
    Then Wait  some time
    And Click on Appointments
    And Click on Bookings
    And Verify the All Bookings page title
    And Click on A appointment update
    And Verify Update refunds page title
    And Verify All of label in Update Refunds
    And Verify All of Text fields in Update Refunds

