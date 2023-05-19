package com.wavenet.stepDefinition;

//import com.wavenet.pages.Countries;
import com.wavenet.pages.Hospitals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HospitalsSteps {
    private Hospitals hospitals = new Hospitals();

    @Given("^Click on Hospitals$")
    public void click_on_Hospitals() throws Throwable {
        hospitals.click_on_Hospitals();
    }

    @Given("^Click on All hospitals$")
    public void click_on_All_hospitals() throws Throwable {
        hospitals.click_on_All_hospitals();
    }

    @Given("^Click on Add new hospitals$")
    public void click_on_Add_new_hospitals() throws Throwable {
        hospitals.click_on_Add_new_hospitals();
    }

    @Given("^Click on Create new organization group button$")
    public void click_on_Create_new_organization_group_button() throws Throwable {
        hospitals.click_on_Create_new_organization_group_button();
    }

    @Given("^Enter name for the organization as '(.*?)'$")
    public void enter_name_for_the_organization(String name) throws Throwable {
        hospitals.enter_name_for_the_organization(name);
    }

    @Given("^Upload logo image for organization$")
    public void upload_logo_image_for_organization() throws Throwable {
        hospitals.upload_logo_image_for_organization();
    }

    @Given("^Click on save and proceed button$")
    public void click_on_save_and_proceed_button() throws Throwable {
        hospitals.click_on_save_and_proceed_button();
    }

    @Given("^Select language for hospital$")
    public void select_language_for_hospital() throws Throwable {
        hospitals.select_language_for_hospital();
    }




    @Given("^Enter hospital name as '(.*?)'$")
    public void enter_hospital_name(String name) throws Throwable {
        hospitals.enter_hospital_name(name);
    }


    @Given("^Click on Add language button for hospital$")
    public void click_on_Add_language_button_for_hospital() throws Throwable {
        hospitals.click_on_Add_language_button_for_hospital();
    }

    @Given("^Select another language for hospital$")
    public void select_another_language_for_hospital() throws Throwable {
        hospitals.select_another_language_for_hospital();
    }

    @Given("^Enter another hospital name as '(.*?)'$")
    public void enter_another_hospital_name(String name) throws Throwable {
        hospitals.enter_another_hospital_name(name);
    }


    @Given("^Enter hospital code as '(.*?)'$")
    public void enter_hospital_code(String code) throws Throwable {
        hospitals.enter_hospital_code(code);
    }

    @Given("^Upload logo image for hospital$")
    public void upload_logo_image_for_hospital() throws Throwable {
        hospitals.upload_logo_image_for_hospital();
    }

    @Given("^Click on save button for hospital$")
    public void click_on_save_button_for_hospital() throws Throwable {
        hospitals.click_on_save_button_for_hospital();
    }

    @Then("^Display the success message for adding hospital as '(.*?)'$")
    public void display_the_success_message_for_adding_hospital(String successMsg) throws Throwable {
        hospitals.display_the_success_message_for_adding_hospital(successMsg);
    }



    @Given("^Select a organization from dropdown$")
    public void select_a_organization_from_dropdown() throws Throwable {
        hospitals.select_a_organization_from_dropdown();
    }

    @Given("^Click on Next button$")
    public void click_on_Next_button() throws Throwable {
        hospitals.click_on_Next_button();
    }

    @Then("^Display the success message for adding hospital with exiting organization group as '(.*?)'$")
    public void display_the_success_message_for_adding_hospital_with_exiting_organization_group(String successMsg) throws Throwable {
        hospitals.display_the_success_message_for_adding_hospital_with_exiting_organization_group(successMsg);
    }

    @Given("^Click on Update button for the hospital$")
    public void click_on_Update_button_for_the_hospital() throws Throwable {
        hospitals.click_on_Update_button_for_the_hospital();
    }

    @Given("^Click on configurations for the hospital$")
    public void click_on_configurations_for_the_hospital() throws Throwable {
        hospitals.click_on_configurations_for_the_hospital();
    }

    @Given("^Click on print configurations for the hospital$")
    public void click_on_print_configurations_for_the_hospital() throws Throwable {
        hospitals.click_on_print_configurations_for_the_hospital();
    }

    @Given("^Click on Add template button$")
    public void click_on_Add_template_button() throws Throwable {
        hospitals.click_on_Add_template_button();
    }

    @Given("^Enter template name for the template as '(.*?)'$")
    public void enter_template_name_for_the_template(String name) throws Throwable {
        hospitals.enter_template_name_for_the_template(name);
    }

    @Given("^Select print job for the template$")
    public void select_print_job_for_the_template() throws Throwable {
        hospitals.select_print_job_for_the_template();
    }

    @Given("^Enter content for the template as '(.*?)'$")
    public void enter_content_for_the_template(String content) throws Throwable {
        hospitals.enter_content_for_the_template(content);
    }

    @Given("^Upload logo image for the template$")
    public void upload_logo_image_for_the_template() throws Throwable {
        hospitals.upload_logo_image_for_the_template();
    }

    @Given("^Enter caption for the template as '(.*?)'$")
    public void enter_caption_for_the_template(String caption) throws Throwable {
        hospitals.enter_caption_for_the_template(caption);
    }

    @Given("^Click on add another image button$")
    public void click_on_add_another_image_button() throws Throwable {
        hospitals.click_on_add_another_image_button();
    }

    @Given("^Upload logo image again for the template$")
    public void upload_logo_image_again_for_the_template() throws Throwable {
        hospitals.upload_logo_image_again_for_the_template();
    }

    @Given("^Enter caption2 for the template as '(.*?)'$")
    public void enter_caption2_for_the_template(String caption2) throws Throwable {
        hospitals.enter_caption2_for_the_template(caption2);
    }

    @Given("^Mark as active for the template$")
    public void mark_as_active_for_the_template() throws Throwable {
        hospitals.mark_as_active_for_the_template();
    }

    @Given("^Click on save button$")
    public void click_on_save_button() throws Throwable {
        hospitals.click_on_save_button();
    }

    @Then("^Display the added template on the page$")
    public void display_the_added_template_on_the_page() throws Throwable {
        hospitals.display_the_added_template_on_the_page();
    }

    @Then("^Display table of templates available$")
    public void display_table_of_templates_available() throws Throwable {
        hospitals.display_table_of_templates_available();
    }

    @Given("^Change the number of pages to twenty$")
    public void change_the_number_of_pages_to_twenty() throws Throwable {
        hospitals.change_the_number_of_pages_to_twenty();
    }

    @Then("^Display the twenty or less than twenty entries for the templates$")
    public void display_the_twenty_or_less_than_twenty_entries_for_the_templates() throws Throwable {
        hospitals.display_the_twenty_or_less_than_twenty_entries_for_the_templates();
    }

    @Then("^Click on next button$")
    public void click_on_next_button() throws Throwable {
        hospitals.click_on_next_button();
    }

    @Then("^Click on previous button$")
    public void click_on_previous_button() throws Throwable {
        hospitals.click_on_previous_button();
    }

    @Then("^Click on multi next button$")
    public void click_on_multi_next_button() throws Throwable {
        hospitals.click_on_multi_next_button();
    }

    @Then("^Click on multi previous button$")
    public void click_on_multi_previous_button() throws Throwable {
        hospitals.click_on_multi_previous_button();
    }

    @When("^Click on Institutes delete Button in All Institutes Page$")
    public void click_on_Institutes_delete_Button_in_All_Institutes_Page() throws Throwable {
        hospitals.click_on_Institutes_delete_Button_in_All_Institutes_Page();
    }

    @When("^Verify Delete conformation message$")
    public void verify_Delete_conformation_message() throws Throwable {
        hospitals.verify_Delete_conformation_message();
    }
}
