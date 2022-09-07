Feature: DDH Personal Info

# TestCase 1292: Verification of Successful UI Navigation-Profile page
  Scenario:TestCase 1292: Verification of Successful UI Navigation-Profile page
    Given Open the browser and launch the application
    And Wait  some time
    When Click on Log In Drop down
    And Click on the name button
    Then Redirect to profile page


# TestCase 1669(1): Verification of Successful Personal Info for a New Registered User
 Scenario:TestCase 1669(1): Verification of Successful Personal Info after Registration
    Given Open the browser and launch the application
    And Wait  some time
    When Click on Log In Drop down
    And Click on the name button
    And Click on personal info edit button
    And Check first name as 'Jeff'
    And Check last name as 'Peter'
    And Check email as 'test1l@gmail.com'
    And Check mobile number as '+94772222230'
    And Select date of birth
    And Select gender
    And Select nationality
    And Enter national identification number as '908908978V'
    And Click on personal info update button
    Then Display success message for Personal Info Update as 'Health worker Information has been successfully updated'


# TestCase 1300: Verification of Successful Profile Image Upload
  Scenario:TestCase 1300: Verification of Successful Profile Image Upload
    Given Open the browser and launch the application
    And Wait  some time
    When Click on Log In Drop down
    And Click on the name button
    And Click on camera icon and upload an image
    Then Display success message for profile image upload as 'Profile Picture has been successfully Updated'


# TestCase 1669(2): Verification of Successful Personal Info Update for a Existing User
  Scenario:TestCase 1669(2): Verification of Successful Personal Info Update for a Existing User
    Given Open the browser and launch the application
    And Wait  some time
    When Click on Log In Drop down
    And Click on the name button
    And Click on personal info edit button
    And Edit first name as 'Kasun'
    And Edit last name as 'Herath'
    And Edit email as 'wavenet3@gmail.com'
    And Edit date of birth
    And Edit gender
    And Edit nationality
    And Edit national identification number as '990008899V'
    And Click on personal info update button
    Then Display success message for Personal Info Update as 'Health worker Information has been successfully updated'


# TestCase 1314: Verification of Successful Profile Image Update
  Scenario:TestCase 1314: Verification of Successful Profile Image Update
    Given Open the browser and launch the application
    And Wait  some time
    When Click on Log In Drop down
    And Click on the name button
    And Click on camera icon and edit profile image
    Then Display success message for profile image upload as 'Profile Picture has been successfully Updated'

# TestCase 1313/1294: Verification of Availability of profile details
  Scenario:TestCase 1313/1294: Verification of Availability of profile details
    Given Open the browser and launch the application
    And Wait  some time
    When Click on Log In Drop down
    And Click on the name button
    Then Display First Name as 'Kasun'
    Then Display Last Name as 'Herath'
    And Display Email as 'wavenet3@gmail.com'
    Then Display DOB as '2022-07-05'
    Then Display Gender as 'Male'
    Then Display MSISDN as '+94772222230'
    Then Display Nationality as 'American'
    Then Display National Identification Number as '990008899V'
    Then Display profile image


# TestCase 1298: Verification of Single Image Selection
#  Scenario:TestCase 1298: Verification of Single Image Selection
#    Given Open the browser and launch the application
#    And Wait  some time
#    When Click on Log In Drop down
#    And Click on the name button
#    And Click on camera icon and select one profile image
    #    And Select another profile image


# TestCase 1305: Verification of Successful Profile Image Crop
  Scenario:TestCase 1305: Verification of Successful Profile Image Crop
    Given Open the browser and launch the application
    And Wait  some time
    When Click on Log In Drop down
    And Click on the name button
    And Click on camera icon and crop profile image
    Then Display success message for profile image upload as 'Profile Picture has been successfully Updated'


# TestCase 2194: Verification of Successful Profile Image Delete
  Scenario:TestCase 2194: Verification of Successful Profile Image Delete
    Given Open the browser and launch the application
    And Wait  some time
    When Click on Log In Drop down
    And Click on the name button
    And Click on image delete icon
    Then Display the delete success message as 'Profile Picture has been successfully removed'
