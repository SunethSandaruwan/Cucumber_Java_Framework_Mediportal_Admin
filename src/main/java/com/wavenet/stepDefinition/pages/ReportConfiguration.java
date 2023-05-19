package com.wavenet.pages;

import com.wavenet.util.Config;
import com.wavenet.util.InitializeDriver;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ReportConfiguration {

    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Config config = new Config();
    String url = config.getUrl();

    // Billing Summary UI Xpath

    // Billing Summary Report Configuration Button
    private By ReportConfigurationBtn = By.xpath("//span[normalize-space()='Report Configuration']");
    //Billing Summary Report Configuration Title
    private By ReportConfigurationTitle = By.xpath("//h2[normalize-space()='Report Configuration']");
    //Email Report Configuration Xpath
    //Billing Summary Email Configuration Text
    private By ReportConfigurationEmailConfigurationText = By.xpath("//strong[normalize-space()='Email Configurations']");
    //Check the Billing Summary Email Configuration button
    private By ClickEmailConfigurationBtn = By.xpath("//label[@for='mat-slide-toggle-1-input']//span[@class='mat-slide-toggle-bar mat-slide-toggle-bar-no-side-margin']");
    //Email Repeat Event Text Field
    private By EmailRepeatEventText = By.xpath("//div[@class='row']//div[@class='row']//p[contains(text(),'Repeat Every')]");
    //Billing Summary Email Repeat Time
    private By EmailRepeatTime = By.id("txt_shareEarningsEmail");
    //Select Billing Summary Email Time Period Drop Down
    private By EmailTimePeriodDropDown = By.xpath("//div[@class='mat-form-field-infix ng-tns-c68-9']");
    //Click on Email Help Label
    private By ClickEmailHelpLabel = By.xpath("//button[@id='btn_matMenu']//mat-icon[@role='img'][normalize-space()='help_outline']");
    //Email Help Description
    private By EmailHelpDescription = By.xpath("//div[@class='mat-menu-content ng-tns-c133-93']");
    //Email Send Time
    private By EmailSendTimeText = By.xpath("//div[@class='col-md-6 col-xl-3 mb-4 mb-sm-2']//span[@class='text-muted'][normalize-space()='Send time']");
    //Email Send Time hours Up Button
    private By EmailSendTimeHoursUpBtn = By.xpath("");
    //Email Send Time house Dow Button
    private By EmailSendTimeHousesDownBtn = By.xpath("");
    //Email Send Time Min Up Button
    private By EmailSendTimeMinUpBtn = By.xpath("");
    //Email Send Time Min Down Button
    private By EmailSendTimeMinDownBtn = By.xpath("");
    //Email Time Format Label
    private By EmailTimeFormat = By.xpath("");
    //Email Time Zone
    private By EmailTimeZoneLabel = By.xpath("//div[@class='row']//div[@class='row']//span[@class='text-muted'][normalize-space()='Time Zone']");
    //Select Time Zone
    private By EmailTimeZoneDropDown = By.xpath("//div[@id='mat-select-value-43']");
    private By SelectEmailTimeZoneCity = By.xpath("//span[@class='mat-option-text'][normalize-space()='Australian Western (UTC +8)']");
    //Displayed Email Example City
    private By EmailExampleCity = By.xpath("//mat-hint[@id='mat-hint-2']");
    //Displayed Email Scheduled Time Description
    private By EmailExampleScheduledTime = By.xpath("//div[@class='row']//span[@id='spn_smsRepeatSchedule']");
    //Email Report consist Transaction Description
    private By EmailReportConsistTransactionTxt =  By.xpath("//div[@class='row']//span[@id='spn_smsReportConsist']");

    //SMS Report Configuration Xpath
    // SMS Configuration Title
    private By SMSConfigurationText = By.xpath("//strong[normalize-space()='SMS Configurations']");
    // SMS Configuration Button
    private By SMSConfigurationsBtn = By.xpath("//label[@for='mat-slide-toggle-4-input']//span[@class='mat-slide-toggle-bar mat-slide-toggle-bar-no-side-margin']");
    // SMS Repeat Event Label
    private By SMSRepeatEvenLabel = By.xpath("//div[@class='row mb-1 mt-2']//p[contains(text(),'Repeat Every')]");
    // SMS Repeat Time
    private By SMSRepeatTime = By.xpath("//input[@id='txt_shareEarningsSMS']");
    // SMS Repeat Time Period
    private By SMSTimePeriod = By.xpath("//div[@id='mat-select-value-45']");
    // SMS Configuration Help
    private By SMSHelpLabel = By.xpath("//button[@id='btn_help']//mat-icon[@role='img'][normalize-space()='help_outline']");
    // SMS Configuration Help Description
    private By SMSHelpDescription = By.xpath("//div[@class='mat-menu-content ng-tns-c133-93']");
    // SMS Send Time Text
    private By SMSConfigurationSendTimeTxt = By.xpath("//div[@class='col-md-6 col-lg-3 mb-4 mb-sm-2']//span[@class='text-muted'][normalize-space()='Send time']");
    // SMS Send time hours Up button
    private By SMSSendTimeHoursUpBtn = By.xpath("");
    //SMS Send time hours Down button
    private By SMSSendTimeHousesDownBtn = By.xpath("");
    //SMS Send time Min Up Button
    private By SMSSendTimeMinUpBtn = By.xpath("");
    //SMS Send time Min Down Button
    private By SMSSendTimeMinDownBtn = By.xpath("");
    //SMS Time Format
    private By SMSTimeFormat = By.xpath("");
    //SMS Time Zone title
    private By SMSTimeZone = By.xpath("//div[@class='row mb-1 mt-2']//span[@class='text-muted'][normalize-space()='Time Zone']");
    //SMS Time Zone DropDown
    private By SMSTimeZoneDropDown = By.xpath("//div[@id='mat-select-value-47']");
    //SMS Select Time Zone Dropdown City
    private By SMSTimeZoneDropDownCity = By.xpath("//span[@class='mat-option-text'][normalize-space()='Australian Western (UTC +8)']");
    //Displayed SMS Example City
    private By SMSExampleCity = By.xpath("//mat-hint[@id='mat-hint-3']");
    //Displayed SMS Scheduled Time Description
    private By SMSExampleScheduledTime = By.xpath("//div[@class='row mb-1 mt-2']//span[@id='spn_smsRepeatSchedule']");
    //SMS Report consist Transaction Description
    private By SMSReportConsistTransactionTxt =  By.xpath("//div[@class='row mb-1 mt-2']//span[@id='spn_smsReportConsist']");
    //Email Repeat Every Period in Day
    private By EmailRepeatEveryPeriodDay = By.xpath("//span[@class='mat-option-text'][normalize-space()='Day']");
    //Email Repeat Every Period in Week
    private By EmailRepeatEveryPeriodWeek = By.xpath("//span[normalize-space()='Week']");
    //Email Repeat Every Period in Month
    private By EmailRepeatEveryPeriodMonth = By.xpath("//span[normalize-space()='Month']");
    //Email Repeat Every Period in Year
    private By EmailRepeatEventPeriodYear = By.xpath("//span[normalize-space()='Year']");

    public ReportConfiguration(){
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }

    public void click_on_Report_Configuration() throws Throwable {

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement ClickReportConfiguration = driver.findElement(ReportConfigurationBtn);
        ClickReportConfiguration.click();
    }

    public void verify_the_Display_as_Report_Configuration_Title() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean BillingSummaryReportConfigurationTitle = driver.findElement(ReportConfigurationTitle).isDisplayed();
        Assert.assertEquals(true,ReportConfigurationTitle);
    }

    public void verify_the_Display_as_Email_Configuration_Text() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean BillingSummaryReportConfigurationEmailConfiguration = driver.findElement(ReportConfigurationEmailConfigurationText).isDisplayed();
        Assert.assertEquals(true,ReportConfigurationEmailConfigurationText);
    }

    public void check_the_Email_Configuration_Button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement EmailConfigurationButton = driver.findElement(ClickEmailConfigurationBtn);
        EmailConfigurationButton.click();
    }

    public void verify_the_Display_as_Email_Repeat_Event_Text() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean EmailEventText = driver.findElement(EmailRepeatEventText).isDisplayed();
        Assert.assertEquals(true,EmailRepeatEventText);

    }
    public void verify_the_Display_as_Email_Time_Field(String EmailTimeFieldNo) throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement EmailTimeField = driver.findElement(EmailRepeatTime);
      //  EmailTimeField.click();
        EmailTimeField.sendKeys(EmailTimeFieldNo);
    }

    public void verify_the_Display_as_Email_Time_period() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement EmailTimePeriod = driver.findElement(EmailTimePeriodDropDown);
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", EmailTimePeriod);
      //  EmailTimePeriod.click();

    }

    public void verify_the_Display_as_Email_Help() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement ClickEmailHelp = driver.findElement(ClickEmailHelpLabel);
        ClickEmailHelp.click();
        boolean SelectEmailHelpDescription = driver.findElement(EmailHelpDescription).isDisplayed();
        Assert.assertEquals(true,SelectEmailHelpDescription);

    }

    public void verify_the_Display_as_Email_Send_Time_Period_Text() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean VerifyEmailSendTimeTxt = driver.findElement(EmailSendTimeText).isDisplayed();
        Assert.assertEquals(true,VerifyEmailSendTimeTxt);
    }

    public void verify_the_Click_Email_Time_Seat_Hour_UP_Button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement EmailTimeSeatHourUpButton = driver.findElement(EmailSendTimeHoursUpBtn);
        EmailTimeSeatHourUpButton.click();
    }

    public void verify_the_Click_Email_Time_Seat_Hour_Down_Button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement EmailTimeSeatHourDownButton = driver.findElement(EmailSendTimeHousesDownBtn);
        EmailTimeSeatHourDownButton.click();
    }

    public void verify_the_Click_Email_Time_Seat_Minutes_UP_Button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement EmailTimeSeatMinutesUpButton = driver.findElement(EmailSendTimeMinUpBtn);
        EmailTimeSeatMinutesUpButton.click();
    }

    public void verify_the_Click_Email_Time_Seat_Minutes_Down_Button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement EmailTimeSeatMinutesDownButton = driver.findElement(EmailSendTimeMinDownBtn);
        EmailTimeSeatMinutesDownButton.click();
    }

    public void verify_the_Display_as_Email_Time_Format_AM_or_PM() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement EmailTimeFormatTxt = driver.findElement(EmailTimeFormat);
        EmailTimeFormatTxt.click();
    }

    public void verify_the_Display_as_Email_Time_Zone_Title() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean EmailTimeZoneTitle = driver.findElement(EmailTimeZoneLabel).isDisplayed();
        Assert.assertEquals(true,EmailTimeZoneTitle);
    }

    public void verify_the_Select_as_Email_Time_Zone_City() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement EmailTimeZoneCity = driver.findElement(EmailTimeZoneDropDown);
        EmailTimeZoneCity.click();
        WebElement ClickEmailTimeZoneCity = driver.findElement(SelectEmailTimeZoneCity);
        ClickEmailTimeZoneCity.click();
    }

    public void verify_the_Display_as_Email_Example_City() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean EmailExampleCityTxt = driver.findElement(EmailExampleCity).isDisplayed();
        Assert.assertEquals(true,EmailExampleCityTxt);
    }

    public void verify_the_Display_as_Email_Example_Scheduled_Time() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean EmailExampleScheduledTimeTxt = driver.findElement(EmailExampleScheduledTime).isDisplayed();
        Assert.assertEquals(true,EmailExampleScheduledTimeTxt);
    }

    public void verify_the_Display_Email_Date_Report_Consist_Transaction() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean EmailDateReportConsistTransaction = driver.findElement(EmailReportConsistTransactionTxt).isDisplayed();
        Assert.assertEquals(true,EmailDateReportConsistTransaction);
    }

    // Below in to SMS Configuration information

    public void verify_the_Display_as_SMS_Configuration_Text() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean SMSConfigurationTxt = driver.findElement(SMSConfigurationText).isDisplayed();
        Assert.assertEquals(true,SMSConfigurationTxt);
    }

    public void verify_the_Display_as_SMS_Repeat_Event_Text() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean SMSRepeatEventText = driver.findElement(SMSRepeatEvenLabel).isDisplayed();
        Assert.assertEquals(true,SMSRepeatEventText);
    }

    public void verify_the_Display_as_SMS_Time_Field() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean SMSTimeField = driver.findElement(SMSRepeatTime).isDisplayed();
        Assert.assertEquals(true,SMSTimeField);
        WebElement ClickSMSTimeField = driver.findElement(SMSRepeatTime);
        ClickSMSTimeField.click();
    }

    public void verify_the_Display_as_SMS_Time_period() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement SelectSMSTimePeriod = driver.findElement(SMSTimePeriod);
        SelectSMSTimePeriod.click();
    }

    public void verify_the_Display_as_SMS_Help() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement SMSHelp = driver.findElement(SMSHelpLabel);
        SMSHelp.click();
        boolean SMSHelpDescriptionTxt = driver.findElement(SMSHelpDescription).isDisplayed();
        Assert.assertEquals(true, SMSHelpDescriptionTxt);
    }

    public void verify_the_Display_as_SMS_Send_Time_Period_Text() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean SMSSendTimePeriod = driver.findElement(SMSConfigurationSendTimeTxt).isDisplayed();
        Assert.assertEquals(true,SMSSendTimePeriod);
    }

    public void verify_the_Click_SMS_Time_Seat_Hour_UP_Button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement SMSTimeSeatHourUpBtn = driver.findElement(SMSSendTimeHoursUpBtn);
        SMSTimeSeatHourUpBtn.click();
    }

    public void verify_the_Click_SMS_Time_Seat_Hour_Down_Button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement SMSTimeSeatHourDownButton = driver.findElement(SMSSendTimeHousesDownBtn);
        SMSTimeSeatHourDownButton.click();
    }

    public void verify_the_Click_SMS_Time_Seat_Minutes_UP_Button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement SMSTimeSeatMinutesUpBtn = driver.findElement(SMSSendTimeMinUpBtn);
        SMSTimeSeatMinutesUpBtn.click();
    }

    public void verify_the_Click_SMS_Time_Seat_Minutes_Down_Button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement SMSTimeSeatMinutesDownBtn = driver.findElement(SMSSendTimeMinDownBtn);
        SMSTimeSeatMinutesDownBtn.click();

    }

    public void verify_the_Display_as_SMS_Time_Format_AM_or_PM() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean SMSTimeFormatDisplay = driver.findElement(SMSTimePeriod).isDisplayed();
        Assert.assertEquals(true,SMSTimeFormatDisplay);
        WebElement SMSTimeFormatTxt = driver.findElement(SMSTimeFormat);
        SMSTimeFormatTxt.click();
    }

    public void verify_the_Display_as_SMS_Time_Zone_Title() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        boolean SMSTimeZoneTitle = driver.findElement(SMSTimeZone).isDisplayed();
        Assert.assertEquals(true,SMSTimeZoneTitle);
    }

    public void verify_the_Select_as_SMS_Time_Zone_City() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement ClickSMSTimeZoneCity = driver.findElement(SMSTimeZoneDropDown);
        ClickSMSTimeZoneCity.click();
        WebElement SelectSMSTimeZoneCity = driver.findElement(SMSTimeZoneDropDownCity);
        SelectSMSTimeZoneCity.click();
    }

    public void verify_the_Display_as_SMS_Example_City() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        boolean SMSExampleCityLabel = driver.findElement(SMSExampleCity).isDisplayed();
        Assert.assertEquals(true,SMSExampleCityLabel);

    }

    public void verify_the_Display_as_SMS_Example_Scheduled_Time() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean SMSExampleScheduledTimeTxt = driver.findElement(SMSExampleScheduledTime).isDisplayed();
        Assert.assertEquals(true,SMSExampleScheduledTimeTxt);
    }

    public void verify_the_Display_SMS_Date_Report_Consist_Transaction() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        boolean SMSDateReportConsistTransaction = driver.findElement(SMSReportConsistTransactionTxt).isDisplayed();
        Assert.assertEquals(true,SMSDateReportConsistTransaction);
    }
    public void select_the_Day_Email_Time_period() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement ClickOnEmailTimePeriodDay = driver.findElement(EmailRepeatEveryPeriodDay);
        ClickOnEmailTimePeriodDay.click();
    }

    public void select_the_Week_Email_Time_period() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement ClickOnEmailTimePeriodWeek = driver.findElement(EmailRepeatEveryPeriodWeek);
        ClickOnEmailTimePeriodWeek.click();
    }

    public void select_the_Month_Email_Time_period() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement ClickOnEmailTimePeriodMonth = driver.findElement(EmailRepeatEveryPeriodMonth);
        ClickOnEmailTimePeriodMonth.click();
    }

    public void select_the_year_Email_Time_period() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement ClickOnEmailTimePeriodYear = driver.findElement(EmailRepeatEventPeriodYear);
        ClickOnEmailTimePeriodYear.click();
    }
    public void enter_the_Email_Configuration_seat_time_Hours() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    }

    public void enter_the_Email_Configuration_seat_time_Minute() throws Throwable {

    }

    public void click_on_Report_Configuration_Save_Button() throws Throwable {

    }

}
