package com.wavenet.stepDefinition;


import com.wavenet.pages.AllBookings;
import com.wavenet.util.ExcelReader;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class AllBookingSteps {

    private AllBookings allBookings = new AllBookings();

    @Then("^Click on Appointments$")
    public void click_on_Appointments() throws Throwable {
        allBookings.click_on_Appointments();
    }

    @Then("^Click on Bookings$")
    public void click_on_Bookings() throws Throwable {
        allBookings.click_on_Bookings();
    }

    @Then("^Verify the All Bookings page title$")
    public void verify_the_All_Bookings_page_title() throws Throwable {
        allBookings.verify_the_All_Bookings_page_title();
    }

    @Then("^Verify that display in keyword and date ranges text field$")
    public void verify_that_display_in_keyword_and_date_ranges_text_field() throws Throwable {
        allBookings.verify_that_display_in_keyword_and_date_ranges_text_field();
    }

    //------------7556--------------
    @Then("^Click on A appointment update$")
    public void click_on_A_appointment_update() throws Throwable {
        allBookings.click_on_A_appointment_update();
    }

    @Then("^Verify Update refunds page title$")
    public void verify_Update_refunds_page_title() throws Throwable {
        allBookings.verify_Update_refunds_page_title();
    }

    @Then("^Verify All of label in Update Refunds$")
    public void verify_All_of_label_in_Update_Refunds() throws Throwable {
        allBookings.verify_All_of_label_in_Update_Refunds();
    }

    @Then("^Verify All of Text fields in Update Refunds$")
    public void verify_All_of_Text_fields_in_Update_Refunds() throws Throwable {
        allBookings.verify_All_of_Text_fields_in_Update_Refunds();
    }

    @Then("^Select All Booking Search Institute '(.*?)'$")
    public void select_All_Booking_Search_Institute(String SearchInstitute) throws Throwable {
        allBookings.select_All_Booking_Search_Institute(SearchInstitute);
    }

    @Then("^Click on All Booking page first Booking Appointments Action column view button$")
    public void click_on_All_Booking_page_first_Booking_Appointments_Action_column_view_button() throws Throwable {
        allBookings.click_on_All_Booking_page_first_Booking_Appointments_Action_column_view_button();
    }

    @Then("^Check View Booking Details Appointment details$")
    public void check_View_Booking_Details_Appointment_details() throws Throwable {

    }

    @Then("^Click on View Booking Details Close Button$")
    public void click_on_View_Booking_Details_Close_Button() throws Throwable {


    }

    //-----------------------------Test Data Excell ---------------------------------------------

    @Then("^User fills the InstituteName from given sheetName \"([^\"]*)\" and rowNumber (\\d+)$")
    public void user_fills_the_InstituteName_from_given_sheetName_and_rowNumber(String SheetName, int RowNumber) throws Throwable {

        ExcelReader reader = new ExcelReader();
        List<Map<String,String>> testData =  reader.getData("/Users/sunethsandaruwan/Desktop/Automation.xlsx",SheetName);

        String AllBookingsInstituteSearchName =  testData.get(RowNumber).get("DoctorName");

        allBookings.userFillsTheInstituteNameFromGivenSheetNameAndRowNumber(AllBookingsInstituteSearchName);
    }

    @Then("^Verify All fields to be available under patient details$")
    public void verify_All_fields_to_be_available_under_patient_details() throws Throwable {

    }
}
