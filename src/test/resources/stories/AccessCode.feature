Feature: Access Code Management

## Test Case 01: Verify USSD Access Code Creation for Existing Flow

  Scenario: Select Short Code type as USSD
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999910'
    Then Click on Create Button on Short Code Create Page
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code'
    Then Delete Created USSD Short Code

  Scenario: Short Code type empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as ''
    And Enter Short Code Name as 'Test Automation USSD Code'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999900'
    And Click on Create Button on Short Code Create Page
    Then Verify Short Code Type Required Error Message

  Scenario: Enter USSD Short Code name with allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test_Automation-USSD Code123'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999911'
    Then Click on Create Button on Short Code Create Page
    And Search USSD Short Code by Short Code Name 'Test_Automation-USSD Code123'
    Then Delete Created USSD Short Code

  Scenario: Enter USSD Short Code name with max 100 characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'This is Test Automation Test Code This is Test Automation Test Code This is Test Automation TestCode'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999912'
    Then Click on Create Button on Short Code Create Page
    And Search USSD Short Code by Short Code Name 'This is Test Automation Test Code This is Test Automation Test Code This is Test Automation TestCode'
    Then Delete Created USSD Short Code

  Scenario: Enter USSD Short Code name with more than 100 characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'This is Test Automation Test Code This is Test Automation Test Code This is Test Automation Test Code'
    Then Verify Short Code Name Max Length Error Message

  Scenario: Enter USSD Short Code name empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as ''
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999900'
    And Click on Create Button on Short Code Create Page
    Then Verify Short Code Name Required Error Message

  Scenario: Enter USSD Short Code Description with allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code1'
    And Enter Short Code Description as 'This is Description 1234 !@#_-++'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999913'
    Then Click on Create Button on Short Code Create Page
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code1'
    Then Delete Created USSD Short Code

  Scenario: Enter USSD Short Code Description max 200 allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code2'
    And Enter Short Code Description as 'This is test automation short code description This is test automation short code description This is test automation short code description This is test automation short code description This is test'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999914'
    Then Click on Create Button on Short Code Create Page
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code2'
    Then Delete Created USSD Short Code

  Scenario: Enter USSD Short Code Description Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code3'
    And Enter Short Code Description as ''
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999915'
    Then Click on Create Button on Short Code Create Page
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code3'
    Then Delete Created USSD Short Code

  Scenario: Enter USSD Short Code Description with more than 200 characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code0'
    And Enter Short Code Description as 'This is test automation short code description This is test automation short code description This is test automation short code description This is test automation short code description This is test123'
    Then Verify Short Code Description Max Length Error Message

  Scenario: Enter USSD Short Code Flow Name as Valid Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code4'
    And Enter Short Code Description as ''
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999916'
    Then Click on Create Button on Short Code Create Page
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code4'
    Then Delete Created USSD Short Code

  Scenario: Enter USSD Short Code Flow Name as Invalid Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code4'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'Invalid Flow'
    Then Verify Flow Validate Error Message

  Scenario: Enter USSD Short Code Flow Name Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Enter Short Code as '999900'
    And Click on Create Button on Short Code Create Page
    Then Verify Flow Required Error Message

  Scenario: Enter USSD Short Code Code as Numeric Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code5'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999916'
    Then Click on Create Button on Short Code Create Page
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code5'
    Then Delete Created USSD Short Code

  Scenario: Enter USSD Short Code Code as Invalid Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as 'Abcd!@#_- Xyz'
    Then Verify Short Code Invalid Characters Error Message

  Scenario: Enter USSD Short Code Code Starts with * Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '*123456'
    Then Verify Short Code Invalid Characters Error Message

  Scenario: Enter USSD Short Code Code Ends with * Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '123456*'
    Then Verify Short Code Invalid Characters Error Message

  Scenario: Enter USSD Short Code Code Starts and Ends with * Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '*123456*'
    Then Verify Short Code Invalid Characters Error Message

  Scenario: Enter USSD Short Code Code with Numeric and * Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code6'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999917*8'
    Then Click on Create Button on Short Code Create Page
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code6'
    Then Delete Created USSD Short Code

  Scenario: Enter Multiple USSD Short Codes separated by Comma
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code7'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999918,999919'
    Then Click on Create Button on Short Code Create Page
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code7'
    Then Delete Created USSD Short Code

  Scenario: Enter Multiple USSD Short Codes with Comma and * Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code8'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999918*1,999919*2'
    Then Click on Create Button on Short Code Create Page
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code8'
    Then Delete Created USSD Short Code

  Scenario: Enter USSD Short Code Code Ends with Comma
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '123456,'
    Then Verify Short Code Invalid Characters Error Message

  Scenario: Enter USSD Short Code Code Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as ''
    And Click on Create Button on Short Code Create Page
    Then Verify Short Code Required Error Message

  Scenario: Skip a Menu Checkbox Enabled
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code10'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999920'
    And Select USSD Short Code Skip Menu Check Box
    Then Click on Create Button on Short Code Create Page
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code'
    Then Delete Created USSD Short Code

