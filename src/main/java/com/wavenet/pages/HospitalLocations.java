package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import cucumber.api.java.de.Wenn;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HospitalLocations {
    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;


    public HospitalLocations() {
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }

    //Slect the Institute Location in Configuration --->Click Institute
    public void click_on_Hospital_Locations() throws Throwable
    {
        Thread.sleep(3000);
        WebElement ClickHospitalLocations = driver.findElement(By.xpath("//span[normalize-space()='Institute Locations']"));
        ClickHospitalLocations.click();
    }

    public void enter_valid_location_name_or_display_name(String SearchHospitalName) throws Throwable {
        WebElement EnterLocationname = driver.findElement(By.xpath("//input[@placeholder='Search Hospital']"));
        EnterLocationname.sendKeys(SearchHospitalName);
    }

    public void click_valid_utilization_in_drop_down() throws Throwable{
        WebElement UtilizationDropDown = driver.findElement(By.xpath(""));
        UtilizationDropDown.click();
    }
    public void click_on_Institute_Location_Create_New_Button() throws Throwable {
        WebElement ClickLocationCreateNewButton = driver.findElement(By.xpath("//span[normalize-space()='Create New']"));
        ClickLocationCreateNewButton.click();
    }

    public void click_on_Create_Location_and_Select_Institute(String InstituteName) throws Throwable {
        WebElement EnterInstituteName = driver.findElement(By.xpath("//input[@id='mat-input-15']"));
        EnterInstituteName.sendKeys(InstituteName);
    }

    public void enter_new_Location_in_Create_Location(String InstituteLocation) throws Throwable {
        WebElement EnterNewLocationCL = driver.findElement(By.xpath("//input[@id='mat-input-16']"));
        EnterNewLocationCL.sendKeys(InstituteLocation);
    }

    public void enter_new_Location_code_in_Create_Location(String InstituteLocationCode) throws Throwable {
        WebElement EnterNewLocationCode = driver.findElement(By.xpath("//input[@id='mat-input-17']"));
        EnterNewLocationCode.sendKeys(InstituteLocationCode);

    }
    public void select_the_utilization_in_Dropdown() throws Throwable {
        WebElement SelectUtilizationDropdown = driver.findElement(By.xpath("//span[normalize-space()='Cashier']"));
        SelectUtilizationDropdown.click();
    }
    public void enter_Create_Location_Description(String LocationDescription) throws Throwable {
        WebElement EnterCreateLocationDes = driver.findElement(By.xpath("//textarea[@id='mat-input-18']"));
        EnterCreateLocationDes.sendKeys(LocationDescription);
    }

    public void click_on_Create_Location_Save_Button() throws Throwable {
        WebElement ClickOnLocationSaveBtn = driver.findElement(By.xpath("//span[normalize-space()='Save']"));
        ClickOnLocationSaveBtn.click();
    }
    public void verify_the_Display_as_success_message_as_Institute_Location() throws Throwable {
        WebElement VerifySuccessmessageIL = driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
        Assert.assertEquals(VerifySuccessmessageIL,"");
    }


}
