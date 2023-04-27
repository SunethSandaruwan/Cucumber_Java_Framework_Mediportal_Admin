Feature: Web Chat Widget

## Test Case 01: Verify Web Chat Widget Creation

  Scenario: Web Chat Widget Name with String
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Name with Integer
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as '1234567890123'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name '1234567890123'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Name with Underscore
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'Test_Automation_Widget'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'Test_Automation_Widget'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Name with Hyphen
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'Test-Automation-Widget'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'Test-Automation-Widget'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Name with special characters except hyphen and underscore
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    And Enter Web Chat Widget Name as 'TestAutomationWidget!@#$%^&*()+='
    Then Verify Web Chat Widget Name Allowed Characters Error Message

  Scenario: Web Chat Widget Name with Spaces
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    And Enter Web Chat Widget Name as 'Test Automation Widget'
    Then Verify Web Chat Widget Name Allowed Characters Error Message

  Scenario: Web Chat Widget Name with Min One Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'Z'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'Z'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Name with Max 100 Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-12345678'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-12345678'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Name with More than 100 Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    And Enter Web Chat Widget Name as 'Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-123456789'
    Then Verify Web Chat Widget Name Max Length Error Message

  Scenario: Web Chat Widget Name Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as ''
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    And Click on Create Button on Web Chat Widget Create Page
    Then Verify Web Chat Widget Name Required Error Message

  Scenario: Web Chat Widget Description with String
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget01'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'ThisisWebChatWidgetDescription'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget01'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Description with Integer
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget02'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as '12345678901234'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget02'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Description with Special Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget03'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as '!@#$%^&*()_-+='
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget03'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Description with Spaces
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget04'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget04'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Description with Min One Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget05'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'D'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget05'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Description with Max 200 Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget06'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat 123'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget06'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Description with more than 200 characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget00'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat 1234'
    Then Verify Web Chat Widget Description Max Length Error Message

  Scenario: Web Chat Widget Description Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget07'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as ''
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget07'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Service Detection as Dynamic
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget08'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget08'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Service Detection as Static with No Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget09'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Static'
    And Enter Web Chat Widget Domain Name for Static Service Detection as 'localhost'
    And Click on Create Button on Web Chat Widget Create Page
    Then Verify Web Chat Widget Flow Name Required Error Message

  Scenario: Web Chat Widget Service Detection as Static with Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget10'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Static'
    And Select Web Chat Widget Flow Name as 'BotFlow 1'
    And Enter Web Chat Widget Domain Name for Static Service Detection as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget10'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Service Detection as Static with Invalid Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget11'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Static'
    And Select Web Chat Widget Flow Name as 'Invalid Flow'
    Then Verify Web Chat Widget Flow Name Invalid Error Message

  Scenario: Web Chat Widget Domain Name as localhost
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget12'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget12'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Domain Name as Name of a Domain
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget13'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'wavenet.lk'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget13'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Domain Name as IPv4 Address
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget14'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as '127.0.0.1'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget14'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Domain Name as IPv6 Address
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget15'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as '2001:0db8:85a3:0000:0000:8a2e:0370:7334'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget15'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Domain Name as URL
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget16'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'https://13.127.152.191/connection/mysql'
    Then Verify Web Chat Widget Domain Name Invalid Error Message

  Scenario: Web Chat Widget Domain Name as Invalid Domain Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget17'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'wavenet@#$.lk'
    Then Verify Web Chat Widget Domain Name Invalid Error Message

  Scenario: Web Chat Widget Domain Name as Empty Domain Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget18'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as ''
    And Click on Create Button on Web Chat Widget Create Page
    Then Verify Web Chat Widget Domain Name Required Error Message

  Scenario: Web Chat Widget Name Domain Name as Sub Domain
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget19'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'en.wikipedia.org'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget19'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Name Domain Name as Max 64 Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget20'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'wavenetwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.com'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget20'
    Then Delete Created Web Chat Widget

  Scenario: Web Chat Widget Name Domain Name as More Than 64 Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget21'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'wavenetwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.com'
    Then Verify Web Chat Widget Domain Name Max Length

  Scenario: Assign Color for Web Chat Widget Button
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget22'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Widget Button
    And Enter Color Code for Web Chat Widget Button as '#96005b'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget22'
    Then Delete Created Web Chat Widget

