package com.wavenet.pages;


import com.wavenet.util.Config;
import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BillingSummary {

    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Config config = new Config();
    String url = config.getUrl();

    // Billing Summary UI Xpath

    private By BillingSummaryMainManu = By.xpath("//h1[normalize-space()='Billing Summary']");
    private By BillingSummarySearchMedicalCenter = By.xpath("//div[@id='mat-select-value-3']");

    private By BillingSummaryGlobalReportConfigurations = By.xpath("//span[normalize-space()='Report Configuration']");

    private By  BillingSummaryExportButton = By.xpath("//mat-icon[normalize-space()='download']");

    private By BillingSummarySelectTimeDuration = By.xpath("//span[@class='fw-medium me-2']");

    private By BillingSummarySearchPractitioner = By.id("doctorName");

    private By BillingSummaryFilterByData = By.xpath("//input[@id='txt_duration']");

    private By GlobalBillingSummaryTablePractitioner = By.xpath("//div[contains(text(),'Practitioner Name')]");

    private By GlobalBillingSummaryTableNumberOfPatients = By.xpath("//div[contains(text(),'No. Of Patients')]");

    private By GlobalBillingSummaryTableInvoiceCount = By.xpath("//div[contains(text(),'Invoice Count')]");

    private By GlobalBillingSummaryTableServiceCount = By.xpath("//div[contains(text(),'Service Count')]");

    private By GlobalBillingSummaryTableTotalFee = By.xpath("//div[contains(text(),'Total Fee')]");

    private By GlobalBillingSummaryTableAction = By.xpath("//th[normalize-space()='Actions']");

    private By GlobalBillingSummaryTotalColumn = By.xpath("//td[normalize-space()='Total']");

    private By GlobalBillingSummarySelectMedicalCenter = By.xpath("//div[@id='mat-select-value-17']");

    private By SelectPractitionerFirstValue = By.xpath("//span[@class='mat-option-text']");



    public BillingSummary(){
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }
    public void click_on_Billing_Summary() throws Throwable {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement ClickBillingSummary = driver.findElement(By.xpath("//span[normalize-space()='Billing Summary']"));
        ClickBillingSummary.click();
    }
    public void verify_the_Finance_Billing_Summary_Title() throws Throwable {

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean BillingSummaryMainManuTitle = driver.findElement(BillingSummaryMainManu).isDisplayed();
        Assert.assertEquals(true,BillingSummaryMainManuTitle);

    }
    public void verify_the_Finance_medical_center_search_box() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean BillingSummarySearchBox = driver.findElement(BillingSummarySearchMedicalCenter).isDisplayed();
        Assert.assertEquals(true,BillingSummarySearchBox);

    }
    public void verify_the_Global_report_Configuration() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean BillingSummaryGlobalReportConfiguration = driver.findElement(BillingSummaryGlobalReportConfigurations).isDisplayed();
        Assert.assertEquals(true,BillingSummaryGlobalReportConfiguration);
    }
    public void verify_the_Finance_Export() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean BillingSummarySearchBox = driver.findElement(BillingSummaryExportButton).isDisplayed();
        Assert.assertEquals(true,BillingSummarySearchBox);
    }
    public void verify_the_Data_and_Time_Range() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean BillingSummaryVerifyDataAndTimeRange = driver.findElement(BillingSummarySelectTimeDuration).isDisplayed();
        Assert.assertEquals(true,BillingSummaryVerifyDataAndTimeRange);
    }
    public void verify_the_Search_practitioner() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean BillingSummaryVerifySearchPractitioner = driver.findElement(BillingSummarySearchPractitioner).isDisplayed();
        Assert.assertEquals(true,BillingSummaryVerifySearchPractitioner);
    }
    public void verify_the_Filter_by_Day() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean BillingSummaryVerifyFilterByDay = driver.findElement(BillingSummaryFilterByData).isDisplayed();
        Assert.assertEquals(true,BillingSummaryVerifyFilterByDay);
    }
    public void verify_the_Billing_Summary_Grid_Column_title() throws Throwable {
        //Verify the Billing summary table column's name
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean BillingSummaryPractitioner = driver.findElement(GlobalBillingSummaryTablePractitioner).isDisplayed();
        Assert.assertEquals(true,BillingSummaryPractitioner);

        //Verify the Billing Summary Number of Patients
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean BillingSummaryNumberOfPatients = driver.findElement(GlobalBillingSummaryTableNumberOfPatients).isDisplayed();
        Assert.assertEquals(true,BillingSummaryNumberOfPatients);

        //Verify the Table Invoice Count
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean GlobalBillingSummaryVerifyTableInvoiceCount = driver.findElement(GlobalBillingSummaryTableInvoiceCount).isDisplayed();
        Assert.assertEquals(true,GlobalBillingSummaryVerifyTableInvoiceCount);

        //Verify the Global Billing Summary Table Service Count
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean GlobalBillingSummaryVerifyTableServiceCount = driver.findElement(GlobalBillingSummaryTableServiceCount).isDisplayed();
        Assert.assertEquals(true,GlobalBillingSummaryVerifyTableServiceCount);

        //Verify the Global Billing Summary Table total fee
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean GlobalBillingSummaryVerifyTableTotalFee = driver.findElement(GlobalBillingSummaryTableTotalFee).isDisplayed();
        Assert.assertEquals(true,GlobalBillingSummaryVerifyTableTotalFee);

        //Verify the Global Billing Table Total Fee
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean GlobalBillingSummaryVerifyTableAction = driver.findElement(GlobalBillingSummaryTableAction).isDisplayed();
        Assert.assertEquals(true,GlobalBillingSummaryVerifyTableAction);

    }
    public void verify_the_Total_Column() throws Throwable {

        // Verify the DisPlay Total Column value
        boolean GlobalBillingTotalColumn = driver.findElement(GlobalBillingSummaryTotalColumn).isDisplayed();
        Assert.assertEquals(true,GlobalBillingTotalColumn);

    }
    public void select_Billing_Summary_Medical_Center() throws Throwable {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        WebElement SelectBillingSummaryMedicalCenter = driver.findElement(GlobalBillingSummarySelectMedicalCenter);
        SelectBillingSummaryMedicalCenter.click();
    }

    public void verify_the_refresh_Data_in_Billing_Summary_Table() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

    }

    public void select_Billing_Summary_Practitioner_Search_Box() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement ClickOnSearchPractitioner = driver.findElement(BillingSummarySearchPractitioner);
        ClickOnSearchPractitioner.click();
        WebElement ClickOnSearchPractitionerFirstValue = driver.findElement(SelectPractitionerFirstValue);
        ClickOnSearchPractitionerFirstValue.click();
    }

}
