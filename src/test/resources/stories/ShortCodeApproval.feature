 Feature: Short Code Requests

# Test Case 01: Approval Process of USSD Short Code

  Scenario: Create USSD Short Code to Test Approve USSD Short Code
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'USSD Code Approval'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '788810'
    Then Click on Create Button on Short Code Create Page

  Scenario: Approve USSD Short Code
    Given Login to Compose Successfully
    When Click on Approvals Icon in Compose
    And Click on Short Code Requests Tab in Compose
    And Select USSD Short Code Tab in Short Code Approval
    And Search Short Code by Short Code '788810'
    And Click on USSD Short Code Approve Icon
    Then Click on Yes Button on USSD Short Code Approve Confirmation Message

  Scenario: Delete Previously Created USSD Short Code to Verify USSD Short Code Approval
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'USSD Code Approval'
    Then Delete Created USSD Short Code

# Test Case 02: Reject Process of USSD Short Code

  Scenario: Create USSD Short Code to Test Reject USSD Short Code
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'USSD Code Reject'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '788811'
    Then Click on Create Button on Short Code Create Page

  Scenario: Reject USSD Short Code
    Given Login to Compose Successfully
    When Click on Approvals Icon in Compose
    And Click on Short Code Requests Tab in Compose
    And Select USSD Short Code Tab in Short Code Approval
    And Search Short Code by Short Code '788811'
    Then Click on USSD Short Code Reject Icon
    And Enter Reject Short Code Request Comment as 'No Use'
    And Click on Submit Button on Reject Short Code Request Comment
    Then Click on Yes Button on USSD Short Code Reject Confirmation Message

  Scenario: Delete Previously Created USSD Short Code to Verify USSD Short Code Reject
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'USSD Code Reject'
    Then Delete Created USSD Short Code

# Test Case 03: Re-Approval Process of USSD Short Code

  Scenario: Create USSD Short Code to Test Re-Approve USSD Short Code
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'USSD Code Re Approve'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '788812'
    Then Click on Create Button on Short Code Create Page

  Scenario: Re-Approve USSD Short Code
    Given Login to Compose Successfully
    When Click on Approvals Icon in Compose
    And Click on Short Code Requests Tab in Compose
    And Select USSD Short Code Tab in Short Code Approval
    And Search Short Code by Short Code '788812'
    Then Click on USSD Short Code Reject Icon
    And Enter Reject Short Code Request Comment as 'No Use'
    And Click on Submit Button on Reject Short Code Request Comment
    Then Click on Yes Button on USSD Short Code Reject Confirmation Message
    And Search Short Code by Short Code '788812'
    And Click on USSD Short Code Approve Icon to Re-Approve
    Then Click on Yes Button on USSD Short Code Approve Confirmation Message

  Scenario: Delete Previously Created USSD Short Code to Verify USSD Short Code Reject
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select USSD Short Code Tab
    And Search USSD Short Code by Short Code Name 'USSD Code Re Approve'
    Then Delete Created USSD Short Code

# Test Case 04: Delete USSD Short Code Approval Request

  Scenario: Create USSD Short Code to Test Delete USSD Short Code Approval Request
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'USSD'
    And Enter Short Code Name as 'USSD Code Delete'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '788813'
    Then Click on Create Button on Short Code Create Page

  Scenario: Delete USSD Short Code Approval Request
    Given Login to Compose Successfully
    When Click on Approvals Icon in Compose
    And Click on Short Code Requests Tab in Compose
    And Select USSD Short Code Tab in Short Code Approval
    And Search Short Code by Short Code '788813'
    And Click on USSD Short Code Delete Icon
    Then Click on Yes Button on USSD Short Code Request Delete Confirmation Message

# Test Case 05: Approval Process of SMS Short Code

  Scenario: Create SMS Short Code to Test Approve SMS Short Code
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'SMS Code Approval'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '788814'
    Then Click on Create Button on Short Code Create Page

  Scenario: Approve SMS Short Code
    Given Login to Compose Successfully
    When Click on Approvals Icon in Compose
    And Click on Short Code Requests Tab in Compose
    And Select SMS Short Code Tab in Short Code Approval
    And Search Short Code by Short Code '788814'
    And Click on SMS Short Code Approve Icon
    Then Click on Yes Button on SMS Short Code Approve Confirmation Message

  Scenario: Delete Previously Created SMS Short Code to Verify SMS Short Code Approval
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'SMS Code Approval'
    Then Delete Created SMS Short Code

# Test Case 06: Reject Process of SMS Short Code

  Scenario: Create SMS Short Code to Test Reject SMS Short Code
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'SMS Code Reject'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '788815'
    Then Click on Create Button on Short Code Create Page

  Scenario: Reject SMS Short Code
    Given Login to Compose Successfully
    When Click on Approvals Icon in Compose
    And Click on Short Code Requests Tab in Compose
    And Select SMS Short Code Tab in Short Code Approval
    And Search Short Code by Short Code '788815'
    Then Click on SMS Short Code Reject Icon
    And Enter Reject Short Code Request Comment as 'No Use'
    And Click on Submit Button on Reject Short Code Request Comment
    Then Click on Yes Button on SMS Short Code Reject Confirmation Message

  Scenario: Delete Previously Created SMS Short Code to Verify SMS Short Code Reject
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'SMS Code Reject'
    Then Delete Created SMS Short Code

