package com.wavenet.stepDefinition;

import cucumber.api.java.en.Given;
import com.wavenet.pages.RecallManager;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RecallManagerSteps {
    private RecallManager recallManager = new RecallManager();

    @When("^Click on Follow up care$")
    public void click_on_Follow_up_care() throws Throwable {
        recallManager.click_on_Follow_up_care();
    }

    @When("^Click on All Recalls$")
    public void click_on_All_Recalls() throws Throwable {
        recallManager.click_on_All_Recalls();
    }

    @When("^Click on Recall Manager$")
    public void click_on_Recall_Manager() throws Throwable {
        recallManager.click_on_Recall_Manager();
    }

    @When("^Verify the Recall Manager Page Title$")
    public void verify_the_Recall_Manager_Page_Title() throws Throwable {
        recallManager.verify_the_Recall_Manager_Page_Title();
    }

    @Then("^Select Dropdown in hospital name$")
    public void select_Dropdown_in_hospital_name() throws Throwable {
        recallManager.select_Dropdown_in_hospital_name();
    }
    @Given("^Click on Sync Recalls$")
    public void click_on_Sync_Recalls() throws Throwable {

    }

    @Given("^Validate in Sync$")
    public void validate_in_Sync() throws Throwable {

    }
}
