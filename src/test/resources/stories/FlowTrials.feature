Feature: Flow Trials

## Test Case 01: Verify Creation of Flow Trial for Existing Flow

  Scenario: Enter Trial Identifier as String
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as 'trialIdentifier'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Messenger'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier 'trialIdentifier'
    Then Delete Created Flow Trial

  Scenario: Enter Trial Identifier as Integers
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as '94774567123'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Messenger'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier '94774567123'
    Then Delete Created Flow Trial

  Scenario: Enter Trial Identifier with Special Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as '@_!#$%^*'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Messenger'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier '@_!#$%^*'
    Then Delete Created Flow Trial

  Scenario: Enter Trial Identifier with Spaces
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as 'Flow Trial Identifier'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Messenger'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier 'Flow Trial Identifier'
    Then Delete Created Flow Trial

  Scenario: Enter Trial Identifier with Min One Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as 'Z'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Messenger'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier 'Z'
    Then Delete Created Flow Trial

  Scenario: Enter Trial Identifier with Max 50 Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as 'Test Flow Trial Test Flow Trial Test Flow Trial123'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Messenger'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier 'Test Flow Trial Test Flow Trial Test Flow Trial123'
    Then Delete Created Flow Trial

  Scenario: Enter Trial Identifier with More Than 50 Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    And Enter Trial Identifier as 'Test Flow Trial Test Flow Trial Test Flow Trial1234'
    Then Verify Trial Identifier Max Length Error Message

  Scenario: Enter Trial Identifier Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    And Enter Trial Identifier as ''
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Messenger'
    Then Click on Create Button on Create Flow Trials Page
    Then Verify Trial Identifier Required Error Message

  Scenario: Enter Trial Identifier as Smooch ID
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as '1e6fbf72141504798d0086ee'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Messenger'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier '1e6fbf72141504798d0086ee'
    Then Delete Created Flow Trial

  Scenario: Enter Flow Name as Existing Flow
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as 'Test Existing Flow'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Messenger'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier 'Test Existing Flow'
    Then Delete Created Flow Trial

  Scenario: Enter Flow Name as Not Existing Flow
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as 'Test Not Existing Flow'
    And Select Flow as 'InvalidFlow'
    Then Verify Flow Trial Invalid Flow Name Error Message

  Scenario: Enter Flow Name Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as 'Test Flow Empty'
    And Select Channel as 'Messenger'
    And Click on Create Button on Create Flow Trials Page to Verify Required
    Then Verify Flow Trial Flow Name Required Error Message

  Scenario: Select Channel as Messenger
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as '78e6fbf72141504798d0086ee'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Messenger'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier '78e6fbf72141504798d0086ee'
    Then Delete Created Flow Trial

  Scenario: Select Channel as Viber
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as '567e6fbf72141504798d0086ee'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Viber'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier '567e6fbf72141504798d0086ee'
    Then Delete Created Flow Trial

  Scenario: Select Channel as WhatsApp
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as '190e6fbf72141504798d0086ee'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Whatsapp'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier '190e6fbf72141504798d0086ee'
    Then Delete Created Flow Trial

  Scenario: Select Channel as USSD
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as '94756783421'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'USSD'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier '94756783421'
    Then Delete Created Flow Trial

  Scenario: Select Channel as IVR
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as '94771183421'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'IVR'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier '94771183421'
    Then Delete Created Flow Trial

  Scenario: Select Channel as SMS
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as '94709183421'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'SMS'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier '94709183421'
    Then Delete Created Flow Trial

  Scenario: Select Channel as HTTP
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as 'TestHeader'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'HTTP'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier 'TestHeader'
    Then Delete Created Flow Trial

  Scenario: Leave Channel Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as 'Test Channel Empty'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Click on Create Button on Create Flow Trials Page to Verify Required
    Then Verify Flow Trial Channel Required Error Message

  Scenario: Create Flow Trial to Check Duplicates for Trial Identifier
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as 'TestHeaderDuplicate'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'HTTP'
    Then Click on Create Button on Create Flow Trials Page
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as 'TestHeaderDuplicate'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'HTTP'
    And Click on Create Button on Create Flow Trials Page
    Then Verify Duplicated Trial Identifier Error Message
    And Click on Cancel Button on Flow Trials Page
    And Search Flow Trial by Test Identifier 'TestHeaderDuplicate'
    Then Delete Created Flow Trial

