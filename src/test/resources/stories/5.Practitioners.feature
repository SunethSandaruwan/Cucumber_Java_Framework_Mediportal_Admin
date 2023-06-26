Feature: verify the Practitioners details

    #Test case DDH-8303: Navigate to the Practitioners UserInterface
  Scenario: Testcase 8308: Navigate to the MyDoctors UserInterface
    Given Login to Admin Successfully
    And Click on Practitioners
    And Click on AllPractitioners
    And Verify the AllPractitioners page



    #Test case DDH-7313: When assigning a doctor to the hospital.
  Scenario: Testcase 7313: When assigning a doctor to the hospital
    Given Login to Admin Successfully
    And Click on Practitioners
    And Click on AllPractitioners
    And Verify the AllPractitioners page
    And Select the Hospital Search Field ''
    And Click on Assign Doctor Button
    And Select the unassigned Doctor Name
    And Click on Save Button
    And Click on Cancel button
    Then Verify the Assign Doctor name in Hospital





