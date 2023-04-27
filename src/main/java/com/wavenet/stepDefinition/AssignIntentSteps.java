package com.wavenet.stepDefinition;

import com.wavenet.pages.AssignIntent;
import com.wavenet.pages.Intent;
import com.wavenet.util.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AssignIntentSteps {

    private Config config = new Config();
    private Intent intent = new Intent();
    private AssignIntent assignIntent = new AssignIntent();

    @And("^Click on Assign Intents Tab$")
    public void click_on_assign_intents_tab()
    {
        assignIntent.clickAssignIntentsTab();
    }

    @Then("^Click on Assign An Intent Button$")
    public void click_on_assign_an_intent_button()
    {
        assignIntent.clickAssignAnIntentButton();
    }

    @And("^Select Assign an Intent Intent as '(.*?)'$")
    public void select_assign_an_intent_intent(String intent)
    {
        assignIntent.selectAssignAnIntentIntent(intent);
    }

    @And("^Select Assign an Intent Flow as '(.*?)'$")
    public void select_assign_an_intent_flow(String flow)
    {
        assignIntent.selectAssignAnIntentFlow(flow);
    }

    @Then("^Click on Assign Button on Assign an Intent UI$")
    public void click_on_assign_button_on_assign_an_intent_ui() throws InterruptedException {
        assignIntent.clickOnAssignButton();
    }

    @And("^Search Assign Intent by Intent Name '(.*?)'$")
    public void search_assign_intent_by_intent_name(String intentName)
    {
        assignIntent.searchAssignIntent(intentName);
    }

    @Then("^Unassigned Previously Assigned Intent$")
    public void unassigned_previously_assigned_intent() throws InterruptedException {
        assignIntent.unassignedIntent();
    }

    @Then("^Verify Assign an Intent Intent Required Error Message$")
    public void verify_assign_an_intent_intent_required()
    {
        assignIntent.verifyAssignAnIntentRequired();
    }

    @Then("^Verify Assign an Intent Flow Required Error Message$")
    public void verify_assign_an_intent_flow_required()
    {
        assignIntent.verifyAssignAnIntentFlowRequired();
    }

    @And("^Select Assign Another Intent Checkbox Enabled$")
    public void select_assign_another_intent_checkbox_enabled()
    {
        assignIntent.selectAssignAnotherIntentEnable();
    }

    @And("^Click on Close Button on Assign Intent UI$")
    public void click_on_close_button_on_assign_intent_ui()
    {
        assignIntent.clickCloseButtonOnAssignAnIntentUI();
    }

    @And("^Click on Assigned Intent Edit Button$")
    public void click_on_assigned_intent_edit_button() throws InterruptedException {
        assignIntent.clickOnAssignIntentEdit();
    }

    @Then("^Click on Update Button on Assign Intent Update UI$")
    public void click_on_update_button_on_assign_intent_update_ui()
    {
        assignIntent.clickOnUpdateButton();
    }

    @And("^Update Assign an Intent Intent as '(.*?)'$")
    public void update_assign_an_intent_intent(String intent)
    {
        assignIntent.updateAssignAnIntentIntent(intent);
    }

    @And("^Update Assign an Intent as Empty Intent as '(.*?)'$")
    public void update_assign_an_intent_intent_as_empty(String intent)
    {
        assignIntent.updateAssignAnIntentIntentEmpty(intent);
    }

    @And("^Click on Close Button on Assign Intent Update UI$")
    public void click_on_close_button_on_assign_intent_update_ui()
    {
        assignIntent.clickCloseButtonOnAssignAnIntentUpdateUI();
    }

    @And("^Update Assign an Intent Flow as '(.*?)'$")
    public void update_assign_an_intent_flow(String flow)
    {
        assignIntent.updateAssignAnIntentFlow(flow);
    }

    @And("^Update Assign an Intent as Empty Flow as '(.*?)'$")
    public void update_assign_an_intent_flow_as_empty(String flow)
    {
        assignIntent.updateAssignAnIntentFlowEmpty(flow);
    }

    @And("^Click to View Assigned Intent$")
    public void click_to_view_assigned_intent()
    {
        assignIntent.clickOnAssignIntentView();
    }

    @Then("^Click on Close Button on Assign Intent View UI$")
    public void click_on_close_button_on_assign_intent_view() throws InterruptedException {
        assignIntent.clickCloseButtonOnAssignAnIntentViewUI();
    }

    @And("^Click on Assign Intent Goto Flow Option$")
    public void click_assign_intent_go_to_flow_option() throws InterruptedException {
        assignIntent.clickAssignIntentGoToFlowOption();
    }

    @Then("^Verify Assign Intent Goto Flow Name as '(.*?)'$")
    public void verify_assign_intent_go_to_flow_name(String flowName) throws InterruptedException {
        assignIntent.verifyAssignIntentGoToFlowName(flowName);
    }
}
