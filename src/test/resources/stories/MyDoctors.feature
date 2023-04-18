Feature: Doctors User Interface

    #Test case DDH-8308: Navigate to the MyDoctors UserInterface
  Scenario: Testcase 8308: Navigate to the MyDoctors UserInterface
    Given Open the browser and launch the application
    And Wait  some time
    When Enter for login as 'AdminUser4'
    And Enter for password as'Test@123'
    And Click on the signin button
    And Click on Doctors
    And Click on My Doctors
    And Verify the My Doctors page
    And Check spelling should be correct
    And Verify My Doctor UI
    And Verify My doctor table grid column names
    And Driver Close


    #Test case DDH-7313: When assigning a doctor to the hospital.
  Scenario: Testcase 7313: When assigning a doctor to the hospital
    Given Open the browser and launch the application
    And Wait  some time
    When Enter for login as 'AdminUser1'
    And Enter for password as'Test@123'
    And Click on the signin button
    And Click on Doctors
    And Click on My Doctors
    And Verify the My Doctors page
    And Select the Hospital Search Field 'Coop HealthCare Kurunegala'
    And Click on Assign Doctor Button
    And Select the unassigned Doctor Name
    And Click on Save Button
    And Click on Cancel button
    Then Verify the Assign Doctor name in Hospital
    And Driver Close

    #Testcase BAP-1396: Verify the Data displayed in the doctor profile
  Scenario: Testcase BAP-1396: Verify the Data displayed in the doctor profile
    Given Open the browser and launch the application
    And Wait  some time
    When Enter Password for login as 'AdminUser1'
    And Enter for password as'Test@123'
    And Click on the signin button
    And Click on Doctors
    And Click on My Doctors
    And Enter Institute name in My Doctor search bar
    And Select My Doctor Status
    And Click on My Doctos






