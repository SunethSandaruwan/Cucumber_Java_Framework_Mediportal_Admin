package com.wavenet.stepDefinition;

import com.wavenet.pages.FinanceDashBoard;
import com.wavenet.pages.HomePage;
import com.wavenet.pages.Login;
import com.wavenet.util.Config;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;

public class FinanceDashboardSteps {

    private HomePage homePage = new HomePage();
    private FinanceDashBoard financeDashBoard = new FinanceDashBoard();
    private Login login = new Login();
    private Config config = new Config();
    String url = config.getUrl();

    @Given("^Verify the Home page title$")
    public void verify_the_Home_page_title() throws Throwable {
        homePage.verify_the_Home_page_title();
    }

    @Given("^Click on Finance main menu$")
    public void click_on_Finance_main_menu() throws Throwable {
        financeDashBoard.click_on_Finance_main_menu();
    }

    @Given("^Click on Finance Dashboard$")
    public void click_on_Finance_Dashboard() throws Throwable {
        financeDashBoard.click_on_Finance_Dashboard();
    }

    @Given("^Verify on Finance Dashboard$")
    public void verify_on_Finance_Dashboard() throws Throwable {
        financeDashBoard.verify_on_Finance_Dashboard();
    }

    @Given("^Select Medical Center in DropDown$")
    public void select_Medical_Center_in_DropDown() throws Throwable {
        financeDashBoard.select_Medical_Center_in_DropDown();
    }

    @Then("^Verify the select medical center finance dashboard today details$")
    public void verify_the_select_medical_center_finance_dashboard_today_details() throws Throwable {
        financeDashBoard.verify_the_select_medical_center_finance_dashboard_today_details();
    }

    @Then("^Verify the select medical center finance dashboard yesterday details$")
    public void verify_the_select_medical_center_finance_dashboard_yesterday_details() throws Throwable {
        financeDashBoard.verify_the_select_medical_center_finance_dashboard_yesterday_details();

    }

    @Then("^Verify the select last week medical center finance dashboard last week details$")
    public void verify_the_select_last_week_medical_center_finance_dashboard_last_week_details() throws Throwable {
        financeDashBoard.verify_the_select_last_week_medical_center_finance_dashboard_last_week_details();
    }

    @Then("^Verify the select last month medical center finance dashboard last month details$")
    public void verify_the_select_last_month_medical_center_finance_dashboard_last_month_details() throws Throwable {
        financeDashBoard.verify_the_select_last_month_medical_center_finance_dashboard_last_month_details();
    }

    // @Then("^Verify the Highest Billed Details Title in given sheetName \"([^\"]*)\" and rowNumber (\\d+)$")
    // public void verify_the_Highest_Billed_Details_Title_in_given_sheetName_and_rowNumber(String arg1, int arg2) throws Throwable {
    //     financeDashBoard.verify_the_Highest_Billed_Details_Title();
    //  }

    @Then("^Verify the Highest Billed Today Details$")
    public void verify_the_Highest_Billed_Today_Details() throws Throwable {
        financeDashBoard.verify_the_Highest_Billed_Today_Details();
    }

    @Then("^Verify the Highest Billed Yesterday Details$")
    public void verify_the_Highest_Billed_Yesterday_Details() throws Throwable {
        financeDashBoard.verify_the_Highest_Billed_Yesterday_Details();
    }

    @Then("^Verify the Highest Billed Current month Details$")
    public void verify_the_Highest_Billed_Current_month_Details() throws Throwable {
        financeDashBoard.verify_the_Highest_Billed_Current_month_Details();
    }

    @Then("^Verify the Highest Billed prev month details$")
    public void verify_the_Highest_Billed_prev_month_details() throws Throwable {
        financeDashBoard.verify_the_Highest_Billed_prev_month_details();
    }

    @Then("^Check on Weekly Chart button$")
    public void check_on_Weekly_Chart_button() throws Throwable {
        financeDashBoard.check_on_Weekly_Chart_button();
    }

    @Then("^Check on Monthly Chart button$")
    public void check_on_Monthly_Chart_button() throws Throwable {
        financeDashBoard.check_on_Monthly_Chart_button();
    }

    @Then("^Check on Yearly Chart button$")
    public void check_on_Yearly_Chart_button() throws Throwable {
        financeDashBoard.check_on_Yearly_Chart_button();
    }

    @Then("^Check on Previous Year \\(Monthly\\)$")
    public void check_on_Previous_Year_Monthly() throws Throwable {
        financeDashBoard.check_on_Previous_Year_Monthly();
    }

    @Then("^Check on Previous Year \\(Weekly\\)$")
    public void check_on_Previous_Year_Weekly() throws Throwable {
        financeDashBoard.check_on_Previous_Year_Weekly();
    }

    @Then("^Verify the Billed Trend Chart Title$")
    public void verify_the_Billed_Trend_Chart_Title() throws Throwable {
        financeDashBoard.verify_the_Billed_Trend_Chart_Title();
    }

    @Then("^Check on Total Billed Title$")
    public void check_on_Total_Billed_Title() throws Throwable {
        financeDashBoard.check_on_Total_Billed_Title();
    }
    //----------------------- Medical Financial Year -----------------------------

    @Then("^Verify the Financial Year Title$")
    public void verify_the_Financial_Year_Title() throws Throwable {
        financeDashBoard.verify_the_Financial_Year_Title();
    }

    @Then("^Verify the Total Appointments details$")
    public void verify_the_Total_Appointments_details() throws Throwable {
        financeDashBoard.verify_the_Total_Appointments_details();
    }

    @Then("^Verify the Total Billed details$")
    public void verify_the_Total_Billed_details() throws Throwable {
        financeDashBoard.verify_the_Total_Billed_details();
    }

    @Then("^Verify the Group Average details$")
    public void verify_the_Group_Average_details() throws Throwable {
        financeDashBoard.verify_the_Group_Average_details();
    }

    @Then("^Verify the Total Medical Centre fees$")
    public void verify_the_Total_Medical_Centre_fees() throws Throwable {
        financeDashBoard.verify_the_Total_Medical_Centre_fees();
    }

    //------------------Verify the Finance Dashboard medical center sync button -----------------
    @Then("^Click on Sync Button$")
    public void click_on_Sync_Button() throws Throwable {
        financeDashBoard.click_on_Sync_Button();
    }

    @Given("^Click on Finance Dashboard Download button$")
    public void click_on_Finance_Dashboard_Download_button() throws Throwable {
        financeDashBoard.click_on_Finance_Dashboard_Download_button();
    }

    @When("^Click on Medical Center$")
    public void click_on_Medical_Center() throws Throwable {
        financeDashBoard.click_on_Medical_Center();
    }
}
