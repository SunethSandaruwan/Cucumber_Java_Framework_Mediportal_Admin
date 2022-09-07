package com.wavenet.stepDefinition;

import com.wavenet.pages.Login;
import com.wavenet.pages.ProfessionalDetails;
import com.wavenet.util.Config;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ProfessionalDetailsSteps {

    private ProfessionalDetails professionalDetails = new ProfessionalDetails();
    private Config config = new Config();
    String url = config.getUrl();

    @Given("^Click on Professional Details button$")
    public void click_on_Professional_Details_button() throws Throwable {
        professionalDetails.click_on_Professional_Details_button();
    }

    @Given("^Click on update button$")
    public void click_on_update_button() throws Throwable {
        professionalDetails.click_on_update_button();
    }
    @Given("^Click on update button with empty input fields$")
    public void click_on_update_button_with_empty_input_fields() throws Throwable {
        professionalDetails.click_on_update_button_with_empty_input_fields();
    }


    @Then("^Display validation for list of practice as '(.*?)'$")
    public void display_validation_for_list_of_practice(String validationMsg) throws Throwable {
        professionalDetails.display_validation_for_list_of_practice(validationMsg);
    }

    @Then("^Display validation for languages accepted as '(.*?)'$")
    public void display_validation_for_languages_accepted(String validationMsg) throws Throwable {
        professionalDetails.display_validation_for_languages_accepted(validationMsg);
    }

    @Then("^Display validation for bank name field outline colour$")
    public void display_validation_for_bank_name_field_outline_colour( ) throws Throwable {
        professionalDetails.display_validation_for_bank_name_field_outline_colour();
    }

    @Then("^Display validation for account number as '(.*?)'$")
    public void display_validation_for_account_number(String validationMsg) throws Throwable {
        professionalDetails.display_validation_for_account_number(validationMsg);
    }


    @Given("^Enter first list of practises$")
    public void enter_first_list_of_practises() throws Throwable {
        professionalDetails.enter_first_list_of_practises();
    }

    @Given("^Enter second list of practises$")
    public void enter_second_list_of_practises() throws Throwable {
        professionalDetails.enter_second_list_of_practises();
    }

    @Given("^Enter third list of practises$")
    public void enter_third_list_of_practises() throws Throwable {
        professionalDetails.enter_third_list_of_practises();
    }

    @Given("^Enter fourth list of practises$")
    public void enter_fourth_list_of_practises() throws Throwable {
        professionalDetails.enter_fourth_list_of_practises();
    }

    @Given("^Enter fifth list of practises$")
    public void enter_fifth_list_of_practises() throws Throwable {
        professionalDetails.enter_fifth_list_of_practises();
    }

    @Given("^Enter sixth list of practises$")
    public void enter_sixth_list_of_practises() throws Throwable {
        professionalDetails.enter_sixth_list_of_practises();
    }

    @Then("^Display validation text for list of practices as '(.*?)'$")
    public void display_validation_text_for_list_of_practices(String validationMsg) throws Throwable {
        professionalDetails.display_validation_text_for_list_of_practices(validationMsg);
    }


//////
    @Given("^Enter languages accepted$")
    public void enter_languages_accepted() throws Throwable {
        professionalDetails.enter_languages_accepted();
    }

    @Given("^Select qualifications$")
    public void select_qualifications() throws Throwable {
        professionalDetails.select_qualifications();
    }

    @Given("^Enter practice ID$")
    public void enter_practice_ID() throws Throwable {
        professionalDetails.enter_practice_ID();
    }

    @Given("^Select bank name$")
    public void select_bank_name() throws Throwable {
        professionalDetails.select_bank_name();
    }


    @Given("^Enter account number$")
    public void enter_account_number() throws Throwable {
        professionalDetails.enter_account_number();
    }

    @Given("^Enter Branch ID$")
    public void enter_Branch_ID() throws Throwable {
        professionalDetails.enter_Branch_ID();
    }

    @Given("^Enter beneficiary name$")
    public void enter_beneficiary_name() throws Throwable {
        professionalDetails.enter_beneficiary_name();
    }

    @Given("^Enter bank address$")
    public void enter_bank_address() throws Throwable {
        professionalDetails.enter_bank_address();
    }

    @Given("^Enter IBAN or SWIFT$")
    public void enter_IBAN_or_SWIFT() throws Throwable {
        professionalDetails.enter_IBAN_or_SWIFT();
    }

    @Given("^Click on update button to update$")
    public void click_on_update_button_to_update() throws Throwable {
        professionalDetails.click_on_update_button_to_update();
    }

    @Then("^Display success message as '(.*?)'$")
    public void display_success_message(String successMsg) throws Throwable {
        professionalDetails.display_success_message(successMsg);
    }

    @Given("^Wait  some time$")
    public void wait_some_time() throws Throwable {
        professionalDetails.wait_some_time();
    }
}
