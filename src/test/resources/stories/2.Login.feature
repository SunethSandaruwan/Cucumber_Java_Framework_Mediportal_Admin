Feature: DDH Log in

# TestCase 1564: Mandatory field test-when both fields are not empty - Tested with Verification of Successful Log In

# TestCase 1565: Mandatory field test-when both fields are empty
  Scenario:TestCase 1565: Mandatory field test-when both fields are empty
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on LogIn Button
    And Click on Sign In Button
    Then Display toast as 'Invalid mobile number or password.'
#    And Click on Logout button

 # TestCase 1568: Mandatory field test-when only password is empty
  Scenario:TestCase 1568: Mandatory field test-when only password is empty
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on LogIn Button
    And Enter Mobile Number for login as '+94772233445'
    And Click on Sign In Button
    Then Display toast as 'Invalid mobile number or password.'

# TestCase 1569: Mandatory field test-when only MSISDN is empty
  Scenario:TestCase 1569: Mandatory field test-when only password is empty
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on LogIn Button
    And Enter Password for login as 'password123'
    And Click on Sign In Button
    Then Display toast as 'Invalid mobile number or password.'

# TestCase 1570: Verification of Password display as Masked
  Scenario:TestCase 1570: Verification of Password display as Masked
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on LogIn Button
    And Enter Mobile Number for login as '+94772233445'
    And Enter Password for login as 'password123'
    Then Check whether the password is masked

                  # TestCase 1584/1644: Verification of Password validation - Login with incorrect password
                  #  Scenario:TestCase 1: Verification of Password validation- Login with incorrect password
                  #    Given Open the browser and launch the application
                  #    When Click on Log In Drop down
                  #    And Click on LogIn Button
                  #    And Enter Mobile Number for login as '+94772233445'
                  #    And Enter Password for login as 'pass'
                  #    And Click on Sign In Button
                  #    Then Display toast as 'Invalid mobile number or password.'

                  #   no need this. covers from 1644

# TestCase 1606: MSISDN validation-Input login MSISDN without front zero
  Scenario:TestCase 1606: MSISDN validation-Input login MSISDN without front zero
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on LogIn Button
    And Enter Mobile Number for login as '773596444'
    And Enter Password for login as 'password123'
    And Click on Sign In Button
    Then Display toast as 'Invalid mobile number or password.'

# TestCase 1641: Verification of Invalid Log In Blocking scenario work (Invalid Mobile Number)
  Scenario:TestCase 1641: Verification of Invalid Log In Blocking scenario work (Invalid Mobile Number)
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on LogIn Button
    And Enter Mobile Number for login as '3596444'
    And Enter Password for login as 'password123'
    And Click on Sign In Button
    Then Display toast as 'Invalid mobile number or password.'


# TestCase 1644: Verification of Invalid Log In Blocking scenario work (Invalid password)
  Scenario:TestCase 1644: Verification of Invalid Log In Blocking scenario work (Invalid password)
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on LogIn Button
    And Enter Mobile Number for login as '+94772233445'
    And Enter Password for login as 'pass'
    And Click on Sign In Button
    Then Display toast as 'Invalid mobile number or password.'


# TestCase 1646: Verification of Unsuccessful MSISDN and password
  Scenario:TestCase 1646: Verification of Unsuccessful MSISDN and password
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on LogIn Button
    And Enter Mobile Number for login as '+2233445'
    And Enter Password for login as 'pass'
    And Click on Sign In Button
    Then Display toast as 'Invalid mobile number or password.'


# TestCase 1656: Forgot Password-check whether link is working fine
  Scenario:TestCase 1656: Forgot Password-check whether link is working fine
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on LogIn Button
    And Click on Forgot Password button
    Then Redirect to forgot password page

# TestCase 1660: Register your service-check whether link is working fine
  Scenario:TestCase 1660: Register your service-check whether link is working fine
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on LogIn Button
    And Click on Register button
    Then Direct to the sign up submission page

# TestCase 1564: Verification of Successful Log In
  Scenario:TestCase 1564: Verification of Successful Log in
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on LogIn Button
    And Enter Mobile Number for login as '+94772222230'
    And Enter Password for login as 'Password@123'
    And Click on Sign In Button
    Then Redirect to next page
#    And Click on Logout button

  #--------------BAB--------------
  #loging in to the BAP project in registered user
  Scenario: Verification of successful log In
    Given Open the browser and launch the application
    When Enter for login as 'suneth'
    And Enter for password as'Test@123'
    And Click on the sign in button
    Then Navigate to the home page





