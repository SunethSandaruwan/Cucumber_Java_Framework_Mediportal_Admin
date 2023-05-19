package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class IntentManagement {

    public static WebDriver driver;

    private Login login = new Login();

    public IntentManagement(){
        driver = InitializeDriver.getInstance().getDriver();
    }

    public void clickIntentManagementTab()
    {
        WebElement commonIntentTab = driver.findElement(By.xpath("//span[contains(text(),'Intents Management')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", commonIntentTab);
    }

    public void clickCreateCommonIntent()
    {
        WebElement create = driver.findElement(By.xpath("//button[contains(text(),'CREATE INTENT')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", create);
    }

    public void enterCommonIntentName(String commonIntentName)
    {
        WebElement elementIntentName = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-common-intents-create[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        elementIntentName.sendKeys(commonIntentName);
    }

    public void enterCommonIntentPhrase(String commonIntentPhrase)
    {
        WebElement elementTrainingPhrase = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-common-intents-create[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        elementTrainingPhrase.sendKeys(commonIntentPhrase);
    }

    public void addNewCommonIntentPhrase()
    {
        WebElement addPhrase = driver.findElement(By.xpath("//body[1]/modal-container[1]/div[1]/div[1]/app-common-intents-create[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", addPhrase);
    }

    public void clickCreateButton()
    {
        WebElement intentCreate = driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", intentCreate);
    }

    public void searchCommonIntent(String commonIntentName)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().refresh();
        WebElement searchBox = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-common-intents[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
        searchBox.sendKeys(Keys.CONTROL, Keys.chord("a"));
        searchBox.sendKeys(Keys.BACK_SPACE);
        searchBox .sendKeys(commonIntentName);
        searchBox.sendKeys(Keys.ENTER);
    }

    public void deleteCreatedCommonIntent() throws InterruptedException
    {
        Thread.sleep(9000);
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-common-intents[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
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

    public void verifyCommonIntentNameAllowedCharacters()
    {
        WebElement verifyCharacters = driver.findElement(By.xpath("//div[contains(text(),'Allow letters, numbers, spaces, underscore and hyphen only.')]"));
        verifyCharacters.isDisplayed();
    }

    public void verifyCommonIntentNameRequired()
    {
        WebElement verifyRequired = driver.findElement(By.xpath("//div[contains(text(),'Intent name required.')]"));
        verifyRequired.isDisplayed();
    }

    public void verifyCommonIntentNameMaxLength()
    {
        WebElement verifyRequired = driver.findElement(By.xpath("//div[contains(text(),'Intent name maximum characters length is 32.')]"));
        verifyRequired.isDisplayed();
    }

    public void verifyCommonIntentTrainingPhraseMaxLength()
    {
        WebElement verifyRequired = driver.findElement(By.xpath("//div[contains(text(),'Training phrase maximum characters length is 200.')]"));
        verifyRequired.isDisplayed();
    }

    public void verifyCommonIntentTrainingPhraseRequired()
    {
        WebElement verifyRequired = driver.findElement(By.xpath("//div[contains(text(),'Training phrase required.')]"));
        verifyRequired.isDisplayed();
    }

    public void verifyCommonIntentDuplicatePhrases()
    {
        WebElement verifyDuplicate = driver.findElement(By.xpath("//div[contains(text(),'Training phrase cannot be duplicate.')]"));
        verifyDuplicate.isDisplayed();
    }

    public void clickCommonIntentUpdate() throws InterruptedException
    {
        Thread.sleep(9000);
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-common-intents[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);

        WebElement element2 = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", element2);
    }

    public void updateCommonIntentName(String commonIntentName) throws InterruptedException
    {
        Thread.sleep(5000);
        WebElement elementConfName = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-common-intents-create[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        elementConfName.sendKeys(Keys.CONTROL, Keys.chord("a"));
        elementConfName.sendKeys(Keys.BACK_SPACE);
        elementConfName.sendKeys(commonIntentName);
        //Thread.sleep(2000);
    }

    public void clickUpdateCommonIntent()
    {
        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Update')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void clickOnBackButton()
    {
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-common-intents-create[1]/div[1]/div[1]/div[1]/button[1]/span[1]/mat-icon[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void updateCommonIntentTrainingPhrase(String trainingPhrase) throws InterruptedException
    {
        WebElement element = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-common-intents-create[1]/form[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/div[1]/div[2]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);

        WebElement elementEdit = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", elementEdit);

        WebElement elementName = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-common-intents-create[1]/form[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        elementName.sendKeys(Keys.CONTROL, Keys.chord("a"));
        elementName.sendKeys(Keys.BACK_SPACE);
        elementName.sendKeys(trainingPhrase);
        Thread.sleep(2000);
    }

    public void clickCommonIntentTrainingPhraseUpdate()
    {
        WebElement element = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-common-intents-create[1]/form[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void enterTrainingPhraseCoInUpdate(String trainingPhrase)
    {
        WebElement elementTrainingPhrase = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-common-intents-create[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        elementTrainingPhrase.sendKeys(trainingPhrase);
    }

    public void addNewPhraseCoInUpdate()
    {
        WebElement addPhrase = driver.findElement(By.xpath("//body[1]/modal-container[1]/div[1]/div[1]/app-common-intents-create[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", addPhrase);
    }

    public void clickDeleteButton()
    {
        WebElement clickMore = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-common-intents-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", clickMore);

        //WebElement clickDelete = driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[2]/span[1]"));
        WebElement clickDelete = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", clickDelete);
    }

    public void verifyUpdateButton()
    {
        WebElement updateButton = driver.findElement(By.xpath("//button[contains(text(),'Update')]"));
        updateButton.isEnabled();
    }

    public void clickCopyCode() throws InterruptedException
    {
        Thread.sleep(5000);
        WebElement clickCopy = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-common-intents[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/button[1]/span[1]/mat-icon[1]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", clickCopy);
    }

    public void verifySuccessfulCopy()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//span[contains(text(),'Intent Code Copied')]"));
        Assert.assertTrue(verifyMessage.isDisplayed());
    }

    public void clickCopyCodeIconOnCommonIntUpdate() throws InterruptedException
    {
        Thread.sleep(10000);
        WebElement clickCopy = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-common-intents-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]/mat-icon[1]"));
        //JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        //executor1.executeScript("arguments[0].click()", clickCopy);
        clickCopy.click();
    }

    public void verifySuccessfulCopyFromCommonIntUpdate()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//span[contains(text(),'Intent Code Copied')]"));
        Assert.assertTrue(verifyMessage.isDisplayed());
    }

    public void viewCommonIntent() throws InterruptedException
    {
        Thread.sleep(3000);
        WebElement clickForView = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-common-intents[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", clickForView);
        Thread.sleep(5000);
    }

    public void verifyCommonIntentViewMode()
    {
        WebElement verifyText = driver.findElement(By.xpath("//div[contains(text(),'View Intent Details')]"));
        Assert.assertEquals(true, verifyText.isDisplayed());
    }

    public void clickCloseButtonOnCommonIntentView() throws InterruptedException
    {
        driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-common-intents-view[1]/div[1]/button[1]")).click();
        Thread.sleep(3000);
    }
}

