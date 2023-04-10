package com.wavenet.pages;

import com.wavenet.util.Config;
import com.wavenet.util.InitializeDriver;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllBookings {
    
    public static WebDriver driver;
    
    private WebDriverWait wait;
    
    private JavascriptExecutor executor;
    
    private Config config = new Config();
    String url = config.getUrl();

    private By AllBookingsInstituteSearch = By.xpath("//input[@data-placeholder=\"Search Institute\"]");
    private By PersonalDetailsTitle = By.xpath("//h4[contains(text(), 'Personal Details')][1]");
    private By PatientName = By.xpath("//label[@class='ng-tns-c171-48'][normalize-space()='Patient Name']");
    private By PhoneNo = By.xpath("//label[@class='ng-tns-c171-48'][normalize-space()='Phone No']");
    private By EmailAddress = By.xpath("//label[@class='ng-tns-c171-48'][normalize-space()='Email address']");
    private By Address = By.xpath("//label[@class='ng-tns-c171-48'][normalize-space()='Address']");
    private By DateOfBirth = By.xpath("//label[@class='ng-tns-c171-50'][normalize-space()='Date of birth']");
    // Patient personal details data Validating
    private By PatientNameValue = By.xpath("//p[@class='ng-tns-c171-50'][contains(text(),'Test')]");
    private By PhoneNoValue = By.xpath("//p[@class='ng-tns-c171-50'][normalize-space()='+61235467842']");
    private By EmailAddressValue = By.xpath("//p[@class='ng-tns-c171-50'][normalize-space()='ema@gmail.com']");
    private By AddressValue = By.xpath("//p[@class='ng-tns-c171-50'][normalize-space()='1234']");
    private By DateOfBirthValue = By.xpath("//p[@class='ng-tns-c171-48'][normalize-space()='1936-01-28']");


    public AllBookings(){
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver,30);
        executor = (JavascriptExecutor) driver;
    }
    
    public void click_on_Appointments() throws Throwable{
        Thread.sleep(3000);
        WebElement ClickAppointmentsBtn = driver.findElement(By.xpath("//span[normalize-space()='Appointments']"));
        ClickAppointmentsBtn.click();
        }

    public void click_on_Bookings() throws Throwable {
        Thread.sleep(3000);
        WebElement ClickBookingsBtn = driver.findElement(By.xpath("//span[normalize-space()='All Bookings']"));
        ClickBookingsBtn.click();
    }
    public void verify_the_All_Bookings_page_title() throws Throwable {
        Thread.sleep(3000);
        boolean VerifyAllBookingaPage = driver.findElement(By.xpath("//h1[normalize-space()='All Bookings']")).isDisplayed();
        Assert.assertEquals(true,VerifyAllBookingaPage);
    }
    public void verify_that_display_in_keyword_and_date_ranges_text_field() throws Throwable {
        Thread.sleep(3000);
        //Checking to the displayed in page keyword search bar
        boolean VerifyKeywordSearchTxt = driver.findElement(By.xpath("//input[@id='mat-input-296']")).isDisplayed();
        Assert.assertEquals(true,VerifyKeywordSearchTxt);
        //Assert.assertTrue(VerifyKeywordSearchTxt,);

        //Checking to the displayed in Date Range select bar and txt field
        Thread.sleep(3000);
        boolean VerifyDataRangesTxt = driver.findElement(By.xpath("//input[@placeholder='End date']")).isDisplayed();
        Assert.assertEquals(true,VerifyDataRangesTxt);

    }
    public void click_on_A_appointment_update() throws Throwable {
        WebElement ClickAppointment_Update = driver.findElement(By.xpath(""));
        ClickAppointment_Update.click();
    }
    public void verify_Update_refunds_page_title() throws Throwable {

    }

    public void verify_All_of_label_in_Update_Refunds() throws Throwable {

    }
    public void verify_All_of_Text_fields_in_Update_Refunds() throws Throwable {

    }
    //BAP-426
    public void select_All_Booking_Search_Institute(String SearchInstitute) throws Throwable {
        WebElement ClickOnSearchInstitute = driver.findElement(By.xpath("//input[@placeholder=\"Search Institute\"]"));
        ClickOnSearchInstitute.sendKeys(SearchInstitute);
        WebElement ClickOnFirstResultsInList = driver.findElement(By.xpath("//span[normalize-space()='Asiri Hospital Automation Data']"));
        ClickOnFirstResultsInList.click();
    }
    //BAP-426
    public void click_on_All_Booking_page_first_Booking_Appointments_Action_column_view_button() throws Throwable {
        WebElement ClickOnViewButton = driver.findElement(By.xpath(""));
        ClickOnViewButton.click();
    }
    //BAP-426
    public void check_View_Booking_Details_Appointment_details() throws Throwable {

    }
    //BAP-426
    public void click_on_View_Booking_Details_Close_Button() throws Throwable {


    }

    //------------------------------Test Data Excell ------------------------------

    public void userFillsTheInstituteNameFromGivenSheetNameAndRowNumber(String AllBookingsInstituteSearchName) throws Throwable {
        driver.findElement(AllBookingsInstituteSearch).sendKeys(AllBookingsInstituteSearchName);
    }

    public void verify_All_fields_to_be_available_under_patient_details() throws Throwable {


    }


}
