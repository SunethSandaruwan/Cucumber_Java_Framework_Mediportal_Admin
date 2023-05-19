package com.wavenet.stepDefinition;

import com.wavenet.pages.MyDoctor;
import com.wavenet.pages.PersonalInfo;
import com.wavenet.util.Config;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

public class MyDoctors {
    private PersonalInfo personalInfo = new PersonalInfo();
    private MyDoctor mydoctor = new MyDoctor();
    private Config config = new Config();
    String url = config.getUrl();

    //Click on main menu in Doctors element
    @When("^Click on Doctors$")
    public void click_on_Doctors() throws Throwable {
        mydoctor.click_on_Doctors();
    }

    //Click on My Doctors
    @When("^Click on My Doctors$")
    public void click_on_My_Doctors() throws Throwable {
        mydoctor.click_on_My_Doctors();
    }

    @When("^Verify the My Doctors page$")
    public void verify_the_My_Doctors_page() throws Throwable {
        mydoctor.verify_the_My_Doctors_page();
    }

    @When("^Select the Hospital Search Field '(.*?)'$")
    public void select_the_Hospital_Search_Field(String SearchName) throws Throwable {
        mydoctor.select_the_Hospital_Search_Field(SearchName);
    }

    @When("^Click on Assign Doctor Button$")
    public void click_on_Assign_Doctor_Button() throws Throwable {
        mydoctor.click_on_Assign_Doctor_Button();
    }

    @When("^Select the unassigned Doctor Name$")
    public void select_the_unassigned_Doctor_Name() throws Throwable {
        mydoctor.select_the_unassigned_Doctor_Name();
    }

    @When("^Click on Save Button$")
    public void click_on_Save_Button() throws Throwable {
        mydoctor.click_on_Save_Button();
    }

    @When("^Click on Cancel button$")
    public void click_on_Cancel_button() throws Throwable {
        mydoctor.click_on_Cancel_button();
    }

    @Then("^Verify the Assign Doctor name in Hospital$")
    public void verify_the_Assign_Doctor_name_in_Hospital() throws Throwable {

    }

    @When("^Check spelling should be correct$")
    public void check_spelling_should_be_correct() throws Throwable {
        mydoctor.check_spelling_should_be_correct();
    }

    @Then("^Click on Schedule$")
    public void click_on_Schedule() throws Throwable {

    }

        @Then("^Verify Doctor Schedule$")
        public void verify_Doctor_Schedule () throws Throwable {

        }

        @Then("^Select Institute in Search bar$")
        public void select_Institute_in_Search_bar () throws Throwable {

        }

        @Then("^Click on Add schedule$")
        public void click_on_Add_schedule () throws Throwable {

        }

        @Then("^Verify Institute search bar$")
        public void verify_Institute_search_bar () throws Throwable {


        }


    }
