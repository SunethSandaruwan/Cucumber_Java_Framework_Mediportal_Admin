Feature: Add Schedule

  #DDH-6057 Add Doctor schedule User Interface
  Scenario: DDH-6057 Add Doctor schedule User Interface
    Given Open the browser and launch the application
    Then Wait  some time
    And Enter for login as 'AdminUser'
    And Enter for password as'Test@123'
    And Click on the signin button
    Then Navigate to the home page

    And Open the browser and launch the application
    Then Wait  some time
    And Click on Appointments
    And Click on Schedule
    And Verify Doctor Schedule
    And Select Institute in Search bar
    And Click on Add schedule
    And Verify Institute search bar
