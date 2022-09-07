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
}
