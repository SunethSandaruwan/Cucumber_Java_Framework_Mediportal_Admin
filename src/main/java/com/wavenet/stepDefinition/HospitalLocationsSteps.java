package com.wavenet.stepDefinition;

import com.wavenet.pages.HomePage;
import com.wavenet.pages.HospitalLocations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class HospitalLocationsSteps {

    private HospitalLocations hospitalLocations = new HospitalLocations();
    private HomePage homePage = new HomePage();

    @When("^Click on Hospital Locations$")
    public void click_on_Hospital_Locations() throws Throwable {
        hospitalLocations.click_on_Hospital_Locations();
    }

    @When("^Enter valid location name or display name '(.*?)'$")
    public void enter_valid_location_name_or_display_name(String SearchHospitalName) throws Throwable {
        hospitalLocations.enter_valid_location_name_or_display_name(SearchHospitalName);

    }

    @When("^Click valid utilization in drop down$")
    public void click_valid_utilization_in_drop_down() throws Throwable {

    }

    @When("^Enter valid description$")
    public void enter_valid_description() throws Throwable {

    }

    @Then("^Select valid chief$")
    public void select_valid_chief() throws Throwable {

    }

    @Then("^Click on update button in hospital location$")
    public void click_on_update_button_in_hospital_location() throws Throwable {

    }

    @Then("^Verify update conformation message$")
    public void verify_update_conformation_message() throws Throwable {

    }

    //-----------------------------Testcase: 7761-----------------------------------
    @Given("^Verify the Hospital Locations page title$")
    public void verify_the_Hospital_Locations_page_title() throws Throwable {
        // Insert in homePage
        homePage.verify_the_Hospital_Locations_page_title();

    }

    @Given("^Enter the Hospital Location or Search Hospital name$")
    public void enter_the_Hospital_Location_or_Search_Hospital_name() throws Throwable {

    }

    @Given("^Select Valid Hospital name$")
    public void select_Valid_Hospital_name() throws Throwable {

    }

    @Given("^Click on Hospital delete Button$")
    public void click_on_Hospital_delete_Button() throws Throwable {

    }


//----------------------DDH-7691------------------------

    @When("^Click on Institute Location Create New Button$")
    public void click_on_Institute_Location_Create_New_Button() throws Throwable {
        hospitalLocations.click_on_Institute_Location_Create_New_Button();
    }

    @When("^Click on Create Location and Select Institute '(.*?)'$")
    public void click_on_Create_Location_and_Select_Institute(String InstituteName) throws Throwable {
        hospitalLocations.click_on_Create_Location_and_Select_Institute(InstituteName);
    }

    @When("^Enter new Location in Create Location '(.*?)'$")
    public void enter_new_Location_in_Create_Location(String InstituteLocation) throws Throwable {
        hospitalLocations.enter_new_Location_in_Create_Location(InstituteLocation);
    }

    @When("^Enter new Location code in Create Location '(.*?)'$")
    public void enter_new_Location_code_in_Create_Location(String InstituteLocationCode) throws Throwable {
        hospitalLocations.enter_new_Location_code_in_Create_Location(InstituteLocationCode);
    }

    @When("^Select the utilization in Dropdown $")
    public void select_the_utilization_in_Dropdown( ) throws Throwable {
        hospitalLocations.select_the_utilization_in_Dropdown();
    }

    @When("^Enter Create Location Description '(.*?)'$")
    public void enter_Create_Location_Description(String LocationDescription) throws Throwable {
        hospitalLocations.enter_Create_Location_Description(LocationDescription);
    }

    @When("^Click on Create Location Save Button$")
    public void click_on_Create_Location_Save_Button() throws Throwable {
        hospitalLocations.click_on_Create_Location_Save_Button();
    }

    @Then("^Verify the Display as success message as Institute Location$")
    public void verify_the_Display_as_success_message_as_Institute_Location() throws Throwable {
        hospitalLocations.verify_the_Display_as_success_message_as_Institute_Location();
    }
}