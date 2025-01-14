package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class OddPhrase {

    public static WebDriver driver;

    private Login login = new Login();

    public OddPhrase() {
        driver = InitializeDriver.getInstance().getDriver();
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

    public void clickOnTrainingTab()
    {
        WebElement elementShortCodes = driver.findElement(By.xpath("//span[contains(text(),'Training')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", elementShortCodes);
    }

    public void clickOnUnresolvedRequestsTab()
    {
        WebElement elementTab = driver.findElement(By.xpath("//span[contains(text(),'Unresolved Request(s)')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", elementTab);
    }

    public void searchTrainingPhrase(String trainingPhrase) {

        WebElement searchBox = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-training[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
        searchBox.sendKeys(Keys.CONTROL, Keys.chord("a"));
        searchBox.sendKeys(Keys.BACK_SPACE);
        searchBox.sendKeys(trainingPhrase);

        WebElement phraseSearch = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-training[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[4]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", phraseSearch);

    }

    public void clickOnIgnoreButton()
    {
        WebElement elementIgnore = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-training[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/li[2]/div[1]/div[2]/app-training-update[1]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", elementIgnore);
    }

    public void clickOnYesButtonOnIgnorePhraseConfirmation()
    {
        WebElement clickYes = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", clickYes);
    }

    public void verifyPhraseIgnored()
    {
        WebElement verifyText = driver.findElement(By.xpath("//span[contains(text(),'Phrase successfully ignored')]"));
        Assert.assertEquals(true, verifyText.isDisplayed());
    }

    public void clickOnIgnoredRequestsTab()
    {
        WebElement elementTab = driver.findElement(By.xpath("//span[contains(text(),'Ignored')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", elementTab);
    }

    public void clickOnUnIgnoreButton()
    {
        WebElement elementIgnore = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-training[1]/div[1]/div[1]/div[2]/div[2]/div[1]/tabset[1]/div[1]/tab[2]/div[1]/cdk-virtual-scroll-viewport[1]/div[1]/ul[1]/li[2]/div[1]/div[2]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", elementIgnore);
    }

    public void clickOnYesButtonOnUnIgnorePhraseConfirmation()
    {
        WebElement clickYes = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", clickYes);
    }

    public void verifyPhraseUnIgnored()
    {
        WebElement verifyText = driver.findElement(By.xpath("//span[contains(text(),'Phrase successfully unignored')]"));
        Assert.assertEquals(true, verifyText.isDisplayed());
    }
}
