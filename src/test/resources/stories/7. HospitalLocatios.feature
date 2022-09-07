Feature: Hospital location

  Scenario: Testcase 7733: Enter update valid all dates and Click on create button
    Given Open the browser and launch the application
    And Wait  some time
    When Enter for login as 'suneth'
    And Enter for password as'Test@123'
    And Click on the signin button
    And Click on Configuration
    And Click on Hospital
    And Click on Hospital Locations
    And Enter valid location name or display name 'Coop HealthCare Kurunegala '
    And Click valid utilization in drop down
    And Enter valid description
    Then Select valid chief
    And Click on update button in hospital location
    And Verify update conformation message

  Scenario: Testcase DDH-7761: When Click on Delete button in hospital Location
    Given Open the browser and launch the application
    And Wait  some time
    When Enter for login as 'test'
    And Enter for password as'Test@1234'
    And Click on the signin button
    And Verify the homepage title
    And Click on Configuration
    And Click on Hospital
    And Click on Hospital Locations
    And Verify the Hospital Locations page title
    And Enter valid location name or display name 'Coop HealthCare Kurunegala '
    And Select Valid Hospital name
    And Click on Hospital delete Button
    Then Driver Close





    