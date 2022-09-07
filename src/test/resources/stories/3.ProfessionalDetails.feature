Feature: DDH Detailed Registration

  Scenario:TestCase 1564: Verification of Successful Log in
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on LogIn Button
    And Enter Mobile Number for login as '+94772222230'
    And Enter Password for login as 'Password@123'
    And Click on Sign In Button
    Then Redirect to next page

# TestCase 1320: Verification of Mandatory Fields
#  Scenario:TestCase 1320: Verification of Mandatory Fields
#    Given Open the browser and launch the application
#    And Wait  some time
#    When Click on Log In Drop down
#    And Click on Professional Details button
#    And Click on update button
#    And Click on update button with empty input fields
#    Then Display validation for list of practice as 'This field is required'
#    Then Display validation for languages accepted as 'This field is required'
#    Then Display validation for bank name field outline colour
#    Then Display validation for account number as 'This field is required'


# TestCase 1321: Verification of Successful Add 5 practices
 Scenario:TestCase 1321: Verification of Successful Add 5 practices
    Given Open the browser and launch the application
    And Wait  some time
    When Click on Log In Drop down
    And Click on Professional Details button
    And Click on update button
    And Enter first list of practises
    And Enter second list of practises
    And Enter third list of practises
    And Enter fourth list of practises
    And Enter fifth list of practises
    And Enter sixth list of practises
    Then Display validation text for list of practices as 'Maximum of 5 Practices can be select'
#        correct this add 5 practices


## TestCase 1324: Verification of Successful Add professional details
  Scenario:TestCase 1324: Verification of Successful Add professional details
    Given Open the browser and launch the application
    And Wait  some time
    When Click on Log In Drop down
    And Click on Professional Details button
    And Click on update button
#    And Enter first list of practises
    And Enter languages accepted
    And Select qualifications
    And Enter practice ID
    And Select bank name
    And Enter account number
    And Enter Branch ID
    And Enter beneficiary name
    And Enter bank address
    And Enter IBAN or SWIFT
    And Click on update button to update
    Then Display success message as 'Health worker Information has been successfully updated'


