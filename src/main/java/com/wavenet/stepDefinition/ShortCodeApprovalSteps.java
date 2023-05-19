package com.wavenet.stepDefinition;

import com.wavenet.pages.AccessCode;
import com.wavenet.pages.ShortCodeApproval;
import com.wavenet.util.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShortCodeApprovalSteps {

    private Config config = new Config();
    private AccessCode code = new AccessCode();
    private ShortCodeApproval approveCode = new ShortCodeApproval();

    @When("^Click on Approvals Icon in Compose$")
    public void click_on_approvals_icon_in_compose()
    {
        approveCode.clickApprovalsIcon();
    }

    @And("^Click on Short Code Requests Tab in Compose$")
    public void click_on_short_code_requests_tab()
    {
        approveCode.clickShortCodeRequestsTab();
    }

    @And("^Select USSD Short Code Tab in Short Code Approval$")
    public void select_ussd_short_code_tab_in_short_code_approval()
    {
        approveCode.selectUSSDShortCodeTab();
    }

    @And("^Search Short Code by Short Code '(.*?)'$")
    public void search_short_code_by_short_code(String shortCode) throws InterruptedException {
        approveCode.searchShortCodeByCode(shortCode);
    }

    @And("^Click on USSD Short Code Approve Icon$")
    public void click_on_ussd_short_code_approve_icon()
    {
        approveCode.clickUSSDShortCodeApproveIcon();
    }

    @Then("^Click on Yes Button on USSD Short Code Approve Confirmation Message$")
    public void click_on_yes_button_on_ussd_short_code_approve_confirmation_message()
    {
        approveCode.clickYesButtonOnUSSDCodeApproveConfirmation();
    }

    @Then("^Click on USSD Short Code Reject Icon$")
    public void click_on_ussd_short_code_reject_icon()
    {
        approveCode.clickUSSDShortCodeRejectIcon();
    }

    @And("^Enter Reject Short Code Request Comment as '(.*?)'$")
    public void enter_reject_short_code_request_comment(String comment)
    {
        approveCode.enterRejectShortCodeRequestComment(comment);
    }

    @Then("^Click on Submit Button on Reject Short Code Request Comment$")
    public void click_on_submit_button_on_reject_short_code_request_comment() throws InterruptedException {
        approveCode.clickOnSubmitButton();
    }

    @Then("^Click on Yes Button on USSD Short Code Reject Confirmation Message$")
    public void click_on_yes_button_on_ussd_short_code_reject_confirmation_message() throws InterruptedException {
        approveCode.clickYesButtonOnUSSDCodeRejectConfirmation();
    }

    @Then("^Click on USSD Short Code Approve Icon to Re-Approve$")
    public void click_on_ussd_short_code_approve_icon_to_re_approve() throws InterruptedException {
        approveCode.clickUSSDShortCodeApproveIconToReApprove();
    }

    @And("^Click on USSD Short Code Delete Icon$")
    public void click_on_ussd_short_code_delete_icon()
    {
        approveCode.clickUSSDShortCodeDeleteIcon();
    }

    @Then("^Click on Yes Button on USSD Short Code Request Delete Confirmation Message$")
    public void click_on_yes_button_on_ussd_short_code_request_delete_confirmation_message() {
        approveCode.clickYesButtonOnUSSDCodeDeleteConfirmation();
    }

    @And("^Select SMS Short Code Tab in Short Code Approval$")
    public void select_sms_short_code_tab_in_short_code_approval()
    {
        approveCode.selectSMSShortCodeTab();
    }

    @And("^Click on SMS Short Code Approve Icon$")
    public void click_on_sms_short_code_approve_icon()
    {
        approveCode.clickSMSShortCodeApproveIcon();
    }

    @Then("^Click on Yes Button on SMS Short Code Approve Confirmation Message$")
    public void click_on_yes_button_on_sms_short_code_approve_confirmation_message()
    {
        approveCode.clickYesButtonOnSMSCodeApproveConfirmation();
    }

    @Then("^Click on SMS Short Code Reject Icon$")
    public void click_on_sms_short_code_reject_icon()
    {
        approveCode.clickSMSShortCodeRejectIcon();
    }

    @Then("^Click on Yes Button on SMS Short Code Reject Confirmation Message$")
    public void click_on_yes_button_on_sms_short_code_reject_confirmation_message() throws InterruptedException {
        approveCode.clickYesButtonOnSMSCodeRejectConfirmation();
    }

    @Then("^Click on SMS Short Code Approve Icon to Re-Approve$")
    public void click_on_sms_short_code_approve_icon_to_re_approve() throws InterruptedException {
        approveCode.clickSMSShortCodeApproveIconToReApprove();
    }

    @And("^Click on SMS Short Code Delete Icon$")
    public void click_on_sms_short_code_delete_icon()
    {
        approveCode.clickSMSShortCodeDeleteIcon();
    }

    @Then("^Click on Yes Button on SMS Short Code Request Delete Confirmation Message$")
    public void click_on_yes_button_on_sms_short_code_request_delete_confirmation_message() {
        approveCode.clickYesButtonOnSMSCodeDeleteConfirmation();
    }

    @And("^Select IVR Short Code Tab in Short Code Approval$")
    public void select_ivr_short_code_tab_in_short_code_approval()
    {
        approveCode.selectIVRShortCodeTab();
    }

    @And("^Click on IVR Short Code Approve Icon$")
    public void click_on_ivr_short_code_approve_icon()
    {
        approveCode.clickIVRShortCodeApproveIcon();
    }

    @Then("^Click on Yes Button on IVR Short Code Approve Confirmation Message$")
    public void click_on_yes_button_on_ivr_short_code_approve_confirmation_message()
    {
        approveCode.clickYesButtonOnIVRCodeApproveConfirmation();
    }

    @Then("^Click on IVR Short Code Reject Icon$")
    public void click_on_ivr_short_code_reject_icon()
    {
        approveCode.clickIVRShortCodeRejectIcon();
    }

    @Then("^Click on Yes Button on IVR Short Code Reject Confirmation Message$")
    public void click_on_yes_button_on_ivr_short_code_reject_confirmation_message() throws InterruptedException {
        approveCode.clickYesButtonOnIVRCodeRejectConfirmation();
    }

    @Then("^Click on IVR Short Code Approve Icon to Re-Approve$")
    public void click_on_ivr_short_code_approve_icon_to_re_approve() throws InterruptedException {
        approveCode.clickIVRShortCodeApproveIconToReApprove();
    }

    @And("^Click on IVR Short Code Delete Icon$")
    public void click_on_ivr_short_code_delete_icon()
    {
        approveCode.clickIVRShortCodeDeleteIcon();
    }

    @Then("^Click on Yes Button on IVR Short Code Request Delete Confirmation Message$")
    public void click_on_yes_button_on_ivr_short_code_request_delete_confirmation_message() {
        approveCode.clickYesButtonOnIVRCodeDeleteConfirmation();
    }
}