## Test Case 02: Verify Web Chat Widget Update

  Scenario: Create Web Chat Widget to Check Web Chat Widget Name Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget30'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page

  Scenario: Update Web Chat Widget Name with String
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget30'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Name as 'TestAutomationWidgetUpdate'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Name with Integer
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidgetUpdate'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Name as '12345678901234'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Name with Underscore
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name '12345678901234'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Name as 'Test_Automation_Widget_Update'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Name with Hyphen
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name '12345678901234'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Name as 'Test-Automation-Widget-Update'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Name with Hyphen
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name '12345678901234'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Name as 'Test-Automation-Widget-Update'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Name with special characters except hyphen and underscore
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'Test-Automation-Widget-Update'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Name as 'TestAutomationWidget!@#$%^&*()+='
    Then Verify Web Chat Widget Name Allowed Characters Error Message

  Scenario: Update Web Chat Widget Name with Spaces
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'Test-Automation-Widget-Update'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Name as 'Test Automation Widget'
    Then Verify Web Chat Widget Name Allowed Characters Error Message

  Scenario: Update Web Chat Widget Name with Min One Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'Test-Automation-Widget-Update'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Name as 'X'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Name with Max 100 Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'X'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Name as 'Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-12345678'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Name with More than 100 Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-12345678'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Name as 'Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-123456789'
    Then Verify Web Chat Widget Name Max Length Error Message

  Scenario: Update Web Chat Widget Name Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-12345678'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Name as ''
    Then Verify Web Chat Widget Name Required Error Message

  Scenario: Delete Previously Created Web Chat Widget
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-Test-Automation_Widget-12345678'
    Then Delete Created Web Chat Widget

##<------------------------------------------------------------------------------------------------------------------->

  Scenario: Create Web Chat Widget to Check Web Chat Widget Description Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget31'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page

  Scenario: Update Web Chat Widget Description with String
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget31'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Description as 'ThisisUpdatedWebChatWidgetDescription'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Description with Integer
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget31'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Description as '12345678901234'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Description with Special Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget31'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Description as '!@#$%^&*()_-+='
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Description with Spaces
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget31'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Description as 'This is Web Chat Widget Description with Spaces'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Description with Min One Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget31'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Description as 'D'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Description with Max 200 Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget31'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Description as 'This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat 123'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Description with more than 200 characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget31'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Description as 'This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat Widget Description This is Web Chat 1234'
    Then Verify Web Chat Widget Description Max Length Error Message

  Scenario: Update Web Chat Widget Description Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget31'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Description as ''
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Delete Previously Created Web Chat Widget
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget31'
    Then Delete Created Web Chat Widget

##<------------------------------------------------------------------------------------------------------------------->

  Scenario: Create Web Chat Widget to Check Web Chat Widget Service Detection Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget32'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page

  Scenario: Update Web Chat Widget Service Detection as Static with No Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget32'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Service Detections as 'Static'
    And Click on Update Button on Web Chat Widget Update UI
    Then Verify Web Chat Widget Flow Name Required Error Message

  Scenario: Update Web Chat Widget Service Detection as Static with Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget32'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Service Detections as 'Static'
    And Update Web Chat Widget Flow Name as 'BotFlow 1'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Service Detection as Static with Invalid Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget32'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Service Detections as 'Static'
    And Update Web Chat Widget Flow Name as 'Invalid Flow'
    Then Verify Web Chat Widget Flow Name Invalid Error Message

  Scenario: Delete Previously Created Web Chat Widget
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget32'
    Then Delete Created Web Chat Widget