## Test Case 02: Verify SMS Access Code Creation for Existing Flow

  Scenario: Select Short Code type as SMS
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999910'
    Then Click on Create Button on Short Code Create Page
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code'
    Then Delete Created SMS Short Code

  Scenario: Short Code type empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as ''
    And Enter Short Code Name as 'Test Automation SMS Code'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999900'
    And Click on Create Button on Short Code Create Page
    Then Verify Short Code Type Required Error Message

  Scenario: Enter SMS Short Code name with allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test_Automation-SMS Code123'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999911'
    Then Click on Create Button on Short Code Create Page
    And Search SMS Short Code by Short Code Name 'Test_Automation-SMS Code123'
    Then Delete Created SMS Short Code

  Scenario: Enter SMS Short Code name with max 100 characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'This is Test Automation Test Code This is Test Automation Test Code This is Test Automation TestCode'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999912'
    Then Click on Create Button on Short Code Create Page
    And Search SMS Short Code by Short Code Name 'This is Test Automation Test Code This is Test Automation Test Code This is Test Automation TestCode'
    Then Delete Created SMS Short Code

  Scenario: Enter SMS Short Code name with more than 100 characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'This is Test Automation Test Code This is Test Automation Test Code This is Test Automation Test Code'
    Then Verify Short Code Name Max Length Error Message

  Scenario: Enter SMS Short Code name empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as ''
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999900'
    And Click on Create Button on Short Code Create Page
    Then Verify Short Code Name Required Error Message

  Scenario: Enter SMS Short Code Description with allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code1'
    And Enter Short Code Description as 'This is Description 1234 !@#_-++'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999913'
    Then Click on Create Button on Short Code Create Page
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code1'
    Then Delete Created SMS Short Code

  Scenario: Enter SMS Short Code Description max 200 allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code2'
    And Enter Short Code Description as 'This is test automation short code description This is test automation short code description This is test automation short code description This is test automation short code description This is test'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999914'
    Then Click on Create Button on Short Code Create Page
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code2'
    Then Delete Created SMS Short Code

  Scenario: Enter SMS Short Code Description Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code3'
    And Enter Short Code Description as ''
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999915'
    Then Click on Create Button on Short Code Create Page
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code3'
    Then Delete Created SMS Short Code

  Scenario: Enter SMS Short Code Description with more than 200 characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code0'
    And Enter Short Code Description as 'This is test automation short code description This is test automation short code description This is test automation short code description This is test automation short code description This is test123'
    Then Verify Short Code Description Max Length Error Message

  Scenario: Enter SMS Short Code Flow Name as Valid Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code4'
    And Enter Short Code Description as ''
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999916'
    Then Click on Create Button on Short Code Create Page
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code4'
    Then Delete Created SMS Short Code

  Scenario: Enter SMS Short Code Flow Name as Invalid Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code4'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'Invalid Flow'
    And Enter Short Code as '999900'
    And Click on Create Button on Short Code Create Page
    Then Verify Flow Validate Error Message

  Scenario: Enter SMS Short Code Flow Name Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Enter Short Code as '999900'
    And Click on Create Button on Short Code Create Page
    Then Verify Flow Required Error Message

  Scenario: Enter SMS Short Code Code as Numeric Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code5'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999916'
    Then Click on Create Button on Short Code Create Page
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code5'
    Then Delete Created SMS Short Code

  Scenario: Enter SMS Short Code Code as Invalid Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as 'Abcd!@#_- Xyz'
    Then Verify SMS Short Code Invalid Characters Error Message

  Scenario: Enter SMS Short Code Code Starts with * Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '*123456'
    Then Verify SMS Short Code Invalid Characters Error Message

  Scenario: Enter SMS Short Code Code Ends with * Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '123456*'
    Then Verify SMS Short Code Invalid Characters Error Message

  Scenario: Enter SMS Short Code Code Starts and Ends with * Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '*123456*'
    Then Verify SMS Short Code Invalid Characters Error Message

  Scenario: Enter SMS Short Code Code with Numeric and * Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code6'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999917*8'
    Then Verify SMS Short Code Invalid Characters Error Message

  Scenario: Enter Multiple SMS Short Codes separated by Comma
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code7'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999918,999919'
    Then Click on Create Button on Short Code Create Page
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code7'
    Then Delete Created SMS Short Code

  Scenario: Enter Multiple SMS Short Codes with Comma and * Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code8'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999918*1,999919*2'
    Then Verify SMS Short Code Invalid Characters Error Message

  Scenario: Enter SMS Short Code Code Ends with Comma
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '123456,'
    Then Verify SMS Short Code Invalid Characters Error Message

  Scenario: Enter SMS Short Code Code Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as ''
    And Click on Create Button on Short Code Create Page
    Then Verify Short Code Required Error Message

