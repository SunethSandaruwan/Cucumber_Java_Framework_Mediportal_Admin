package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AssignIntent {

    public static WebDriver driver;

    private Login login = new Login();

    public AssignIntent(){
        driver = InitializeDriver.getInstance().getDriver();
    }

    public void clickAssignIntentsTab()
    {
        WebElement commonIntentTab = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/div[1]/app-left-navbar[1]/div[1]/div[1]/div[2]/div[3]/div[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", commonIntentTab);
    }

    public void clickAssignAnIntentButton()
    {
        WebElement commonIntentTab = driver.findElement(By.xpath("//button[contains(text(),'ASSIGN AN INTENT')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", commonIntentTab);
    }

    public void selectAssignAnIntentIntent(String intent)
    {
        Select selectIntent = new Select(driver.findElement(By.xpath("//body[1]/modal-container[1]/div[1]/div[1]/app-intent-assign[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")));
        selectIntent.selectByVisibleText(intent);
    }

    public void selectAssignAnIntentFlow(String flow)
    {
        Select selectFlow = new Select(driver.findElement(By.xpath("//body[1]/modal-container[1]/div[1]/div[1]/app-intent-assign[1]/form[1]/div[1]/div[1]/div[2]/div[1]/select[1]")));
        selectFlow.selectByVisibleText(flow);
    }

    public void clickOnAssignButton() throws InterruptedException {
        WebElement assignButton = driver.findElement(By.xpath("//button[contains(text(),'Assign')]"));
        assignButton.click();
        Thread.sleep(3000);
    }

    public void searchAssignIntent(String intentName)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='srch-intents']"));
        searchBox.sendKeys(Keys.CONTROL, Keys.chord("a"));
        searchBox.sendKeys(Keys.BACK_SPACE);
        searchBox .sendKeys(intentName);
        searchBox.sendKeys(Keys.ENTER);
    }

    public void unassignedIntent() throws InterruptedException {
        Thread.sleep(9000);
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intents[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
        WebElement element2 = driver.findElement(By.xpath("//span[contains(text(),'Unassign')]"));
        JavascriptExecutor executor2 = (JavascriptExecutor)driver;
        executor2.executeScript("arguments[0].click()", element2);
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
        Thread.sleep(10000);
    }

    public void verifyAssignAnIntentRequired()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Intent is required.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyAssignAnIntentFlowRequired()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Flow is required.')]"));
        verifyMessage.isDisplayed();
    }

    public void selectAssignAnotherIntentEnable()
    {
        WebElement element = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-intent-assign[1]/form[1]/div[2]/mat-checkbox[1]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void clickCloseButtonOnAssignAnIntentUI()
    {
        WebElement commonIntentTab = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-confirm-modal[1]/div[1]/div[1]/button[1]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", commonIntentTab);
    }

    public void clickOnAssignIntentEdit() throws InterruptedException {
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intents[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
        WebElement element2 = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
        JavascriptExecutor executor2 = (JavascriptExecutor)driver;
        executor2.executeScript("arguments[0].click()", element2);
        Thread.sleep(5000);
    }

    public void clickOnUpdateButton()
    {
        driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
    }

    public void updateAssignAnIntentIntent(String intent)
    {
        Select selectIntent = new Select(driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-intent-update[1]/div[2]/form[1]/div[1]/div[1]/div[1]/select[1]")));
        selectIntent.selectByVisibleText(intent);
    }

    public void updateAssignAnIntentIntentEmpty(String intent)
    {
        Select selectIntent = new Select(driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-intent-update[1]/div[2]/form[1]/div[1]/div[1]/div[1]/select[1]")));
        selectIntent.selectByIndex(0);
    }

    public void clickCloseButtonOnAssignAnIntentUpdateUI()
    {
        WebElement commonIntentTab = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-intent-update[1]/div[1]/button[1]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", commonIntentTab);
    }

    public void updateAssignAnIntentFlow(String flow)
    {
        Select selectIntent = new Select(driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-intent-update[1]/div[2]/form[1]/div[1]/div[2]/div[1]/select[1]")));
        selectIntent.selectByVisibleText(flow);
    }

    public void updateAssignAnIntentFlowEmpty(String flow)
    {
        Select selectIntent = new Select(driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-intent-update[1]/div[2]/form[1]/div[1]/div[2]/div[1]/select[1]")));
        selectIntent.selectByIndex(0);
    }

    public void clickOnAssignIntentView()
    {
        WebElement clickView = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intents[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", clickView);
    }

    public void clickCloseButtonOnAssignAnIntentViewUI() throws InterruptedException {
        driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-intent-view[1]/div[1]/button[1]")).click();
        Thread.sleep(3000);
    }

    public void clickAssignIntentGoToFlowOption() throws InterruptedException {
        WebElement clickGoTo = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intents[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", clickGoTo);
        Thread.sleep(10000);
    }

    public void verifyAssignIntentGoToFlowName(String flowName) throws InterruptedException {
        Thread.sleep(3000);
        WebElement inputField = driver.findElement(By.xpath("//input[@id='flow-inside']"));
        String name = flowName;
        Boolean found = false;

        if(name.equals(inputField.getAttribute("value")))
        {
            found = true;
            Assert.assertTrue(found);
        }else
        {
            found = false;
            Assert.assertTrue(found);
        }
    }
}
