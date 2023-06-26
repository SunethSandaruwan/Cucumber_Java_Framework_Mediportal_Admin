package com.wavenet.pages;

import com.wavenet.util.Config;
import com.wavenet.util.InitializeDriver;
import cucumber.api.java.en.Then;
import gherkin.lexer.Pa;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PaymentSummary {

    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Config config = new Config();
    String url = config.getUrl();

    private By ClickOnPaymentSummary = By.xpath("//span[normalize-space()='Payment Summary']"); // Verify the Click on Payment Summary

    private By PaymentSummaryTitle = By.xpath("//h1[normalize-space()='Payment Summary']"); // Payment summary title

    private By PaymentSummaryDescription = By.xpath("//span[contains(text(),'This report will list all Payments created within ')]"); //Payment Summary Description

    private By PaymentSummaryMedicalCenter = By.xpath("//div[@class='mat-select-arrow ng-tns-c98-246']']"); // Medical Center Selection

    private By PaymentSummaryDateRange = By.xpath("//div[@class='mat-form-field-infix ng-tns-c68-247']"); // Select the Date Range

    private By WithGSTCheckBox = By.xpath("//span[@class='mat-checkbox-inner-container']"); //Select the With GST button

    private By PaymentSummaryTableCheckBox = By.xpath("//label[@for='mat-checkbox-117-input']//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']"); // Table name Check Box

    private By TableName = By.xpath("//th[normalize-space()='Name']"); // Table Name Verification

    private By TableGrossIncome = By.xpath("//th[normalize-space()='Gross Income']"); //Table Gross Income

    private By TableMCCPercentage = By.xpath("//th[normalize-space()='MCC(%)']"); // Table MCC Percentage

    private By TableMMC = By.xpath("//th[normalize-space()='MCC']"); // Table MMC

    private By TableGSTPercentage = By.xpath("//th[normalize-space()='GST(%)']"); //Table GST Percentage

    private By TableGST = By.xpath("//th[normalize-space()='GST']"); //Table GST

    private By TableMCCAnaGST = By.xpath("//th[normalize-space()='MCC+GST']"); //Table MCC And GST

    private By TableNetSalary = By.xpath("//th[normalize-space()='Net Salary']"); // Table NET Salary

    private By TableSendEmail = By.xpath("//th[normalize-space()='Send Email']"); //Table Send Email

    private By TableTotal = By.xpath("//td[normalize-space()='Total']"); //Table Total Value

    private By RandomMedicalCenterSelection = By.xpath("//span[@class='mat-option-text'][normalize-space()='Wattle Grove']"); // Select Random medical Center

    private By VerifyTheSelectMedicalCenterFirstValue = By.xpath("//label[@for='mat-checkbox-128-input']//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']");

    public PaymentSummary(){
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }
    public void click_on_payment_Summary() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement ClickOnPaymentSummaryMenuIcon = driver.findElement(ClickOnPaymentSummary);
        ClickOnPaymentSummaryMenuIcon.click();
    }

    public void verify_the_Payment_Summary_Title() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        boolean VerifyThePaymentSummaryTitle = driver.findElement(PaymentSummaryTitle).isDisplayed();
        Assert.assertEquals(true,VerifyThePaymentSummaryTitle);

    }

    public void verify_the_Payment_Summary_Title_Description() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean VerifyThePaymentSummaryTitleDescription = driver.findElement(PaymentSummaryDescription).isDisplayed();
        Assert.assertEquals(true,VerifyThePaymentSummaryTitleDescription);
    }

    public void verify_the_Payment_Summary_in_Medical_Center_Selection() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement VerifyThePaymentSummaryInMedicalCenterUp = driver.findElement(PaymentSummaryMedicalCenter);
        VerifyThePaymentSummaryInMedicalCenterUp.click();
        Thread.sleep(10000);
        WebElement VerifyThePaymentSummaryInMedicalCenterDown = driver.findElement(PaymentSummaryMedicalCenter);
        VerifyThePaymentSummaryInMedicalCenterDown.click();

    }

    public void verify_the_Date_range_Selection() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement ClickOnDateRangeSelection = driver.findElement(PaymentSummaryDateRange);
        ClickOnDateRangeSelection.click();
        Thread.sleep(10000);
        ClickOnDateRangeSelection.click();

    }

    public void verify_with_the_GST_Check_Button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement ClickOnGSTCheckBox = driver.findElement(WithGSTCheckBox);
        ClickOnGSTCheckBox.click();
        Thread.sleep(10000);
        ClickOnGSTCheckBox.click();

    }
    public void verify_the_Payment_Summary_Table_column_title() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //Verify the Payment Summary Table Column Name Check Box Button
        WebElement ClickOnTableColumnHeaderCheckBox = driver.findElement(PaymentSummaryTableCheckBox);
        ClickOnTableColumnHeaderCheckBox.click();
        Thread.sleep(10000);
        ClickOnTableColumnHeaderCheckBox.click();

        //Verify the Payment Summary Table Name's
        boolean PaymentSummaryTableName = driver.findElement(TableName).isDisplayed();
        Assert.assertEquals(true,PaymentSummaryTableName);

        //Verify the Payment Summary Table Gross Income Name
        boolean PaymentSummaryTableGrossIncome = driver.findElement(TableGrossIncome).isDisplayed();
        Assert.assertEquals(true,PaymentSummaryTableGrossIncome);

        //Verify the Payment Summary Table MCC percentage (%)
        boolean PaymentSummaryTableMCCPercentage = driver.findElement(TableMCCPercentage).isDisplayed();
        Assert.assertEquals(true,PaymentSummaryTableMCCPercentage);

        //Verify the payment Summary Table MCC
        boolean PaymentSummaryTableMCC = driver.findElement(TableMMC).isDisplayed();
        Assert.assertEquals(true,PaymentSummaryTableMCC);

        //Verify the Payment Summary Table  GST Percentage (%)
        boolean PaymentSummaryTableGSTPercentage = driver.findElement(TableGSTPercentage).isDisplayed();
        Assert.assertEquals(true,TableGSTPercentage);

        //Verify the Payment Summary Table GST
        boolean PaymentSummaryTableGST = driver.findElement(TableGST).isDisplayed();
        Assert.assertEquals(true,PaymentSummaryTableGST);

        //Verify the Payment Summary GST+MCC
        boolean PaymentSummaryTableMCCPlusGST = driver.findElement(TableMCCAnaGST).isDisplayed();
        Assert.assertEquals(true,PaymentSummaryTableMCCPlusGST);

        //Verify the Payment Summary Net Salary
        boolean PaymentSummaryTableNetSalary = driver.findElement(TableNetSalary).isDisplayed();
        Assert.assertEquals(true,PaymentSummaryTableNetSalary);

        //Verify the Send Email
        boolean PaymentSummaryTableSendEmail = driver.findElement(TableSendEmail).isDisplayed();
        Assert.assertEquals(true,PaymentSummaryTableSendEmail);

    }

    public void verify_the_Payment_Summary_Total_colum() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        boolean PaymentSummaryTotal = driver.findElement(TableTotal).isDisplayed();
        Assert.assertEquals(true,PaymentSummaryTotal);
    }
    public void select_the_Medical_Center_in_Drop_Down() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement ClickMedicalCenter = driver.findElement(PaymentSummaryMedicalCenter);
        ClickMedicalCenter.click();

        WebElement SelectMedicalCenter = driver.findElement(RandomMedicalCenterSelection);
        SelectMedicalCenter.click();
    }
    public void verify_the_table_Data_loading() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement ClickOnFirstTableData = driver.findElement(VerifyTheSelectMedicalCenterFirstValue);
        ClickOnFirstTableData.click();
        Thread.sleep(10000);
        ClickOnFirstTableData.click();
    }


}
