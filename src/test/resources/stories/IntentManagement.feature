 Feature: Intent Management

## Test Case 1: Verify Intent Creation

  Scenario: Intent Name with Max 32 Allowed Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent1234567'
    And Enter Intent Management Training Phrase as 'test phrase'
    And Click on Add New Intent Training Phrase Button
    Then Click on Create Button on Intent Management Intent Create Page
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent1234567'
    Then Delete Created Intent Management Intent

  Scenario: Intent Name with Underscore
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose_Automation_Intent01'
    And Enter Intent Management Training Phrase as 'test phrase'
    And Click on Add New Intent Training Phrase Button
    Then Click on Create Button on Intent Management Intent Create Page
    And Search Intent Management Intent by Intent Name 'Compose_Automation_Intent01'
    Then Delete Created Intent Management Intent

  Scenario: Intent Name with Hyphen
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose-Automation-Intent01'
    And Enter Intent Management Training Phrase as 'test phrase'
    And Click on Add New Intent Training Phrase Button
    Then Click on Create Button on Intent Management Intent Create Page
    And Search Intent Management Intent by Intent Name 'Compose-Automation-Intent01'
    Then Delete Created Intent Management Intent

  Scenario: Intent Name with Not Allowed Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as '!@#$%^&*()+='
    Then Verify Intent Management Intent Name Allowed Characters Error Message

  Scenario: Intent Name Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as ' '
    Then Verify Intent Management Intent Name Required Error Message

  Scenario: Intent Name with More Than 32 Allowed Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent12345678910'
    Then Verify Intent Management Intent Name Max Length Error Message

  Scenario: Intent Training Phrase with Max 200 Allowed Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent2'
    And Enter Intent Management Training Phrase as 'Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent 123@#$'
    And Click on Add New Intent Training Phrase Button
    Then Click on Create Button on Intent Management Intent Create Page
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent2'
    Then Delete Created Intent Management Intent

  Scenario: Intent Training Phrase Greater Than Max 200 Allowed Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent0'
    And Enter Intent Management Training Phrase as 'Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent 123@#$%^&*()'
    Then Verify Intent Management Intent Training Phrase Max Length Error Message

  Scenario: Intent Training Phrase Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent0'
    And Enter Intent Management Training Phrase as ' '
    Then Verify Intent Management Intent Training Phrase Required Error Message

  Scenario: Multiple Training Phrases
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent3'
    And Enter Intent Management Training Phrase as 'Training Phrase1'
    And Click on Add New Intent Training Phrase Button
    And Enter Intent Management Training Phrase as 'Training Phrase2'
    And Click on Add New Intent Training Phrase Button
    And Enter Intent Management Training Phrase as 'Training Phrase3'
    And Click on Add New Intent Training Phrase Button
    Then Click on Create Button on Intent Management Intent Create Page
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent3'
    Then Delete Created Intent Management Intent

  Scenario: Same Training Phrase for Multiple Times
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent0'
    And Enter Intent Management Training Phrase as 'Training Phrase1'
    And Click on Add New Intent Training Phrase Button
    And Enter Intent Management Training Phrase as 'Training Phrase1'
    Then Verify Duplicate Intent Management Intent Training Phrase Error Message

  Scenario: Same Training Phrase with Different Case for Multiple Times
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent0'
    And Enter Intent Management Training Phrase as 'Training Phrase1'
    And Click on Add New Intent Training Phrase Button
    And Enter Intent Management Training Phrase as 'training phrase1'
    Then Verify Duplicate Intent Management Intent Training Phrase Error Message

## Test Case 2: Verify Intent Update

  Scenario: Update Intent Name with Max 32 Allowed Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent4'
    And Enter Intent Management Training Phrase as 'test phrase'
    And Click on Add New Intent Training Phrase Button
    Then Click on Create Button on Intent Management Intent Create Page
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent4'
    Then Click on Intent Management Intent Update Button
    And Update Intent Management Intent Name as 'Compose Automation Intent Intent'
    Then Click on Update Button in Intent Management Intent Update Page
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent Intent'
    Then Delete Created Intent Management Intent

##<-------------------------------------------------------------------------------------------------------------------->

  Scenario: Update Intent Name with Not Allowed Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent5'
    And Enter Intent Management Training Phrase as 'test phrase'
    And Click on Add New Intent Training Phrase Button
    Then Click on Create Button on Intent Management Intent Create Page
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent5'
    Then Click on Intent Management Intent Update Button
    And Update Intent Management Intent Name as '!@#$%^&*()-_+='
    Then Verify Intent Management Intent Name Allowed Characters Error Message

  Scenario: Update Intent Name Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent5'
    Then Click on Intent Management Intent Update Button
    And Update Intent Management Intent Name as ''
    Then Verify Intent Name Required Error Message

  Scenario: Update Intent Name with more than 32 allowed characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent5'
    Then Click on Intent Management Intent Update Button
    And Update Intent Management Intent Name as 'Compose Automation Intent Intent1234'
    Then Verify Intent Name Max Length Error Message
    And Click on Back Button on Intent Update Page
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent5'
    Then Delete Created Intent Management Intent

