package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import org.openqa.selenium.*;

public class ShortCodeApproval {

    public static WebDriver driver;

    private Login login = new Login();

    public ShortCodeApproval(){
        driver = InitializeDriver.getInstance().getDriver();
    }

    public void clickApprovalsIcon()
    {
        driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/div[1]/app-left-navbar[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/div[1]/a[1]")).click();
    }

    public void clickShortCodeRequestsTab()
    {
        driver.findElement(By.xpath("//span[contains(text(),'Short Code Requests')]")).click();
    }

    public void selectUSSDShortCodeTab()
    {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'USSD')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void searchShortCodeByCode(String shortCode) throws InterruptedException {
        Thread.sleep(3000);
        WebElement searchBox = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-code-requests[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
        searchBox.sendKeys(Keys.CONTROL, Keys.chord("a"));
        searchBox.sendKeys(Keys.BACK_SPACE);
        searchBox .sendKeys(shortCode);

        WebElement shortCodeSearch = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-code-requests[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[4]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", shortCodeSearch);

    }

    public void clickUSSDShortCodeApproveIcon()
    {
        WebElement shortCodeApprove = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-code-requests[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/form[1]/li[1]/div[1]/div[1]/div[1]/div[4]/div[1]/button[3]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", shortCodeApprove);
    }

    public void clickYesButtonOnUSSDCodeApproveConfirmation()
    {
        WebElement yesButton = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", yesButton);
    }

    public void clickUSSDShortCodeRejectIcon()
    {
        WebElement shortCodeApprove = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-code-requests[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/form[1]/li[1]/div[1]/div[1]/div[1]/div[4]/div[1]/button[2]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", shortCodeApprove);
    }

    public void enterRejectShortCodeRequestComment(String comment)
    {
        WebElement rejectReason = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-short-code-req-reject[1]/div[2]/form[1]/div[1]/div[1]/textarea[1]"));
        rejectReason.sendKeys(comment);
    }

    public void clickOnSubmitButton() throws InterruptedException {
        Thread.sleep(3000);
        WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submitButton.click();
    }

    public void clickYesButtonOnUSSDCodeRejectConfirmation() throws InterruptedException {
        WebElement yesButton = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        yesButton.click();
        //Thread.sleep(3000);
    }

    public void clickUSSDShortCodeApproveIconToReApprove() throws InterruptedException {
        Thread.sleep(3000);
        WebElement shortCodeApprove = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-code-requests[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/form[1]/li[1]/div[1]/div[1]/div[1]/div[4]/div[1]/button[2]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", shortCodeApprove);
    }

    public void clickUSSDShortCodeDeleteIcon()
    {
        WebElement shortCodeApprove = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-code-requests[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/form[1]/li[1]/div[1]/div[1]/div[1]/div[4]/div[1]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", shortCodeApprove);
    }

    public void clickYesButtonOnUSSDCodeDeleteConfirmation() {
        WebElement yesButton = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        yesButton.click();
    }

    public void selectSMSShortCodeTab()
    {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'SMS')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void clickSMSShortCodeApproveIcon()
    {
        WebElement shortCodeApprove = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-code-requests[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/form[1]/li[1]/div[1]/div[1]/div[1]/div[4]/div[1]/button[3]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", shortCodeApprove);
    }

    public void clickYesButtonOnSMSCodeApproveConfirmation()
    {
        WebElement yesButton = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", yesButton);
    }

    public void clickSMSShortCodeRejectIcon()
    {
        WebElement shortCodeApprove = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-code-requests[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/form[1]/li[1]/div[1]/div[1]/div[1]/div[4]/div[1]/button[2]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", shortCodeApprove);
    }

    public void clickYesButtonOnSMSCodeRejectConfirmation() throws InterruptedException {
        WebElement yesButton = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        yesButton.click();
        //Thread.sleep(3000);
    }

    public void clickSMSShortCodeApproveIconToReApprove() throws InterruptedException {
        Thread.sleep(3000);
        WebElement shortCodeApprove = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-code-requests[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/form[1]/li[1]/div[1]/div[1]/div[1]/div[4]/div[1]/button[2]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", shortCodeApprove);
    }

    public void clickSMSShortCodeDeleteIcon()
    {
        WebElement shortCodeApprove = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-code-requests[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/form[1]/li[1]/div[1]/div[1]/div[1]/div[4]/div[1]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", shortCodeApprove);
    }

    public void clickYesButtonOnSMSCodeDeleteConfirmation() {
        WebElement yesButton = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        yesButton.click();
    }

    public void selectIVRShortCodeTab()
    {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'IVR')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void clickIVRShortCodeApproveIcon()
    {
        WebElement shortCodeApprove = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-code-requests[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[3]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/form[1]/li[1]/div[1]/div[1]/div[1]/div[5]/div[1]/button[3]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", shortCodeApprove);
    }

    public void clickYesButtonOnIVRCodeApproveConfirmation()
    {
        WebElement yesButton = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", yesButton);
    }

    public void clickIVRShortCodeRejectIcon()
    {
        WebElement shortCodeApprove = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-code-requests[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[3]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/form[1]/li[1]/div[1]/div[1]/div[1]/div[5]/div[1]/button[2]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", shortCodeApprove);
    }

    public void clickYesButtonOnIVRCodeRejectConfirmation() throws InterruptedException {
        WebElement yesButton = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        yesButton.click();
    }

    public void clickIVRShortCodeApproveIconToReApprove() throws InterruptedException {
        Thread.sleep(3000);
        WebElement shortCodeApprove = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-code-requests[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[3]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/form[1]/li[1]/div[1]/div[1]/div[1]/div[5]/div[1]/button[2]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", shortCodeApprove);
    }

    public void clickIVRShortCodeDeleteIcon()
    {
        WebElement shortCodeApprove = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-short-code-requests[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[3]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/form[1]/li[1]/div[1]/div[1]/div[1]/div[5]/div[1]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", shortCodeApprove);
    }

    public void clickYesButtonOnIVRCodeDeleteConfirmation() {
        WebElement yesButton = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        yesButton.click();
    }
}
