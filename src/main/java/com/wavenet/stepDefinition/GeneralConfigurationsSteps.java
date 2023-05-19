package com.wavenet.stepDefinition;

import com.wavenet.pages.PersonalInfo;
import com.wavenet.pages.GeneralConfigurations;
import com.wavenet.util.Config;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GeneralConfigurationsSteps {
    private PersonalInfo personalInfo = new PersonalInfo();
    private GeneralConfigurations generalConfigurations = new GeneralConfigurations();
    private Config config = new Config();
    String url = config.getUrl();

    @When("^Click on Configuration$")
    public void click_on_Configuration() throws Throwable {
        generalConfigurations.click_on_Configuration();
    }

    @When("^Click on Hospital$")
    public void click_on_Hospital() throws Throwable {
        generalConfigurations.click_on_Hospital();
    }

    @When("^Click on Business Hours$")
    public void click_on_Business_Hours() throws Throwable {
        generalConfigurations.click_on_Business_Hours();
    }

    @When("^Verify the General Configurations$")
    public void verify_the_General_Configurations() throws Throwable {
        generalConfigurations.verify_the_General_Configurations();
    }

    @When("^Click on the General Configurations Search Hospital Field$")
    public void click_on_the_General_Configurations_Search_Hospital_Field() throws Throwable {
        generalConfigurations.click_on_the_General_Configurations_Search_Hospital_Field();
    }

    @When("^Select or Enter Hospital Name$")
    public void select_or_Enter_Hospital_Name(String hospitalName) throws Throwable {
        generalConfigurations.select_or_Enter_Hospital_Name(hospitalName);
    }

    @When("^Select the (\\d+)x(\\d+) Operations Radio Button$")
    public void select_the_x_Operations_Radio_Button(int arg1, int arg2) throws Throwable {
        generalConfigurations.select_the_x_Operations_Radio_Button();

    }

    @Then("^Select the Custom hours Radio Button$")
    public void select_the_Custom_hours_Radio_Button() throws Throwable {
        generalConfigurations.select_the_Custom_hours_Radio_Button();

    }


}
