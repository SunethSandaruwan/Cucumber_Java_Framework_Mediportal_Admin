package com.wavenet.stepDefinition;

import com.wavenet.pages.Intent;
import com.wavenet.util.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class IntentSteps {

    private Config config = new Config();
    private Intent intent = new Intent();

    String composeUrl = config.getComposeUrl();
    String composeUsername = config.getComposeUsername();
    String composePassword = config.getComposePassword();

    @Given("^Login to Compose Successfully$")
    public void login_to_compose_successfully() throws Throwable
    {
        intent.composeLogin(composeUrl,composeUsername,composePassword);
    }

    @And("^Select Workspace from Workspace Drop Down List as '(.*?)'$")
    public void select_workspace_created_before(String workspaceName) throws InterruptedException {
        intent.selectCreatedWorkspace(workspaceName);
    }

    @And("^Click on Connectors Tab$")
    public void click_on_connectors_tab()
    {
        intent.clickOnConnectors();
    }

    @And("^Select Intents Tab$")
    public void select_intents_tab()
    {
        intent.selectIntentsTab();
    }

    @And("^Click on Create Intent Button$")
    public void click_on_create_intent()
    {
        intent.clickCreateIntent();
    }

    @And("^Enter Intent Name as '(.*?)'$")
    public void enter_intent_name(String intentName)
    {
        intent.enterIntentName(intentName);
    }

    @And("^Select Flow from Flow Dropdown List as '(.*?)'$")
    public void select_flow_from_flow_dropdown(String flowName)
    {
        intent.selectFlow(flowName);
    }

    @And("^Enter Training Phrase as '(.*?)'$")
    public void enter_training_phrase(String trainingPhrase)
    {
        intent.enterTrainingPhrase(trainingPhrase);
    }

    @And("^Click on Add New Phrase Button$")
    public void click_on_add_new_phrase()
    {
        intent.addNewPhrase();
    }

    @Then("^Click on Create Button on Intent Create Page$")
    public void click_on_create_button_on_intent_create()
    {
        intent.clickOnIntentCreate();
    }

    @And("^Search Intent by Intent Name '(.*?)'$")
    public void search_intent_by_intent_name(String intentName)
    {
        intent.searchIntentByName(intentName);
    }

    @Then("^Delete Created Intent$")
    public void delete_created_intent() throws InterruptedException
    {
        intent.deleteIntent();
    }

    @Then("^Verify Intent Name Allowed Characters Error Message$")
    public void verify_intent_name_allowed_characters()
    {
        intent.verifyIntentNameAllowedCharacters();
    }

    @Then("^Verify Intent Name Required Error Message$")
    public void verify_intent_name_required()
    {
        intent.verifyIntentNameRequired();
    }

    @Then("^Verify Intent Name Max Length Error Message$")
    public void verify_intent_name_max_length()
    {
        intent.verifyIntentNameMaxLength();
    }

    @Then("^Verify Flow Name Required Error Message$")
    public void verify_intent_flow_name_required()
    {
        intent.verifyIntentFlowNameRequired();
    }

    @Then("^Verify Training Phrase Max Length Error Message$")
    public void verify_training_phrase_max_length()
    {
        intent.verifyTrainingPhraseMaxLength();
    }

    @Then("^Verify Training Phrase Required Error Message$")
    public void verify_intent_training_phrase_required()
    {
        intent.verifyIntentTrainingPhraseRequired();
    }

    @And("^Enter Intent Flow Name Empty$")
    public void intent_flow_name_empty()
    {
        intent.flowNameEmpty();
    }

    @Then("^Verify Duplicate Training Phrase Error Message$")
    public void verify_Duplicate_Training_Phrases()
    {
        intent.verifyDuplicatePhrases();
    }

    @Then("^Click on Intent Update Button$")
    public void click_on_intent_update_button() throws InterruptedException {
        intent.clickIntentUpdate();
    }

    @And("^Update Intent Name as '(.*?)'$")
    public void update_intent_name(String intentName) throws InterruptedException {
        intent.updateIntentName(intentName);
    }

    @Then("^Click on Update Button in Intent Update Page$")
    public void click_update_button_in_intent_update_page()
    {
        intent.clickUpdateIntent();
    }

    @And("^Update Intent Flow Name as '(.*?)'$")
    public void update_intent_flow_name(String flowName)
    {
        intent.updateFlowName(flowName);
    }

    @And("^Update Intent Training Phrase as '(.*?)'$")
    public void update_intent_training_phrase(String trainingPhrase) throws InterruptedException {
        intent.updateTrainingPhrase(trainingPhrase);
    }

    @And("^Click on Training Phrase Update Button$")
    public void click_training_phrase_update_button()
    {
        intent.clickTrainingPhraseUpdate();
    }

    @And("^Enter Training Phrase as '(.*?)' in Intent Update$")
    public void enter_training_phrase_in_intent_update(String trainingPhrase)
    {
        intent.enterTrainingPhraseInUpdate(trainingPhrase);
    }

    @And("^Click on Add New Phrase Button in Intent Update$")
    public void add_new_phrase_button_in_intent_update()
    {
        intent.addNewPhraseInUpdate();
    }

    @And("^Click Delete Button in Intent Update$")
    public void click_delete_button_in_intent_update()
    {
        intent.clickDeleteButton();
    }

    @Then("^Verify Update Button is Disabled$")
    public void verify_update_button_disabled()
    {
        intent.verifyUpdateButton();
    }

    @Then("^View Previously Created Intent$")
    public void view_previously_created_intent() throws InterruptedException {
        intent.viewIntent();
    }

    @And("^Verify Intent View Mode$")
    public void verify_intent_view_mode()
    {
        intent.verifyIntentViewMode();
    }

    @And("^Click Close Button on Intent View$")
    public void click_close_button_on_intent_view() throws InterruptedException {
        intent.clickCloseButtonOnIntentView();
    }
}
