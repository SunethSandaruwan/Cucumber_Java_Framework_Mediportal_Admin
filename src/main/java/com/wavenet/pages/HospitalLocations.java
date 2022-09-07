package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
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

    public void click_on_Hospital_Locations() throws Throwable
    {
        Thread.sleep(3000);
        WebElement ClickHospitalLocations = driver.findElement(By.xpath("//span[contains(text(),'Hospital Locations')]"));
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



}
