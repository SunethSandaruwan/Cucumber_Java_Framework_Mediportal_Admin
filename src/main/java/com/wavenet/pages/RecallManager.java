package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RecallManager {
    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;

    public RecallManager() {
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }

    public void click_on_Follow_up_care() throws Throwable
    {
        Thread.sleep(5000);
        WebElement ClickFollowUpCase = driver.findElement(By.xpath("//span[contains(text(),' Follow up care')]"));
        ClickFollowUpCase.click();
    }
    public void click_on_All_Recalls() throws Throwable
    {
        Thread.sleep(5000);
        WebElement ClickAllRecalls = driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-7\"]/span[1]/mat-panel-title/span"));
        ClickAllRecalls.click();
    }
    public void click_on_Recall_Manager() throws Throwable
    {
        Thread.sleep(5000);
        WebElement ClickRecellManager = driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-7\"]/div/app-menu-panel[2]/span/mat-list-item/span/span[3]"));
        ClickRecellManager.click();
    }
    public void verify_the_Recall_Manager_Page_Title() throws Throwable
    {
        //Verifying if element is displayed
        boolean isElementDisplayed = driver.findElement(By.xpath("//h1[contains(text(),'Recall Manager')]")).isDisplayed();
        Assert.assertEquals(true,isElementDisplayed);
    }
    public void select_Dropdown_in_hospital_name() throws Throwable
    {
        //Select Hospital name in Dropdown
      // WebElement HospitalDropDown = driver.findElement(By.xpath("//*[@id=\"mat-select-12\"]/div"));
       // Select select = new Select(HospitalDropDown);

        WebElement DDown = driver.findElement(By.xpath("//*[@id=\"mat-option-59\"]/span"));
        DDown.click();

      //  select.selectByValue(value);
      //  select.selectByVisibleText(text);
      //  select.selectByIndex(1);

        
    }
    public void click_on_Sync_Recalls() throws Throwable {

    }

    public void validate_in_Sync() throws Throwable {

    }

}