##<----------------------------------------------------------------------------------------------------------------->

  Scenario: Update Intent Name with Underscore
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent8'
    And Enter Intent Management Training Phrase as 'test phrase'
    And Click on Add New Intent Training Phrase Button
    Then Click on Create Button on Intent Management Intent Create Page
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent8'
    Then Click on Intent Management Intent Update Button
    And Update Intent Management Intent Name as 'Compose_Automation_Intent8'
    Then Click on Update Button in Intent Management Intent Update Page
    And Search Intent Management Intent by Intent Name 'Compose_Automation_Intent8'
    Then Delete Created Intent Management Intent

  Scenario: Update Intent Name with Hyphen
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent9'
    And Enter Intent Management Training Phrase as 'test phrase'
    And Click on Add New Intent Training Phrase Button
    Then Click on Create Button on Intent Management Intent Create Page
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent9'
    Then Click on Intent Management Intent Update Button
    And Update Intent Management Intent Name as 'Compose-Automation-Intent9'
    Then Click on Update Button in Intent Management Intent Update Page
    And Search Intent Management Intent by Intent Name 'Compose-Automation-Intent9'
    Then Delete Created Intent Management Intent

##<--------------------------------------------------------------------------------------------------------------------->

  Scenario: Update Intent Training Phrase with Max 200 Allowed Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent6'
    And Enter Intent Management Training Phrase as 'test phrase'
    And Click on Add New Intent Training Phrase Button
    Then Click on Create Button on Intent Management Intent Create Page
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent6'
    Then Click on Intent Management Intent Update Button
    And Update Intent Management Intent Training Phrase as 'Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent 123@#$'
    And Click on Intent Training Phrase Update Button
    Then Click on Update Button in Intent Management Intent Update Page
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent6'
    Then Delete Created Intent Management Intent

##<--------------------------------------------------------------------------------------------------------------------->

  Scenario: Update Intent Training Phrase with greater than 200 Allowed Characters
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent6'
    And Enter Intent Management Training Phrase as 'test phrase'
    And Click on Add New Intent Training Phrase Button
    Then Click on Create Button on Intent Management Intent Create Page
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent6'
    Then Click on Intent Management Intent Update Button
    And Update Intent Management Intent Training Phrase as 'Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent 12345678@#$'
    Then Verify Training Phrase Max Length Error Message

  Scenario: Update Intent Training Phrase Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent6'
    Then Click on Intent Management Intent Update Button
    And Update Intent Management Intent Training Phrase as ''
    Then Verify Training Phrase Required Error Message

  Scenario: Update Intent Training Phrase with Same Phrase Multiple Times
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent6'
    Then Click on Intent Management Intent Update Button
    And Enter Intent Management Training Phrase as 'test phrase' in Intent Update
    Then Verify Duplicate Training Phrase Error Message

  Scenario: Update Intent Training Phrase with Same Phrase having Case Sensitivity Multiple
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent6'
    Then Click on Intent Management Intent Update Button
    And Enter Intent Management Training Phrase as 'Test Phrase' in Intent Update
    Then Verify Duplicate Training Phrase Error Message

  Scenario: Update Intent Training Phrase by Adding New Training Phrase
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent6'
    Then Click on Intent Management Intent Update Button
    And Enter Intent Management Training Phrase as 'test phrase 1' in Intent Update
    And Click on Add New Phrase Button in Intent Management Intent Update
    Then Click on Update Button in Intent Management Intent Update Page

  Scenario: Update Intent Training Phrase by Deleting Existing Training Phrase
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent6'
    Then Click on Intent Management Intent Update Button
    And Click Delete Button in Intent Management Intent Update
    Then Click on Update Button in Intent Management Intent Update Page

  Scenario: Update Intent Training Phrase by Deleting All Training Phrases
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent6'
    Then Click on Intent Management Intent Update Button
    And Click Delete Button in Intent Management Intent Update
    Then Verify Intent Management Intent Update Button is Disabled

  Scenario: Delete Previously Created Intent
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent6'
    Then Delete Created Intent Management Intent

## Test Case 3: Verify Intent View

  Scenario: View Previously Created Intent
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'View Compose Common Intent'
    And Enter Intent Management Training Phrase as 'test phrase'
    And Click on Add New Intent Training Phrase Button
    Then Click on Create Button on Intent Management Intent Create Page
    And Search Intent Management Intent by Intent Name 'View Compose Common Intent'
    Then View Previously Created Common Intent
    And Verify Intent Management Intent View Mode
    And Click Close Button on Intent Management Intent View
    And Search Intent Management Intent by Intent Name 'View Compose Common Intent'
    Then Delete Created Intent Management Intent

## Test Case 4: Verify Copy Intent Code

  Scenario: Copy Intent Code from List Intent Management UI
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent7'
    And Enter Intent Management Training Phrase as 'test phrase'
    And Click on Add New Intent Training Phrase Button
    Then Click on Create Button on Intent Management Intent Create Page
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent7'
    And Click on Copy Code icon
    And Verify Successful Copy Action
    Then Delete Created Intent Management Intent

  Scenario: Copy Intent Code from Update Intent Management Intents UI
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Intent Management Tab
    Then Click on Create Intent Button on Intent Management Page
    And Enter Intent Management Intent Name as 'Compose Automation Intent8'
    And Enter Intent Management Training Phrase as 'test phrase'
    And Click on Add New Intent Training Phrase Button
    Then Click on Create Button on Intent Management Intent Create Page
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent8'
    Then Click on Intent Management Intent Update Button
    And Click on Copy Code icon on Common Intent Update Page
    Then Verify Successful Copy Action from Common Intent Update Page
    And Click on Back Button on Intent Update Page
    And Search Intent Management Intent by Intent Name 'Compose Automation Intent8'
    Then Delete Created Intent Management Intent