## Test Case 03: Verify IVR Access Code Creation for Existing Flow

  Scenario: Select Short Code type as IVR
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999910'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code'
    Then Delete Created IVR Short Code

  Scenario: Short Code type empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as ''
    And Enter Short Code Name as 'Test Automation IVR Code'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999900'
    And Click on Create Button on Short Code Create Page
    Then Verify Short Code Type Required Error Message

  Scenario: Enter IVR Short Code name with allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test_Automation-IVR Code123'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999911'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test_Automation-IVR Code123'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code name with max 100 characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'This is Test Automation Test Code This is Test Automation Test Code This is Test Automation TestCode'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999912'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'This is Test Automation Test Code This is Test Automation Test Code This is Test Automation TestCode'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code name with more than 100 characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'This is Test Automation Test Code This is Test Automation Test Code This is Test Automation Test Code'
    Then Verify Short Code Name Max Length Error Message

  Scenario: Enter IVR Short Code name empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as ''
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999900'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Click on Create Button on Short Code Create Page
    Then Verify Short Code Name Required Error Message

  Scenario: Enter IVR Short Code Description with allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code1'
    And Enter Short Code Description as 'This is Description 1234 !@#_-++'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999913'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code1'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Description max 200 allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code2'
    And Enter Short Code Description as 'This is test automation short code description This is test automation short code description This is test automation short code description This is test automation short code description This is test'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999914'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code2'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Description Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code3'
    And Enter Short Code Description as ''
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999915'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Click on Create Button on Short Code Create Page
    Then Verify IVR Short Code Description Required Error Message

  Scenario: Enter IVR Short Code Description with more than 200 characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code0'
    And Enter Short Code Description as 'This is test automation short code description This is test automation short code description This is test automation short code description This is test automation short code description This is test123'
    Then Verify Short Code Description Max Length Error Message

  Scenario: Enter IVR Short Code Flow Name as Valid Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code4'
    And Enter Short Code Description as 'This is Description'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999916'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code4'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Flow Name as Invalid Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code4'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'Invalid Flow'
    Then Verify Flow Validate Error Message

  Scenario: Enter IVR Short Code Flow Name Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Enter Short Code as '999900'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Click on Create Button on Short Code Create Page
    Then Verify Flow Required Error Message

  Scenario: Enter IVR Short Code Code as Numeric Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code5'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999916'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code5'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Code Starts with * Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code011'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '*123456'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code011'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Code Ends with * Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code012'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '123456*'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code012'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Code Starts and Ends with * Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code013'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '*123456*'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code013'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Code with Numeric and * Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code6'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999917*8'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code6'
    Then Delete Created IVR Short Code

  Scenario: Enter Multiple IVR Short Codes separated by Comma
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code7'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '9999180,9999190'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Click on Create Button on Short Code Create Page
    Then Verify Access Code Contains Invalid Characters Error Message

  Scenario: Enter Multiple IVR Short Codes with Comma and * Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code8'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999918*1,999919*2'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Click on Create Button on Short Code Create Page
    Then Verify Access Code Contains Invalid Characters Error Message

  Scenario: Enter IVR Short Code Code Ends with Comma
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '123456,'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Click on Create Button on Short Code Create Page
    Then Verify IVR Short Code Invalid Characters Error Message

  Scenario: Enter IVR Short Code Code Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as ''
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Click on Create Button on Short Code Create Page
    Then Verify Short Code Required Error Message

  Scenario: Enter IVR Short Code Call Type as inbound
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code9'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999920'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code9'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Call Type as outbound
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code10'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999921'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code10'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Call Type Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999900'
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Click on Create Button on Short Code Create Page
    Then Verify IVR Call Type Required Error Message

  Scenario: Enter IVR Short Code Control Type as Full Control
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code11'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999922'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code11'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Control Type as Half Control
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code12'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999923'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Half Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code12'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Control Type as App Control
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code13'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999924'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'App Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code13'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Control Type Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999900'
    And Select IVR Call Type as outbound
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Click on Create Button on Short Code Create Page
    Then Verify IVR Control Type Required Error Message

  Scenario: Enter IVR Short Code Audio Codec Type as G.711 - A Law
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code14'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999925'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code14'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Audio Codec Type as G.711 - μ Law
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code15'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999926'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - μ Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code15'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Audio Codec Type as G.729
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code16'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999927'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.729'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code16'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Audio Codec Type Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code0'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999900'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Full Control'
    And Click on Create Button on Short Code Create Page
    Then Verify IVR Audio Codec Type Required Error Message

  Scenario: Enter IVR Short Code Early Media Check Box Selected
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code17'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999928'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Select IVR Short Code Early Media Check Box
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code17'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code Early Media Check Box Deselected
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code18'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999929'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Deselect IVR Short Code Early Media Check Box
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code18'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code IVR Conferencing Support Check Box Selected
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code19'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999930'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Select IVR Short Code IVR Conferencing Support Check Box
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code19'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code IVR Conferencing Support Check Box Deselected
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code20'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999931'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Deselect IVR Short Code IVR Conferencing Support Check Box
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code20'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code IVR Save Channel Info Check Box Selected
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code21'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999932'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Select IVR Short Code IVR Save Channel Info Check Box
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code21'
    Then Delete Created IVR Short Code

  Scenario: Enter IVR Short Code IVR Save Channel Info Check Box Deselected
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code22'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '999933'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Deselect IVR Short Code IVR Save Channel Info Check Box
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code22'
    Then Delete Created IVR Short Code

