Feature: Doctors User Interface

    #Test case DDH-8303: Navigate to the MyDoctors UserInterface
  Scenario: Testcase 8308: Navigate to the MyDoctors UserInterface
    Given Open the browser and launch the application
    And Wait  some time
    When Enter for login as 'suneth'
    And Enter for password as'Test@123'
    And Click on the signin button
    And Click on Doctors
    And Click on My Doctors
    And Verify the My Doctors page
   # And Driver Close


    #Test case DDH-7313: When assigning a doctor to the hospital.
  Scenario: Testcase 7313: When assigning a doctor to the hospital
    Given Open the browser and launch the application
    And Wait  some time
  #  When Enter for login as 'suneth'
  #  And Enter for password as'Test@123'
  #  And Click on the signin button
    And Click on Doctors
    And Click on My Doctors
    And Verify the My Doctors page
    And Select the Hospital Search Field ''
    And Click on Assign Doctor Button
    And Select the unassigned Doctor Name
    And Click on Save Button
    And Click on Cancel button
    Then Verify the Assign Doctor name in Hospital
    And Driver Close





