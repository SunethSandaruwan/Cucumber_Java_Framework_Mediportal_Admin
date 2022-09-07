Feature: General Configurations

  Scenario: Testcase 7620: Verify that Business Hour Option (Radio button) are available
    Given Open the browser and launch the application
    And Wait  some time
    When Enter for login as 'suneth'
    And Enter for password as'Test@123'
    And Click on the signin button
    And Click on Configuration
    And Click on Hospital
    And Click on Business Hours
    And Verify the General Configurations
    And Click on the General Configurations Search Hospital Field
    And Select or Enter Hospital Name
    And Select the 24x7 Operations Radio Button
    Then Select the Custom hours Radio Button
