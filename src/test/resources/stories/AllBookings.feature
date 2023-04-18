Feature: All Bookings
#
#  # TestCase 401: Verify that search option is available
#  Scenario: TestCase 401: Verify that search option is available
#    Given Open the browser and launch the application
#    Then Wait  some time
#    And Enter for login as 'AdminUser4'
#    And Enter for password as'Test@123'
#    And Click on the signin button
#    Then Navigate to the home page
#
#    Given Open the browser and launch the application
#    Then Wait  some time
#    And Click on Appointments
#    And Click on Bookings
#    And Verify the All Bookings page title
#    Then Verify that display in keyword and date ranges text field
#
#    #TestCase 7556: Verify the UI of the Booking View with Update Refund info
#  Scenario: TestCase 7556: Verify the UI of the Booking View with Update Refund info
#    Given Open the browser and launch the application
#    Then Wait  some time
#    And Enter for login as 'AdminUser3'
#    And Enter for password as'Test@123'
#    And Click on the signin button
#    Then Navigate to the home page
#
#    Given Open the browser and launch the application
#    Then Wait  some time
#    And Click on Appointments
#    And Click on Bookings
#    And Verify the All Bookings page title
#    And Click on A appointment update
#    And Verify Update refunds page title
#    And Verify All of label in Update Refunds
#    And Verify All of Text fields in Update Refunds
#
    #TestCase 426: Verify that appointment details display correctly
    Scenario Outline: BAP-426 Verify that appointment details display correctly.
      Given Open the browser and launch the application
      And Wait  some time
     # And Enter for login as 'AdminUser'
     # And Enter for password as'Test@123'
      Then User fills the Admin Username from given sheetName "<SheetName>" and rowNumber <RowNumber>
      And User filers the Admin Password form given sheetName "<SheetName>" and rowNumber <RowNumber>
      And Click on the signin button
      Then Navigate to the home page

#      Given Open the browser and launch the application
#      Then Click on Appointments
#      And Click on Bookings
#      And User fills the InstituteName from given sheetName "<SheetName>" and rowNumber <RowNumber>
#      And Click on All Booking page first Booking Appointments Action column view button
#      And Check View Booking Details Appointment details
#      When Click on View Booking Details Close Button

      Examples:
      | SheetName | RowNumber |
      | LoginDetails          |   0       |
      | BookAppointment       |   0       |
#
#
#     #TestCase 425: Verify that patient details display correctly
#  Scenario Outline: TestCase 425:Verify that patient details display correctly
#    Given Open the browser and launch the application
#    And Wait  some time
#    Then User fills the Admin Username from given sheetName "<SheetName>" and rowNumber <RowNumber>
#    And User filers the Admin Password form given sheetName "<SheetName>" and rowNumber <RowNumber>
#    And Click on the signin button
#    Then Navigate to the home page
#
#    Given Open the browser and launch the application
#    Then Click on Appointments
#    And Click on Bookings
#    And User fills the InstituteName from given sheetName "<SheetName>" and rowNumber <RowNumber>
#    And Click on All Booking page first Booking Appointments Action column view button
#    And Check View Booking Details Appointment details
#    And Verify All fields to be available under patient details
#    When Click on View Booking Details Close Button
#
#    Examples:
#      | SheetName | RowNumber |
#      | LoginDetails          |   0       |
#      | BookAppointment       |   0       |
#
#
#
#
#
