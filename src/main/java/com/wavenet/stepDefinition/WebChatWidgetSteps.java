package com.wavenet.stepDefinition;

import com.wavenet.pages.WebChatWidget;
import com.wavenet.util.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class WebChatWidgetSteps {

    private Config config = new Config();
    private WebChatWidget webChat = new WebChatWidget();

    @And("^Select Web Chat Widget Tab$")
    public void select_short_codes_tab() throws InterruptedException
    {
        webChat.selectWebChatWidget();
    }

    @And("^Click on Create Widget button$")
    public void click_on_create_short_code()
    {
        webChat.clickOnCreateWidget();
    }

    @Then("^Enter Web Chat Widget Name as '(.*?)'$")
    public void enter_web_chat_widget_name(String widgetName)
    {
        webChat.enterWebChatWidgetName(widgetName);
    }

    @And("^Enter Widget Title as '(.*?)'$")
    public void enter_web_chat_widget_title(String widgetTitle)
    {
        webChat.enterWebChatWidgetTitle(widgetTitle);
    }


    @And("^Enter Web Chat Widget Description as '(.*?)'$")
    public void enter_web_chat_widget_description(String widgetDesc)
    {
        webChat.enterWebChatWidgetDesc(widgetDesc);
    }

    @And("^Select Web Chat Widget Service Detections as '(.*?)'$")
    public void select_web_chat_widget_service_detection(String serviceDetection)
    {
        webChat.selectWebChatWidgetServiceDetection(serviceDetection);
    }

    @And("^Enter Web Chat Widget Domain Name as '(.*?)'$")
    public void enter_web_chat_widget_domain_name(String domainName)
    {
        webChat.enterWebChatWidgetDomainName(domainName);
    }

    @Then("^Click on Create Button on Web Chat Widget Create Page$")
    public void click_on_create_button_on_web_chat_widget_create_page()
    {
        webChat.clickOnWebChatWidgetCreate();
    }

    @And("^Search Web Chat Widget by Web Chat Widget Name '(.*?)'$")
    public void search_web_chat_widget_by_name(String widgetName)
    {
        webChat.searchWebChatWidgetByName(widgetName);
    }

    @Then("^Delete Created Web Chat Widget$")
    public void delete_created_web_chat_widget() throws InterruptedException
    {
        webChat.deleteWebChatWidget();
    }

    @Then("^Verify Web Chat Widget Name Allowed Characters Error Message$")
    public void verify_web_chat_widget_name_allowed_characters()
    {
        webChat.verifyWidgetNameValidCharacters();
    }

    @Then("^Verify Web Chat Widget Name Max Length Error Message$")
    public void verify_web_chat_widget_name_max_length()
    {
        webChat.verifyWidgetNameMaxLength();
    }

    @Then("^Verify Web Chat Widget Name Required Error Message$")
    public void verify_web_chat_widget_name_required()
    {
        webChat.verifyWidgetNameRequired();
    }

    @Then("^Verify Web Chat Widget Description Max Length Error Message$")
    public void verify_web_chat_widget_description_max_length()
    {
        webChat.verifyWidgetDescriptionMaxLength();
    }

    @Then("^Verify Web Chat Widget Flow Name Required Error Message$")
    public void verify_web_chat_widget_flow_name_required()
    {
        webChat.verifyWidgetFlowNameRequired();
    }

    @And("^Select Web Chat Widget Flow Name as '(.*?)'$")
    public void select_web_chat_widget_flow_name(String flowName) throws InterruptedException
    {
        webChat.selectWidgetFlowName(flowName);
    }

    @And("^Enter Web Chat Widget Domain Name for Static Service Detection as '(.*?)'$")
    public void enter_web_chat_widget_domain_name_for_static_service_detection(String domainName)
    {
        webChat.enterWebChatWidgetDomainNameForStaticServiceDetection(domainName);
    }

    @Then("^Verify Web Chat Widget Flow Name Invalid Error Message$")
    public void verify_web_chat_widget_flow_name_invalid()
    {
        webChat.verifyWidgetFlowNameInvalid();
    }

    @Then("^Verify Web Chat Widget Domain Name Invalid Error Message$")
    public void verify_web_chat_widget_domain_name_invalid()
    {
        webChat.verifyWidgetDomainNameInvalid();
    }

    @Then("^Verify Web Chat Widget Domain Name Required Error Message$")
    public void verify_web_chat_widget_domain_name_required()
    {
        webChat.verifyWidgetDomainNameRequired();
    }

    @Then("^Verify Web Chat Widget Domain Name Max Length$")
    public void verify_web_chat_widget_domain_name_max_length()
    {
        webChat.verifyWidgetDomainNameMaxLength();
    }

    @Then("^Click on Widget Button$")
    public void click_on_widget_button()
    {
        webChat.clickOnWebChatWidgetButton();
    }

    @And("^Enter Color Code for Web Chat Widget Button as '(.*?)'$")
    public void enter_color_code_for_web_chat_widget_button(String colorCode)
    {
        webChat.enterWidgetButtonColorCode(colorCode);
    }

    @Then("^Click on Edit Web Chat Widget$")
    public void click_on_edit_web_chat_widget() throws InterruptedException
    {
        webChat.editWebChatWidget();
    }

    @And("^Update Web Chat Widget Name as '(.*?)'$")
    public void update_web_chat_widget_name(String widgetName) throws InterruptedException {
        webChat.updateWebChatWidgetName(widgetName);
    }

    @Then("^Click on Update Button on Web Chat Widget Update UI$")
    public void click_on_update_button_on_web_chat_widget_update_ui()
    {
        webChat.clickOnUpdateButton();
    }

    @And("^Update Web Chat Widget Description as '(.*?)'$")
    public void update_web_chat_widget_description(String widgetDesc)
    {
        webChat.updateWebChatWidgetDesc(widgetDesc);
    }

    @And("^Update Web Chat Widget Service Detections as '(.*?)'$")
    public void update_web_chat_widget_service_detection(String serviceDetection)
    {
        webChat.updateWebChatWidgetServiceDetection(serviceDetection);
    }

    @And("^Update Web Chat Widget Flow Name as '(.*?)'$")
    public void update_web_chat_widget_flow_name(String flowName) throws InterruptedException
    {
        webChat.updateWidgetFlowName(flowName);
    }

    @And("^Update Web Chat Widget Domain Name as '(.*?)'$")
    public void update_web_chat_widget_domain_name(String widgetDomainName)
    {
        webChat.updateWebChatWidgetDomainName(widgetDomainName);
    }

    @Then("^Click on Widget Button on Update UI$")
    public void click_on_widget_button_on_update_ui()
    {
        webChat.clickOnWebChatWidgetButtonOnUpdateUI();
    }

    @And("^Update Color Code for Web Chat Widget Button as '(.*?)'$")
    public void update_color_code_for_web_chat_widget_button(String colorCode)
    {
        webChat.updateWidgetButtonColorCode(colorCode);
    }

    @And("^Click on Web Chat Widget Goto Flow Option$")
    public void click_web_chat_widget_go_to_flow_option() throws InterruptedException {
        webChat.clickWidgetGoToFlowOption();
    }

    @Then("^Verify Web Chat Widget Goto Flow Name as '(.*?)'$")
    public void verify_web_chat_widget_go_to_flow_name(String flowName) throws InterruptedException {
        webChat.verifyWidgetGoToFlowName(flowName);
    }
}
