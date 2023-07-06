package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import cucumber.runtime.junit.Assertions;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RecallReminders {

    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;

    //Main Manu Item in Recall Reminders
    private By AllRemindersMenuItemXpath = By.xpath(""); // All Reminders Xpath

    private By RecallRemindersXpath = By.xpath(""); //Recall Reminders Xpath

    private By RecallRemindersPageTitleXpath = By.xpath(""); //Recall Reminders Title

    private By RecallRemindersMedicalCenter = By.xpath(""); //Recall Reminders Medial Center


    public RecallReminders() {
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }
    public void click_on_All_Reminders() throws Throwable {

        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement ClickOnAllRemindersMenuItem = driver.findElement(AllRemindersMenuItemXpath);
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click",ClickOnAllRemindersMenuItem);

    }
    public void click_on_Recall_Reminders() throws Throwable {

        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        WebElement ClickOnRecallRemindersButton = driver.findElement(RecallRemindersXpath);
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()",ClickOnRecallRemindersButton);
    }

    public void verify_the_Recall_Reminders_Page_title(String PageTitle) throws InterruptedException {

        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

      //  boolean VerifyRecallRemindersPageTitle = driver.findElement(RecallRemindersPageTitleXpath).isDisplayed();
      //  Assert.assertEquals(true,VerifyRecallRemindersPageTitle);

        WebElement InputField = driver.findElement(By.xpath(""));
        String name = PageTitle;
        Boolean found = false;

        String RecallRemindersPageName = "Recall Reminders";

        if(name.equals(InputField.getAttribute("Recall Reminders")))
        {
            found = true;
            Assert.assertTrue(found);
        }
        else
        {
            found = false;
            Assert.assertTrue(found);
        }
    }

    public void click_on_Recall_Reminders_Medical_Center() throws Throwable {
        WebElement ClickRecallRemindersMedicalCenter = driver.findElement(RecallRemindersMedicalCenter);
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()",ClickRecallRemindersMedicalCenter);
        Thread.sleep(3000);
    }

    public void select_the_Medical_Center_in_Search_box() throws Throwable {

    }

}
