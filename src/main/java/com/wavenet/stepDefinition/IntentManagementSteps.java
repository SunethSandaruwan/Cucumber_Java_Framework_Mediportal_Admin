package com.wavenet.stepDefinition;

import com.wavenet.pages.Intent;
import com.wavenet.pages.IntentManagement;
import com.wavenet.util.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class IntentManagementSteps {

    private Config config = new Config();
    private Intent intent = new Intent();
    private IntentManagement mngIntent = new IntentManagement();

    @And("^Click on Intent Management Tab$")
    public void click_intent_management_intent_tab()
    {
        mngIntent.clickIntentManagementTab();
    }

    @Then("^Click on Create Intent Button on Intent Management Page$")
    public void click_create_intent_management_intent_button()
    {
        mngIntent.clickCreateCommonIntent();
    }

    @And("^Enter Intent Management Intent Name as '(.*?)'$")
    public void enter_intent_management_intent_name(String commonIntentName)
    {
        mngIntent.enterCommonIntentName(commonIntentName);
    }

    @And("^Enter Intent Management Training Phrase as '(.*?)'$")
    public void enter_intent_management_intent_training_phrase(String commonIntentPhrase)
    {
        mngIntent.enterCommonIntentPhrase(commonIntentPhrase);
    }

    @And("^Click on Add New Intent Training Phrase Button$")
    public void click_on_add_new_intent_management_intent_phrase()
    {
        mngIntent.addNewCommonIntentPhrase();
    }

    @Then("^Click on Create Button on Intent Management Intent Create Page$")
    public void click_on_intent_management_intent_create_button()
    {
        mngIntent.clickCreateButton();
    }

    @And("^Search Intent Management Intent by Intent Name '(.*?)'$")
    public void search_intent_management_intent_by_name(String commonIntentName)
    {
        mngIntent.searchCommonIntent(commonIntentName);
    }

    @Then("^Delete Created Intent Management Intent$")
    public void delete_created_intent_management_intent() throws InterruptedException
    {
        mngIntent.deleteCreatedCommonIntent();
    }

    @Then("^Verify Intent Management Intent Name Allowed Characters Error Message$")
    public void verify_intent_management_intent_name_allowed_characters()
    {
        mngIntent.verifyCommonIntentNameAllowedCharacters();
    }

    @Then("^Verify Intent Management Intent Name Required Error Message$")
    public void verify_intent_management_intent_name_required()
    {
        mngIntent.verifyCommonIntentNameRequired();
    }

    @Then("^Verify Intent Management Intent Name Max Length Error Message$")
    public void verify_intent_management_intent_name_max_length()
    {
        mngIntent.verifyCommonIntentNameMaxLength();
    }

    @Then("^Verify Intent Management Intent Training Phrase Max Length Error Message$")
    public void verify_intent_management_intent_training_phrase_max_length()
    {
        mngIntent.verifyCommonIntentTrainingPhraseMaxLength();
    }

    @Then("^Verify Intent Management Intent Training Phrase Required Error Message$")
    public void verify_intent_management_intent_training_phrase_required()
    {
        mngIntent.verifyCommonIntentTrainingPhraseRequired();
    }

    @Then("^Verify Duplicate Intent Management Intent Training Phrase Error Message$")
    public void verify_intent_management_duplicate_training_phrases()
    {
        mngIntent.verifyCommonIntentDuplicatePhrases();
    }

    @Then("^Click on Intent Management Intent Update Button$")
    public void click_on_intent_management_intent_update_button() throws InterruptedException
    {
        mngIntent.clickCommonIntentUpdate();
    }

    @And("^Update Intent Management Intent Name as '(.*?)'$")
    public void update_intent_management_intent_name(String commonIntentName) throws InterruptedException
    {
        mngIntent.updateCommonIntentName(commonIntentName);
    }

    @Then("^Click on Update Button in Intent Management Intent Update Page$")
    public void click_update_button_in_intent_management_update_page()
    {
        mngIntent.clickUpdateCommonIntent();
    }

    @And("^Click on Back Button on Intent Update Page$")
    public void click_on_back_button_on_intent_management_intent()
    {
        mngIntent.clickOnBackButton();
    }

    @And("^Update Intent Management Intent Training Phrase as '(.*?)'$")
    public void update_intent_management_intent_training_phrase(String trainingPhrase) throws InterruptedException
    {
        mngIntent.updateCommonIntentTrainingPhrase(trainingPhrase);
    }

    @And("^Click on Intent Training Phrase Update Button$")
    public void click_intent_management_intent_training_phrase_update_button()
    {
        mngIntent.clickCommonIntentTrainingPhraseUpdate();
    }

    @And("^Enter Intent Management Training Phrase as '(.*?)' in Intent Update$")
    public void enter_training_phrase_in_intent_management_intent_update(String trainingPhrase)
    {
        mngIntent.enterTrainingPhraseCoInUpdate(trainingPhrase);
    }

    @And("^Click on Add New Phrase Button in Intent Management Intent Update$")
    public void add_new_phrase_button_in_intent_management_intent_update()
    {
        mngIntent.addNewPhraseCoInUpdate();
    }

    @And("^Click Delete Button in Intent Management Intent Update$")
    public void click_delete_button_in_intent_management_intent_update()
    {
        mngIntent.clickDeleteButton();
    }

    @Then("^Verify Intent Management Intent Update Button is Disabled$")
    public void verify_intent_management_intent_update_button_disabled()
    {
        mngIntent.verifyUpdateButton();
    }

    @And("^Click on Copy Code icon$")
    public void click_intent_management_copy_code_icon() throws InterruptedException {
        mngIntent.clickCopyCode();
    }

    @Then("^Verify Successful Copy Action$")
    public void verify_intent_management_successful_copy_action()
    {
        mngIntent.verifySuccessfulCopy();
    }

    @And("^Click on Copy Code icon on Common Intent Update Page$")
    public void click_copy_code_icon_on_intent_management_intent_update_page() throws InterruptedException
    {
        mngIntent.clickCopyCodeIconOnCommonIntUpdate();
    }

    @Then("^Verify Successful Copy Action from Common Intent Update Page$")
    public void verify_successful_copy_action_from_intent_management_intent_update_page()
    {
        mngIntent.verifySuccessfulCopyFromCommonIntUpdate();
    }

    @Then("^View Previously Created Common Intent$")
    public void view_previously_created_intent_management_intent() throws InterruptedException {
        mngIntent.viewCommonIntent();
    }

    @And("^Verify Intent Management Intent View Mode$")
    public void verify_intent_management_intent_view_mode()
    {
        mngIntent.verifyCommonIntentViewMode();
    }

    @And("^Click Close Button on Intent Management Intent View$")
    public void click_close_button_on_intent_management_intent_view() throws InterruptedException {
        mngIntent.clickCloseButtonOnCommonIntentView();
    }
}

