package com.wavenet.stepDefinition;

import com.wavenet.pages.ReminderConfigurations;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class ReminderConfigurationsSteps {

    private ReminderConfigurations reminderConfigurations = new ReminderConfigurations();


    @Then("^Click on Reminders$")
    public void click_on_Reminders() throws Throwable {
        reminderConfigurations.click_on_Reminders();
    }

    @Then("^Click on Reminder Configurations$")
    public void click_on_Reminder_Configurations() throws Throwable {
        reminderConfigurations.click_on_Reminder_Configurations();
    }

    @Then("^Verify the reminder configurations title$")
    public void verify_the_reminder_configurations_title() throws Throwable {
        reminderConfigurations.verify_the_reminder_configurations_title();
    }

    @Then("^Click on General tab$")
    public void click_on_General_tab() throws Throwable {
        reminderConfigurations.click_on_General_tab();
    }

    @Then("^Verify the Reminder Period sub title$")
    public void verify_the_Reminder_Period_sub_title() throws Throwable {
        reminderConfigurations.verify_the_Reminder_Period_sub_title();
    }

    @Then("^Verify the Reminder period drop down '(.*?)'$")
    public void verify_the_Reminder_period_drop_down(String ReminderPeriod) throws Throwable {
        reminderConfigurations.verify_the_Reminder_period_drop_down(ReminderPeriod);
    }

    @Then("^Verify Duration Type Drop Down$")
    public void verify_Duration_Type_Drop_Down() throws Throwable {
        reminderConfigurations.verify_Duration_Type_Drop_Down();
    }

    @Then("^Verify Send second reminder title and Disabled button$")
    public void verify_Send_second_reminder_title_and_Disabled_button() throws Throwable {
        reminderConfigurations.verify_Send_second_reminder_title_and_Disabled_button();
    }

    @Then("^Verify Specify practitioner title and Disabled button$")
    public void verify_Specify_practitioner_title_and_Disabled_button() throws Throwable {
        reminderConfigurations.verify_Specify_practitioner_title_and_Disabled_button();
    }

    @Then("^Verify Specify appointment type and Disabled button$")
    public void verify_Specify_appointment_type_and_Disabled_button() throws Throwable {
        reminderConfigurations.verify_Specify_appointment_type_and_Disabled_button();
    }

    @Then("^Verify Update Configurations$")
    public void verify_Update_Configurations() throws Throwable {
        reminderConfigurations.verify_Update_Configurations();
    }

}