## Test Case 04: Verify USSD Access Code Update for Existing Flow

  Scenario: Create USSD Short Code to verify description update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code40'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '888810'
    Then Click on Create Button on Short Code Create Page

  Scenario: Update USSD Short Code - update ussd short code description with allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code40'
    Then Click on USSD Short Code Edit Button
    And Update Short Code Description as 'This is Description 1234 !@#_-++'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update USSD Short Code - update ussd short code description with max 200 allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code40'
    Then Click on USSD Short Code Edit Button
    And Update Short Code Description as 'This is test automation short code description This is test automation short code description This is test automation short code description This is test automation short code description This is test'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update USSD Short Code - update ussd short code description empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code40'
    Then Click on USSD Short Code Edit Button
    And Update Short Code Description as ''
    Then Click on Update Button on Short Code Update UI

  Scenario: Update USSD Short Code - update ussd short code description with more than 200 allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code40'
    Then Click on USSD Short Code Edit Button
    And Update Short Code Description as 'This is test automation short code description This is test automation short code description This is test automation short code description This is test automation short code description This is test123'
    Then Verify Short Code Description Max Length Error Message

  Scenario: Delete Previously Created USSD Short Code to Verify Description Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code40'
    Then Delete Created USSD Short Code

###<---------------------------------------------------------------------------------------------------------------------->

  Scenario: Create USSD Short Code to verify executed flow update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code41'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '888811'
    Then Click on Create Button on Short Code Create Page

  Scenario: Update USSD Short Code - update ussd short code executed flow to valid flow name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code41'
    Then Click on USSD Short Code Edit Button
    And Update Executed Flow from Flow Dropdown List as 'BotFlow 2'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update USSD Short Code - update ussd short code executed flow to invalid flow name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code41'
    Then Click on USSD Short Code Edit Button
    And Update Executed Flow from Flow Dropdown List as 'Invalid Flow'
    Then Verify Flow Validate Error Message

  Scenario: Update USSD Short Code - update ussd short code executed flow to empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code41'
    Then Click on USSD Short Code Edit Button
    And Update Executed Flow as Empty
    Then Verify Flow Required Error Message

  Scenario: Delete Previously Created USSD Short Code to Verify Executed Flow Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code41'
    Then Delete Created USSD Short Code

###<---------------------------------------------------------------------------------------------------------------------->

  Scenario: Create USSD Short Code to verify short code code update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code42'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '888811'
    Then Click on Create Button on Short Code Create Page

  Scenario: Update USSD Short Code - update ussd short code with numeric characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code42'
    Then Click on USSD Short Code Edit Button
    And Update Short Code Code as '8888119'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update USSD Short Code - update ussd short code with invalid characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code42'
    Then Click on USSD Short Code Edit Button
    And Update Short Code Code as 'Abcd!@#_- Xyz'
    Then Verify Short Code Invalid Characters Error Message

  Scenario: Update USSD Short Code - update ussd short code starts with * character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code42'
    Then Click on USSD Short Code Edit Button
    And Update Short Code Code as '*123456'
    Then Verify Short Code Invalid Characters Error Message

  Scenario: Update USSD Short Code - update ussd short code ends with * character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code42'
    Then Click on USSD Short Code Edit Button
    And Update Short Code Code as '123456*'
    Then Verify Short Code Invalid Characters Error Message

  Scenario: Update USSD Short Code - update ussd short code starts and ends with * character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code42'
    Then Click on USSD Short Code Edit Button
    And Update Short Code Code as '*123456*'
    Then Verify Short Code Invalid Characters Error Message

  Scenario: Update USSD Short Code - update ussd short code with numeric and * characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code42'
    Then Click on USSD Short Code Edit Button
    And Update Short Code Code as '8888119*3'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update USSD Short Code - update ussd short code with multiple codes separated by comma
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code42'
    Then Click on USSD Short Code Edit Button
    And Update Short Code Code as '8888119,8888117'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update USSD Short Code - update ussd short code with multiple codes with comma and * characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code42'
    Then Click on USSD Short Code Edit Button
    And Update Short Code Code as '8888119*5,8888117'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update USSD Short Code - update ussd short code with code ends with comma
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code42'
    Then Click on USSD Short Code Edit Button
    And Update Short Code Code as '8888116*5,'
    Then Verify Short Code Invalid Characters Error Message

  Scenario: Update USSD Short Code - update ussd short code empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code42'
    Then Click on USSD Short Code Edit Button
    And Update Short Code Code as ''
    Then Verify Short Code Required Error Message

  Scenario: Delete Previously Created USSD Short Code to Verify Short Code Code Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code42'
    Then Delete Created USSD Short Code

