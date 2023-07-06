Feature: Organization or Group Hospitals


# TestCase 1456: Verification of Successful login to Organization/Group
  Scenario:TestCase 1456: Verification of Successful login
    Given Login to Admin Successfully
    And Click on Organization Group

#Create a Organization Group
  Scenario: Create a Organization Group
    Given Login to Admin Successfully
    And Click on Main manu Medical Center
    And Click on All Medical Center
    Then Click on Add New Medical Center
    And Click on Create new organization group button
    Then Verify the Add New Organization Group Title
    And Enter Name of the organization group 'AutomationTestOrganizationA'
      # And Upload logo image for organization
    And Click on Add organization group Save and proceed Button
    And Display the success message for Added new organization group as 'Organization has been successfully created'
    Then Click on Medical Center details Close Button


# Verify the User interface in Organization Group
  Scenario: Verify the organization User interface
    Given Login to Admin Successfully
    And Click on Organization Group
    Then Verify the Organization Title
    And Verify the Search Organization Search Box 'AutomationTestOrganizationA'
    And Verify the Item per page
   # Then Verify the Navigation Button
    And Verify the Table Name Column Title
    And Verify the Table Action Column Title

# TestCase 3934: Verification of Successful Edit Organization group when click on "Update"
  Scenario:TestCase 3934 : Verification of Successful Edit Organization group on update
    Given Login to Admin Successfully
    And Click on Organization Group
    And Verify the Organization Title
   # And Verify the Search Organization Search Box 'AutomationTestOrganizationA'
    And Verify the Search Organization Search Box 'AutomationTestB'
    Then Click on Action Button for organization
    And Click on update button for organization
    And Delete On default Value in Text Box
    And Enter name for the organization as 'AutomationTestOrganizationOne'
   # And Upload logo image for organization
    And Click on save and proceed button
    Then Display the success message for update organization group as 'AutomationTestOrganizationOne has been updated'

# TestCase 2489: Verification of Successful Delete Organization group
  Scenario:TestCase 2489 : Verification of Successful Delete Organization group
    Given Login to Admin Successfully
    And Click on Organization Group
   # And Verify the Search Organization Search Box 'AutomationTestOrganizationOne'
    And Verify the Search Organization Search Box 'AutomationTestOrganizationOne'
   # And Select organization group as 'AutomationTestOrganizationOne'
    And Click on delete button
    And Verify the organization Group Delete Conformation PopUp Box Title
    Then Verify the Organization Group Delete Conformation PopUP Box Description
    And Click on delete button for the yes prompt
    Then Display the success message for delete organization group as 'AutomationTestOrganizationOne has been deleted'


    # Verify the Organization or Group UI
  Scenario: Verify the Navigate Organization or Group
    Given Login to Admin Successfully
    And Click on Organization Group




