Feature: General Configurations

  Scenario: Testcase 7620: Verify that Business Hour Option (Radio button) are available
    Given Login to Admin Successfully
    And Click on Configuration
    And Click on Hospital
    And Click on Business Hours
    And Verify the General Configurations
    And Click on the General Configurations Search Hospital Field
    And Select or Enter Hospital Name
    And Select the 24x7 Operations Radio Button
    Then Select the Custom hours Radio Button
