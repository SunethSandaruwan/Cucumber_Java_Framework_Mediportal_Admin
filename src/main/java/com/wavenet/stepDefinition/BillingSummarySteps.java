package com.wavenet.stepDefinition;

import com.wavenet.pages.BillingSummary;
import com.wavenet.pages.FinanceDashBoard;
import com.wavenet.pages.HomePage;
import com.wavenet.pages.Login;
import com.wavenet.util.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BillingSummarySteps {

    private HomePage homePage = new HomePage();
    private FinanceDashBoard financeDashBoard = new FinanceDashBoard();

    private BillingSummary billingSummary = new BillingSummary();
    private Login login = new Login();
    private Config config = new Config();
    String url = config.getUrl();

    @Then("^Click on Billing Summary$")
    public void click_on_Billing_Summary() throws Throwable {
        billingSummary.click_on_Billing_Summary();
    }

    @Then("^Verify the Finance Billing Summary Title$")
    public void verify_the_Finance_Billing_Summary_Title() throws Throwable {
        billingSummary.verify_the_Finance_Billing_Summary_Title();
    }

    @Then("^Verify the Finance medical center search box$")
    public void verify_the_Finance_medical_center_search_box() throws Throwable {
        billingSummary.verify_the_Finance_medical_center_search_box();
    }

    @Then("^Verify the Global report Configuration$")
    public void verify_the_Global_report_Configuration() throws Throwable {
        billingSummary.verify_the_Global_report_Configuration();
    }

    @Then("^Verify the Finance Export$")
    public void verify_the_Finance_Export() throws Throwable {
        billingSummary.verify_the_Finance_Export();
    }

    @Then("^Verify the Data and Time Range$")
    public void verify_the_Data_and_Time_Range() throws Throwable {
        billingSummary.verify_the_Data_and_Time_Range();
    }

    @Then("^Verify the Search practitioner$")
    public void verify_the_Search_practitioner() throws Throwable {
        billingSummary.verify_the_Search_practitioner();
    }

    @Then("^Verify the Filter by Day$")
    public void verify_the_Filter_by_Day() throws Throwable {
        billingSummary.verify_the_Filter_by_Day();
    }

    @Then("^Verify the Billing Summary Grid Column title$")
    public void verify_the_Billing_Summary_Grid_Column_title() throws Throwable {
        billingSummary.verify_the_Billing_Summary_Grid_Column_title();
    }

    @Then("^Verify the Total Column$")
    public void verify_the_Total_Column() throws Throwable {
        billingSummary.verify_the_Total_Column();
    }

    @When("^Select Billing Summary Medical Center$")
    public void select_Billing_Summary_Medical_Center() throws Throwable {
        billingSummary.select_Billing_Summary_Medical_Center();
    }

    @When("^Verify the refresh Data in Billing Summary Table$")
    public void verify_the_refresh_Data_in_Billing_Summary_Table() throws Throwable {

    }

    @Then("^Select Billing Summary Practitioner Search Box$")
    public void select_Billing_Summary_Practitioner_Search_Box() throws Throwable {
        billingSummary.select_Billing_Summary_Practitioner_Search_Box();
    }

    @Then("^Verify the Practitioner vs Details$")
    public void verify_the_Practitioner_vs_Details() throws Throwable {

    }

    @Then("^Enter Valid Practitioner Name '(.*?)'$")
    public void enter_Valid_Practitioner_Name() throws Throwable{
        billingSummary.enter_Valid_Practitioner_Name();
       // PractitionerName
    }

    @Then("^Click on filter by date Field$")
    public void click_on_filter_by_date_Field() throws Throwable {
        billingSummary.click_on_filter_by_date_Field();
    }

    @Then("^Select Yesterday in filter by date Field$")
    public void select_Yesterday_in_filter_by_date_Field() throws Throwable {
        billingSummary.select_Yesterday_in_filter_by_date_Field();
    }

    @Then("^Verify the Practitioner vs Yesterday Details '(.*?)', '(.*?)', '(.*?)', '(.*?)', '(.*?)'$")
    public void verify_the_Practitioner_vs_Yesterday_Details(String PractitionerName,String NoOfPatients,String InvoiceCount,String ServiceCount,String TotalFee) throws Throwable {
        billingSummary.verify_the_Practitioner_vs_Yesterday_Details(PractitionerName,NoOfPatients,InvoiceCount,ServiceCount,TotalFee);
    }

    @Then("^Select last Seven Days in filter by date Field$")
    public void select_last_Seven_Days_in_filter_by_date_Field() throws Throwable {
        billingSummary.select_last_Seven_Days_in_filter_by_date_Field();
    }

    @Then("^Verify the Practitioner vs last Seven Days Details$")
    public void verify_the_Practitioner_vs_last_Seven_Days_Details() throws Throwable {

    }
    @Then("^Select Specified year and month in filter by date Field$")
    public void select_Specified_year_and_month_in_filter_by_date_Field() throws Throwable {

    }

    @Then("^Verify the Practitioner vs Specified year and month Details$")
    public void verify_the_Practitioner_vs_Specified_year_and_month_Details() throws Throwable {

    }

    @Then("^Select Custom Date Range$")
    public void select_Custom_Date_Range() throws Throwable {

    }

    @Then("^Verify the Practitioner vs Custom Date Range$")
    public void verify_the_Practitioner_vs_Custom_Date_Range() throws Throwable {

    }


}
