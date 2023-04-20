Feature: Billing Summary

  Scenario: Verify the UI Interface
    Then Open the browser and launch the application
    And Wait  some time
    When Enter for login as 'AdminUser'
    And Enter for password as'Test@123'
    And Click on the signin button
    And Driver Close

    Then Open the browser and launch the application
    And Wait  some time
    And Verify the Home page title
    And Click on Finance main menu
    And Verify the Finance Billing Summary Title
    And Verify the Finance medical center search box
    And Verify the Global report Configuration
    And Verify the Finance


