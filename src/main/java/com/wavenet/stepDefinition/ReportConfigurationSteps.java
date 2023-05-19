package com.wavenet.stepDefinition;

import com.wavenet.pages.ReportConfiguration;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ReportConfigurationSteps {

    private ReportConfiguration reportConfiguration = new ReportConfiguration();

    @Given("^Click on Report Configuration$")
    public void click_on_Report_Configuration() throws Throwable {
        reportConfiguration.click_on_Report_Configuration();
    }

    @Given("^Verify the Display as Report Configuration Title$")
    public void verify_the_Display_as_Report_Configuration_Title() throws Throwable {
        reportConfiguration.verify_the_Display_as_Report_Configuration_Title();
    }

    @Then("^Verify the Display as Email Configuration Text$")
    public void verify_the_Display_as_Email_Configuration_Text() throws Throwable {
        reportConfiguration.verify_the_Display_as_Email_Configuration_Text();
    }
    @Then("^Check the Email Configuration Button$")
    public void check_the_Email_Configuration_Button() throws Throwable {
        reportConfiguration.check_the_Email_Configuration_Button();
    }

    @Then("^Verify the Display as Email Repeat Event Text$")
    public void verify_the_Display_as_Email_Repeat_Event_Text() throws Throwable {
        reportConfiguration.verify_the_Display_as_Email_Repeat_Event_Text();
    }
    @Then("^Verify the Display as Email Time Field '(.*?)'$")
    public void verify_the_Display_as_Email_Time_Field(String EmailTimeNo) throws Throwable {
        reportConfiguration.verify_the_Display_as_Email_Time_Field(EmailTimeNo);
    }
    @Then("^Verify the Display as Email Time period$")
    public void verify_the_Display_as_Email_Time_period() throws Throwable {
        reportConfiguration.verify_the_Display_as_Email_Time_period();
    }

    @Then("^Verify the Display as Email Help$")
    public void verify_the_Display_as_Email_Help() throws Throwable {
        reportConfiguration.verify_the_Display_as_Email_Help();
    }

    @Then("^Verify the Display as Email Send Time Period Text$")
    public void verify_the_Display_as_Email_Send_Time_Period_Text() throws Throwable {
        reportConfiguration.verify_the_Display_as_Email_Send_Time_Period_Text();
    }

    @Then("^Verify the Click Email Time Seat Hour UP Button$")
    public void verify_the_Click_Email_Time_Seat_Hour_UP_Button() throws Throwable {
        reportConfiguration.verify_the_Click_Email_Time_Seat_Hour_UP_Button();
    }

    @Then("^Verify the Click Email Time Seat Hour Down Button$")
    public void verify_the_Click_Email_Time_Seat_Hour_Down_Button() throws Throwable {
        reportConfiguration.verify_the_Click_Email_Time_Seat_Hour_Down_Button();
    }

    @Then("^Verify the Click Email Time Seat Minutes UP Button$")
    public void verify_the_Click_Email_Time_Seat_Minutes_UP_Button() throws Throwable {
        reportConfiguration.verify_the_Click_Email_Time_Seat_Minutes_UP_Button();
    }

    @Then("^Verify the Click Email Time Seat Minutes Down Button$")
    public void verify_the_Click_Email_Time_Seat_Minutes_Down_Button() throws Throwable {
        reportConfiguration.verify_the_Click_Email_Time_Seat_Minutes_Down_Button();
    }

    @Then("^Verify the Display as Email Time Format AM or PM$")
    public void verify_the_Display_as_Email_Time_Format_AM_or_PM() throws Throwable {
        reportConfiguration.verify_the_Display_as_Email_Time_Format_AM_or_PM();
    }

    @Then("^Verify the Display as Email Time Zone Title$")
    public void verify_the_Display_as_Email_Time_Zone_Title() throws Throwable {
        reportConfiguration.verify_the_Display_as_Email_Time_Zone_Title();
    }

    @Then("^Verify the Select as Email Time Zone City$")
    public void verify_the_Select_as_Email_Time_Zone_City() throws Throwable {
        reportConfiguration.verify_the_Select_as_Email_Time_Zone_City();
    }

    @Then("^Verify the Display as Email Example City$")
    public void verify_the_Display_as_Email_Example_City() throws Throwable {
        reportConfiguration.verify_the_Display_as_Email_Example_City();
    }

    @Then("^Verify the Display as Email Example Scheduled Time$")
    public void verify_the_Display_as_Email_Example_Scheduled_Time() throws Throwable {
        reportConfiguration.verify_the_Display_as_Email_Example_Scheduled_Time();
    }

    @Then("^Verify the Display Email Date Report Consist Transaction$")
    public void verify_the_Display_Email_Date_Report_Consist_Transaction() throws Throwable {
        reportConfiguration.verify_the_Display_Email_Date_Report_Consist_Transaction();
    }

    @When("^Verify the Display as SMS Configuration Text$")
    public void verify_the_Display_as_SMS_Configuration_Text() throws Throwable {
        reportConfiguration.verify_the_Display_as_SMS_Configuration_Text();
    }
    @When("^Check the SMS Configuration Button$")
    public void check_the_SMS_Configuration_Button() throws Throwable {
        reportConfiguration.check_the_Email_Configuration_Button();
    }

    @Then("^Verify the Display as SMS Repeat Event Text$")
    public void verify_the_Display_as_SMS_Repeat_Event_Text() throws Throwable {
        reportConfiguration.verify_the_Display_as_SMS_Repeat_Event_Text();
    }

    @Then("^Verify the Display as SMS Time Field$")
    public void verify_the_Display_as_SMS_Time_Field() throws Throwable {
        reportConfiguration.verify_the_Display_as_SMS_Time_Field();
    }

    @Then("^Verify the Display as SMS Time period$")
    public void verify_the_Display_as_SMS_Time_period() throws Throwable {
        reportConfiguration.verify_the_Display_as_SMS_Time_Field();
    }

    @Then("^Verify the Display as SMS Help$")
    public void verify_the_Display_as_SMS_Help() throws Throwable {
        reportConfiguration.verify_the_Display_as_SMS_Help();
    }

    @Then("^Verify the Display as SMS Send Time Period Text$")
    public void verify_the_Display_as_SMS_Send_Time_Period_Text() throws Throwable {
        reportConfiguration.verify_the_Display_as_SMS_Send_Time_Period_Text();
    }

    @Then("^Verify the Click SMS Time Seat Hour UP Button$")
    public void verify_the_Click_SMS_Time_Seat_Hour_UP_Button() throws Throwable {
        reportConfiguration.verify_the_Click_SMS_Time_Seat_Hour_UP_Button();
    }

    @Then("^Verify the Click SMS Time Seat Hour Down Button$")
    public void verify_the_Click_SMS_Time_Seat_Hour_Down_Button() throws Throwable {
        reportConfiguration.verify_the_Click_SMS_Time_Seat_Hour_Down_Button();
    }

    @Then("^Verify the Click SMS Time Seat Minutes UP Button$")
    public void verify_the_Click_SMS_Time_Seat_Minutes_UP_Button() throws Throwable {
        reportConfiguration.verify_the_Click_SMS_Time_Seat_Minutes_UP_Button();
    }

    @Then("^Verify the Click SMS Time Seat Minutes Down Button$")
    public void verify_the_Click_SMS_Time_Seat_Minutes_Down_Button() throws Throwable {
        reportConfiguration.verify_the_Click_SMS_Time_Seat_Minutes_Down_Button();
    }

    @Then("^Verify the Display as SMS Time Format AM or PM$")
    public void verify_the_Display_as_SMS_Time_Format_AM_or_PM() throws Throwable {
        reportConfiguration.verify_the_Display_as_SMS_Time_Format_AM_or_PM();
    }

    @Then("^Verify the Display as SMS Time Zone Title$")
    public void verify_the_Display_as_SMS_Time_Zone_Title() throws Throwable {
        reportConfiguration.verify_the_Display_as_SMS_Time_Zone_Title();
    }

    @Then("^Verify the Select as SMS Time Zone City$")
    public void verify_the_Select_as_SMS_Time_Zone_City() throws Throwable {
        reportConfiguration.verify_the_Display_as_SMS_Time_Zone_Title();
    }

    @Then("^Verify the Display as SMS Example City$")
    public void verify_the_Display_as_SMS_Example_City() throws Throwable {
        reportConfiguration.verify_the_Display_as_SMS_Example_City();
    }

    @Then("^Verify the Display as SMS Example Scheduled Time$")
    public void verify_the_Display_as_SMS_Example_Scheduled_Time() throws Throwable {
        reportConfiguration.verify_the_Display_as_SMS_Example_Scheduled_Time();
    }

    @Then("^Verify the Display SMS Date Report Consist Transaction$")
    public void verify_the_Display_SMS_Date_Report_Consist_Transaction() throws Throwable {
        reportConfiguration.verify_the_Display_SMS_Date_Report_Consist_Transaction();
    }

    @Then("^Select the Day Email Time period$")
    public void select_the_Day_Email_Time_period() throws Throwable {
        reportConfiguration.select_the_Day_Email_Time_period();
    }

    @Then("^Select the Week Email Time period$")
    public void select_the_Week_Email_Time_period() throws Throwable {
        reportConfiguration.select_the_Week_Email_Time_period();
    }

    @Then("^Select the Month Email Time period$")
    public void select_the_Month_Email_Time_period() throws Throwable {
        reportConfiguration.select_the_Month_Email_Time_period();
    }

    @Then("^Select the year Email Time period$")
    public void select_the_year_Email_Time_period() throws Throwable {
        reportConfiguration.select_the_year_Email_Time_period();
    }

    @Then("^Enter the Email Configuration seat time Hours$")
    public void enter_the_Email_Configuration_seat_time_Hours() throws Throwable {

    }

    @Then("^Enter the Email Configuration seat time Minute$")
    public void enter_the_Email_Configuration_seat_time_Minute() throws Throwable {

    }

    @Then("^Click on Report Configuration Save Button$")
    public void click_on_Report_Configuration_Save_Button() throws Throwable {

    }
}