###<---------------------------------------------------------------------------------------------------------------------->

  Scenario: Create USSD Short Code to verify skip menu checkbox update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Test Automation USSD Code45'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '88881120'
    And Select USSD Short Code Skip Menu Check Box
    Then Click on Create Button on Short Code Create Page

  Scenario: Update USSD Short Code - update ussd short code with skip menu checkbox disabled
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code45'
    Then Click on USSD Short Code Edit Button
    And Update USSD Short Code Skip Menu Check Box
    Then Click on Update Button on Short Code Update UI

   Scenario: Update USSD Short Code - update ussd short code with skip menu checkbox enabled
     Given Login to Compose Successfully
     When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
     And Click on Connectors Tab
     And Select Short Codes Tab
     And Select USSD Short Code Tab
     And Search USSD Short Code by Short Code Name 'Test Automation USSD Code45'
     Then Click on USSD Short Code Edit Button
     And Update USSD Short Code Skip Menu Check Box
     Then Click on Update Button on Short Code Update UI

   Scenario: Delete Previously Created USSD Short Code to Verify Short Code Code Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Test Automation USSD Code45'
    Then Delete Created USSD Short Code

## Test Case 05: Verify SMS Access Code Update for Existing Flow

  Scenario: Create SMS Short Code to verify short code description update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code50'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '777710'
    Then Click on Create Button on Short Code Create Page

  Scenario: Update SMS Short Code - update sms short code description with allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code50'
    Then Click on SMS Short Code Edit Button
    And Update Short Code Description as 'This is Description 1234 !@#_-++'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update SMS Short Code - update sms short code description with max 200 allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code50'
    Then Click on SMS Short Code Edit Button
    And Update Short Code Description as 'This is test automation short code description This is test automation short code description This is test automation short code description This is test automation short code description This is test'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update SMS Short Code - update sms short code description empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code50'
    Then Click on SMS Short Code Edit Button
    And Update Short Code Description as ''
    Then Click on Update Button on Short Code Update UI

  Scenario: Update SMS Short Code - update sms short code description with more than 200 allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code50'
    Then Click on SMS Short Code Edit Button
    And Update Short Code Description as 'This is test automation short code description This is test automation short code description This is test automation short code description This is test automation short code description This is test123'
    Then Verify Short Code Description Max Length Error Message

  Scenario: Delete Previously Created SMS Short Code to Verify Description Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code50'
    Then Delete Created SMS Short Code

###<---------------------------------------------------------------------------------------------------------------------->

  Scenario: Create SMS Short Code to verify short code executed flow update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code51'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '777711'
    Then Click on Create Button on Short Code Create Page

  Scenario: Update SMS Short Code - update sms short code executed flow to valid flow name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code51'
    Then Click on SMS Short Code Edit Button
    And Update Executed Flow from Flow Dropdown List as 'BotFlow 2'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update SMS Short Code - update sms short code executed flow to invalid flow name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code51'
    Then Click on SMS Short Code Edit Button
    And Update Executed Flow from Flow Dropdown List as 'Invalid Flow'
    Then Verify Flow Validate Error Message

  Scenario: Update SMS Short Code - update sms short code executed flow to empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code51'
    Then Click on SMS Short Code Edit Button
    And Update Executed Flow as Empty
    Then Verify Flow Required Error Message

  Scenario: Delete Previously Created SMS Short Code to Verify Executed Flow Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code51'
    Then Delete Created SMS Short Code

