Feature: Payment Summary

  #Payment Summary UI Verification
  Scenario: Verify the Payment Summary UI
    Given Login to Admin Successfully
    And Click on Finance main menu
    And CLick on payment Summary
    And Verify the Payment Summary Title
    Then Verify the Payment Summary Title Description
  #  And Verify the Payment Summary in Medical Center Selection
  #  And Verify the Date range Selection
    And Verify with the GST Check Button
    Then Verify the Payment Summary Table column title
    And Verify the Payment Summary Total colum

    #Verify the Current Hospital select in Medical Center
   Scenario: Verify the Payment Summary Medical Center Selection
     Given Login to Admin Successfully
     And Click on Finance main menu
     And CLick on payment Summary
     And Verify the Payment Summary Title
     Then Select the Medical Center in Drop Down
     And Verify the table Data loading

     #Verify the Date Range in Payment Summary
    Scenario: Verify the Date Range in Payment Summary
      Given Login to Admin Successfully
      And Click on Finance main menu
      And CLick on payment Summary
      And Verify the Payment Summary Title
      Then Click on Payment Summary Date range
      And Select the Date Range
      Then Verify the table Data loading

     #Verify the "With GST" Check Box button
    Scenario: Verify the With GST Check Box button
      Given Login to Admin Successfully
      And Click on Finance main menu
      And Click on Finance main menu
      And CLick on payment Summary
      And Verify the Payment Summary Title