# Feature: Intent Management
#
## Test Case 1: Verify Intent Creation for Existing Flow
#
#  Scenario: Intent Name with Max 32 Allowed Characters
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as 'Compose Automation Intent1234567'
#    And Select Flow from Flow Dropdown List as 'BotFlow 1'
#    And Enter Training Phrase as 'test phrase'
#    And Click on Add New Phrase Button
#    Then Click on Create Button on Intent Create Page
#    And Search Intent by Intent Name 'Compose Automation Intent1234567'
#    Then Delete Created Intent
#
#  Scenario: Intent Name with Not Allowed Characters
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as '!@#$%^&*()-_+='
#    Then Verify Intent Name Allowed Characters Error Message
#
#  Scenario: Intent Name Empty
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as ' '
#    Then Verify Intent Name Required Error Message
#
#  Scenario: Intent Name with More Than 32 Allowed Characters
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as 'Compose Automation Intent12345678910'
#    Then Verify Intent Name Max Length Error Message
#
#  Scenario: Intent flow name not empty
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as 'Compose Automation Intent1'
#    And Select Flow from Flow Dropdown List as 'BotFlow 1'
#    And Enter Training Phrase as 'test phrase'
#    And Click on Add New Phrase Button
#    Then Click on Create Button on Intent Create Page
#    And Search Intent by Intent Name 'Compose Automation Intent1'
#    Then Delete Created Intent
#
#  Scenario: Intent Training Phrase with Max 200 Allowed Characters
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as 'Compose Automation Intent2'
#    And Select Flow from Flow Dropdown List as 'BotFlow 1'
#    And Enter Training Phrase as 'Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent 123@#$'
#    And Click on Add New Phrase Button
#    Then Click on Create Button on Intent Create Page
#    And Search Intent by Intent Name 'Compose Automation Intent2'
#    Then Delete Created Intent
#
#  Scenario: Intent Training Phrase Greater Than Max 200 Allowed Characters
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as 'Compose Automation Intent0'
#    And Select Flow from Flow Dropdown List as 'BotFlow 1'
#    And Enter Training Phrase as 'Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent 123@#$%^&*()'
#    Then Verify Training Phrase Max Length Error Message
#
#  Scenario: Intent Training Phrase Empty
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as 'Compose Automation Intent0'
#    And Select Flow from Flow Dropdown List as 'BotFlow 1'
#    And Enter Training Phrase as ' '
#    Then Verify Training Phrase Required Error Message
#
#  Scenario: Multiple Training Phrases
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as 'Compose Automation Intent3'
#    And Select Flow from Flow Dropdown List as 'BotFlow 1'
#    And Enter Training Phrase as 'Training Phrase1'
#    And Click on Add New Phrase Button
#    And Enter Training Phrase as 'Training Phrase2'
#    And Click on Add New Phrase Button
#    And Enter Training Phrase as 'Training Phrase3'
#    And Click on Add New Phrase Button
#    Then Click on Create Button on Intent Create Page
#    And Search Intent by Intent Name 'Compose Automation Intent3'
#    Then Delete Created Intent
#
#  Scenario: Same Training Phrase for Multiple Times
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as 'Compose Automation Intent0'
#    And Select Flow from Flow Dropdown List as 'BotFlow 1'
#    And Enter Training Phrase as 'Training Phrase1'
#    And Click on Add New Phrase Button
#    And Enter Training Phrase as 'Training Phrase1'
#    Then Verify Duplicate Training Phrase Error Message
#
#  Scenario: Same Training Phrase with Different Case for Multiple Times
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as 'Compose Automation Intent0'
#    And Select Flow from Flow Dropdown List as 'BotFlow 1'
#    And Enter Training Phrase as 'Training Phrase1'
#    And Click on Add New Phrase Button
#    And Enter Training Phrase as 'training phrase1'
#    Then Verify Duplicate Training Phrase Error Message
#
## Test Case 2: Verify Intent Update for Existing Flow
#
#  Scenario: Update Intent Name with Max 32 Allowed Characters
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as 'Compose Automation Intent4'
#    And Select Flow from Flow Dropdown List as 'BotFlow 1'
#    And Enter Training Phrase as 'test phrase'
#    And Click on Add New Phrase Button
#    Then Click on Create Button on Intent Create Page
#    And Search Intent by Intent Name 'Compose Automation Intent4'
#    Then Click on Intent Update Button
#    And Update Intent Name as 'Compose Automation Intent Intent'
#    Then Click on Update Button in Intent Update Page
#    And Search Intent by Intent Name 'Compose Automation Intent Intent'
#    Then Delete Created Intent
#
###<-------------------------------------------------------------------------------------------------------------------->
#
#  Scenario: Update Intent Name with Not Allowed Characters
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as 'Compose Automation Intent5'
#    And Select Flow from Flow Dropdown List as 'BotFlow 1'
#    And Enter Training Phrase as 'test phrase'
#    And Click on Add New Phrase Button
#    Then Click on Create Button on Intent Create Page
#    And Search Intent by Intent Name 'Compose Automation Intent5'
#    Then Click on Intent Update Button
#    And Update Intent Name as '!@#$%^&*()-_+='
#    Then Verify Intent Name Allowed Characters Error Message
#
#  Scenario: Update Intent Name Empty
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    And Search Intent by Intent Name 'Compose Automation Intent5'
#    Then Click on Intent Update Button
#    And Update Intent Name as ''
#    Then Verify Intent Name Required Error Message
#
#  Scenario: Update Intent Name with more than 32 allowed characters
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    And Search Intent by Intent Name 'Compose Automation Intent5'
#    Then Click on Intent Update Button
#    And Update Intent Name as 'Compose Automation Intent Intent1234'
#    Then Verify Intent Name Max Length Error Message
#
#  Scenario: Update Intent Flow Name
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    And Search Intent by Intent Name 'Compose Automation Intent5'
#    Then Click on Intent Update Button
#    And Update Intent Flow Name as 'BotFlow 2'
#    Then Click on Update Button in Intent Update Page
#    And Search Intent by Intent Name 'Compose Automation Intent5'
#    Then Delete Created Intent
#
###<--------------------------------------------------------------------------------------------------------------------->
#
#  Scenario: Update Intent Training Phrase with Max 200 Allowed Characters
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as 'Compose Automation Intent6'
#    And Select Flow from Flow Dropdown List as 'BotFlow 1'
#    And Enter Training Phrase as 'test phrase'
#    And Click on Add New Phrase Button
#    Then Click on Create Button on Intent Create Page
#    And Search Intent by Intent Name 'Compose Automation Intent6'
#    Then Click on Intent Update Button
#    And Update Intent Training Phrase as 'Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent 123@#$'
#    And Click on Training Phrase Update Button
#    Then Click on Update Button in Intent Update Page
#    And Search Intent by Intent Name 'Compose Automation Intent6'
#    Then Delete Created Intent
#
###<--------------------------------------------------------------------------------------------------------------------->
#
#  Scenario: Update Intent Training Phrase with greater than 200 Allowed Characters
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as 'Compose Automation Intent6'
#    And Select Flow from Flow Dropdown List as 'BotFlow 1'
#    And Enter Training Phrase as 'test phrase'
#    And Click on Add New Phrase Button
#    Then Click on Create Button on Intent Create Page
#    And Search Intent by Intent Name 'Compose Automation Intent6'
#    Then Click on Intent Update Button
#    And Update Intent Training Phrase as 'Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent Training Phrase Compose Automation Intent 12345678@#$'
#    Then Verify Training Phrase Max Length Error Message
#
#  Scenario: Update Intent Training Phrase Empty
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    And Search Intent by Intent Name 'Compose Automation Intent6'
#    Then Click on Intent Update Button
#    And Update Intent Training Phrase as ''
#    Then Verify Training Phrase Required Error Message
#
#  Scenario: Update Intent Training Phrase with Same Phrase Multiple Times
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    And Search Intent by Intent Name 'Compose Automation Intent6'
#    Then Click on Intent Update Button
#    And Enter Training Phrase as 'test phrase' in Intent Update
#    Then Verify Duplicate Training Phrase Error Message
#
#  Scenario: Update Intent Training Phrase with Same Phrase having Case Sensitivity Multiple
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    And Search Intent by Intent Name 'Compose Automation Intent6'
#    Then Click on Intent Update Button
#    And Enter Training Phrase as 'Test Phrase' in Intent Update
#    Then Verify Duplicate Training Phrase Error Message
#
#  Scenario: Update Intent Training Phrase by Adding New Training Phrase
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    And Search Intent by Intent Name 'Compose Automation Intent6'
#    Then Click on Intent Update Button
#    And Enter Training Phrase as 'test phrase 1' in Intent Update
#    And Click on Add New Phrase Button in Intent Update
#    Then Click on Update Button in Intent Update Page
#
#  Scenario: Update Intent Training Phrase by Deleting Existing Training Phrase
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    And Search Intent by Intent Name 'Compose Automation Intent6'
#    Then Click on Intent Update Button
#    And Click Delete Button in Intent Update
#    Then Click on Update Button in Intent Update Page
#
#  Scenario: Update Intent Training Phrase by Deleting All Training Phrases
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    And Search Intent by Intent Name 'Compose Automation Intent6'
#    Then Click on Intent Update Button
#    And Click Delete Button in Intent Update
#    Then Verify Update Button is Disabled
#
#  Scenario: Delete Previously Created Intent
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    And Search Intent by Intent Name 'Compose Automation Intent6'
#    Then Delete Created Intent
#
## Test Case 3: Verify Intent View for Existing Flow
#
#  Scenario: View Intent
#    Given Login to Compose Successfully
#    When Select Agent from Agent Drop Down List as 'Compose Test Automation Agent3'
#    And Click on Triggers Tab
#    And Select Intents Tab
#    Then Click on Create Intent Button
#    And Enter Intent Name as 'View Compose Automation Intent'
#    And Select Flow from Flow Dropdown List as 'BotFlow 1'
#    And Enter Training Phrase as 'test phrase'
#    And Click on Add New Phrase Button
#    Then Click on Create Button on Intent Create Page
#    And Search Intent by Intent Name 'View Compose Automation Intent'
#    Then View Previously Created Intent
#    And Verify Intent View Mode
#    And Click Close Button on Intent View
#    And Search Intent by Intent Name 'View Compose Automation Intent'
#    Then Delete Created Intent
