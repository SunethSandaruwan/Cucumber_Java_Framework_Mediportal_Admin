package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EndPoint {

    public static WebDriver driver;

    private Login login = new Login();

    public EndPoint(){
        driver = InitializeDriver.getInstance().getDriver();
    }

    public void selectEndPointTab() throws InterruptedException
    {
        WebElement elementEP = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/div[1]/app-left-navbar[1]/div[1]/div[1]/div[2]/div[3]/div[1]/ul[1]/li[5]/ul[1]/li[4]/a[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", elementEP);
        Thread.sleep(10000);
    }

    public void clickOnEndPointCreateNew()
    {
        WebElement elementCreateEP = driver.findElement(By.xpath("//button[contains(text(),'CREATE ENDPOINT')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", elementCreateEP);
    }

    public void enterEndPointName(String endPointName) throws InterruptedException {
        Thread.sleep(3000);
        WebElement epName = driver.findElement(By.id("endpoint-name"));
        epName.sendKeys(endPointName);
    }

    public void enterEndPointId(String endPointId){
        WebElement epId = driver.findElement(By.id("endpoint-id"));
        epId.sendKeys(endPointId);
    }

    public void selectServiceFlow(String serviceFlow)
    {
        List<WebElement> optionsToSelect = driver.findElements(By.xpath("//typeahead-container"));
        WebElement elementFlowName = driver.findElement(By.id("executed-service-end"));
        elementFlowName.sendKeys(serviceFlow);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        elementFlowName.sendKeys(Keys.ENTER);
    }

    public void clickOnCreateButton()
    {
        driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    public void searchEndPoint(String epName)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchBox = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-endpoints[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
        searchBox.sendKeys(Keys.CONTROL, Keys.chord("a"));
        searchBox.sendKeys(Keys.BACK_SPACE);
        searchBox .sendKeys(epName);
        searchBox.sendKeys(Keys.ENTER);
    }

    public void deleteEndPoint() throws InterruptedException
    {
        Thread.sleep(9000);
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-endpoints[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
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

    public void verifyEndPointNameValidCharacters()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Allow letters, numbers, underscores and spaces only')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyEndPointNameMaxLength()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Maximum character length is 32.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyEndPointNameRequired()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Endpoint name required.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyEndPointNameDuplicate()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//span[contains(text(),'Record exists with same API endpoint name')]"));
        verifyMessage.isDisplayed();
    }

    public void clickOnCancelButton()
    {
        driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

    public void verifyEndPointFlowInvalid()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Invalid assign service flow. Please select from the dropdown.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyEndPointFlowRequired()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Service flow required.')]"));
        verifyMessage.isDisplayed();
    }

    public void doubleClickOnCreateButton()
    {
        WebElement element1 = driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", element1);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickOnEndPointUpdateButton() throws InterruptedException
    {
        Thread.sleep(9000);
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-endpoints[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);

        WebElement element2 = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", element2);
    }

    public void clickOnUpdateButton()
    {
        driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void updateEndPointName(String epName) throws InterruptedException
    {
        Thread.sleep(5000);
        WebElement updateName = driver.findElement(By.id("endpoint-name"));
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        updateName.sendKeys(Keys.CONTROL, Keys.chord("a"));
        updateName.sendKeys(Keys.BACK_SPACE);
        updateName.sendKeys(epName);
    }

    public void updateServiceFlowName(String serviceFlow) throws InterruptedException
    {
        //Thread.sleep(5000);
        List<WebElement> optionsToSelect = driver.findElements(By.xpath("//typeahead-container"));
        WebElement elementFlowName = driver.findElement(By.id("executed-service-end"));
        elementFlowName.sendKeys(Keys.CONTROL, Keys.chord("a"));
        elementFlowName.sendKeys(Keys.BACK_SPACE);
        elementFlowName.sendKeys(serviceFlow);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void copyEndPointURL()
    {
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-endpoints[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void urlCopySuccess()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//span[contains(text(),'API endpoint URL copied to clipboard!')]"));
        verifyMessage.isDisplayed();
    }

    public void viewEndPoint() throws InterruptedException
    {
        Thread.sleep(3000);
        WebElement clickForView = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-endpoints[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[1]/div[1]/div[2]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", clickForView);
        Thread.sleep(5000);
    }

    public void verifyEndPointViewMode()
    {
        WebElement verifyText = driver.findElement(By.xpath("//div[contains(text(),'Endpoint Details')]"));
        Assert.assertEquals(true, verifyText.isDisplayed());
    }

    public void clickCloseButtonOnEndPointView() throws InterruptedException
    {
        driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-view-endpoint[1]/div[1]/button[1]")).click();
        Thread.sleep(3000);
    }

    public void clickEndPointGoToFlowOption() throws InterruptedException {
        WebElement clickGoTo = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-endpoints[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[1]/div[1]/div[2]/span[1]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", clickGoTo);
        Thread.sleep(10000);
    }

    public void verifyEndPointGoToFlowName(String flowName) throws InterruptedException {
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
