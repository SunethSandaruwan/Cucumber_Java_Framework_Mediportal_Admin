package com.wavenet.stepDefinition;


import com.wavenet.pages.AllBookings;
import cucumber.api.java.en.Then;

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
}
