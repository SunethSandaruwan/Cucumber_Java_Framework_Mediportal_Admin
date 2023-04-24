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

}
