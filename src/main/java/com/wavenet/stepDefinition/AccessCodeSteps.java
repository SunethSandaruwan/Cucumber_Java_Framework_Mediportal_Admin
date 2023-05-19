package com.wavenet.stepDefinition;

import com.wavenet.pages.AccessCode;
import com.wavenet.util.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AccessCodeSteps {

    private Config config = new Config();
    private AccessCode code = new AccessCode();

    @And("^Select Short Codes Tab$")
    public void select_short_codes_tab() throws InterruptedException {
        code.selectShortCodes();
    }

    @And("^Click on Create Short Code button$")
    public void click_on_create_short_code()
    {
        code.clickOnCreateShortCode();
    }

    @Then("^Enter Short Code Type as '(.*?)'$")
    public void select_short_code_type(String shortCodeType)
    {
        code.enterShortCodeType(shortCodeType);
    }

    @And("^Enter Short Code Name as '(.*?)'$")
    public void enter_short_code_name(String shortCodeName)
    {
        code.enterShortCodeName(shortCodeName);
    }

    @And("^Enter Short Code Description as '(.*?)'$")
    public void enter_short_code_description(String shortCodeDesc)
    {
        code.enterShortCodeDesc(shortCodeDesc);
    }

    @And("^Select Executed Flow from Flow Dropdown List as '(.*?)'$")
    public void select_executed_flow(String flowName) throws InterruptedException {
        code.selectExecutedFlow(flowName);
    }

    @And("^Enter Short Code as '(.*?)'$")
    public void enter_short_code(String shortCode)
    {
        code.enterShortCode(shortCode);
    }

    @Then("^Click on Create Button on Short Code Create Page$")
    public void click_on_create_button()
    {
        code.clickOnCreateButton();
    }

    @And("^Search USSD Short Code by Short Code Name '(.*?)'$")
    public void search_ussd_short_code_by_name(String shortCodeName){
        code.searchUSSDShortCodeByName(shortCodeName);
    }

    @And("^Search SMS Short Code by Short Code Name '(.*?)'$")
    public void search_sms_short_code_by_name(String shortCodeName){
        code.searchSMSShortCodeByName(shortCodeName);
    }

    @And("^Search IVR Short Code by Short Code Name '(.*?)'$")
    public void search_ivr_short_code_by_name(String shortCodeName){
        code.searchIVRShortCodeByName(shortCodeName);
    }

    @Then("^Delete Created USSD Short Code$")
    public void delete_created_ussd_short_code() throws InterruptedException {
        code.deleteUSSDShortCode();
    }

    @Then("^Delete Created SMS Short Code$")
    public void delete_created_sms_short_code() throws InterruptedException {
        code.deleteSMSShortCode();
    }

    @Then("^Delete Created IVR Short Code$")
    public void delete_created_ivr_short_code() throws InterruptedException {
        code.deleteIVRShortCode();
    }

    @Then("^Verify Short Code Type Required Error Message$")
    public void verify_short_code_type_required()
    {
        code.verifyShortCodeTypeRequired();
    }

    @Then("^Verify Short Code Name Max Length Error Message$")
    public void verify_short_code_name_max_length()
    {
        code.verifyShortCodeNameMaxLength();
    }

    @Then("^Verify Short Code Name Required Error Message$")
    public void verify_short_code_name_required()
    {
        code.verifyShortNameRequired();
    }

    @Then("^Verify Duplicate Short Code Name Error Message$")
    public void verify_short_code_name_duplicated()
    {
        code.verifyShortNameDuplicated();
    }

    @And("^Click on Back Button on Short Code Create GUI$")
    public void click_back_button_on_short_code_create_page()
    {
        code.clickBackButton();
    }

    @Then("^Verify Short Code Description Max Length Error Message$")
    public void verify_short_code_description_max_length()
    {
        code.verifyShortCodeDescMaxLength();
    }

    @Then("^Verify Flow Validate Error Message$")
    public void verify_flow_validate_error_message()
    {
        code.validateFlow();
    }

    @Then("^Verify Flow Required Error Message$")
    public void verify_flow_required()
    {
        code.verifyFlowRequired();
    }

    @Then("^Verify Short Code Invalid Characters Error Message$")
    public void verify_short_code_invalid_characters()
    {
        code.verifyShortCodeInvalidCharacters();
    }

    @Then("^Verify Short Code Required Error Message$")
    public void verify_short_code_code_required()
    {
        code.verifyShortCodeCodeRequired();
    }

    @Then("^Verify SMS Short Code Invalid Characters Error Message$")
    public void verify_sms_short_code_invalid_characters()
    {
        code.verifySMSShortCodeInvalidCharacters();
    }

    @And("^Select IVR Call Type as inbound$")
    public void select_ivr_call_type_as_inbound()
    {
        code.selectCallTypeAsInbound();
    }

    @And("^Select IVR Control Type as '(.*?)'$")
    public void select_ivr_control_type(String controlType)
    {
        code.selectIVRControlType(controlType);
    }

    @And("^Select IVR Audio Codec Type as '(.*?)'$")
    public void select_ivr_audio_codec_type(String audioCodec)
    {
        code.selectIVRAudioCodec(audioCodec);
    }

    @Then("^Verify IVR Short Code Invalid Characters Error Message$")
    public void verify_ivr_short_code_invalid_characters() throws InterruptedException {
        code.verifyIVRShortCodeInvalidCharacters();
    }

    @And("^Select IVR Call Type as outbound$")
    public void select_ivr_call_type_as_outbound()
    {
        code.selectCallTypeAsOutbound();
    }

    @Then("^Verify IVR Call Type Required Error Message$")
    public void verify_ivr_call_type_required()
    {
        code.verifyIVRCallTypeRequired();
    }

    @Then("^Verify IVR Control Type Required Error Message$")
    public void verify_ivr_control_type_required()
    {
        code.verifyIVRControlTypeRequired();
    }

    @Then("^Verify IVR Audio Codec Type Required Error Message$")
    public void verify_ivr_audio_codec_type_required()
    {
        code.verifyIVRAudioCodecTypeRequired();
    }

    @And("^Select IVR Short Code Early Media Check Box$")
    public void select_early_media_check_box()
    {
        code.selectEarlyMediaCheckBox();
    }

    @And("^Deselect IVR Short Code Early Media Check Box$")
    public void deselect_early_media_check_box()
    {
        code.deselectEarlyMediaCheckBox();
    }

    @And("^Select IVR Short Code IVR Conferencing Support Check Box$")
    public void select_ivr_conferencing_support_check_box()
    {
        code.selectIVRConferencingSupportCheckBox();
    }

    @And("^Deselect IVR Short Code IVR Conferencing Support Check Box$")
    public void deselect_ivr_conferencing_support_check_box()
    {
        code.deselectIVRConferencingSupportCheckBox();
    }

    @And("^Select IVR Short Code IVR Save Channel Info Check Box$")
    public void select_ivr_save_channel_info_check_box()
    {
        code.selectIVRSaveChannelInfoCheckBox();
    }

    @And("^Deselect IVR Short Code IVR Save Channel Info Check Box$")
    public void deselect_ivr_save_channel_info_check_box()
    {
        code.deselectIVRSaveChannelInfoCheckBox();
    }

    @And("^Select USSD Short Code Tab$")
    public void select_ussd_short_code_tab()
    {
        code.selectUSSDShortCodeTab();
    }

    @Then("^Click on USSD Short Code Edit Button$")
    public void click_on_ussd_short_code_edit_button() throws InterruptedException {
        code.clickUSSDShortCodeEditButton();
    }

    @And("^Update Short Code Description as '(.*?)'$")
    public void update_ussd_short_code_description(String shortCodeDesc) throws InterruptedException {
        code.updateShortCodeDescription(shortCodeDesc);
    }

    @And("^Click on Update Button on Short Code Update UI$")
    public void click_on_update_button_on_update_ui(){
        code.clickShortCodeUpdate();
    }

    @And("^Click on Back Button on Short Code Update GUI$")
    public void click_back_button_on_short_code_update_page()
    {
        code.clickBackButtonOnUpdatePage();
    }

    @And("^Update Executed Flow from Flow Dropdown List as '(.*?)'$")
    public void update_executed_flow(String flowName)
    {
        code.updateExecutedFlowName(flowName);
    }

    @And("^Update Executed Flow as Empty$")
    public void update_executed_flow_empty()
    {
        code.updateExecutedFlowNameEmpty();
    }

    @And("^Update Short Code Code as '(.*?)'$")
    public void update_ussd_short_code_code(String shortCode) throws InterruptedException
    {
        code.updateShortCodeCode(shortCode);
    }

    @And("^Select SMS Short Code Tab$")
    public void select_sms_short_code_tab()
    {
        code.selectSMSShortCodeTab();
    }

    @Then("^Click on SMS Short Code Edit Button$")
    public void click_on_sms_short_code_edit_button() throws InterruptedException {
        code.clickSMSShortCodeEditButton();
    }

    @And("^Select IVR Short Code Tab$")
    public void select_ivr_short_code_tab()
    {
        code.selectIVRShortCodeTab();
    }

    @Then("^Click on IVR Short Code Edit Button$")
    public void click_on_ivr_short_code_edit_button() throws InterruptedException {
        code.clickIVRShortCodeEditButton();
    }

    @And("^Update Short Code Name as '(.*?)'$")
    public void update_ivr_short_code_name(String shortCodeName) throws InterruptedException {
        code.updateShortCodeName(shortCodeName);
    }

    @And("^Update IVR Short Code Call Type as OutBound$")
    public void update_ivr_call_type_as_outbound() throws InterruptedException
    {
        code.selectOrDeselectInboundUpdate();
        code.selectOrDeselectOutboundUpdate();
    }

    @And("^Update IVR Short Code Call Type as Inbound$")
    public void update_ivr_call_type_as_inbound() throws InterruptedException
    {
        code.selectOrDeselectInboundUpdate();
        code.selectOrDeselectOutboundUpdate();
    }

    @And("^Update IVR Short Code Call Type as Both$")
    public void update_ivr_call_type_as_both() throws InterruptedException
    {
        code.selectOrDeselectOutboundUpdate();
    }

    @And("^Update IVR Short Code Call Type Empty$")
    public void update_ivr_call_type_as_empty() throws InterruptedException
    {
        code.selectOrDeselectInboundUpdate();
        code.selectOrDeselectOutboundUpdate();
    }

    @And("^Update IVR Short Code Control Type as '(.*?)'$")
    public void update_ivr_control_type(String controlType) throws InterruptedException
    {
        code.updateIVRControlType(controlType);
    }

    @And("^Update IVR Short Code Audio Codec as '(.*?)'$")
    public void update_ivr_audio_codec(String audioCodec) throws InterruptedException
    {
        code.updateIVRAudioCodec(audioCodec);
    }

    @And("^Update IVR Short Code Early Media Check Box Deselected$")
    public void update_ivr_early_media_checkbox_deselected() throws InterruptedException
    {
        code.selectOrDeselectEarlyMediaUpdate();
    }

    @And("^Update IVR Short Code Early Media Check Box Selected$")
    public void update_ivr_early_media_checkbox_selected() throws InterruptedException
    {
        code.selectOrDeselectEarlyMediaUpdate();
    }

    @And("^Update IVR Short Code IVR Conferencing Support Check Box Deselected$")
    public void update_ivr_conferencing_support_checkbox_deselected() throws InterruptedException
    {
        code.selectOrDeselectConferencingSupportUpdate();
    }

    @And("^Update IVR Short Code IVR Conferencing Support Check Box Selected$")
    public void update_ivr_conferencing_support_checkbox_selected() throws InterruptedException
    {
        code.selectOrDeselectConferencingSupportUpdate();
    }

    @And("^Update IVR Short Code IVR Save Channel Info Check Box Deselected$")
    public void update_ivr_save_channel_info_checkbox_deselected() throws InterruptedException
    {
        code.selectOrDeselectSaveChannelInfoUpdate();
    }

    @And("^Update IVR Short Code IVR Save Channel Info Check Box Selected$")
    public void update_ivr_save_channel_info_checkbox_selected() throws InterruptedException
    {
        code.selectOrDeselectSaveChannelInfoUpdate();
    }

    @Then("^View Previously Created USSD Short Code$")
    public void view_previously_created_ussd_short_code() throws InterruptedException {
        code.viewUSSDShortCode();
    }

    @And("^Verify USSD Short Code View Mode$")
    public void verify_ussd_short_code_view_mode()
    {
        code.verifyUSSDShortCodeViewMode();
    }

    @And("^Click Close Button on USSD Short Code View$")
    public void click_close_button_on_ussd_short_code_view() throws InterruptedException {
        code.clickCloseButtonOnUSSDShortCodeView();
    }

    @Then("^Delete Created USSD Short Code After View$")
    public void delete_created_ussd_short_code_after_view() throws InterruptedException {
        code.deleteUSSDShortCodeAfterView();
    }

    @Then("^View Previously Created IVR Short Code$")
    public void view_previously_created_ivr_short_code() throws InterruptedException {
        code.viewIVRShortCode();
    }

    @And("^Verify IVR Short Code View Mode$")
    public void verify_ivr_short_code_view_mode()
    {
        code.verifyIVRShortCodeViewMode();
    }

    @And("^Click Close Button on IVR Short Code View$")
    public void click_close_button_on_ivr_short_code_view() throws InterruptedException {
        code.clickCloseButtonOnIVRShortCodeView();
    }

    @Then("^Delete Created IVR Short Code After View$")
    public void delete_created_ivr_short_code_after_view() throws InterruptedException {
        code.deleteIVRShortCodeAfterView();
    }

    @Then("^View Previously Created SMS Short Code$")
    public void view_previously_created_sms_short_code() throws InterruptedException {
        code.viewSMSShortCode();;
    }

    @And("^Verify SMS Short Code View Mode$")
    public void verify_sms_short_code_view_mode()
    {
        code.verifySMSShortCodeViewMode();
    }

    @And("^Click Close Button on SMS Short Code View$")
    public void click_close_button_on_sms_short_code_view() throws InterruptedException {
        code.clickCloseButtonOnSMSShortCodeView();
    }

    @Then("^Delete Created SMS Short Code After View$")
    public void delete_created_sms_short_code_after_view() throws InterruptedException {
        code.deleteSMSShortCodeAfterView();
    }

    @Then("^Verify IVR Short Code Description Required Error Message$")
    public void verify_ivr_short_code_description_required()
    {
        code.verifyIVRShortCodeDescriptionRequired();
    }

    @Then("^Delete Created USSD Short Code After Update$")
    public void delete_created_ussd_short_code_after_update() throws InterruptedException {
        code.deleteUSSDShortCodeAfterView();
    }

    @Then("^Verify Access Code Contains Invalid Characters Error Message$")
    public void verify_access_code_contains_invalid_characters_error_message()
    {
        code.verifyAccessCodeContainsInvalidChars();
    }

    @And("^Click on USSD Short Code Goto Flow Option$")
    public void click_ussd_short_code_go_to_flow_option() throws InterruptedException {
        code.clickUSSDShortCodeGoToFlowOption();
    }

    @Then("^Verify USSD Short Code Goto Flow Name as '(.*?)'$")
    public void verify_ussd_short_code_go_to_flow_name(String flowName) throws InterruptedException {
        code.verifyUSSDShortCodeGoToFlowName(flowName);
    }

    @And("^Select Agents Tab$")
    public void select_agents_tab()
    {
        code.selectAgentsTab();
    }

    @And("^Click on SMS Short Code Goto Flow Option$")
    public void click_sms_short_code_go_to_flow_option() throws InterruptedException {
        code.clickSMSShortCodeGoToFlowOption();
    }

    @Then("^Verify SMS Short Code Goto Flow Name as '(.*?)'$")
    public void verify_sms_short_code_go_to_flow_name(String flowName) throws InterruptedException {
        code.verifySMSShortCodeGoToFlowName(flowName);
    }

    @And("^Click on IVR Short Code Goto Flow Option$")
    public void click_ivr_short_code_go_to_flow_option() throws InterruptedException {
        code.clickIVRShortCodeGoToFlowOption();
    }

    @Then("^Verify IVR Short Code Goto Flow Name as '(.*?)'$")
    public void verify_ivr_short_code_go_to_flow_name(String flowName) throws InterruptedException {
        code.verifyIVRShortCodeGoToFlowName(flowName);
    }

    @And("^Select USSD Short Code Skip Menu Check Box$")
    public void select_skip_menu_check_box()
    {
        code.selectSkipMenuCheckBox();
    }

    @And("^Update USSD Short Code Skip Menu Check Box$")
    public void update_skip_menu_check_box()
    {
        code.updateSkipMenuCheckBox();
    }
}
