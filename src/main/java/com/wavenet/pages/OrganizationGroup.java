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

import java.util.concurrent.TimeUnit;

public class OrganizationGroup {
    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;

    private By OrganizationGroupButtonXpath = By.xpath("//span[contains(text(),'Organizations/ Groups')]");


    public OrganizationGroup() {
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }

    public void click_on_Organization_Group() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement organizationBtn = driver.findElement(OrganizationGroupButtonXpath);
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
        WebElement deleteBtn = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-organization-groups/table/tbody/tr[1]/td[2]/button[3]/span[1]/mat-icon"));
        deleteBtn.click();
    }

    public void click_on_delete_button_for_the_yes_prompt() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement deleteBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-delete-confirmation-modal/div/mat-dialog-actions/button[2]/span[1]"));
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
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(8000);
        WebElement updateBtn = driver.findElement(By.xpath("//menu[normalize-space()='Edit']"));
        updateBtn.click();
        Thread.sleep(3000);
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

    public void verify_the_Organization_Title() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        boolean VerifyTheOrganizationTitle = driver.findElement(By.xpath("//h1[normalize-space()='Organizations/ Groups']")).isDisplayed();
        Assert.assertEquals(true,VerifyTheOrganizationTitle);
    }

    public void click_on_Action_Button_for_organization() throws Throwable {
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement ClickOnOrganizationActionBtn = driver.findElement(By.xpath("//mat-icon[normalize-space()='more_vert']"));
        ClickOnOrganizationActionBtn.click();
    }

    public void verify_the_Search_Organization_Search_Box(String Organization) throws Throwable {
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement ClickOnSearchOrganizationSearchBox = driver.findElement(By.xpath("//input[@formcontrolname=\"orgGroupName\"]"));
        ClickOnSearchOrganizationSearchBox.click();
        WebElement EnterOrganizationName = driver.findElement(By.xpath("//input[@formcontrolname=\"orgGroupName\"]"));
        EnterOrganizationName.sendKeys(Organization);

    }

    public void click_on_Add_organization_group_Save_and_proceed_Button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement ClickOnSaveAndProceedButton = driver.findElement(By.xpath("//span[normalize-space()='Save & Proceed']"));
        ClickOnSaveAndProceedButton.click();
    }
    public void verify_the_Item_per_page() throws Throwable {
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement ClickTheItemPerPage = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-organization-groups/div[2]/div[2]/mat-paginator/div/div/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]"));
        ClickTheItemPerPage.click();
        WebElement SelectItemPrePage = driver.findElement(By.xpath("//span[normalize-space()='20']"));
        SelectItemPrePage.click();
    }

    public void verify_the_Navigation_Button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement ClickOnNavigationButton = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M10 6L8.59')]"));
        ClickOnNavigationButton.click();
    }

    public void verify_the_Table_Name_Column_Title() throws Throwable {
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        boolean VerifyName = driver.findElement(By.xpath("//th[normalize-space()='Name']")).isDisplayed();
        Assert.assertEquals(true,VerifyName);

    }
    public void verify_the_Table_Action_Column_Title() throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        boolean VerifyTableAction = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-organization-groups/table/thead/tr/th[2]")).isDisplayed();
        Assert.assertEquals(true,VerifyTableAction);
    }

    public void delete_On_default_Value_in_Text_Box() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(5000);
        WebElement DefaultValuesDelete = driver.findElement(By.xpath("//input[@id='mat-input-239']"));
        DefaultValuesDelete.clear();
    }

    public void verify_the_Add_New_Organization_Group_Title() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(5000);
        boolean VerifyTheAddNewOrganizationGroupTitle = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/all-hospitals-selector/div[1]/mat-sidenav-container/mat-sidenav/div/app-sidebar-right/div[1]/h2[1]")).isDisplayed();
        Assert.assertEquals(true,VerifyTheAddNewOrganizationGroupTitle);

    }
    public void enter_Name_of_the_organization_group(String EnterOrganizationGroup) throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement EnterNameOrganizationGroup = driver.findElement(By.xpath("//input[ @formcontrolname=\"newOrganizationGroup\"]"));
        EnterNameOrganizationGroup.sendKeys(EnterOrganizationGroup);

    }
    public void display_the_success_message_for_Added_new_organization_group(String OrganizationSuccessfulMessage) throws Throwable {
        WebDriverWait wait= new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//span[@class='mat-simple-snack-bar-content']")));
        WebElement input = driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(300,0)", "");
        Thread.sleep(3000);
        Assert.assertEquals(OrganizationSuccessfulMessage, input.getText());
    }

    public void click_on_Medical_Center_details_Close_Button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement CLickOnMedicalCenterDetailsCloseButton = driver.findElement(By.xpath("//button[@class='mat-focus-indicator me-2 mat-stroked-button mat-button-base cdk-focused cdk-mouse-focused']//span[@class='mat-button-wrapper'][normalize-space()='Cancel']"));
        CLickOnMedicalCenterDetailsCloseButton.click();

    }

    public void verify_the_organization_Group_Delete_Conformation_PopUp_Box_Title() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(3000);
        boolean DeleteOrganizationPopUp = driver.findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(true,DeleteOrganizationPopUp);
    }

    public void verify_the_Organization_Group_Delete_Conformation_PopUP_Box_Description() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
        boolean DeleteOrganizationGroupDescription = driver.findElement(By.xpath("//p[contains(text(),'Your file will be permanantly deleted and cannot b')]")).isDisplayed();
        Assert.assertEquals(true,DeleteOrganizationGroupDescription);
    }
}
