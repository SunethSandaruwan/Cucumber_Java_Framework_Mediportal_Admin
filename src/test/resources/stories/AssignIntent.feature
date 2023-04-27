Feature: Assign Intent

## Test Case 01: Assign Intent

  Scenario: Assign Intent Select Intent
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3''
    And Click on Connectors Tab
    And Click on Assign Intents Tab
    Then Click on Assign An Intent Button
    And Select Assign an Intent Intent as 'Dymmy Intent Test01'
    And Select Assign an Intent Flow as 'BotFlow 1'
    Then Click on Assign Button on Assign an Intent UI
    And Search Assign Intent by Intent Name 'Dymmy Intent Test01'
    Then Unassigned Previously Assigned Intent

   Scenario: Assign Intent Intent Empty
     Given Login to Compose Successfully
     When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3''
     And Click on Connectors Tab
     And Click on Assign Intents Tab
     Then Click on Assign An Intent Button
     And Select Assign an Intent Flow as 'BotFlow 1'
     And Click on Assign Button on Assign an Intent UI
     Then Verify Assign an Intent Intent Required Error Message

  Scenario: Assign Intent Select Flow
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3''
    And Click on Connectors Tab
    And Click on Assign Intents Tab
    Then Click on Assign An Intent Button
    And Select Assign an Intent Intent as 'Dymmy Intent Test01'
    And Select Assign an Intent Flow as 'BotFlow 1'
    Then Click on Assign Button on Assign an Intent UI
    And Search Assign Intent by Intent Name 'Dymmy Intent Test01'
    Then Unassigned Previously Assigned Intent

  Scenario: Assign Intent Flow Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3''
    And Click on Connectors Tab
    And Click on Assign Intents Tab
    Then Click on Assign An Intent Button
    And Select Assign an Intent Intent as 'Dymmy Intent Test01'
    And Click on Assign Button on Assign an Intent UI
    Then Verify Assign an Intent Flow Required Error Message

  Scenario: Assign Another Intent Checkbox Empty
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3''
    And Click on Connectors Tab
    And Click on Assign Intents Tab
    Then Click on Assign An Intent Button
    And Select Assign an Intent Intent as 'Dymmy Intent Test01'
    And Select Assign an Intent Flow as 'BotFlow 1'
    Then Click on Assign Button on Assign an Intent UI
    And Search Assign Intent by Intent Name 'Dymmy Intent Test01'
    Then Unassigned Previously Assigned Intent

   Scenario: Select Assign Another Intent Checkbox
     Given Login to Compose Successfully
     When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3''
     And Click on Connectors Tab
     And Click on Assign Intents Tab
     Then Click on Assign An Intent Button
     And Select Assign an Intent Intent as 'Dymmy Intent Test01'
     And Select Assign an Intent Flow as 'BotFlow 1'
     And Select Assign Another Intent Checkbox Enabled
     Then Click on Assign Button on Assign an Intent UI
     And Select Assign an Intent Intent as 'Dymmy Intent Test02'
     And Select Assign an Intent Flow as 'BotFlow 2'
     Then Click on Assign Button on Assign an Intent UI
     And Search Assign Intent by Intent Name 'Dymmy Intent Test01'
     Then Unassigned Previously Assigned Intent
     And Click on Close Button on Assign Intent UI
     And Search Assign Intent by Intent Name 'Dymmy Intent Test02'
     Then Unassigned Previously Assigned Intent

