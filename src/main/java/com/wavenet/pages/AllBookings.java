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
        WebElement ClickBookingsBtn = driver.findElement(By.xpath("//span[normalize-space()='Bookings']"));
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
    
    
}
