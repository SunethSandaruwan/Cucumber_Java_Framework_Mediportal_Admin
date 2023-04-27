Feature: Training Phrase Management

## Test Case 01: Ignore Training Phrase

  Scenario: Ignore Training Phrase
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Training Tab
    And Click on Unresolved Requests Tab
    Then Search Training Phrase as 'delightful lobster'
    And Click on Ignore Button on Training Phrase
    And Click on Yes Button on Ignore Training Phrase Confirmation Message
    Then Verify Phrase Successfully Ignored Message

## Test Case 02: Un Ignore Training Phrase

  Scenario: Un Ignore Training Phrase
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Training Tab
    And Click on Ignored Requests Tab
    Then Search Training Phrase as 'delightful lobster'
    And Click on Un Ignore Button on Training Phrase
    And Click on Yes Button on Un Ignore Training Phrase Confirmation Message
    Then Verify Phrase Successfully Un Ignored Message