Feature: Interface Reminder Configurations

  #BAP-1590 User Interface
  Scenario: BAP-1590 User Interface
    Given Open the browser and launch the application
    Then Wait  some time
    And Enter for login as 'AdminUser3'
    And Enter for password as'Test@123'
    And Click on the signin button
    Then Navigate to the home page

    Given Open the browser and launch the application
    Then Wait  some time
    And Click on Reminders
    And Click on Reminder Configurations
    And Verify the reminder configurations title
    And Click on General tab
    And Verify the Reminder Period sub title
    And Verify the Reminder period drop down '1'
    And Verify Duration Type Drop Down
    And Verify Send second reminder title and Disabled button
    And Verify Specify practitioner title and Disabled button
    And Verify Specify appointment type and Disabled button
    And Verify Update Configurations
    And Driver Close



