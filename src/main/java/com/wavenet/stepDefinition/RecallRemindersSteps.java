package com.wavenet.stepDefinition;

import com.wavenet.pages.RecallReminders;
import com.wavenet.util.Config;
import cucumber.api.java.en.Then;

public class RecallRemindersSteps {

    private Config config = new Config();

    private RecallReminders recallReminders = new RecallReminders();

    @Then("^Click on All Reminders$")
    public void click_on_All_Reminders() throws Throwable {
        recallReminders.click_on_All_Reminders();
    }

    @Then("^Click on Recall Reminders$")
    public void click_on_Recall_Reminders() throws Throwable {
        recallReminders.click_on_Recall_Reminders();
    }

    @Then("^Verify the Recall Reminders Page title '(.*?)'$")
    public void verify_the_Recall_Reminders_Page_title(String PageTitle) throws InterruptedException {
        recallReminders.verify_the_Recall_Reminders_Page_title(PageTitle);
    }

    @Then("^Click on Recall Reminders Medical Center$")
    public void click_on_Recall_Reminders_Medical_Center() throws Throwable {
        recallReminders.click_on_Recall_Reminders_Medical_Center();
    }

    @Then("^Select the Medical Center in Search box$")
    public void select_the_Medical_Center_in_Search_box() throws Throwable {
        recallReminders.select_the_Medical_Center_in_Search_box();
    }

    @Then("^Click on Recall Reminders Sync Recalls$")
    public void click_on_Recall_Reminders_Sync_Recalls() throws Throwable {

    }

    @Then("^Verify the Practitioner Name Search box$")
    public void verify_the_Practitioner_Name_Search_box() throws Throwable {

    }

    @Then("^Verify the Last sync Date and time$")
    public void verify_the_Last_sync_Date_and_time() throws Throwable {

    }

    @Then("^Click on Recall Reminders Patient Name Search box$")
    public void click_on_Recall_Reminders_Patient_Name_Search_box() throws Throwable {

    }

    @Then("^Click on Recall Reminders Date Range$")
    public void click_on_Recall_Reminders_Date_Range() throws Throwable {

    }

    @Then("^Click on Recall Reminders Sort By$")
    public void click_on_Recall_Reminders_Sort_By() throws Throwable {

    }

    @Then("^Verify the Recall Reminders Table All column Title$")
    public void verify_the_Recall_Reminders_Table_All_column_Title() throws Throwable {
    }

    @Then("^Verify the Recall Reminders Table SMS  column Title$")
    public void verify_the_Recall_Reminders_Table_SMS_column_Title() throws Throwable {

    }

    @Then("^Verify the Recall Reminders Table Failed SMS column Title$")
    public void verify_the_Recall_Reminders_Table_Failed_SMS_column_Title() throws Throwable {

    }

    @Then("^Verify the Recall Reminders Table Letters column Title$")
    public void verify_the_Recall_Reminders_Table_Letters_column_Title() throws Throwable {

    }

    @Then("^Verify the Recall Reminders Table Calls column Title$")
    public void verify_the_Recall_Reminders_Table_Calls_column_Title() throws Throwable {

    }

    @Then("^Verify the Recall Reminders Navigation Control in Left Side$")
    public void verify_the_Recall_Reminders_Navigation_Control_in_Left_Side() throws Throwable {

    }

    @Then("^Verify the Recall Reminders Navigation Control in Right Side$")
    public void verify_the_Recall_Reminders_Navigation_Control_in_Right_Side() throws Throwable {

    }

    @Then("^Verify the Recall Reminders Navigation Control in First Page$")
    public void verify_the_Recall_Reminders_Navigation_Control_in_First_Page() throws Throwable {

    }

    @Then("^Verify the Recall Reminders Navigation Control in Last Page$")
    public void verify_the_Recall_Reminders_Navigation_Control_in_Last_Page() throws Throwable {

    }

    @Then("^Verify the Recall Reminders Items Per page Row Selection$")
    public void verify_the_Recall_Reminders_Items_Per_page_Row_Selection() throws Throwable {

    }
}
