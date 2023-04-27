package com.wavenet.stepDefinition;

import com.wavenet.pages.EndPoint;
import com.wavenet.util.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class EndPointSteps {

    private Config config = new Config();
    private EndPoint endpoint = new EndPoint();

    @And("^Select End Points Tab$")
    public void select_flow_trials_tab() throws InterruptedException
    {
        endpoint.selectEndPointTab();
    }

    @And("^Click on End Point Create New Button$")
    public void click_on_end_point_create_new_button()
    {
        endpoint.clickOnEndPointCreateNew();
    }

    @Then("^Enter End Point Name as '(.*?)'$")
    public void enter_end_point_name(String endPointName) throws InterruptedException {
        endpoint.enterEndPointName(endPointName);
    }

    @And("^Enter End Point ID as '(.*?)'$")
    public void enter_end_point_id(String endPointId) {
        endpoint.enterEndPointId(endPointId);
    }


    @And("^Select Service Flow as '(.*?)'$")
    public void select_service_flow(String serviceFlow)
    {
        endpoint.selectServiceFlow(serviceFlow);
    }

    @Then("^Click on Create Button on Create End Point Page$")
    public void click_create_button_on_create_end_point_page()
    {
        endpoint.clickOnCreateButton();
    }

    @And("^Search End Point by Name '(.*?)'$")
    public void search_end_point_by_name(String epName)
    {
        endpoint.searchEndPoint(epName);
    }

    @Then("^Delete Created End Point$")
    public void delete_created_end_point() throws InterruptedException
    {
        endpoint.deleteEndPoint();
    }

    @Then("^Verify End Point Name Allowed Characters Error Message$")
    public void verify_end_point_name_allowed_characters()
    {
        endpoint.verifyEndPointNameValidCharacters();
    }

    @Then("^Verify End Point Name Max Length Error Message$")
    public void verify_end_point_name_max_length()
    {
        endpoint.verifyEndPointNameMaxLength();
    }

    @Then("^Verify End Point Name Required Error Message$")
    public void verify_end_point_name_required()
    {
        endpoint.verifyEndPointNameRequired();
    }

    @Then("^Verify Duplicate End Point Name Error Message$")
    public void verify_duplicate_end_point_name()
    {
        endpoint.verifyEndPointNameDuplicate();
    }

    @And("^Click on Cancel Button on End Point UI$")
    public void click_cancel_button_on_end_point_page()
    {
        endpoint.clickOnCancelButton();
    }

    @Then("^Verify End Point Flow Invalid Error Message$")
    public void verify_end_point_flow_invalid()
    {
        endpoint.verifyEndPointFlowInvalid();
    }

    @Then("^Verify End Point Flow Required Error Message$")
    public void verify_end_point_flow_required()
    {
        endpoint.verifyEndPointFlowRequired();
    }

    @And("Click on Create Button on Create End Point Page to Verify Flow Required$")
    public void click_create_button_on_create_end_point_page_to_verify_flow_required()
    {
        endpoint.doubleClickOnCreateButton();
    }

    @Then("^Click on End Point Update Button$")
    public void click_on_end_point_update_button() throws InterruptedException
    {
        endpoint.clickOnEndPointUpdateButton();
    }

    @Then("^Click Update Button on Update End Point Page$")
    public void click_update_button_on_end_point_update_page()
    {
        endpoint.clickOnUpdateButton();
    }

    @And("Update End Point Name as '(.*?)'$")
    public void update_end_point_name(String epName) throws InterruptedException
    {
        endpoint.updateEndPointName(epName);
    }

    @And("Update End Point Service Flow as '(.*?)'$")
    public void update_end_point_service_flow_name(String serviceFlow) throws InterruptedException
    {
        endpoint.updateServiceFlowName(serviceFlow);
    }

    @And("Copy Previously Created HTTP End Point URL$")
    public void copy_http_end_point_url()
    {
        endpoint.copyEndPointURL();
    }

    @And("Verify End Point URL Successfully Copied Message$")
    public void verify_end_point_url_copied_success()
    {
        endpoint.urlCopySuccess();
    }

    @Then("^View Previously Created End Point$")
    public void view_previously_created_end_point() throws InterruptedException {
        endpoint.viewEndPoint();
    }

    @And("Verify End Point View Mode$")
    public void verify_end_point_view_mode()
    {
        endpoint.verifyEndPointViewMode();
    }

    @And("Click Close Button on End Point View$")
    public void click_close_button_on_end_point_view() throws InterruptedException {
        endpoint.clickCloseButtonOnEndPointView();
    }

    @And("^Click on End Point Goto Flow Option$")
    public void click_end_point_go_to_flow_option() throws InterruptedException {
        endpoint.clickEndPointGoToFlowOption();
    }

    @Then("^Verify End Point Goto Flow Name as '(.*?)'$")
    public void verify_end_point_go_to_flow_name(String flowName) throws InterruptedException {
        endpoint.verifyEndPointGoToFlowName(flowName);
    }
}