##<------------------------------------------------------------------------------------------------------------------->

  Scenario: Create Web Chat Widget to Check Web Chat Widget Domain Name Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget33'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as '127.0.0.1'
    Then Click on Create Button on Web Chat Widget Create Page

  Scenario: Update Web Chat Widget Domain Name as localhost
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget33'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Domain Name as 'localhost'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Domain Name as Name of a Domain
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget33'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Domain Name as 'wavenet.lk'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Domain Name as IPv4 Address
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget33'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Domain Name as '127.0.0.1'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Domain Name as IPv6 Address
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget33'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Domain Name as '2001:0db8:85a3:0000:0000:8a2e:0370:7334'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Domain Name as URL
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget33'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Domain Name as 'https://13.127.152.191/connection/mysql'
    Then Verify Web Chat Widget Domain Name Invalid Error Message

  Scenario: Update Web Chat Widget Domain Name as Invalid Domain Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget33'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Domain Name as 'wavenet@#$.lk'
    Then Verify Web Chat Widget Domain Name Invalid Error Message

  Scenario: Update Web Chat Widget Domain Name as Invalid Domain Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget33'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Domain Name as 'wavenet@#$.lk'
    Then Verify Web Chat Widget Domain Name Invalid Error Message

  Scenario: Update Web Chat Widget Domain Name as Empty Domain Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget33'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Domain Name as ''
    Then Verify Web Chat Widget Domain Name Required Error Message

  Scenario: Update Web Chat Widget Domain Name as Sub Domain
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget33'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Domain Name as 'en.wikipedia.org'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Domain Name as Max 64 Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget33'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Domain Name as 'wavenetwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.com'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Update Web Chat Widget Domain Name as More Than 64 Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget33'
    Then Click on Edit Web Chat Widget
    And Update Web Chat Widget Domain Name as 'wavenetwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.com'
    Then Verify Web Chat Widget Domain Name Max Length

  Scenario: Delete Previously Created Web Chat Widget
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget33'
    Then Delete Created Web Chat Widget

##<------------------------------------------------------------------------------------------------------------------->

  Scenario: Create Web Chat Widget to Check Web Chat Widget Button Color Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'TestAutomationWidget34'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Dynamic'
    And Enter Web Chat Widget Domain Name as 'localhost'
    Then Click on Widget Button
    And Enter Color Code for Web Chat Widget Button as '#96005b'
    Then Click on Create Button on Web Chat Widget Create Page

  Scenario: Update Web Chat Widget Button Color
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget34'
    Then Click on Edit Web Chat Widget
    Then Click on Widget Button on Update UI
    And Update Color Code for Web Chat Widget Button as '#341898'
    Then Click on Update Button on Web Chat Widget Update UI

  Scenario: Delete Previously Created Web Chat Widget
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'TestAutomationWidget34'
    Then Delete Created Web Chat Widget

## Test Case 03: Goto Flow Option in Web Chat Widget

  Scenario: Goto Flow Option in Web Chat Widget
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Click on Create Widget button
    Then Enter Web Chat Widget Name as 'GoToOptionWebChatWidget'
    And Enter Widget Title as 'Title'
    And Enter Web Chat Widget Description as 'This is Web Chat Widget Description'
    And Select Web Chat Widget Service Detections as 'Static'
    And Select Web Chat Widget Flow Name as 'BotFlow 1'
    And Enter Web Chat Widget Domain Name for Static Service Detection as 'localhost'
    Then Click on Create Button on Web Chat Widget Create Page
    And Search Web Chat Widget by Web Chat Widget Name 'GoToOptionWebChatWidget'
    And Click on Web Chat Widget Goto Flow Option
    Then Verify Web Chat Widget Goto Flow Name as 'BotFlow 1'
    And Select Agents Tab
    And Click on Connectors Tab
    And Select Web Chat Widget Tab
    And Search Web Chat Widget by Web Chat Widget Name 'GoToOptionWebChatWidget'
    Then Delete Created Web Chat Widget