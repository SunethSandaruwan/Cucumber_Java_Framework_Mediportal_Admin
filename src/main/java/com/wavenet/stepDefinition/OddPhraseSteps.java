package com.wavenet.stepDefinition;

import com.wavenet.pages.OddPhrase;
import com.wavenet.util.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class OddPhraseSteps {

    private Config config = new Config();
    private OddPhrase phrase = new OddPhrase();

    @And("^Click on Training Tab$")
    public void click_on_training_tab()
    {
        phrase.clickOnTrainingTab();
    }

    @And("^Click on Unresolved Requests Tab$")
    public void click_on_unresolved_requests_tab()
    {
        phrase.clickOnUnresolvedRequestsTab();
    }

    @Then("^Search Training Phrase as '(.*?)'$")
    public void search_training_phrase(String trainingPhrase){
        phrase.searchTrainingPhrase(trainingPhrase);
    }

    @And("^Click on Ignore Button on Training Phrase$")
    public void click_on_ignore_button()
    {
        phrase.clickOnIgnoreButton();
    }

    @Then("^Click on Yes Button on Ignore Training Phrase Confirmation Message$")
    public void click_on_yes_button_on_ignore_training_phrase_confirmation_message()
    {
        phrase.clickOnYesButtonOnIgnorePhraseConfirmation();
    }

    @Then("^Verify Phrase Successfully Ignored Message$")
    public void verify_phrase_ignored_message()
    {
        phrase.verifyPhraseIgnored();
    }

    @And("^Click on Ignored Requests Tab$")
    public void click_on_ignored_requests_tab()
    {
        phrase.clickOnIgnoredRequestsTab();
    }

    @And("^Click on Un Ignore Button on Training Phrase$")
    public void click_on_un_ignore_button()
    {
        phrase.clickOnUnIgnoreButton();
    }

    @Then("^Click on Yes Button on Un Ignore Training Phrase Confirmation Message$")
    public void click_on_yes_button_on_un_ignore_training_phrase_confirmation_message()
    {
        phrase.clickOnYesButtonOnUnIgnorePhraseConfirmation();
    }

    @Then("^Verify Phrase Successfully Un Ignored Message$")
    public void verify_phrase_un_ignored_message()
    {
        phrase.verifyPhraseUnIgnored();
    }
}
