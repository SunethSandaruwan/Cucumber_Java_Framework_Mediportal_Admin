Feature: Hospital location

  #Testcase DDH-7733: Enter update valid all dates and click on create button
  Scenario: Testcase DDH-7733: Enter update valid all dates and Click on create button
    Given Open the browser and launch the application
    And Wait  some time
    When Enter for login as 'test'
    And Enter for password as'Test@12345'
    And Click on the signin button
    And Wait  some time
    And Click on Configuration
    And Click on Hospitals
    And Click on Hospital Locations
    And Enter valid location name or display name 'Coop HealthCare Kurunegala'
    And Click valid utilization in drop down
    And Enter valid description
    Then Select valid chief
    And Click on update button in hospital location
    And Verify update conformation message


    #Testcase
  Scenario: Testcase DDH-7761: When Click on Delete button in hospital Location
    Given Open the browser and launch the application
    And Wait  some time
    When Enter for login as 'test'
    And Enter for password as'Test@12345'
    And Click on the signin button
    And Verify the homepage title
    And Click on Configuration
    And Wait  some time
    And Click on Institute
    And Click on Institute Locations
    And Verify the Institute Locations page title
    And Enter valid location name or display name 'Coop HealthCare Kurunegala '
    And Select Valid Institute name
    And Click on Institute delete Button
    Then Driver Close





    