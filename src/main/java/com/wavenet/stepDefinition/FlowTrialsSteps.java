package com.wavenet.stepDefinition;

import com.wavenet.pages.FlowTrials;
import com.wavenet.util.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class FlowTrialsSteps {

    private Config config = new Config();
    private FlowTrials trial = new FlowTrials();

    @And("^Select Flow Trials Tab$")
    public void select_flow_trials_tab() throws InterruptedException
    {
        trial.selectFlowTrialsTab();
    }

    @And("^Click on Flow Trials Create New Button$")
    public void click_on_flow_trial_create_new_button()
    {
        trial.clickOnFlowTrialCreateNew();
    }

    @Then("^Enter Trial Identifier as '(.*?)'$")
    public void enter_trial_identifier(String trialIdentifier) throws InterruptedException {
        trial.enterTrialIdentifier(trialIdentifier);
    }

    @And("^Select Flow as '(.*?)'$")
    public void select_flow(String flowName)
    {
        trial.selectFlow(flowName);
    }

    @And("^Select Channel as '(.*?)'$")
    public void select_channel_type(String channel)
    {
        trial.selectChannelType(channel);
    }

    @And("^Click on Create Button on Create Flow Trials Page$")
    public void click_create_button_on_flow_trials_page()
    {
        trial.clickOnCreateButton();
    }

    @And("^Search Flow Trial by Test Identifier '(.*?)'$")
    public void search_flow_trial_by_test_identifier(String testIdentifier) throws InterruptedException {
        trial.searchFlowTrial(testIdentifier);
    }

    @Then("^Delete Created Flow Trial$")
    public void delete_flow_trial() throws InterruptedException
    {
        trial.deleteFlowTrial();
    }

    @Then("^Verify Trial Identifier Max Length Error Message$")
    public void verify_trial_identifier_max_length()
    {
        trial.verifyTrialIdentifierMaxLength();
    }

    @Then("^Verify Trial Identifier Required Error Message$")
    public void verify_trial_identifier_required()
    {
        trial.verifyTrialIdentifierRequired();
    }

    @Then("^Verify Flow Trial Invalid Flow Name Error Message$")
    public void verify_flow_trial_invalid_flow()
    {
        trial.verifyInvalidFlowName();
    }

    @Then("^Verify Flow Trial Flow Name Required Error Message$")
    public void verify_flow_name_required()
    {
        trial.verifyFlowNameRequired();
    }

    @And("^Click on Create Button on Create Flow Trials Page to Verify Required$")
    public void click_create_button_to_verify_flow_required()
    {
        trial.clickCreateToVerifyFlowRequired();
    }

    @Then("^Verify Flow Trial Channel Required Error Message$")
    public void verify_flow_trial_channel_required()
    {
        trial.verifyChannelRequired();
    }

    @Then("^Verify Duplicated Trial Identifier Error Message$")
    public void verify_duplicated_trial_identifier()
    {
        trial.verifyDuplicatedTrialIdentifier();
    }

    @And("^Click on Cancel Button on Flow Trials Page$")
    public void click_cancel_on_create_flow_trial_page()
    {
        trial.clickOnCancel();
    }

    @Then("^Click on Flow Trial Edit Button$")
    public void click_on_flow_trial_edit() throws InterruptedException
    {
        trial.clickOnFlowTrialEdit();
    }

    @And("^Update Trial Identifier as '(.*?)'$")
    public void update_trial_identifier(String trialIdentifier)
    {
        trial.updateTrialIdentifier(trialIdentifier);
    }

    @Then("^Click on Update Button on Update Flow Trials Page$")
    public void click_on_update_button() throws InterruptedException {
        trial.clickOnUpdateButton();
    }

    @And("^Update Flow Name as '(.*?)'$")
    public void update_flow_name(String flowName)
    {
        trial.updateFlowName(flowName);
    }

    @And("^Click on Flow Trial Goto Flow Option$")
    public void click_assign_intent_go_to_flow_option() throws InterruptedException {
        trial.clickFlowTrialGoToFlowOption();
    }

    @Then("^Verify Flow Trial Goto Flow Name as '(.*?)'$")
    public void verify_flow_trial_go_to_flow_name(String flowName) throws InterruptedException {
        trial.verifyFlowTrialGoToFlowName(flowName);
    }

}