###<---------------------------------------------------------------------------------------------------------------------->

   Scenario: Create SMS Short Code to verify short code code update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'Test Automation SMS Code52'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '777712'
    Then Click on Create Button on Short Code Create Page

  Scenario: Update SMS Short Code - update sms short code with numeric characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code52'
    Then Click on SMS Short Code Edit Button
    And Update Short Code Code as '8878119'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update SMS Short Code - update sms short code with invalid characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code52'
    Then Click on SMS Short Code Edit Button
    And Update Short Code Code as 'Abcd!@#*_- Xyz'
    Then Verify SMS Short Code Invalid Characters Error Message

  Scenario: Update SMS Short Code - update sms short code starts with * character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code52'
    Then Click on SMS Short Code Edit Button
    And Update Short Code Code as '*123456'
    Then Verify SMS Short Code Invalid Characters Error Message

  Scenario: Update SMS Short Code - update sms short code ends with * character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code52'
    Then Click on SMS Short Code Edit Button
    And Update Short Code Code as '123456*'
    Then Verify SMS Short Code Invalid Characters Error Message

  Scenario: Update SMS Short Code - update sms short code starts and ends with * character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code52'
    Then Click on SMS Short Code Edit Button
    And Update Short Code Code as '*123456*'
    Then Verify SMS Short Code Invalid Characters Error Message

  Scenario: Update SMS Short Code - update sms short code with numeric and * characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code52'
    Then Click on SMS Short Code Edit Button
    And Update Short Code Code as '8888119*3'
    Then Verify SMS Short Code Invalid Characters Error Message

  Scenario: Update SMS Short Code - update sms short code with multiple codes separated by comma
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code52'
    Then Click on SMS Short Code Edit Button
    And Update Short Code Code as '8878119,8878117'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update SMS Short Code - update sms short code with multiple codes with comma and * characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code52'
    Then Click on SMS Short Code Edit Button
    And Update Short Code Code as '8888119*5,8888117'
    Then Verify SMS Short Code Invalid Characters Error Message

  Scenario: Update SMS Short Code - update sms short code with code ends with comma
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code52'
    Then Click on SMS Short Code Edit Button
    And Update Short Code Code as '8888116*5,'
    Then Verify SMS Short Code Invalid Characters Error Message

  Scenario: Update SMS Short Code - update sms short code empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code52'
    Then Click on SMS Short Code Edit Button
    And Update Short Code Code as ''
    Then Verify Short Code Required Error Message

  Scenario: Delete Previously Created SMS Short Code to Verify Short Code Code Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'Test Automation SMS Code52'
    Then Delete Created SMS Short Code

###<---------------------------------------------------------------------------------------------------------------------->

## Test Case 06: Verify IVR Access Code Update for Existing Flow

  Scenario: Create IVR Short Code for Check Description Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code61'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '5555512'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page

  Scenario: Update IVR Short Code - Update IVR Short Code Description with allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code61'
    Then Click on IVR Short Code Edit Button
    And Update Short Code Description as 'This is Description 1234 !@#_-++'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code Description max 200 allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code61'
    Then Click on IVR Short Code Edit Button
    And Update Short Code Description as 'This is test automation short code description This is test automation short code description This is test automation short code description This is test automation short code description This is test'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code Description Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code61'
    Then Click on IVR Short Code Edit Button
    And Update Short Code Description as ''
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code Description with more than 200 characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code61'
    Then Click on IVR Short Code Edit Button
    And Update Short Code Description as 'This is test automation short code description This is test automation short code description This is test automation short code description This is test automation short code description This is test123'
    Then Verify Short Code Description Max Length Error Message

  Scenario: Delete Previously Created IVR Short Code to Verify Short Code Description Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code61'
    Then Delete Created IVR Short Code

##<---------------------------------------------------------------------------------------------------------------------->

  Scenario: Create IVR Short Code for Check Executed Flow Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code62'
    And Enter Short Code Description as 'This is IVR Description'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '5555513'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page

  Scenario: Update IVR Short Code - Update IVR Short Code Executed Flow as Valid Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code62'
    Then Click on IVR Short Code Edit Button
    And Update Executed Flow from Flow Dropdown List as 'BotFlow 2'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code Executed Flow as Invalid Flow Name
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code62'
    Then Click on IVR Short Code Edit Button
    And Update Executed Flow from Flow Dropdown List as 'Invalid Flow'
    Then Verify Flow Validate Error Message

  Scenario: Update IVR Short Code - Update IVR Short Code Executed Flow Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code62'
    Then Click on IVR Short Code Edit Button
    And Update Executed Flow as Empty
    Then Verify Flow Required Error Message

  Scenario: Delete Previously Created IVR Short Code to Verify Executed Flow Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code62'
    Then Delete Created IVR Short Code

##<------------------------------------------------------------------------------------------------------------------------->

  Scenario: Create IVR Short Code for Check Short Code Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code63'
    And Enter Short Code Description as 'This is IVR Description'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '5555514'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page

  Scenario: Update IVR Short Code - Update IVR Short Code Code as Numeric Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code63'
    Then Click on IVR Short Code Edit Button
    And Update Short Code Code as '555551412'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code Code as Invalid Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code63'
    Then Click on IVR Short Code Edit Button
    And Update Short Code Code as 'Abcd!@#_- XyzABC'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code Code Starts with * Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code63'
    Then Click on IVR Short Code Edit Button
    And Update Short Code Code as '*555551412'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code Code Ends with * Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code63'
    Then Click on IVR Short Code Edit Button
    And Update Short Code Code as '555551412*'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code Code Starts and Ends with * Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code63'
    Then Click on IVR Short Code Edit Button
    And Update Short Code Code as '*555551412*'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code Code with Numeric and * Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code63'
    Then Click on IVR Short Code Edit Button
    And Update Short Code Code as '555551412*1'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update with Multiple IVR Short Codes separated by Comma
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code63'
    Then Click on IVR Short Code Edit Button
    And Update Short Code Code as '555551412,555551414'
    And Click on Update Button on Short Code Update UI
    Then Verify IVR Short Code Invalid Characters Error Message

  Scenario: Update IVR Short Code - Update with Multiple IVR Short Codes with * and Comma Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code63'
    Then Click on IVR Short Code Edit Button
    And Update Short Code Code as '555551412*5,555551414'
    And Click on Update Button on Short Code Update UI
    Then Verify IVR Short Code Invalid Characters Error Message

  Scenario: Update IVR Short Code - Update IVR Short Code Code Ends with Comma Character
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code63'
    Then Click on IVR Short Code Edit Button
    And Update Short Code Code as '555551412,'
    And Click on Update Button on Short Code Update UI
    Then Verify IVR Short Code Invalid Characters Error Message

  Scenario: Update IVR Short Code - Update IVR Short Code Code Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code63'
    Then Click on IVR Short Code Edit Button
    And Update Short Code Code as ''
    Then Verify Short Code Required Error Message

  Scenario: Delete Previously Created IVR Short Code to Verify IVR Short Code Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code63'
    Then Delete Created IVR Short Code

