package com.wavenet.pages;


import com.wavenet.util.Config;
import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class BillingSummary {

    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Config config = new Config();
    String url = config.getUrl();

    // Billing Summary UI Xpath

    private By BillingSummaryMainManu = By.xpath("//h1[normalize-space()='Billing Summary']");

    private By MainManuBillingSummary = By.xpath("//span[normalize-space()='Billing Summary']");

    private By BillingSummarySearchMedicalCenter = By.xpath("//div[@id='mat-select-value-3']");

    private By BillingSummaryGlobalReportConfigurations = By.xpath("//span[normalize-space()='Report Configuration']");

    private By  BillingSummaryExportButton = By.xpath("//mat-icon[normalize-space()='download']");

    private By BillingSummarySelectTimeDuration = By.xpath("//span[@class='fw-medium me-2']");

    private By BillingSummarySearchPractitioner = By.xpath("//input[@id='doctorName']");

    private By BillingSummaryFilterByData = By.xpath("//input[@id='txt_duration']");

    private By GlobalBillingSummaryTablePractitioner = By.xpath("//div[contains(text(),'Practitioner Name')]");

    private By GlobalBillingSummaryTableNumberOfPatients = By.xpath("//div[contains(text(),'No. Of Patients')]");

    private By GlobalBillingSummaryTableInvoiceCount = By.xpath("//div[contains(text(),'Invoice Count')]");

    private By GlobalBillingSummaryTableServiceCount = By.xpath("//div[contains(text(),'Service Count')]");

    private By GlobalBillingSummaryTableTotalFee = By.xpath("//div[contains(text(),'Total Fee')]");

    private By GlobalBillingSummaryTableAction = By.xpath("//th[normalize-space()='Actions']");

    private By GlobalBillingSummaryTotalColumn = By.xpath("//td[normalize-space()='Total']");

    private  By ClickOnMedicalCenter = By.xpath("//mat-select[@id=\"slct_hospital\"]");

    private By GlobalBillingSummarySelectMedicalCenter = By.xpath("//span[@class='mat-option-text'][normalize-space()='Main surgery - Ellen Stirling']");

    private By SelectPractitionerFirstValue = By.xpath("//span[@class='mat-option-text']");

    private By SelectTheRegularPractitioner = By.xpath("//span[normalize-space()='Ashik Varghese']");

    private By BillingSummaryPractitioner = By.xpath("//span[@class='mat-option-text']");

    private By ClickOnFilterDateFieldTxt = By.id("txt_duration");

    private By SelectBillingSummaryFilterByYesterday = By.xpath("//span[@class='text-dark fw-medium me-2'][normalize-space()='Yesterday']");

    private By VerifyThePractitionerNameInTable = By.xpath("//table[@role='table']//tbody[@role=\"rowgroup\"]//td[@role='cell'][1]");

    private By SelectBillingSummaryFilterBySevenDay = By.xpath("//label[@for='rbtn_lastSevenDays-input']//span[@class='mat-radio-inner-circle']");



    public BillingSummary(){
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }
    public void click_on_Billing_Summary() throws Throwable {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(10000);
        WebElement ClickBillingSummary = driver.findElement(MainManuBillingSummary);
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

        Thread.sleep(10000);
        // Verify the DisPlay Total Column value
        boolean GlobalBillingTotalColumn = driver.findElement(GlobalBillingSummaryTotalColumn).isDisplayed();
        Assert.assertEquals(true,GlobalBillingTotalColumn);

    }
    public void select_Billing_Summary_Medical_Center() throws Throwable {
      //  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Thread.sleep(5000);
        WebElement ClickOnBillingSummaryMedicalCenter = driver.findElement(ClickOnMedicalCenter);
        ClickOnBillingSummaryMedicalCenter.click();
        WebElement SelectBillingSummaryMedicalCenter = driver.findElement(GlobalBillingSummarySelectMedicalCenter);
        SelectBillingSummaryMedicalCenter.click();
    }

    public void verify_the_refresh_Data_in_Billing_Summary_Table() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

    }

    public void select_Billing_Summary_Practitioner_Search_Box() throws Throwable {
        //Select the Billing Summary Practitioner Search Box
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Thread.sleep(10000);
        //Click on Practitioner Search Box
        WebElement ClickOnSearchPractitioner = driver.findElement(BillingSummarySearchPractitioner);
        ClickOnSearchPractitioner.click();
        //Select Practitioner First Value (Don't delete below commented code base)
        WebElement ClickOnSearchPractitionerFirstValue = driver.findElement(SelectPractitionerFirstValue);
        ClickOnSearchPractitionerFirstValue.click();

       // String typeValue=ClickOnSearchPractitionerFirstValue.getAttribute("type");
       // System.out.println("Value of type attribute: "+typeValue);

        //Regular Doctor name "Ashik Varghese"
        //WebElement RegularPractitioner = driver.findElement(SelectTheRegularPractitioner);
        //RegularPractitioner.click();

    }
    public void enter_Valid_Practitioner_Name() throws Throwable{
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Thread.sleep(15000);
        WebElement EnterValidPractitionerName = driver.findElement(BillingSummaryPractitioner);
        EnterValidPractitionerName.sendKeys("Ashik Varghese");
        //PractitionerName
    }
    public void click_on_filter_by_date_Field() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Thread.sleep(5000);
        WebElement ClickOnFilterByDateField = driver.findElement(ClickOnFilterDateFieldTxt);
        ClickOnFilterByDateField.click();

    }

    public void select_Yesterday_in_filter_by_date_Field() throws Throwable {
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement SelectInDayFilterByYesterday = driver.findElement(SelectBillingSummaryFilterByYesterday);
        SelectInDayFilterByYesterday.click();
    }

    //Write a code in Verify the Select practitioner yesterday details
    public void verify_the_Practitioner_vs_Yesterday_Details(String PractitionerName, String NoOfPatients, String InvoiceCount, String ServiceCount, String TotalFee) throws Throwable {
        Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement VerifyThePractitionerName = driver.findElement(VerifyThePractitionerNameInTable);

    }
    public void select_last_Seven_Days_in_filter_by_date_Field() throws Throwable {
        Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement SelectInDayFilterBySevenDays = driver.findElement(SelectBillingSummaryFilterBySevenDay);
        SelectInDayFilterBySevenDays.click();
    }

    //Write a code in Verify the Select practitioner Seven Day details
    public void verify_the_Practitioner_vs_last_Seven_Days_Details() throws Throwable {
       Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);


    }

    public void select_Specified_year_and_month_in_filter_by_date_Field() throws Throwable {

    }

    public void verify_the_Practitioner_vs_Specified_year_and_month_Details() throws Throwable {

    }

    public void select_Custom_Date_Range() throws Throwable {

    }

    public void verify_the_Practitioner_vs_Custom_Date_Range() throws Throwable {

    }
}
