Feature: HTTP End Point

## Test Case 01: Verify Creation of HTTP End Point for Existing Service Flow

  Scenario: Enter HTTP End Point Name as String
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    Then Enter End Point Name as 'endpointname'
    And Enter End Point ID as 'ep0001'
    And Select Service Flow as 'EP Service Flow 1'
    Then Click on Create Button on Create End Point Page
    And Search End Point by Name 'endpointname'
    Then Delete Created End Point

  Scenario: Enter HTTP End Point Name as Integers
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    Then Enter End Point Name as 'endpointname1234567'
    And Enter End Point ID as 'ep0001'
    And Select Service Flow as 'EP Service Flow 1'
    Then Click on Create Button on Create End Point Page
    And Search End Point by Name 'endpointname1234567'
    Then Delete Created End Point

  Scenario: Enter HTTP End Point Name with Special Characters except Underscore
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    And Enter End Point Name as 'endpointname!@#$%^&*()'
    Then Verify End Point Name Allowed Characters Error Message

  Scenario: Enter HTTP End Point Name with Spaces
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    Then Enter End Point Name as 'end point name check spaces'
    And Enter End Point ID as 'ep0001'
    And Select Service Flow as 'EP Service Flow 1'
    Then Click on Create Button on Create End Point Page
    And Search End Point by Name 'end point name check spaces'
    Then Delete Created End Point

  Scenario: Enter HTTP End Point Name with Underscore
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    Then Enter End Point Name as 'end point name check_underscore'
    And Enter End Point ID as 'ep0001'
    And Select Service Flow as 'EP Service Flow 1'
    Then Click on Create Button on Create End Point Page
    And Search End Point by Name 'end point name check_underscore'
    Then Delete Created End Point

  Scenario: Enter HTTP End Point Name with Min One Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    Then Enter End Point Name as 'Z'
    And Enter End Point ID as 'ep0001'
    And Select Service Flow as 'EP Service Flow 1'
    Then Click on Create Button on Create End Point Page
    And Search End Point by Name 'Z'
    Then Delete Created End Point

  Scenario: Enter HTTP End Point Name with Max 32 Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    Then Enter End Point Name as 'End Point Name Check End Point12'
    And Enter End Point ID as 'ep0001'
    And Select Service Flow as 'EP Service Flow 1'
    Then Click on Create Button on Create End Point Page
    And Search End Point by Name 'End Point Name Check End Point12'
    Then Delete Created End Point

  Scenario: Enter HTTP End Point Name with More Than 32 Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    And Enter End Point Name as 'End Point Name Check End Point123'
    Then Verify End Point Name Max Length Error Message

  Scenario: Enter HTTP End Point Name Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    Then Enter End Point Name as ''
    And Enter End Point ID as 'ep0001'
    And Select Service Flow as 'EP Service Flow 1'
    Then Click on Create Button on Create End Point Page
    Then Verify End Point Name Required Error Message

  Scenario: Check Duplicates for End Point Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    Then Enter End Point Name as 'endpointnamecheckduplicates'
    And Enter End Point ID as 'ep0001'
    And Select Service Flow as 'EP Service Flow 1'
    Then Click on Create Button on Create End Point Page
    And Click on End Point Create New Button
    Then Enter End Point Name as 'endpointnamecheckduplicates'
    And Enter End Point ID as 'ep0002'
    And Select Service Flow as 'EP Service Flow 1'
    And Click on Create Button on Create End Point Page
    Then Verify Duplicate End Point Name Error Message
    And Click on Cancel Button on End Point UI
    And Search End Point by Name 'endpointnamecheckduplicates'
    Then Delete Created End Point

  Scenario: Enter HTTP End Point Flow as Existing Service Flow
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    Then Enter End Point Name as 'check endpoint flow'
    And Enter End Point ID as 'ep0001'
    And Select Service Flow as 'EP Service Flow 1'
    Then Click on Create Button on Create End Point Page
    And Search End Point by Name 'check endpoint flow'
    Then Delete Created End Point

  Scenario: Enter HTTP End Point Flow as Not Existing Service Flow
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    Then Enter End Point Name as 'check endpoint flow invalid'
    And Enter End Point ID as 'ep0001'
    And Select Service Flow as 'invalidFlow'
    Then Verify End Point Flow Invalid Error Message

  Scenario: Enter HTTP End Point Flow Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    And Enter End Point Name as 'check endpoint flow empty'
    And Enter End Point ID as 'ep0001'
    And Click on Create Button on Create End Point Page to Verify Flow Required
    Then Verify End Point Flow Required Error Message

