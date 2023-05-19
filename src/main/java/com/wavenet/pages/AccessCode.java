package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AccessCode {

    public static WebDriver driver;

    private Login login = new Login();

    public AccessCode() {
        driver = InitializeDriver.getInstance().getDriver();
    }

    public void selectShortCodes() throws InterruptedException {
        WebElement elementShortCodes = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/div[1]/app-left-navbar[1]/div[1]/div[1]/div[2]/div[3]/div[1]/ul[1]/li[5]/ul[1]/li[3]/a[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", elementShortCodes);
        Thread.sleep(10000);
    }

    public void clickOnCreateShortCode() {
        WebElement elementCreateShortCodes = driver.findElement(By.xpath("//button[contains(text(),'CREATE SHORT CODE')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", elementCreateShortCodes);
    }

    public void enterShortCodeType(String shortCodeType) {
        WebElement elementShortCodeType = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]"));
        elementShortCodeType.sendKeys(shortCodeType);
    }

    public void enterShortCodeName(String shortCodeName) {
        WebElement elementShortCodeName = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        elementShortCodeName.sendKeys(shortCodeName);
    }

    public void enterShortCodeDesc(String shortCodeDesc) {
        WebElement elementShortCodeDesc = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/textarea[1]"));
        elementShortCodeDesc.sendKeys(shortCodeDesc);
    }

    public void selectExecutedFlow(String flowName) {

        List<WebElement> optionsToSelect = driver.findElements(By.xpath("//typeahead-container"));
        WebElement elementBodyVar = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
        elementBodyVar.sendKeys(flowName);
        elementBodyVar.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public void enterShortCode(String shortCode) {
        WebElement elementShortCode = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]"));
        elementShortCode.sendKeys(shortCode);
    }

    public void clickOnCreateButton() {
        WebElement shortCodeCreate = driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", shortCodeCreate);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void searchUSSDShortCodeByName(String shortCodeName) {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://compose2.globalwavenet.com/triggers/short-codes");
        //driver.navigate().refresh();

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //WebElement element = driver.findElement(By.xpath("//span[contains(text(),'USSD')]"));
        //JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        //executor1.executeScript("arguments[0].click()", element);

        WebElement searchBox = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
        searchBox.sendKeys(Keys.CONTROL, Keys.chord("a"));
        searchBox.sendKeys(Keys.BACK_SPACE);
        searchBox.sendKeys(shortCodeName);

        WebElement shortCodeSearch = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[4]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", shortCodeSearch);

    }

    public void searchSMSShortCodeByName(String shortCodeName) {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://compose2.globalwavenet.com/triggers/short-codes");
        //driver.navigate().refresh();

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement searchBox = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
        searchBox.sendKeys(Keys.CONTROL, Keys.chord("a"));
        searchBox.sendKeys(Keys.BACK_SPACE);
        searchBox.sendKeys(shortCodeName);

        WebElement shortCodeSearch = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[4]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", shortCodeSearch);

    }

    public void searchIVRShortCodeByName(String shortCodeName) {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://compose2.globalwavenet.com/triggers/short-codes");
        //driver.navigate().refresh();

        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //WebElement element = driver.findElement(By.xpath("//span[contains(text(),'IVR')]"));
        //JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        //executor1.executeScript("arguments[0].click()", element);

        WebElement searchBox = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
        searchBox.sendKeys(Keys.CONTROL, Keys.chord("a"));
        searchBox.sendKeys(Keys.BACK_SPACE);
        searchBox.sendKeys(shortCodeName);

        WebElement shortCodeSearch = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[4]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", shortCodeSearch);

    }

    public void deleteUSSDShortCode() throws InterruptedException {
        Thread.sleep(7000);

        WebElement element1 = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]"));
        element1.click();

        WebElement element2 = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]"));
        element2.click();

        WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", element3);

        WebElement element4 = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click()", element4);

        Thread.sleep(3000);

    }

    public void deleteSMSShortCode() throws InterruptedException {
        Thread.sleep(7000);

        WebElement element1 = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]"));
        element1.click();

        WebElement element2 = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]"));
        element2.click();

        WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", element3);

        WebElement element4 = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click()", element4);

        Thread.sleep(3000);
    }

    public void deleteIVRShortCode() throws InterruptedException {
        Thread.sleep(7000);

        WebElement element1 = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[3]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]"));
        element1.click();

        WebElement element2 = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[3]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]"));
        element2.click();

        WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", element3);

        WebElement element4 = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click()", element4);

        Thread.sleep(3000);
    }

    public void verifyShortCodeTypeRequired() {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Short code type required.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyShortCodeNameMaxLength() {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Short code name maximum characters length is 100.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyShortNameRequired() {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Short code name required.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyShortNameDuplicated() {
        WebElement verifyMessage = driver.findElement(By.xpath("//span[contains(text(),'Record exists with same short code name')]"));
        verifyMessage.isDisplayed();
    }

    public void clickBackButton() {
        WebElement back = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/div[1]/button[1]"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", back);
    }

    public void verifyShortCodeDescMaxLength() {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Description maximum characters length is 200.')]"));
        verifyMessage.isDisplayed();
    }

    public void validateFlow() {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Please select a valid flow from the dropdown.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyFlowRequired() {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Flow is required.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyShortCodeInvalidCharacters() {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Short code can contain numeric values only, asteri')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyShortCodeCodeRequired() {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Short code is required.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifySMSShortCodeInvalidCharacters() {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'comma')]"));
        verifyMessage.isDisplayed();
    }

    public void selectCallTypeAsInbound() {
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/section[1]/mat-checkbox[1]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void selectIVRControlType(String controlType) {
        WebElement elementControlType = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[2]/select[1]"));
        elementControlType.sendKeys(controlType);
    }

    public void selectIVRAudioCodec(String audioCodec) {
        WebElement elementAudioCodec = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[3]/select[1]"));
        elementAudioCodec.sendKeys(audioCodec);
    }

    public void verifyIVRShortCodeInvalidCharacters() throws InterruptedException {
        Thread.sleep(3000);
        WebElement verifyMessage = driver.findElement(By.xpath("//span[contains(text(),'Access code contains invalid characters.')]"));
        verifyMessage.isDisplayed();

    }

    public void selectCallTypeAsOutbound() {
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/section[1]/mat-checkbox[2]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void verifyIVRCallTypeRequired() {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'IVR Call Type required.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyIVRControlTypeRequired() {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'IVR Control Type required.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyIVRAudioCodecTypeRequired() {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'IVR Codec required.')]"));
        verifyMessage.isDisplayed();
    }

    public void selectEarlyMediaCheckBox() {
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[4]/div[1]/section[1]/mat-checkbox[1]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void deselectEarlyMediaCheckBox() {
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[4]/div[1]/section[1]/mat-checkbox[1]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", element);

    }

    public void selectIVRConferencingSupportCheckBox() {
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[5]/div[1]/section[1]/mat-checkbox[1]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void deselectIVRConferencingSupportCheckBox() {
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[5]/div[1]/section[1]/mat-checkbox[1]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", element);
    }

    public void selectIVRSaveChannelInfoCheckBox() {
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[6]/div[1]/section[1]/mat-checkbox[1]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void deselectIVRSaveChannelInfoCheckBox() {
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[6]/div[1]/section[1]/mat-checkbox[1]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", element);
    }

    public void selectUSSDShortCodeTab() {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'USSD')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void clickUSSDShortCodeEditButton() throws InterruptedException {
        Thread.sleep(5000);
        //WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        //JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("arguments[0].click()", element);

        WebElement element1 = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        element1.click();

        WebElement element2 = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        element2.click();

        WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", element3);
    }

    public void updateShortCodeDescription(String shortCodeDesc) throws InterruptedException {
        Thread.sleep(10000);

        WebElement inputCode = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/textarea[1]"));
        inputCode.sendKeys(Keys.CONTROL, Keys.chord("a"));
        inputCode.sendKeys(Keys.BACK_SPACE);
        inputCode.sendKeys(shortCodeDesc);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickShortCodeUpdate() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element2 = driver.findElement(By.xpath("//button[contains(text(),'UPDATE')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", element2);
    }

    public void clickBackButtonOnUpdatePage() {
        WebElement element2 = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-update[1]/div[1]/div[1]/div[1]/button[1]"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", element2);
    }

    public void updateExecutedFlowName(String flowName) {

        List<WebElement> optionsToSelect = driver.findElements(By.xpath("//typeahead-container"));
        WebElement element = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
        element.sendKeys(Keys.CONTROL, Keys.chord("a"));
        element.sendKeys(Keys.BACK_SPACE);
        element.sendKeys(flowName);
        element.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public void updateExecutedFlowNameEmpty()
    {
        List<WebElement> optionsToSelect = driver.findElements(By.xpath("//typeahead-container"));
        WebElement element = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]"));
        element.sendKeys(Keys.CONTROL, Keys.chord("a"));
        element.sendKeys(Keys.BACK_SPACE);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void updateShortCodeCode(String shortCode) throws InterruptedException {
        Thread.sleep(5000);
        WebElement inputCode = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]"));
        inputCode.sendKeys(Keys.CONTROL, Keys.chord("a"));
        inputCode.sendKeys(Keys.BACK_SPACE);
        inputCode.sendKeys(shortCode);
    }

    public void selectSMSShortCodeTab() {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'SMS')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void clickSMSShortCodeEditButton() throws InterruptedException {
        Thread.sleep(5000);
        //WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        //JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("arguments[0].click()", element);

        WebElement element1 = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        element1.click();

        WebElement element2 = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        element2.click();

        WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", element3);
    }

    public void selectIVRShortCodeTab() {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'IVR')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void clickIVRShortCodeEditButton() throws InterruptedException {
        Thread.sleep(5000);
        //WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        //JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("arguments[0].click()", element);

        WebElement element1 = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[3]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]"));
        element1.click();

        WebElement element2 = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[3]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]"));
        element2.click();

        WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", element3);
    }

    public void updateShortCodeName(String shortCodeName) throws InterruptedException {
        Thread.sleep(10000);

        WebElement inputCode = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        inputCode.sendKeys(Keys.CONTROL, Keys.chord("a"));
        inputCode.sendKeys(Keys.BACK_SPACE);
        inputCode.sendKeys(shortCodeName);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void selectOrDeselectInboundUpdate() throws InterruptedException {
        Thread.sleep(5000);

        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/section[1]/mat-checkbox[1]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void selectOrDeselectOutboundUpdate() throws InterruptedException {
        Thread.sleep(5000);

        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/section[1]/mat-checkbox[2]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void updateIVRControlType(String controlType) throws InterruptedException {
        Thread.sleep(5000);

        WebElement elementControlType = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[2]/select[1]"));
        elementControlType.sendKeys(controlType);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void updateIVRAudioCodec(String audioCodec) throws InterruptedException {
        Thread.sleep(5000);

        WebElement elementControlType = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[3]/select[1]"));
        elementControlType.sendKeys(audioCodec);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void selectOrDeselectEarlyMediaUpdate() throws InterruptedException {
        Thread.sleep(5000);

        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[4]/div[1]/section[1]/mat-checkbox[1]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void selectOrDeselectConferencingSupportUpdate() throws InterruptedException {
        Thread.sleep(5000);

        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[5]/div[1]/section[1]/mat-checkbox[1]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void selectOrDeselectSaveChannelInfoUpdate() throws InterruptedException {
        Thread.sleep(5000);

        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[6]/div[1]/section[1]/mat-checkbox[1]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void viewUSSDShortCode() throws InterruptedException {
        Thread.sleep(3000);
        WebElement clickForView = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[1]/div[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", clickForView);
        Thread.sleep(5000);
    }

    public void verifyUSSDShortCodeViewMode() {
        WebElement verifyText = driver.findElement(By.xpath("//div[contains(text(),'View Short Code Details')]"));
        Assert.assertEquals(true, verifyText.isDisplayed());
    }

    public void clickCloseButtonOnUSSDShortCodeView() throws InterruptedException {
        driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-short-codes-view[1]/div[1]/button[1]")).click();
        Thread.sleep(3000);
    }

    public void deleteUSSDShortCodeAfterView() throws InterruptedException {
        Thread.sleep(5000);

        WebElement element1 = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        element1.click();

        //WebElement element2 = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        //element2.click();

        WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", element3);

        WebElement element4 = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click()", element4);

    }

    public void viewIVRShortCode() throws InterruptedException {
        Thread.sleep(3000);
        WebElement clickForView = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[3]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[1]/div[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", clickForView);
        Thread.sleep(5000);
    }

    public void verifyIVRShortCodeViewMode() {
        WebElement verifyText = driver.findElement(By.xpath("//div[contains(text(),'View Short Code Details')]"));
        Assert.assertEquals(true, verifyText.isDisplayed());
    }

    public void clickCloseButtonOnIVRShortCodeView() throws InterruptedException {
        driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-short-codes-view[1]/div[1]/button[1]")).click();
        Thread.sleep(3000);
    }

    public void deleteIVRShortCodeAfterView() throws InterruptedException {
        Thread.sleep(5000);

        WebElement element1 = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[3]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]"));
        element1.click();

        //WebElement element2 = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[3]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]"));
        //element2.click();

        WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", element3);

        WebElement element4 = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click()", element4);

    }

    public void viewSMSShortCode() throws InterruptedException {
        Thread.sleep(3000);
        WebElement clickForView = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[1]/div[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", clickForView);
        Thread.sleep(5000);
    }

    public void verifySMSShortCodeViewMode() {
        WebElement verifyText = driver.findElement(By.xpath("//div[contains(text(),'View Short Code Details')]"));
        Assert.assertEquals(true, verifyText.isDisplayed());
    }

    public void clickCloseButtonOnSMSShortCodeView() throws InterruptedException {
        driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-short-codes-view[1]/div[1]/button[1]")).click();
        Thread.sleep(3000);
    }

    public void deleteSMSShortCodeAfterView() throws InterruptedException {
        Thread.sleep(5000);

        WebElement element1 = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        element1.click();

        //WebElement element2 = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        //element2.click();

        WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()", element3);

        WebElement element4 = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click()", element4);
    }

    public void verifyIVRShortCodeDescriptionRequired() {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Description is required for IVR short codes.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyAccessCodeContainsInvalidChars() {
        WebElement verifyMessage = driver.findElement(By.xpath("//span[contains(text(),'Access code contains invalid characters.')]"));
        verifyMessage.isDisplayed();
    }

    public void clickUSSDShortCodeGoToFlowOption() throws InterruptedException {
        WebElement clickGoTo = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", clickGoTo);
        Thread.sleep(10000);
    }

    public void verifyUSSDShortCodeGoToFlowName(String flowName) throws InterruptedException {
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

    public void selectAgentsTab()
    {
        WebElement elementTriggers = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/div[1]/app-left-navbar[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", elementTriggers);
    }

    public void clickSMSShortCodeGoToFlowOption() throws InterruptedException {
        WebElement clickGoTo = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", clickGoTo);
        Thread.sleep(10000);
    }

    public void verifySMSShortCodeGoToFlowName(String flowName) throws InterruptedException {
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

    public void clickIVRShortCodeGoToFlowOption() throws InterruptedException {
        WebElement clickGoTo = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[3]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", clickGoTo);
        Thread.sleep(10000);
    }

    public void verifyIVRShortCodeGoToFlowName(String flowName) throws InterruptedException {
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

    public void selectSkipMenuCheckBox() {
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/section[1]/mat-checkbox[1]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void updateSkipMenuCheckBox() {
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-codes-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/section[1]/mat-checkbox[1]/label[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", element);
    }
}