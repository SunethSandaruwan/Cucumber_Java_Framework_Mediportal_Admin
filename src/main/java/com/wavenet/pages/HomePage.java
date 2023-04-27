package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;


public class HomePage {

    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;

    //Element and Locators in Class methods
    private By HomePageTitle = By.id("");

    public HomePage(){
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }
    // Verify main menu home page in hospital location title
    public void verify_the_Hospital_Locations_page_title() throws Throwable{
        String expectedTitle = "Hospital Locations";
        String actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
    public void verify_the_Home_page_title() throws Throwable {
         String HomePageExpectedTitle = "MediPortal Dashboard";
         String actualHomepageTitle = driver.getTitle();
         if (actualHomepageTitle.contentEquals(HomePageExpectedTitle)) {
             System.out.println("Test Passed");
         }
         else {
             System.out.println("Test Fails");
         }
    }
    public void driver_Quit() throws Throwable {
        driver_Quit();
    }


}