## Test Case 02: Verify Update of HTTP End Point for Existing Service Flow

  Scenario: Create HTTP End Point to Check HTTP End Point Name Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    Then Enter End Point Name as 'checkendpointupdate'
    And Enter End Point ID as 'ep0001'
    And Select Service Flow as 'EP Service Flow 1'
    Then Click on Create Button on Create End Point Page

  Scenario: Update HTTP End Point Name with String
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Search End Point by Name 'checkendpointupdate'
    Then Click on End Point Update Button
    And Update End Point Name as 'checkendpointupdatename'
    Then Click Update Button on Update End Point Page

  Scenario: Update HTTP End Point Name with Integers
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Search End Point by Name 'checkendpointupdatename'
    Then Click on End Point Update Button
    And Update End Point Name as 'checkendpointupdate1234567'
    Then Click Update Button on Update End Point Page

  Scenario: Update HTTP End Point Name with Spaces
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Search End Point by Name 'checkendpointupdate1234567'
    Then Click on End Point Update Button
    And Update End Point Name as 'check end point update'
    Then Click Update Button on Update End Point Page

  Scenario: Update HTTP End Point Name with Underscore
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Search End Point by Name 'check end point update'
    Then Click on End Point Update Button
    And Update End Point Name as 'check end point_underscore'
    Then Click Update Button on Update End Point Page

  Scenario: Update HTTP End Point Name with Special Characters except Underscore
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Search End Point by Name 'check end point_underscore'
    Then Click on End Point Update Button
    And Update End Point Name as '!@#$%^&*&()'
    Then Verify End Point Name Allowed Characters Error Message

  Scenario: Update HTTP End Point Name Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Search End Point by Name 'check end point_underscore'
    Then Click on End Point Update Button
    And Update End Point Name as ''
    Then Verify End Point Name Required Error Message

  Scenario: Update HTTP End Point Name with More Than 32 Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Search End Point by Name 'check end point_underscore'
    Then Click on End Point Update Button
    And Update End Point Name as 'Update End Point Name Update End1'
    Then Verify End Point Name Max Length Error Message

  Scenario: Update HTTP End Point Name with Min One Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Search End Point by Name 'check end point_underscore'
    Then Click on End Point Update Button
    And Update End Point Name as 'W'
    Then Click Update Button on Update End Point Page

  Scenario: Update HTTP End Point Name with Max 32 Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Search End Point by Name 'W'
    Then Click on End Point Update Button
    And Update End Point Name as 'Update End Point Name Update End'
    Then Click Update Button on Update End Point Page
    And Search End Point by Name 'Update End Point Name Update End'
    Then Delete Created End Point

##<---------------------------------------------------------------------------------------------------------------------------->

  Scenario: Create HTTP End Point to Check HTTP End Point Service Flow Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    Then Enter End Point Name as 'checkendpointflowupdate'
    And Enter End Point ID as 'ep0001'
    And Select Service Flow as 'EP Service Flow 1'
    Then Click on Create Button on Create End Point Page

  Scenario: Update HTTP End Point Service Flow with Invalid Flow
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Search End Point by Name 'checkendpointflowupdate'
    Then Click on End Point Update Button
    And Update End Point Service Flow as 'invalidFlow'
    Then Verify End Point Flow Invalid Error Message

  Scenario: Update HTTP End Point Service Flow Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Search End Point by Name 'checkendpointflowupdate'
    Then Click on End Point Update Button
    And Update End Point Service Flow as ''
    Then Verify End Point Flow Required Error Message

  Scenario: Update HTTP End Point Service Flow with Existing Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Search End Point by Name 'checkendpointflowupdate'
    Then Click on End Point Update Button
    And Update End Point Service Flow as 'EP Service Flow 2'
    Then Click Update Button on Update End Point Page
    And Search End Point by Name 'checkendpointflowupdate'
    Then Delete Created End Point

##<--------------------------------------------------------------------------------------------------------------------------------->

  Scenario: Copy HTTP End Point URL
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    Then Enter End Point Name as 'checkendpointcopy'
    And Select Service Flow as 'EP Service Flow 1'
    Then Click on Create Button on Create End Point Page
    And Search End Point by Name 'checkendpointcopy'
    And Copy Previously Created HTTP End Point URL
    And Verify End Point URL Successfully Copied Message
    And Search End Point by Name 'checkendpointcopy'
    Then Delete Created End Point

## Test Case 03: Verify View HTTP End Point for Existing Service Flow

  Scenario: View HTTP End Point
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    Then Enter End Point Name as 'View End Point Auto'
    And Select Service Flow as 'EP Service Flow 1'
    Then Click on Create Button on Create End Point Page
    And Search End Point by Name 'View End Point Auto'
    Then View Previously Created End Point
    And Verify End Point View Mode
    And Click Close Button on End Point View
    And Search End Point by Name 'View End Point Auto'
    Then Delete Created End Point

## Test Case 04: Goto Flow Option in End Point

  Scenario: Goto Flow Option in End Point
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select End Points Tab
    And Click on End Point Create New Button
    Then Enter End Point Name as 'Go To Option End Point'
    And Enter End Point ID as 'ep0001'
    And Select Service Flow as 'EP Service Flow 1'
    Then Click on Create Button on Create End Point Page
    And Search End Point by Name 'Go To Option End Point'
    And Click on End Point Goto Flow Option
    Then Verify End Point Goto Flow Name as 'EP Service Flow 1'
    And Select Agents Tab
    And Click on Connectors Tab
    And Select End Points Tab
    And Search End Point by Name 'Go To Option End Point'
    Then Delete Created End Point


