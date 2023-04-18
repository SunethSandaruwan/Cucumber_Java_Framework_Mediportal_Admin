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
    And Click on Hospital
    And Click on Hospital Locations
    And Enter valid location name or display name 'Coop HealthCare Kurunegala'
    And Click valid utilization in drop down
    And Enter valid description
    Then Select valid chief
    And Click on update button in hospital location
    And Verify update conformation message


    #Testcase DDH-7761: When Click on Delete button in hospital Location
  Scenario: Testcase DDH-7761: When Click on Delete button in hospital Location
    Given Open the browser and launch the application
    And Wait  some time
    When Enter for login as 'sunethNew'
    And Enter for password as'Test@123'
    And Click on the signin button

    And Open the browser and launch the application
    And Verify the homepage title
    And Click on Configuration
    And Wait  some time
    And Click on Hospital
    And Click on Hospital Locations
    And Verify the Hospital Locations page title
    And Enter valid location name or display name 'Coop HealthCare Kurunegala '
    And Select Valid Hospital name
    And Click on Hospital delete Button
    Then Driver Close

    #Testcase DDH-7691 Enter valid all dates and Click on create button
  Scenario: Enter valid all dates and Click on create button
    Given Open the browser and launch the application
    And Wait  some time
    When Enter for login as 'sunethNew'
    And Enter for password as'Test@123'
    And Click on the signin button

    And Open the browser and launch the application
    And Verify the homepage title
    And Click on Configuration
    And Wait  some time
    And Click on Hospital
    And Click on Hospital Locations
    And Verify the Hospital Locations page title
    And Click on Institute Location Create New Button
    And Click on Create Location and Select Institute 'Automation Hospital One'
    And Enter new Location in Create Location 'Kagalla'
    And Enter new Location code in Create Location '00067'
    And Select the utilization in Dropdown
    And Enter Create Location Description 'Test01'
    And Click on Create Location Save Button
    Then Verify the Display as success message as Institute Location





    