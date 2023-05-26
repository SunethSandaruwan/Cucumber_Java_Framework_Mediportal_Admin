Feature: Hospital location

  Scenario: Testcase 7733: Enter update valid all dates and Click on create button
    Given Login to Admin Successfully
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
    Given Login to Admin Successfully
    And Verify the homepage title
    And Click on Configuration
    And Click on Hospital
    And Click on Hospital Locations
    And Verify the Hospital Locations page title
    And Enter valid location name or display name 'Coop HealthCare Kurunegala '
    And Select Valid Hospital name
    And Click on Hospital delete Button





    