Feature: MediPortal Admin Login

## Test Case 01: Compose Login through CAM Admin

  Scenario: Verification for Successful Login
    Given Open the browser and launch the application
    Given Login to Compose Successfully
    When Enter a valid email and valid password
    When Click SignIn
#    Then Load the CAM Admin Home Page
#    And Click on Compose
#    And Load the Compose Home Page

  Scenario: Unsuccessful Login using invalid username valid password
    Given Open the browser and launch the application
    When Enter a invalid email 'AdminUserError' and valid password 'Test@123'
    And Click SignIn
    Then Verify Error Message

  Scenario: Unsuccessful Login using valid username invalid password
    Given Open the browser and launch the application
    When Enter a valid email 'AdminUser' and invalid password 'Test'
    And Click SignIn
  #  Then Verification of Error Message

  Scenario: Unsuccessful Login using invalid username invalid password
    Given Open the browser and launch the application
    When Enter a invalid email 'AdminUserError' and invalid password 'Test'
    And Click SignIn
   # Then Verify Error Message

  Scenario: Empty username with password
    Given Open the browser and launch the application
    When Enter empty username '' and password 'Test@123'
    And Click SignIn
   # Then Verify Error Popup

#  Scenario: Empty password with username
#    Given Open the browser and launch the application
#    When Enter username 'AdminUser' and empty password
#    And Click SignIn
   # Then Verify Error Popup

  Scenario: Empty username and empty password
    Given Open the browser and launch the application
    When Enter empty username '' and empty password ''
    And Click SignIn
   # Then Verify Error Popup

### Test Case 01: Compose Login through Compose Login Page
#
#  Scenario: Verification for Successful Login through Compose Login Page
#    Given Open the browser and launch the compose login page
#    When Enter a valid email and valid password in compose login page
#    When Click Log In Button
#    Then Load the Compose Home Page
#
#  Scenario: Unsuccessful Login using invalid username valid password through Compose Login Page
#    Given Open the browser and launch the compose login page
#    When Enter a invalid email 'test@globalwavenet.com' and valid password 'Test@123' in compose login page
#    And Click Log In Button
#    Then Verify Error Message in Compose Login Page
#
#  Scenario: Unsuccessful Login using valid username invalid password through Compose Login Page
#    Given Open the browser and launch the compose login page
#    When Enter a valid email 'super_admin@globalwavenet.com' and invalid password 'Test' in compose login page
#    And Click Log In Button
#    Then Verify Error Message in Compose Login Page
#
#  Scenario: Unsuccessful Login using invalid username invalid password through Compose Login Page
#    Given Open the browser and launch the compose login page
#    When Enter a invalid email 'test@gmail.com' and invalid password 'Test' in compose login page
#    And Click Log In Button
#    Then Verify Error Message in Compose Login Page
#
#  Scenario: Empty username with password in Compose Login Page
#    Given Open the browser and launch the compose login page
#    When Enter empty username '' and password 'Test@123' in compose login page
#    Then Verify LogIn Button is Disabled
#
#  Scenario: Empty password with username in Compose Login Page
#    Given Open the browser and launch the compose login page
#    When Enter username 'super_admin@globalwavenet.com' and password empty '' in compose login page
#    Then Verify LogIn Button is Disabled
#
#  Scenario: Empty username and empty password in Compose Login Page
#    Given Open the browser and launch the compose login page
#    When Enter username empty '' and password empty '' in compose login page
#    Then Verify LogIn Button is Disabled
