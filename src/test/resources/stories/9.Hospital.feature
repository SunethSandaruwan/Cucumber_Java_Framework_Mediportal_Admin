Feature: DDH Hospitals

# TestCase 1456: Verification of Successful login
  Scenario:TestCase 1456: Verification of Successful login
    Given Open the browser and launch the application
    And Enter Username for login as 'test'
    And Enter Password for login as 'Test@123'
    And Click on Sign In Button
    Then Navigate to the home page

# TestCase 1780/1623: Verification of Successful Add Hospital
  Scenario:TestCase 1780: Verification of Successful Add Hospital

    Given Open the browser and launch the application
    And Wait  some time
    And Enter Username for login as 'test'
    And Enter Password for login as 'Test@123'
    And Click on Sign In Button
    Then Navigate to the home page

    Given Open the browser and launch the application
    And Click on Hospitals
    And Click on All hospitals
    And Click on Add new hospitals
    And Click on Create new organization group button
    And Enter name for the organization as 'AJz'
    And Upload logo image for organization
    And Click on save and proceed button
          #    And Select language for hospital
    And Enter hospital name as 'Asiri Hospital1'
    And Click on Add language button for hospital
    And Select another language for hospital
    And Enter another hospital name as 'Nawinna Hospital'
       And Enter hospital code as 'A123'
    And Upload logo image for hospital
    And Click on save button for hospital
    Then Display the success message for adding hospital as 'Hospital has been successfully created'


# TestCase 1615/1623: Verification of Successful Add Hospital
  Scenario:TestCase 1615: Verification of Successful Add Hospital

    Given Open the browser and launch the application
    And Enter Username for login as 'test'
    And Enter Password for login as 'Test@123'
    And Click on Sign In Button
    Then Navigate to the home page

    Given Open the browser and launch the application
    And Click on Hospitals
    And Click on All hospitals
    And Click on Add new hospitals
    And Select a organization from dropdown
    And Click on Next button
#    And Select language for hospital
    And Enter hospital name as 'Asiri HospitalTest2'
    And Click on Add language button for hospital
    And Select another language for hospital
    And Enter another hospital name as 'Nawinna Hospital'
       And Enter hospital code as 'A123'
    And Upload logo image for hospital
    And Click on save button for hospital
    Then Display the success message for adding hospital with exiting organization group as 'Hospital has been successfully created'

# TestCase 4121/4113: Verification of Successful Activation - add an active template
  Scenario:TestCase 4121/4113: Verification of Successful Activation - add an active template

    Given Open the browser and launch the application
    And Enter Username for login as 'test'
    And Enter Password for login as 'Test@123'
    And Click on Sign In Button
    Then Navigate to the home page


    Given Open the browser and launch the application
    And Click on Hospitals
    And Click on All hospitals
    And Click on Update button for the hospital
    And Click on configurations for the hospital
    And Click on print configurations for the hospital
    And Click on Add template button
    And Enter template name for the template as 'Template1'
    And Select print job for the template
    And Enter content for the template as 'content1'
    And Upload logo image for the template
    And Enter caption for the template as 'caption1'
    And Click on add another image button
    And Upload logo image again for the template
    And Enter caption2 for the template as 'caption2'
    And Mark as active for the template
    And Click on save button
    Then Display the added template on the page

# TestCase 4164: Verification of Successful View when having more than 10/50 records (View receipt templates)
#  Scenario:TestCase 4164: Verification of Successful View when having more than 10/50 records (View receipt templates)
#    Given Open the browser and launch the application
#    And Click on Hospitals
#    And Click on All hospitals
#    And Click on Update button for the hospital
#    And Click on configurations for the hospital
#    And Click on print configurations for the hospital
##      Then Display table of templates available
#    And Change the number of pages to twenty
      Then Display the twenty or less than twenty entries for the templates
#    And Click on next button
      Then Display the twenty or less than twenty entries for the templates
#    And Click on previous button
      Then Display the twenty or less than twenty entries for the templates
#    And Click on multi next button
      Then Display the twenty or less than twenty entries for the templates
#    And Click on multi previous button
      Then Display the twenty or less than twenty entries for the templates

#  no templates available
  # TestCase : BAP 815 Hospital Profile Create - When trying to validating in requires field for full name
  Scenario: TestCase BAP 815 Hospital Profile Create When trying to validating in requires field for full name
    Given Open the browser and launch the application
    And Wait  some time
    When Enter for login as 'suneth'
    And Enter for password as'Test@123'
    And Click on the signin button

    And Click on Hospitals
    And Click on All hospitals
    And Verify the Hospital Locations page title
    And Click on Add new hospitals
    And Select organization group as '.*'
    And Click on Next button
    And Enter hospital name as '.*'
    And Enter hospital code as '.*'
    And Click on Save Button