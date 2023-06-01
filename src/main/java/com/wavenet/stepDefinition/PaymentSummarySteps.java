package com.wavenet.stepDefinition;

import com.wavenet.pages.*;
import com.wavenet.util.Config;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PaymentSummarySteps {


    private HomePage homePage = new HomePage();
    private FinanceDashBoard financeDashBoard = new FinanceDashBoard();

    private BillingSummary billingSummary = new BillingSummary();
    private Login login = new Login();
    private Config config = new Config();

    private PaymentSummary paymentSummary = new PaymentSummary();
    String url = config.getUrl();
    @Given("^CLick on payment Summary$")
    public void click_on_payment_Summary() throws Throwable {
        paymentSummary.click_on_payment_Summary();
    }

    @Given("^Verify the Payment Summary Title$")
    public void verify_the_Payment_Summary_Title() throws Throwable {
        paymentSummary.verify_the_Payment_Summary_Title();
    }

    @Then("^Verify the Payment Summary Title Description$")
    public void verify_the_Payment_Summary_Title_Description() throws Throwable {
        paymentSummary.verify_the_Payment_Summary_Title_Description();
    }

    @Then("^Verify the Payment Summary in Medical Center Selection$")
    public void verify_the_Payment_Summary_in_Medical_Center_Selection() throws Throwable {
        paymentSummary.verify_the_Payment_Summary_in_Medical_Center_Selection();
    }

    @Then("^Verify the Date range Selection$")
    public void verify_the_Date_range_Selection() throws Throwable {
        paymentSummary.verify_the_Date_range_Selection();
    }

    @Then("^Verify with the GST Check Button$")
    public void verify_with_the_GST_Check_Button() throws Throwable {
        paymentSummary.verify_with_the_GST_Check_Button();
    }

    @Then("^Verify the Payment Summary Table column title$")
    public void verify_the_Payment_Summary_Table_column_title() throws Throwable {
        paymentSummary.verify_the_Payment_Summary_Table_column_title();
    }

    @Then("^Verify the Payment Summary Total colum$")
    public void verify_the_Payment_Summary_Total_colum() throws Throwable {
        paymentSummary.verify_the_Payment_Summary_Total_colum();
    }

    @Then("^Select the Medical Center in Drop Down$")
    public void select_the_Medical_Center_in_Drop_Down() throws Throwable {
        paymentSummary.select_the_Medical_Center_in_Drop_Down();
    }

    @Then("^Verify the table Data loading$")
    public void verify_the_table_Data_loading() throws Throwable {
        paymentSummary.verify_the_table_Data_loading();
    }

    @Then("^Click on Payment Summary Date range$")
    public void click_on_Payment_Summary_Date_range() throws Throwable {

    }

    @Then("^Select the Date Range$")
    public void select_the_Date_Range() throws Throwable {

    }

}
