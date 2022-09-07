package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrganizationGroup {
    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;


    public OrganizationGroup() {
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }

    public void click_on_Organization_Group() throws Throwable {
        WebElement organizationBtn = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/app-sidenav[1]/mat-nav-list[1]/div[1]/mat-accordion[1]/app-menu-panel[2]/span[1]/mat-list-item[1]"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", organizationBtn);
        Thread.sleep(3000);
        organizationBtn.click();
    }

    public void select_organization_group(String group) throws Throwable {
        Thread.sleep(3000);
        WebElement organization = driver.findElement(By.xpath("//td[contains(text(),'ABCD')]"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", organization);
        Thread.sleep(3000);
        Assert.assertEquals(group, organization.getText());
        organization.click();
    }

    public void click_on_delete_button() throws Throwable {
        WebElement deleteBtn = driver.findElement(By.xpath("//button[contains(@mattooltip,'Delete')]"));
        deleteBtn.click();
    }

    public void click_on_delete_button_for_the_yes_prompt() throws Throwable {
        WebElement deleteBtn = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        deleteBtn.click();
    }

    public void display_the_success_message_for_delete_organization_group(String successMsg) throws Throwable {
        WebDriverWait wait= new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//span[@class='mat-simple-snack-bar-content']")));
        WebElement input = driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(300,0)", "");
        Thread.sleep(3000);
        Assert.assertEquals(successMsg, input.getText());
    }

    public void click_on_update_button_for_organization() throws Throwable {
        Thread.sleep(3000);
        WebElement updateBtn = driver.findElement(By.xpath("//button[contains(@mattooltip,'Update')]"));
        updateBtn.click();
    }

    public void display_the_success_message_for_update_organization_group(String successMsg) throws Throwable {
        WebDriverWait wait= new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//span[@class='mat-simple-snack-bar-content']")));
        WebElement input = driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(300,0)", "");
        Thread.sleep(3000);
        Assert.assertEquals(successMsg, input.getText());
    }
}
