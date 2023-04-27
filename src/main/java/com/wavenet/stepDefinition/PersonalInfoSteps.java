package com.wavenet.stepDefinition;

import com.wavenet.pages.Login;
import com.wavenet.pages.PersonalInfo;
import com.wavenet.util.Config;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PersonalInfoSteps {
    private PersonalInfo personalInfo = new PersonalInfo();
    private Config config = new Config();
    String url = config.getUrl();

    @Given("^Click on the name button$")
    public void click_on_the_name_button() throws Throwable {
        personalInfo.click_on_the_name_button();
    }

    @Given("^Click on personal info edit button$")
    public void click_on_personal_info_edit_button() throws Throwable {
        personalInfo.click_on_personal_info_edit_button();
    }

    @Then("^Redirect to profile page$")
    public void redirect_to_profile_page() throws Throwable {
        personalInfo.redirect_to_profile_page();
    }



    @Given("^Check first name as '(.*?)'$")
    public void check_first_name(String firstName) throws Throwable {
        personalInfo.check_first_name(firstName);
    }

    @Given("^Check last name as '(.*?)'$")
    public void check_last_name(String lastName) throws Throwable {
        personalInfo.check_last_name(lastName);
    }

    @Given("^Check email as '(.*?)'$")
    public void check_email(String email) throws Throwable {
        personalInfo.check_email(email);
    }

    @Given("^Check mobile number as '(.*?)'$")
    public void check_mobile_number(String mobileNo) throws Throwable {
        personalInfo.check_mobile_number(mobileNo);
    }

    @Given("^Select date of birth$")
    public void select_date_of_birth() throws Throwable {
        personalInfo.select_date_of_birth();
    }

    @Given("^Select gender$")
    public void select_gender() throws Throwable {
        personalInfo.select_gender();
    }

    @Given("^Select nationality$")
    public void select_nationality() throws Throwable {
        personalInfo.select_nationality();
    }

    @Given("^Enter national identification number as '(.*?)'$")
    public void enter_national_identification_number(String idNumber) throws Throwable {
        personalInfo.enter_national_identification_number(idNumber);
    }

    @Given("^Click on personal info update button$")
    public void click_on_personal_info_update_button() throws Throwable {
        personalInfo.click_on_personal_info_update_button();
    }

    @Then("^Display success message for Personal Info Update as '(.*?)'$")
    public void display_success_message_for_Personal_Info_Update(String successMsg) throws Throwable {
        personalInfo.display_success_message_for_Personal_Info_Update(successMsg);
    }

    @Given("^Edit first name as '(.*?)'$")
    public void edit_first_name(String editFirstName) throws Throwable {
        personalInfo.edit_first_name(editFirstName);
    }

    @Given("^Edit last name as '(.*?)'$")
    public void edit_last_name(String editLastName) throws Throwable {
        personalInfo.edit_last_name(editLastName);
    }

    @Given("^Edit email as '(.*?)'$")
    public void edit_email(String editEmail) throws Throwable {
        personalInfo.edit_email(editEmail);
    }

    @Given("^Edit date of birth$")
    public void edit_date_of_birth() throws Throwable {
        personalInfo.edit_date_of_birth();
    }

    @Given("^Edit gender$")
    public void edit_gender() throws Throwable {
        personalInfo.edit_gender();
    }

    @Given("^Edit nationality$")
    public void edit_nationality() throws Throwable {
        personalInfo.edit_nationality();
    }

    @Given("^Edit national identification number as '(.*?)'$")
    public void edit_national_identification_number(String editIdNo) throws Throwable {
        personalInfo.edit_national_identification_number(editIdNo);
    }


    @Then("^Display First Name as '(.*?)'$")
    public void display_First_Name(String displayFirstName) throws Throwable {
        personalInfo.display_First_Name(displayFirstName);
    }

    @Then("^Display Last Name as '(.*?)'$")
    public void display_Last_Name(String displayLastName) throws Throwable {
        personalInfo.display_Last_Name(displayLastName);
    }

    @Then("^Display Email as '(.*?)'$")
    public void display_Email(String displayEmail) throws Throwable {
        personalInfo.display_Email(displayEmail);
    }

//    @Then("^Display DOB as '(\\d+)/(\\d+)/(\\d+)'$")
    @Then("^Display DOB as '(.*?)'$")
    public void display_DOB(String displayDob) throws Throwable {
        personalInfo.display_DOB(displayDob);
    }

    @Then("^Display Gender as '(.*?)'$")
    public void display_Gender(String displayGender) throws Throwable {
        personalInfo.display_Gender(displayGender);
    }

    @Then("^Display MSISDN as '(.*?)'$")
    public void display_MSISDN(String displayMSISDN) throws Throwable {
        personalInfo.display_MSISDN(displayMSISDN);
    }

    @Then("^Display Nationality as '(.*?)'$")
    public void display_Nationality(String displayNationality) throws Throwable {
        personalInfo.display_Nationality(displayNationality);
    }

    @Then("^Display National Identification Number as '(.*?)'$")
    public void display_National_Identification_Number(String displayIdNo) throws Throwable {
        personalInfo.display_National_Identification_Number(displayIdNo);
    }


    @Given("^Click on camera icon and upload an image$")
    public void click_on_camera_icon_and_upload_an_image() throws Throwable {
        personalInfo.click_on_camera_icon_and_upload_an_image();
    }

    @Given("^Edit profile image$")
    public void edit_profile_image() throws Throwable {
        personalInfo.edit_profile_image();
    }

    @Then("^Display success message for profile image upload as '(.*?)'$")
    public void display_success_message_for_profile_image_upload(String successMsg) throws Throwable {
        personalInfo.display_success_message_for_profile_image_upload(successMsg);
    }

    @Given("^Click on camera icon and edit profile image$")
    public void click_on_camera_icon_and_edit_profile_image() throws Throwable {
        personalInfo.click_on_camera_icon_and_edit_profile_image();
    }

    @Then("^Display profile image$")
    public void display_profile_image() throws Throwable {
        personalInfo.display_profile_image();
    }


    @Given("^Click on camera icon and select one profile image$")
    public void click_on_camera_icon_and_select_one_profile_image() throws Throwable {
        personalInfo.click_on_camera_icon_and_select_one_profile_image();
    }

    @Given("^Select another profile image$")
    public void select_another_profile_image() throws Throwable {
        personalInfo.select_another_profile_image();
    }





    @Given("^Click on camera icon and crop profile image$")
    public void click_on_camera_icon_and_crop_profile_image() throws Throwable {
        personalInfo.click_on_camera_icon_and_crop_profile_image();
    }





    @Given("^Click on image delete icon$")
    public void click_on_image_delete_icon() throws Throwable {
        personalInfo.click_on_image_delete_icon();
    }

    @Then("^Display the delete success message as '(.*?)'$")
    public void display_the_delete_success_message(String deleteMsg) throws Throwable {
        personalInfo.display_the_delete_success_message(deleteMsg);
    }

}
