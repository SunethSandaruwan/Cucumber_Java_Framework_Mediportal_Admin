package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FlowTrials {

    public static WebDriver driver;

    private Login login = new Login();

    public FlowTrials(){
        driver = InitializeDriver.getInstance().getDriver();
    }

    public void selectFlowTrialsTab() throws InterruptedException
    {
        WebElement elementShortCodes = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/div[1]/app-left-navbar[1]/div[1]/div[1]/div[2]/div[3]/div[1]/ul[1]/li[5]/ul[1]/li[2]/a[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", elementShortCodes);
        Thread.sleep(10000);
    }

    public void clickOnFlowTrialCreateNew()
    {
        WebElement elementCreateShortCodes = driver.findElement(By.xpath("//button[contains(text(),'Create New')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", elementCreateShortCodes);
    }

    public void enterTrialIdentifier(String trialIdentifier) throws InterruptedException {
        Thread.sleep(2000);
        WebElement trialIdentifierName = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-create-test-code[1]/form[1]/div[1]/div[1]/input[1]"));
        trialIdentifierName.sendKeys(trialIdentifier);
    }

    public void selectFlow(String flowName) {

        List<WebElement> optionsToSelect = driver.findElements(By.xpath("//typeahead-container"));
        WebElement elementFlowName = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-create-test-code[1]/form[1]/div[1]/div[2]/input[1]"));
        elementFlowName.sendKeys(flowName);
        elementFlowName.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public void selectChannelType(String channel)
    {
        WebElement channelType = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-create-test-code[1]/form[1]/div[1]/div[3]/select[1]"));
        channelType.sendKeys(channel);
    }

    public void clickOnCreateButton()
    {
        driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-create-test-code[1]/form[1]/div[2]/button[2]")).click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    public void searchFlowTrial(String testIdentifier) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchBox = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-test-codes[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
        searchBox.sendKeys(Keys.CONTROL, Keys.chord("a"));
        searchBox.sendKeys(Keys.BACK_SPACE);
        searchBox .sendKeys(testIdentifier);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    public void deleteFlowTrial() throws InterruptedException
    {
        Thread.sleep(9000);
        WebElement element = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-test-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
        //Thread.sleep(5000);
        WebElement element2 = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        JavascriptExecutor executor2 = (JavascriptExecutor)driver;
        executor2.executeScript("arguments[0].click()", element2);
        WebElement element1 = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", element1);
        Thread.sleep(10000);
    }

    public void verifyTrialIdentifierMaxLength()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Maximum character length is 50.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyTrialIdentifierRequired()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Trial Identifier is required.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyInvalidFlowName()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Please select a valid flow from the dropdown.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyFlowNameRequired()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Flow is required.')]"));
        verifyMessage.isDisplayed();
    }

    public void clickCreateToVerifyFlowRequired()
    {
        WebElement element1 = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-create-test-code[1]/form[1]/div[2]/button[2]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", element1);
    }

    public void verifyChannelRequired()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Channel is required.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyDuplicatedTrialIdentifier()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//span[contains(text(),'Record exists with same trial identifier.')]"));
        verifyMessage.isDisplayed();
    }

    public void clickOnCancel()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickOnFlowTrialEdit() throws InterruptedException
    {
        Thread.sleep(9000);
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-test-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);

        WebElement element2 = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", element2);
    }

    public void updateTrialIdentifier(String trialIdentifier)
    {
        WebElement trialIdentifierName = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-create-test-code[1]/form[1]/div[1]/div[1]/input[1]"));
        trialIdentifierName.sendKeys(Keys.CONTROL, Keys.chord("a"));
        trialIdentifierName.sendKeys(Keys.BACK_SPACE);
        trialIdentifierName.sendKeys(trialIdentifier);
    }

    public void clickOnUpdateButton() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void updateFlowName(String flowName)
    {
        List<WebElement> optionsToSelect = driver.findElements(By.xpath("//typeahead-container"));
        WebElement elementFlowName = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-create-test-code[1]/form[1]/div[1]/div[2]/input[1]"));
        elementFlowName.sendKeys(Keys.CONTROL, Keys.chord("a"));
        elementFlowName.sendKeys(Keys.BACK_SPACE);
        elementFlowName.sendKeys(flowName);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickFlowTrialGoToFlowOption() throws InterruptedException {
        WebElement clickGoTo = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-test-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[1]/div[1]/div[2]/span[1]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", clickGoTo);
        Thread.sleep(10000);
    }

    public void verifyFlowTrialGoToFlowName(String flowName) throws InterruptedException {
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