## Test Case 02: Verify Update of Flow Trial for Existing Flow

  Scenario: Create Flow Trial to Check Trial Identifier Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as 'checkTrialIdentifier'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Messenger'
    Then Click on Create Button on Create Flow Trials Page

  Scenario: Update Flow Trial Trial Identifier with String
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'checkTrialIdentifier'
    Then Click on Flow Trial Edit Button
    And Update Trial Identifier as 'checkTrialIdentifierUpdate'
    Then Click on Update Button on Update Flow Trials Page

  Scenario: Update Flow Trial Trial Identifier with Integers
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'checkTrialIdentifierUpdate'
    Then Click on Flow Trial Edit Button
    And Update Trial Identifier as '94781234543'
    Then Click on Update Button on Update Flow Trials Page

  Scenario: Update Flow Trial Trial Identifier with Special Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier '94781234543'
    Then Click on Flow Trial Edit Button
    And Update Trial Identifier as '@_!#$%^*'
    Then Click on Update Button on Update Flow Trials Page

  Scenario: Update Flow Trial Trial Identifier with Spaces
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier '@_!#$%^*'
    Then Click on Flow Trial Edit Button
    And Update Trial Identifier as 'Check Trial Identifier Spaces'
    Then Click on Update Button on Update Flow Trials Page

  Scenario: Update Flow Trial Trial Identifier with Min One Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'Check Trial Identifier Spaces'
    Then Click on Flow Trial Edit Button
    And Update Trial Identifier as 'W'
    Then Click on Update Button on Update Flow Trials Page

  Scenario: Update Flow Trial Trial Identifier with Max 50 Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'W'
    Then Click on Flow Trial Edit Button
    And Update Trial Identifier as 'Check Trial Identifier Update Check Trial 12345678'
    Then Click on Update Button on Update Flow Trials Page

  Scenario: Update Flow Trial Trial Identifier with More Than 50 Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'Check Trial Identifier Update Check Trial 12345678'
    Then Click on Flow Trial Edit Button
    And Update Trial Identifier as 'Check Trial Identifier Update Check Trial 123456789'
    Then Verify Trial Identifier Max Length Error Message

  Scenario: Update Flow Trial Trial Identifier Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'Check Trial Identifier Update Check Trial 12345678'
    Then Click on Flow Trial Edit Button
    And Update Trial Identifier as ''
    Then Verify Trial Identifier Required Error Message

  Scenario: Update Flow Trial Trial Identifier with Smooch ID
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'Check Trial Identifier Update Check Trial 12345678'
    Then Click on Flow Trial Edit Button
    And Update Trial Identifier as '9999e6fbf72141504798d0086ee'
    Then Click on Update Button on Update Flow Trials Page
    And Search Flow Trial by Test Identifier '9999e6fbf72141504798d0086ee'
    Then Delete Created Flow Trial

##<----------------------------------------------------------------------------------------------------------------------------------->

  Scenario: Create Flow Trial to Check Flow Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as 'checkFlowUpdate'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Messenger'
    Then Click on Create Button on Create Flow Trials Page

  Scenario: Update Flow Name with Another Existing Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'checkFlowUpdate'
    Then Click on Flow Trial Edit Button
    And Update Flow Name as 'Flow Trial Bot Flow 2'
    Then Click on Update Button on Update Flow Trials Page

  Scenario: Update Flow Name with Invalid Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'checkFlowUpdate'
    Then Click on Flow Trial Edit Button
    And Update Flow Name as 'InvalidFlow'
    Then Verify Flow Trial Invalid Flow Name Error Message

  Scenario: Update Flow Name Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'checkFlowUpdate'
    Then Click on Flow Trial Edit Button
    And Update Flow Name as ''
    Then Verify Flow Trial Flow Name Required Error Message
    And Click on Cancel Button on Flow Trials Page
    And Search Flow Trial by Test Identifier 'checkFlowUpdate'
    Then Delete Created Flow Trial

##<------------------------------------------------------------------------------------------------------------------------------>

  Scenario: Create Flow Trial to Check Channel Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as 'checkFlowTrialChannelUpdate'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Messenger'
    Then Click on Create Button on Create Flow Trials Page

  Scenario: Update Channel as Viber
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'checkFlowTrialChannelUpdate'
    Then Click on Flow Trial Edit Button
    And Select Channel as 'Viber'
    Then Click on Update Button on Update Flow Trials Page

  Scenario: Update Channel as Messenger
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'checkFlowTrialChannelUpdate'
    Then Click on Flow Trial Edit Button
    And Select Channel as 'Messenger'
    Then Click on Update Button on Update Flow Trials Page

  Scenario: Update Channel as Whatsapp
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'checkFlowTrialChannelUpdate'
    Then Click on Flow Trial Edit Button
    And Select Channel as 'Whatsapp'
    Then Click on Update Button on Update Flow Trials Page

  Scenario: Update Channel as USSD
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'checkFlowTrialChannelUpdate'
    Then Click on Flow Trial Edit Button
    And Select Channel as 'USSD'
    Then Click on Update Button on Update Flow Trials Page

  Scenario: Update Channel as SMS
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'checkFlowTrialChannelUpdate'
    Then Click on Flow Trial Edit Button
    And Select Channel as 'SMS'
    Then Click on Update Button on Update Flow Trials Page

  Scenario: Update Channel as IVR
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'checkFlowTrialChannelUpdate'
    Then Click on Flow Trial Edit Button
    And Select Channel as 'IVR'
    Then Click on Update Button on Update Flow Trials Page

  Scenario: Update Channel as HTTP
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'checkFlowTrialChannelUpdate'
    Then Click on Flow Trial Edit Button
    And Select Channel as 'HTTP'
    Then Click on Update Button on Update Flow Trials Page
    And Search Flow Trial by Test Identifier 'checkFlowTrialChannelUpdate'
    Then Delete Created Flow Trial

## Test Case 03: Goto Flow Option in Flow Trial

  Scenario: Goto Flow Option in Flow Trial
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Click on Flow Trials Create New Button
    Then Enter Trial Identifier as 'Go To Option Flow Trial'
    And Select Flow as 'Flow Trial Bot Flow 1'
    And Select Channel as 'Messenger'
    Then Click on Create Button on Create Flow Trials Page
    And Search Flow Trial by Test Identifier 'Go To Option Flow Trial'
    And Click on Flow Trial Goto Flow Option
    Then Verify Flow Trial Goto Flow Name as 'Flow Trial Bot Flow 1'
    And Select Agents Tab
    And Click on Connectors Tab
    And Select Flow Trials Tab
    And Search Flow Trial by Test Identifier 'Go To Option Flow Trial'
    Then Delete Created Flow Trial
