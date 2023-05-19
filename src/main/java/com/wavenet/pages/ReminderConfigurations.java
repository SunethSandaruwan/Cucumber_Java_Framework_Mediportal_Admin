package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import cucumber.api.java.de.Wenn;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ReminderConfigurations {

    public static WebDriver driver;

    private WebDriverWait wait;

    private JavascriptExecutor executor;

    public ReminderConfigurations(){
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver,30);
        executor = (JavascriptExecutor) driver;
    }

    public void click_on_Reminders() throws Throwable {
        WebElement ClickOnReminders = driver.findElement(By.xpath("//span[normalize-space()='Reminders']"));
        ClickOnReminders.click();
    }
    public void click_on_Reminder_Configurations() throws Throwable {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement ClickOnReminderConElement = driver.findElement(By.xpath("//span[normalize-space()='Reminder Configurations']"));
        ClickOnReminderConElement.click();
    }


    public void verify_the_reminder_configurations_title() throws Throwable {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement VerifyReminderConfigurationsTitle = driver.findElement(By.xpath("//h1[normalize-space()='Reminder configurations']"));
        //GetPageSource() to get page source
        if(driver.findElement(By.xpath("//h1[normalize-space()='Reminder configurations']")).isDisplayed())
        {
            System.out.println("reminder configuration title is Visible");
        }else {
            System.out.println("reminder configuration title is InVisible");
        }
        if (driver.findElement(By.xpath("//h1[normalize-space()='Reminder configurations']"))!=null)
        {
            System.out.println("reminder configuration title is Visible");
        }else {
            System.out.println("reminder configuration title is InVisible");
        }
    }
    public void click_on_General_tab() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement ClickGeneralTabElement = driver.findElement(By.xpath("//div[text()='General']"));
        ClickGeneralTabElement.click();
    }
    public void verify_the_Reminder_Period_sub_title() throws Throwable {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement VerifyReminderConfigurationsTitle = driver.findElement(By.xpath("//h3[normalize-space()='Reminder period']"));
        //GetPageSource() to get page source
        if(driver.findElement(By.xpath("//h3[normalize-space()='Reminder period']]")).isDisplayed())
        {
            System.out.println("Reminder period is Visible");
        }else {
            System.out.println("Reminder period is InVisible");
        }
        if (driver.findElement(By.xpath("//h3[normalize-space()='Reminder period']"))!=null)
        {
            System.out.println("Reminder period is Present");
        }else {
            System.out.println("Reminder period is Absent");
        }
    }
    public void verify_the_Reminder_period_drop_down(String ReminderPeriod) throws Throwable {
        WebElement  VerifyTheReminderPeriodDropdown = driver.findElement(By.xpath("//*[@id=\"mat-input-19\"]"));
        VerifyTheReminderPeriodDropdown.sendKeys(ReminderPeriod);
    }
    public void verify_Duration_Type_Drop_Down() throws Throwable {
        WebElement VerifyDurationTypeDropDown = driver.findElement(By.xpath("//*[@id=\"mat-select-4\"]/div/div[2]"));
        VerifyDurationTypeDropDown.click();
        //Select  Duration Types
        WebElement SelectDurationType = driver.findElement(By.xpath("//span[normalize-space()='HOUR']"));
        SelectDurationType.click();
    }
    public void verify_Send_second_reminder_title_and_Disabled_button() throws Throwable {
        WebElement VerifyReminderConfigurationsTitle = driver.findElement(By.xpath("//h3[normalize-space()='Send second reminder']]"));
        //GetPageSource() to get page source
        if(driver.findElement(By.xpath("//h3[normalize-space()='Send second reminder']")).isDisplayed())
        {
            System.out.println("Reminder period is Visible");
        }else {
            System.out.println("Reminder period is InVisible");
        }
        if (driver.findElement(By.xpath("//h3[normalize-space()='Send second reminder']"))!=null)
        {
            System.out.println("Reminder period is Present");
        }else {
            System.out.println("Reminder period is Absent");
        }
        String SecondReminderDisabledButton;
        if( driver.findElement(By.xpath("//label[@for='mat-slide-toggle-1-input']//span[@class='mat-slide-toggle-bar']"))!=null)
        {
            // Should be display Secondary reminder enable and disabled button
            WebElement SRD = driver.findElement(By.xpath("//label[@for='mat-slide-toggle-1-input']//span[@class='mat-slide-toggle-bar']"));
                    SRD.click();
        }else {
            System.out.println("Secondary reminder enable button is InVisible");
        }

    }

    public void verify_Specify_practitioner_title_and_Disabled_button() throws Throwable {

        WebElement VerifyReminderConfigurationsTitle = driver.findElement(By.xpath("//h3[normalize-space()='Specify practitioner']"));
        //GetPageSource() to get page source
        if(driver.findElement(By.xpath("//h3[normalize-space()='Specify practitioner']")).isDisplayed())
        {
            System.out.println("Send second reminder is Visible");
        }else {
            System.out.println("Send second reminder is InVisible");
        }
        if (driver.findElement(By.xpath("//h3[normalize-space()='Specify practitioner']"))!=null)
        {
            System.out.println("Send second reminder is Present");
        }else {
            System.out.println("Send second reminder is Absent");
        }
        String SecondReminderDisabledButton;
        if( driver.findElement(By.xpath("//label[@for='mat-slide-toggle-1-input']//span[@class='mat-slide-toggle-bar']"))!=null)
        {
            // Should be display Secondary reminder enable and disabled button
            WebElement SRD = driver.findElement(By.xpath("//label[@for='mat-slide-toggle-1-input']//span[@class='mat-slide-toggle-bar']"));
            SRD.click();
        }else {
            System.out.println("Secondary reminder enable button is InVisible");
        }

    }
    public void verify_Specify_appointment_type_and_Disabled_button() throws Throwable {

        WebElement VerifyReminderConfigurationsTitle = driver.findElement(By.xpath("//h3[normalize-space()='Specify appointment types']"));
        //GetPageSource() to get page source
        if(driver.findElement(By.xpath("//h3[normalize-space()='Specify appointment types']")).isDisplayed())
        {
            System.out.println("Specify appointment types is Visible");
        }else {
            System.out.println("Specify appointment types is InVisible");
        }
        if (driver.findElement(By.xpath("//h3[normalize-space()='Specify appointment types']"))!=null)
        {
            System.out.println("Specify appointment types is Present");
        }else {
            System.out.println("Specify appointment types is Absent");
        }
        String SecondReminderDisabledButton;
        if( driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-3\"]/label/span[1]"))!=null)
        {
            // Should be display Secondary reminder enable and disabled button
            WebElement SRD = driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-3\"]/label/span[1]"));
            SRD.click();
        }else {
            System.out.println("Specify appointment types enable button is InVisible");
        }
    }
    public void verify_Update_Configurations() throws Throwable {
        WebElement ClickOnUpdateConfiguration = driver.findElement(By.xpath("//span[normalize-space()='Update configurations']"));
        ClickOnUpdateConfiguration.click();
    }


}


