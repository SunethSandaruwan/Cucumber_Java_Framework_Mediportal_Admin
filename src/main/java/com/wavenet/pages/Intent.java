package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Intent {

    public static WebDriver driver;

    private Login login = new Login();

    public Intent(){
        driver = InitializeDriver.getInstance().getDriver();
    }

    public void composeLogin(String composeUrl, String composeUsername, String composePassword)
    {
        login.loadComposeLogin(composeUrl);
        login.enterComposeLoginData(composeUsername,composePassword);
        login.clickLogIn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement verifyLocation = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/div[1]/app-left-navbar[1]/div[1]/div[1]/div[2]/div[1]"));
        verifyLocation.isDisplayed();
    }

    public void selectCreatedWorkspace(String workspaceName) throws InterruptedException {

        WebElement selectAgent = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/div[1]/app-left-navbar[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]"));
        JavascriptExecutor executor4 = (JavascriptExecutor)driver;
        executor4.executeScript("arguments[0].click()", selectAgent);

        WebElement agentDropDown = driver.findElement(By.id("agent-dropdown"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", agentDropDown);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement selectMore = driver.findElement(By.id("mnu-compose-test-automation-agent3"));
        JavascriptExecutor executor2 = (JavascriptExecutor)driver;
        executor2.executeScript("arguments[0].click()", selectMore);

        WebElement clickSelectAgent = driver.findElement(By.xpath("//span[contains(text(),'Select Workspace')]"));
        JavascriptExecutor executor3 = (JavascriptExecutor)driver;
        executor3.executeScript("arguments[0].click()", clickSelectAgent);

        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public void clickOnConnectors()
    {
        WebElement elementTriggers = driver.findElement(By.xpath("//span[contains(text(),'Connectors')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", elementTriggers);
    }

    public void selectIntentsTab()
    {
        WebElement elementIntents = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/div[1]/app-left-navbar[1]/div[1]/div[1]/div[2]/div[4]/div[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", elementIntents);
    }

    public void clickCreateIntent()
    {
        WebElement createIntent = driver.findElement(By.xpath("//button[contains(text(),'CREATE INTENT')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", createIntent);
    }

    public void enterIntentName(String intentName)
    {
        WebElement elementIntentName = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intent-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        elementIntentName.sendKeys(intentName);
    }

    public void selectFlow(String flowName)
    {
        Select elementFlowName = new Select(driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intent-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/select[1]")));
        elementFlowName.selectByVisibleText(flowName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void enterTrainingPhrase(String trainingPhrase)
    {
        WebElement elementTrainingPhrase = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intent-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        elementTrainingPhrase.sendKeys(trainingPhrase);
    }

    public void addNewPhrase()
    {
        WebElement addPhrase = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intent-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/mat-icon[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", addPhrase);
    }

    public void clickOnIntentCreate()
    {
        WebElement intentCreate = driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", intentCreate);
    }

    public void searchIntentByName(String intentName)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchBox = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intents[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
        searchBox.sendKeys(Keys.CONTROL, Keys.chord("a"));
        searchBox.sendKeys(Keys.BACK_SPACE);
        searchBox .sendKeys(intentName);
        searchBox.sendKeys(Keys.ENTER);
    }

    public void deleteIntent() throws InterruptedException
    {
        Thread.sleep(9000);
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intents[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
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

    public void verifyIntentNameAllowedCharacters()
    {
        WebElement verifyCharacters = driver.findElement(By.xpath("//div[contains(text(),'Allow letters, numbers and spaces only.')]"));
        verifyCharacters.isDisplayed();
    }

    public void verifyIntentNameRequired()
    {
        WebElement verifyRequired = driver.findElement(By.xpath("//div[contains(text(),'Intent name required.')]"));
        verifyRequired.isDisplayed();
    }

    public void verifyIntentNameMaxLength()
    {
        WebElement verifyRequired = driver.findElement(By.xpath("//div[contains(text(),'Intent name maximum characters length is 32.')]"));
        verifyRequired.isDisplayed();
    }

    public void verifyIntentFlowNameRequired()
    {
        WebElement verifyRequired = driver.findElement(By.xpath("//div[contains(text(),'Flow is required.')]"));
        verifyRequired.isDisplayed();
    }

    public void verifyTrainingPhraseMaxLength()
    {
        WebElement verifyRequired = driver.findElement(By.xpath("//div[contains(text(),'Training phrase maximum characters length is 200.')]"));
        verifyRequired.isDisplayed();
    }

    public void verifyIntentTrainingPhraseRequired()
    {
        WebElement verifyRequired = driver.findElement(By.xpath("//div[contains(text(),'Training phrase required.')]"));
        verifyRequired.isDisplayed();
    }

    public void flowNameEmpty()
    {
        new Select(driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intent-create[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/select[1]"))).selectByValue("");
    }

    public void verifyDuplicatePhrases()
    {
        WebElement verifyRequired = driver.findElement(By.xpath("//div[contains(text(),'Training phrase cannot be duplicate.')]"));
        verifyRequired.isDisplayed();
    }

    public void clickIntentUpdate() throws InterruptedException
    {
        Thread.sleep(9000);
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intents[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);

        WebElement element2 = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", element2);

    }

    public void updateIntentName(String intentName) throws InterruptedException
    {
        WebElement elementConfName = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intent-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        elementConfName.sendKeys(Keys.CONTROL, Keys.chord("a"));
        elementConfName.sendKeys(Keys.BACK_SPACE);
        elementConfName.sendKeys(intentName);
        Thread.sleep(2000);
    }

    public void clickUpdateIntent()
    {
        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'UPDATE')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void updateFlowName(String flowName)
    {
        Select elementFlowName = new Select(driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intent-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/select[1]")));
        elementFlowName.selectByVisibleText(flowName);
    }

    public void updateTrainingPhrase(String trainingPhrase) throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intent-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);

        WebElement elementEdit = driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", elementEdit);

        WebElement elementConfName = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intent-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        elementConfName.sendKeys(Keys.CONTROL, Keys.chord("a"));
        elementConfName.sendKeys(Keys.BACK_SPACE);
        elementConfName.sendKeys(trainingPhrase);
        Thread.sleep(2000);
    }

    public void clickTrainingPhraseUpdate()
    {
        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Update')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void enterTrainingPhraseInUpdate(String trainingPhrase)
    {
        WebElement elementTrainingPhrase = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intent-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]"));
        elementTrainingPhrase.sendKeys(trainingPhrase);
    }

    public void addNewPhraseInUpdate()
    {
        WebElement addPhrase = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intent-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]/mat-icon[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", addPhrase);
    }

    public void clickDeleteButton()
    {
        WebElement clickMore = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intent-update[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", clickMore);

        //WebElement clickDelete = driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[2]/span[1]"));
        WebElement clickDelete = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", clickDelete);
    }

    public void verifyUpdateButton()
    {
        WebElement updateButton = driver.findElement(By.xpath("//button[contains(text(),'UPDATE')]"));
        updateButton.isEnabled();
    }

    public void viewIntent() throws InterruptedException
    {
        Thread.sleep(3000);
        WebElement clickForView = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-intents[1]/div[1]/div[1]/div[2]/div[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/mat-radio-group[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", clickForView);
        Thread.sleep(5000);
    }

    public void verifyIntentViewMode()
    {
        WebElement verifyText = driver.findElement(By.xpath("//div[contains(text(),'View Intent Details')]"));
        Assert.assertEquals(true, verifyText.isDisplayed());
    }

    public void clickCloseButtonOnIntentView() throws InterruptedException
    {
        driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-intent-view[1]/div[1]/button[1]")).click();
        Thread.sleep(3000);
    }
}
