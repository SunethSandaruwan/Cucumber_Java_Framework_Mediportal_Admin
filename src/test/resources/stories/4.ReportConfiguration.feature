Feature: Report Configuration

# Billing Summary Report in Configuration Report UI

  Scenario: Insert in to Report Configuration
    Then Select Billing Summary Practitioner Search Box
    Given Click on Report Configuration
    And  Verify the Display as Report Configuration Title
    Then Verify the Display as Email Configuration Text
    And  Check the Email Configuration Button
    And  Verify the Display as Email Repeat Event Text
    And Verify the Display as Email Time Field '2'
    And Verify the Display as Email Time period
    And Verify the Display as Email Help
    Then Verify the Display as Email Send Time Period Text
    And Verify the Click Email Time Seat Hour UP Button
    And Verify the Click Email Time Seat Hour Down Button
    And Verify the Click Email Time Seat Minutes UP Button
    And Verify the Click Email Time Seat Minutes Down Button
    And Verify the Display as Email Time Format AM or PM
    And Verify the Display as Email Time Zone Title
    And Verify the Select as Email Time Zone City
    And Verify the Display as Email Example City
    Then Verify the Display as Email Example Scheduled Time
    And Verify the Display Email Date Report Consist Transaction

    When Verify the Display as SMS Configuration Text
    And  Check the SMS Configuration Button
    Then Verify the Display as SMS Repeat Event Text
    And Verify the Display as SMS Time Field '3'
    And Verify the Display as SMS Time period
    And Verify the Display as SMS Help
    Then Verify the Display as SMS Send Time Period Text
    And Verify the Click SMS Time Seat Hour UP Button
    And Verify the Click SMS Time Seat Hour Down Button
    And Verify the Click SMS Time Seat Minutes UP Button
    And Verify the Click SMS Time Seat Minutes Down Button
    And Verify the Display as SMS Time Format AM or PM
    And Verify the Display as SMS Time Zone Title
    And Verify the Select as SMS Time Zone City
    And Verify the Display as SMS Example City
    Then Verify the Display as SMS Example Scheduled Time
    And Verify the Display SMS Date Report Consist Transaction

    #Verify the Email Configuration enable and disable
    Scenario: Email Configuration enable and disable
      When Click on Report Configuration
      Then Verify the Display as Report Configuration Title
      And Check the Email Configuration Button
      And Check the SMS Configuration Button

    #Verify the Repeat Every All period
    Scenario: Verify the Repeat Every All Period
      When Verify the Display as Report Configuration Title
      Then Verify the Display as Email Time period
      And Select the Day Email Time period
      And Select the Week Email Time period
      And Select the Month Email Time period
      And Select the year Email Time period

    #Enable Email configuration And Disable configuration
    Scenario: Setup the only Email configuration and successful Save message
      When Check the Email Configuration Button
      And Check the SMS Configuration Button
      And Verify the Display as Email Time Field '4'
      Then Select the Day Email Time period
      And Enter the Email Configuration seat time Hours
      And Enter the Email Configuration seat time Minute
      And Verify the Select as Email Time Zone City
      Then Click on Report Configuration Save Button