## Test Case 02: Update Assign Intent

  Scenario: Update Assign Intent Intent
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3''
    And Click on Connectors Tab
    And Click on Assign Intents Tab
    Then Click on Assign An Intent Button
    And Select Assign an Intent Intent as 'Dymmy Intent Test01'
    And Select Assign an Intent Flow as 'BotFlow 1'
    Then Click on Assign Button on Assign an Intent UI
    And Click on Assigned Intent Edit Button
    And Update Assign an Intent Intent as 'Dymmy Intent Test02'
    Then Click on Update Button on Assign Intent Update UI
    And Search Assign Intent by Intent Name 'Dymmy Intent Test02'
    Then Unassigned Previously Assigned Intent
    And Click on Close Button on Assign Intent UI
    And Search Assign Intent by Intent Name 'Dymmy Intent Test01'
    Then Unassigned Previously Assigned Intent

   Scenario: Update Assign Intent Intent Empty
     Given Login to Compose Successfully
     When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3''
     And Click on Connectors Tab
     And Click on Assign Intents Tab
     Then Click on Assign An Intent Button
     And Select Assign an Intent Intent as 'Dymmy Intent Test01'
     And Select Assign an Intent Flow as 'BotFlow 1'
     Then Click on Assign Button on Assign an Intent UI
     And Click on Assigned Intent Edit Button
     And Update Assign an Intent as Empty Intent as '- Select an intent -'
     Then Verify Assign an Intent Intent Required Error Message
     And Click on Close Button on Assign Intent Update UI
     And Search Assign Intent by Intent Name 'Dymmy Intent Test01'
     Then Unassigned Previously Assigned Intent

  Scenario: Update Assign Intent Flow
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3''
    And Click on Connectors Tab
    And Click on Assign Intents Tab
    Then Click on Assign An Intent Button
    And Select Assign an Intent Intent as 'Dymmy Intent Test01'
    And Select Assign an Intent Flow as 'BotFlow 1'
    Then Click on Assign Button on Assign an Intent UI
    And Click on Assigned Intent Edit Button
    And Update Assign an Intent Flow as 'BotFlow 2'
    Then Click on Update Button on Assign Intent Update UI
    And Search Assign Intent by Intent Name 'Dymmy Intent Test01'
    Then Unassigned Previously Assigned Intent

   Scenario: Update Assign Intent Flow Empty
     Given Login to Compose Successfully
     When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3''
     And Click on Connectors Tab
     And Click on Assign Intents Tab
     Then Click on Assign An Intent Button
     And Select Assign an Intent Intent as 'Dymmy Intent Test01'
     And Select Assign an Intent Flow as 'BotFlow 1'
     Then Click on Assign Button on Assign an Intent UI
     And Click on Assigned Intent Edit Button
     And Update Assign an Intent as Empty Flow as '- Select an intent -'
     Then Verify Assign an Intent Flow Required Error Message
     And Click on Close Button on Assign Intent Update UI
     And Search Assign Intent by Intent Name 'Dymmy Intent Test01'
     Then Unassigned Previously Assigned Intent

## Test Case 03: Unassigned Assign Intent

  Scenario: Unassigned an Assigned Intent
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3''
    And Click on Connectors Tab
    And Click on Assign Intents Tab
    Then Click on Assign An Intent Button
    And Select Assign an Intent Intent as 'Dymmy Intent Test01'
    And Select Assign an Intent Flow as 'BotFlow 1'
    Then Click on Assign Button on Assign an Intent UI
    And Search Assign Intent by Intent Name 'Dymmy Intent Test01'
    Then Unassigned Previously Assigned Intent

## Test Case 04: View Assigned Intent

   Scenario: View an Assigned Intent
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3''
    And Click on Connectors Tab
    And Click on Assign Intents Tab
    Then Click on Assign An Intent Button
    And Select Assign an Intent Intent as 'Dymmy Intent Test01'
    And Select Assign an Intent Flow as 'BotFlow 1'
    Then Click on Assign Button on Assign an Intent UI
    And Click to View Assigned Intent
    Then Click on Close Button on Assign Intent View UI
    And Search Assign Intent by Intent Name 'Dymmy Intent Test01'
    Then Unassigned Previously Assigned Intent

## Test Case 05: Goto Flow Option in Assign Intent

  Scenario: Goto Flow Option in Assign Intent
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3''
    And Click on Connectors Tab
    And Click on Assign Intents Tab
    Then Click on Assign An Intent Button
    And Select Assign an Intent Intent as 'Dymmy Intent Test01'
    And Select Assign an Intent Flow as 'BotFlow 1'
    Then Click on Assign Button on Assign an Intent UI
    And Search Assign Intent by Intent Name 'Dymmy Intent Test01'
    And Click on Assign Intent Goto Flow Option
    Then Verify Assign Intent Goto Flow Name as 'BotFlow 1'
    And Select Agents Tab
    And Click on Connectors Tab
    And Click on Assign Intents Tab
    And Search Assign Intent by Intent Name 'Dymmy Intent Test01'
    Then Unassigned Previously Assigned Intent