# Test Case 07: Re-Approval Process of SMS Short Code

  Scenario: Create SMS Short Code to Test Re-Approve SMS Short Code
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'SMS Code Re Approve'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '788816'
    Then Click on Create Button on Short Code Create Page

  Scenario: Re-Approve SMS Short Code
    Given Login to Compose Successfully
    When Click on Approvals Icon in Compose
    And Click on Short Code Requests Tab in Compose
    And Select SMS Short Code Tab in Short Code Approval
    And Search Short Code by Short Code '788816'
    Then Click on SMS Short Code Reject Icon
    And Enter Reject Short Code Request Comment as 'No Use'
    And Click on Submit Button on Reject Short Code Request Comment
    Then Click on Yes Button on SMS Short Code Reject Confirmation Message
    And Search Short Code by Short Code '788816'
    And Click on SMS Short Code Approve Icon to Re-Approve
    Then Click on Yes Button on SMS Short Code Approve Confirmation Message

  Scenario: Delete Previously Created SMS Short Code to Verify SMS Short Code Reject
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select SMS Short Code Tab
    And Search SMS Short Code by Short Code Name 'SMS Code Re Approve'
    Then Delete Created SMS Short Code

# Test Case 08: Delete SMS Short Code Approval Request

  Scenario: Create SMS Short Code to Test Delete SMS Short Code Approval Request
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'SMS'
    And Enter Short Code Name as 'SMS Code Delete'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '788817'
    Then Click on Create Button on Short Code Create Page

  Scenario: Delete SMS Short Code Approval Request
    Given Login to Compose Successfully
    When Click on Approvals Icon in Compose
    And Click on Short Code Requests Tab in Compose
    And Select SMS Short Code Tab in Short Code Approval
    And Search Short Code by Short Code '788817'
    And Click on SMS Short Code Delete Icon
    Then Click on Yes Button on SMS Short Code Request Delete Confirmation Message

# Test Case 09: Approval Process of IVR Short Code

  Scenario: Create IVR Short Code to Test Approve IVR Short Code
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'IVR Code Approval'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '788820'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page

  Scenario: Approve IVR Short Code
    Given Login to Compose Successfully
    When Click on Approvals Icon in Compose
    And Click on Short Code Requests Tab in Compose
    And Select IVR Short Code Tab in Short Code Approval
    And Search Short Code by Short Code '788820'
    And Click on IVR Short Code Approve Icon
    Then Click on Yes Button on IVR Short Code Approve Confirmation Message

  Scenario: Delete Previously Created IVR Short Code to Verify IVR Short Code Approval
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'IVR Code Approval'
    Then Delete Created IVR Short Code

# Test Case 10: Reject Process of IVR Short Code

  Scenario: Create IVR Short Code to Test Reject IVR Short Code
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'IVR Code Reject'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '788821'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page

  Scenario: Reject IVR Short Code
    Given Login to Compose Successfully
    When Click on Approvals Icon in Compose
    And Click on Short Code Requests Tab in Compose
    And Select IVR Short Code Tab in Short Code Approval
    And Search Short Code by Short Code '788821'
    Then Click on IVR Short Code Reject Icon
    And Enter Reject Short Code Request Comment as 'No Use'
    And Click on Submit Button on Reject Short Code Request Comment
    Then Click on Yes Button on IVR Short Code Reject Confirmation Message

  Scenario: Delete Previously Created IVR Short Code to Verify IVR Short Code Reject
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'IVR Code Reject'
    Then Delete Created IVR Short Code

# Test Case 11: Re-Approval Process of IVR Short Code

  Scenario: Create IVR Short Code to Test Re-Approve IVR Short Code
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'IVR Code Re Approve'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '788822'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page

  Scenario: Re-Approve IVR Short Code
    Given Login to Compose Successfully
    When Click on Approvals Icon in Compose
    And Click on Short Code Requests Tab in Compose
    And Select IVR Short Code Tab in Short Code Approval
    And Search Short Code by Short Code '788822'
    Then Click on IVR Short Code Reject Icon
    And Enter Reject Short Code Request Comment as 'No Use'
    And Click on Submit Button on Reject Short Code Request Comment
    Then Click on Yes Button on IVR Short Code Reject Confirmation Message
    And Search Short Code by Short Code '788822'
    And Click on IVR Short Code Approve Icon to Re-Approve
    Then Click on Yes Button on IVR Short Code Approve Confirmation Message

  Scenario: Delete Previously Created IVR Short Code to Verify IVR Short Code Reject
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Select IVR Short Code Tab
    And Search IVR Short Code by Short Code Name 'IVR Code Re Approve'
    Then Delete Created IVR Short Code

# Test Case 12: Delete IVR Short Code Approval Request

  Scenario: Create IVR Short Code to Test Delete IVR Short Code Approval Request
    Given Login to Compose Successfully
    When Select Workspace from Workspace Drop Down List as 'Compose Test Automation Agent3'
    And Click on Connectors Tab
    And Select Short Codes Tab
    And Click on Create Short Code button
    Then Enter Short Code Type as 'IVR'
    And Enter Short Code Name as 'IVR Code Delete'
    And Enter Short Code Description as 'This is Test Automation Test Code'
    And Select Executed Flow from Flow Dropdown List as 'BotFlow 1'
    And Enter Short Code as '788823'
    And Select IVR Call Type as inbound
    And Select IVR Control Type as 'Full Control'
    And Select IVR Audio Codec Type as 'G.711 - A Law'
    Then Click on Create Button on Short Code Create Page

  Scenario: Delete IVR Short Code Approval Request
    Given Login to Compose Successfully
    When Click on Approvals Icon in Compose
    And Click on Short Code Requests Tab in Compose
    And Select IVR Short Code Tab in Short Code Approval
    And Search Short Code by Short Code '788823'
    And Click on IVR Short Code Delete Icon
    Then Click on Yes Button on IVR Short Code Request Delete Confirmation Message