Feature: DDH Hospitals


# TestCase 1456: Verification of Successful login
  Scenario:TestCase 1456: Verification of Successful login
    Given Open the browser and launch the application
    And Enter Username for login as 'test'
    And Enter Password for login as 'Test@123'
    And Click on Sign In Button
    Then Navigate to the home page

# TestCase 3934: Verification of Successful Edit Organization group when click on "Update"
  Scenario:TestCase 3934 : Verification of Successful Edit Organization group on update
    Given Open the browser and launch the application
    And Click on Organization Group
    And Select organization group as 'ABCD'
    And Click on update button for organization
    And Enter name for the organization as 'updatedORG'
    And Upload logo image for organization
    And Click on save and proceed button
    Then Display the success message for update organization group as 'updatedORG has been updated'

# TestCase 2489: Verification of Successful Delete Organization group
  Scenario:TestCase 2489 : Verification of Successful Delete Organization group
    Given Open the browser and launch the application
    And Click on Organization Group
    And Select organization group as 'ABCD'
    And Click on delete button
    And Click on delete button for the yes prompt
    Then Display the success message for delete organization group as 'ABCD has been deleted'