##<------------------------------------------------------------------------------------------------------------------------------>

  Scenario: Create IVR Short Code for Check Call Type Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code64'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '5555515'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page

  Scenario: Update IVR Short Code - Update with IVR Short Code Call Type as Outbound
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code64'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code Call Type as OutBound
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update with IVR Short Code Call Type as Inbound
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code64'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code Call Type as Inbound
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update with IVR Short Code Call Type as Both
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code64'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code Call Type as Both
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update with IVR Short Code Call Type Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code64'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code Call Type Empty
    Then Verify IVR Call Type Required Error Message

  Scenario: Delete Previously Created IVR Short Code to Verify IVR Short Code Call Type Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code64'
    Then Delete Created IVR Short Code

##<---------------------------------------------------------------------------------------------------------------------------------->

  Scenario: Create IVR Short Code for Check Control Type Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code65'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '5555516'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page

  Scenario: Update IVR Short Code - Update IVR Short Code Control Type as Half Control
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code65'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code Control Type as 'Half Control'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code Control Type as App Control
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code65'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code Control Type as 'App Control'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code Control Type as Full Control
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code65'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code Control Type as 'Full Control'
    Then Click on Update Button on Short Code Update UI

  Scenario: Delete Previously Created IVR Short Code to Verify IVR Short Code Control Type Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code65'
    Then Delete Created IVR Short Code

##<----------------------------------------------------------------------------------------------------------------------------->

  Scenario: Create IVR Short Code for Check Audio Codec Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code66'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '5555517'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page

  Scenario: Update IVR Short Code - Update IVR Short Code Audio Codec as G.711 - μ Law
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code66'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code Audio Codec as 'G.711 - μ Law'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code Audio Codec as G.729
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code66'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code Audio Codec as 'G.729'
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code Audio Codec as G.729
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code66'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code Audio Codec as 'G.711 - A Law'
    Then Click on Update Button on Short Code Update UI

  Scenario: Delete Previously Created IVR Short Code to Verify IVR Short Code Audio Codec Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code66'
    Then Delete Created IVR Short Code

##<---------------------------------------------------------------------------------------------------------------------------------->

  Scenario: Create IVR Short Code for Check IVR Early Media Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code67'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '5555518'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Select IVR Short Code Early Media Check Box
    Then Click on Create Button on Short Code Create Page

  Scenario: Update IVR Short Code - Update IVR Short Code Early Media Check Box Deselected
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code67'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code Early Media Check Box Deselected
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code Early Media Check Box Deselected
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code67'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code Early Media Check Box Selected
    Then Click on Update Button on Short Code Update UI

  Scenario: Delete Previously Created IVR Short Code to Verify IVR Short Code Early Media Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code67'
    Then Delete Created IVR Short Code

###<--------------------------------------------------------------------------------------------------------------------------------->

  Scenario: Create IVR Short Code for Check IVR Conferencing Support Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code68'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '5555519'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Select IVR Short Code IVR Conferencing Support Check Box
    Then Click on Create Button on Short Code Create Page

  Scenario: Update IVR Short Code - Update IVR Short Code IVR Conferencing Support Check Box Deselected
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code68'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code IVR Conferencing Support Check Box Deselected
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code IVR Conferencing Support Check Box Selected
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code68'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code IVR Conferencing Support Check Box Selected
    Then Click on Update Button on Short Code Update UI

  Scenario: Delete Previously Created IVR Short Code to Verify IVR Short Code IVR Conferencing Support Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code68'
    Then Delete Created IVR Short Code

##<---------------------------------------------------------------------------------------------------------------------------------->

  Scenario: Create IVR Short Code for Check IVR Save Channel Info Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'Test Automation IVR Code69'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '5555520'
    And Select IVR Call Type as outbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    And Select IVR Short Code IVR Save Channel Info Check Box
    Then Click on Create Button on Short Code Create Page

  Scenario: Update IVR Short Code - Update IVR Short Code IVR Save Channel Info Check Box Deselected
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code69'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code IVR Save Channel Info Check Box Deselected
    Then Click on Update Button on Short Code Update UI

  Scenario: Update IVR Short Code - Update IVR Short Code IVR Save Channel Info Check Box Deselected
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code69'
    Then Click on IVR Short Code Edit Button
    And Update IVR Short Code IVR Save Channel Info Check Box Selected
    Then Click on Update Button on Short Code Update UI

  Scenario: Delete Previously Created IVR Short Code to Verify IVR Short Code IVR Save Channel Info Update
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'Test Automation IVR Code69'
    Then Delete Created IVR Short Code

##<-------------------------------------------------------------------------------------------------------------------------------------->

## Test Case 07: Verify USSD Access Code View for Existing Flow

  Scenario: View USSD Short Code
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'View Test Automation USSD Code'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '9999101'
    Then Click on Create Button on Short Code Create Page
    And Search USSD Short Code by Short Code Name 'View Test Automation USSD Code'
    Then View Previously Created USSD Short Code
    And Verify USSD Short Code View Mode
    And Click Close Button on USSD Short Code View
    And Search USSD Short Code by Short Code Name 'View Test Automation USSD Code'
    Then Delete Created USSD Short Code After View

## Test Case 08: Verify IVR Access Code View for Existing Flow

  Scenario: View IVR Short Code
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'View Test Automation IVR Code'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '9999101'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page
    And Search IVR Short Code by Short Code Name 'View Test Automation IVR Code'
    Then View Previously Created IVR Short Code
    And Verify IVR Short Code View Mode
    And Click Close Button on IVR Short Code View
    And Search IVR Short Code by Short Code Name 'View Test Automation IVR Code'
    Then Delete Created IVR Short Code After View

## Test Case 09: Verify SMS Access Code View for Existing Flow

  Scenario: View SMS Short Code
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'View Test Automation SMS Code'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '9999105'
    Then Click on Create Button on Short Code Create Page
    And Search SMS Short Code by Short Code Name 'View Test Automation SMS Code'
    Then View Previously Created SMS Short Code
    And Verify SMS Short Code View Mode
    And Click Close Button on SMS Short Code View
    And Search SMS Short Code by Short Code Name 'View Test Automation SMS Code'
    Then Delete Created SMS Short Code After View

## Test Case 10: Goto Flow Option in USSD Short Code

  Scenario: Goto Flow Option in USSD Short Code
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'Go To Option USSD'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '9999110'
    Then Click on Create Button on Short Code Create Page
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Go To Option USSD'
    And Click on USSD Short Code Goto Flow Option
    Then Verify USSD Short Code Goto Flow Name as 'BotFlow 1'
    And Select Agents Tab
    And Click on Connectors Tab
    And Select Short Codes Tab
    Then Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'Go To Option USSD'
    Then Delete Created USSD Short Code

## Test Case 11: Goto Flow Option in SMS Short Code

   Scenario: Goto Flow Option in SMS Short Code
     Given Login to Compose Successfully
     When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
     And Click on Connectors Tab
     And Select Short Codes Tab
     And Click on Create Short Code button
     Then Enter Short Code Type as 'SMS'
     And Enter Short Code Name as 'Go To Option SMS'
     And Enter Short Code Description as 'This is Test Automation Test Code'
     And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
     And Enter Short Code as '9999111'
     Then Click on Create Button on Short Code Create Page
     And Select SMS Short Code Tab
     And Search SMS Short Code by Short Code Name 'Go To Option SMS'
     And Click on SMS Short Code Goto Flow Option
     Then Verify SMS Short Code Goto Flow Name as 'BotFlow 1'
     And Select Agents Tab
     And Click on Connectors Tab
     And Select Short Codes Tab
     Then Select SMS Short Code Tab
     And Search SMS Short Code by Short Code Name 'Go To Option SMS'
     Then Delete Created SMS Short Code

## Test Case 12: Goto Flow Option in IVR Short Code

   Scenario: Goto Flow Option in IVR Short Code
     Given Login to Compose Successfully
     When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
     And Click on Connectors Tab
     And Select Short Codes Tab
     And Click on Create Short Code button
     Then Enter Short Code Type as 'IVR'
     And Enter Short Code Name as 'Go To Option IVR'
     And Enter Short Code Description as 'This is Test Automation Test Code'
     And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
     And Enter Short Code as '9999112'
     And Select IVR Call Type as inbound
     And Select IVR Control Type as 'Full Control'
     And Select IVR Audio Codec Type as 'G.711 - A Law'
     Then Click on Create Button on Short Code Create Page
     And Select IVR Short Code Tab
     And Search IVR Short Code by Short Code Name 'Go To Option IVR'
     And Click on IVR Short Code Goto Flow Option
     Then Verify IVR Short Code Goto Flow Name as 'BotFlow 1'
     And Select Agents Tab
     And Click on Connectors Tab
     And Select Short Codes Tab
     Then Select IVR Short Code Tab
     And Search IVR Short Code by Short Code Name 'Go To Option IVR'
     Then Delete Created IVR Short Code



