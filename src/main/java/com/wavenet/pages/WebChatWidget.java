package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebChatWidget {

    public static WebDriver driver;

    private Login login = new Login();

    public WebChatWidget(){
        driver = InitializeDriver.getInstance().getDriver();
    }

    public void selectWebChatWidget() throws InterruptedException {
        WebElement selectWidget = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/div[1]/app-left-navbar[1]/div[1]/div[1]/div[2]/div[3]/div[1]/ul[1]/li[5]/ul[1]/li[5]/a[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", selectWidget);
        Thread.sleep(5000);
    }

    public void clickOnCreateWidget()
    {
        WebElement elementCreateWidget = driver.findElement(By.xpath("//button[contains(text(),'CREATE WIDGET')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", elementCreateWidget);
    }

    public void enterWebChatWidgetName(String widgetName)
    {
        WebElement elementWidgetName = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-create-widget[1]/form[1]/div[1]/div[1]/input[1]"));
        elementWidgetName.sendKeys(widgetName);
    }

    public void enterWebChatWidgetTitle(String widgetTitle)
    {
        WebElement elementWidgetTitle = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-create-widget[1]/form[1]/div[1]/div[2]/input[1]"));
        elementWidgetTitle.sendKeys(widgetTitle);
    }

    public void enterWebChatWidgetDesc(String widgetDesc)
    {
        WebElement elementWidgetDesc = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-create-widget[1]/form[1]/div[1]/div[3]/textarea[1]"));
        elementWidgetDesc.sendKeys(widgetDesc);
    }

    public void selectWebChatWidgetServiceDetection(String serviceDetection)
    {
        WebElement selectServiceDetection = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-create-widget[1]/form[1]/div[1]/div[4]/select[1]"));
        selectServiceDetection.sendKeys(serviceDetection);
    }

    public void enterWebChatWidgetDomainName(String domainName)
    {
        WebElement elementWidgetDomain = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-create-widget[1]/form[1]/div[1]/div[5]/input[1]"));
        elementWidgetDomain.sendKeys(domainName);
    }

    public void clickOnWebChatWidgetCreate()
    {
        WebElement webChatCreate = driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", webChatCreate);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void searchWebChatWidgetByName(String widgetName)
    {
        WebElement searchBox = driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-webchats[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        searchBox.sendKeys(Keys.CONTROL, Keys.chord("a"));
        searchBox.sendKeys(Keys.BACK_SPACE);
        searchBox .sendKeys(widgetName);

    }

    public void deleteWebChatWidget() throws InterruptedException
    {
        Thread.sleep(5000);

        WebElement element2 = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/button[1]"));
        element2.click();

        WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", element3);

        WebElement element4 = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
        JavascriptExecutor executor2 = (JavascriptExecutor)driver;
        executor2.executeScript("arguments[0].click()", element4);

        Thread.sleep(3000);

    }

    public void verifyWidgetNameValidCharacters()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Allow only letters, numbers,hyphen and underscore.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyWidgetNameMaxLength()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Maximum character length is 100')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyWidgetNameRequired()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Name is required.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyWidgetDescriptionMaxLength()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Maximum character length is 200')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyWidgetFlowNameRequired()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Flow is required')]"));
        verifyMessage.isDisplayed();
    }

    public void selectWidgetFlowName(String flowName) {

        List<WebElement> optionsToSelect = driver.findElements(By.xpath("//typeahead-container"));
        WebElement elementBodyVar = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-create-widget[1]/form[1]/div[1]/div[5]/input[1]"));
        elementBodyVar.sendKeys(flowName);
        elementBodyVar.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public void enterWebChatWidgetDomainNameForStaticServiceDetection(String domainName)
    {
        WebElement elementWidgetDomain = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-create-widget[1]/form[1]/div[1]/div[6]/input[1]"));
        elementWidgetDomain.sendKeys(domainName);
    }

    public void verifyWidgetFlowNameInvalid()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Please select a valid flow from the dropdown')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyWidgetDomainNameInvalid()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Please enter a valid domain')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyWidgetDomainNameRequired()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Domain is required.')]"));
        verifyMessage.isDisplayed();
    }

    public void verifyWidgetDomainNameMaxLength()
    {
        WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Maximum character length is 64')]"));
        verifyMessage.isDisplayed();
    }

    public void clickOnWebChatWidgetButton()
    {
        WebElement webChatCreate = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-create-widget[1]/form[1]/div[1]/div[6]/div[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", webChatCreate);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void enterWidgetButtonColorCode(String colorCode)
    {
        WebElement elementWidgetColor = driver.findElement(By.xpath("//body[1]/modal-container[1]/div[1]/div[1]/app-create-widget[1]/form[1]/div[1]/div[6]/div[1]/color-picker[1]/div[1]/div[7]/div[1]/input[1]"));
        elementWidgetColor.sendKeys(Keys.CONTROL, Keys.chord("a"));
        elementWidgetColor.sendKeys(Keys.BACK_SPACE);
        elementWidgetColor.sendKeys(colorCode);
    }

    public void editWebChatWidget() throws InterruptedException
    {
        Thread.sleep(5000);

        WebElement element2 = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/button[1]"));
        element2.click();

        WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", element3);

        Thread.sleep(10000);

    }

    public void updateWebChatWidgetName(String widgetName) throws InterruptedException {
        Thread.sleep(1000);
        WebElement elementWidgetName = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-update-widget[1]/form[1]/div[1]/div[1]/input[1]"));
        elementWidgetName.sendKeys(Keys.CONTROL, Keys.chord("a"));
        elementWidgetName.sendKeys(Keys.BACK_SPACE);
        elementWidgetName.sendKeys(widgetName);
        Thread.sleep(2000);
    }

    public void clickOnUpdateButton()
    {
        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Update')]"));
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].click()", element);
    }

    public void updateWebChatWidgetDesc (String widgetDesc)
    {
        WebElement elementWidgetName = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-update-widget[1]/form[1]/div[1]/div[3]/textarea[1]"));
        elementWidgetName.sendKeys(Keys.CONTROL, Keys.chord("a"));
        elementWidgetName.sendKeys(Keys.BACK_SPACE);
        elementWidgetName.sendKeys(widgetDesc);
    }

    public void updateWebChatWidgetServiceDetection(String serviceDetection)
    {
        WebElement selectServiceDetection = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-update-widget[1]/form[1]/div[1]/div[4]/select[1]"));
        selectServiceDetection.sendKeys(serviceDetection);
    }

    public void updateWidgetFlowName(String flowName) {

        List<WebElement> optionsToSelect = driver.findElements(By.xpath("//typeahead-container"));
        WebElement elementBodyVar = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-update-widget[1]/form[1]/div[1]/div[5]/input[1]"));
        elementBodyVar.sendKeys(Keys.CONTROL, Keys.chord("a"));
        elementBodyVar.sendKeys(Keys.BACK_SPACE);
        elementBodyVar.sendKeys(flowName);
        elementBodyVar.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public void updateWebChatWidgetDomainName (String widgetDomainName)
    {
        WebElement elementWidgetName = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-update-widget[1]/form[1]/div[1]/div[5]/input[1]"));
        elementWidgetName.sendKeys(Keys.CONTROL, Keys.chord("a"));
        elementWidgetName.sendKeys(Keys.BACK_SPACE);
        elementWidgetName.sendKeys(widgetDomainName);
    }

    public void clickOnWebChatWidgetButtonOnUpdateUI()
    {
        WebElement webChatCreate = driver.findElement(By.xpath("//body/modal-container[1]/div[1]/div[1]/app-update-widget[1]/form[1]/div[1]/div[6]/div[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", webChatCreate);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void updateWidgetButtonColorCode(String colorCode)
    {
        WebElement elementWidgetColor = driver.findElement(By.xpath("//body[1]/modal-container[1]/div[1]/div[1]/app-update-widget[1]/form[1]/div[1]/div[6]/div[1]/color-picker[1]/div[1]/div[7]/div[1]/input[1]"));
        elementWidgetColor.sendKeys(Keys.CONTROL, Keys.chord("a"));
        elementWidgetColor.sendKeys(Keys.BACK_SPACE);
        elementWidgetColor.sendKeys(colorCode);
    }

    public void clickWidgetGoToFlowOption() throws InterruptedException {
        WebElement clickGoTo = driver.findElement(By.xpath("//body[1]/app-root[1]/app-shell[1]/div[1]/div[1]/main[1]/app-webchats[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[1]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()", clickGoTo);
        Thread.sleep(10000);
    }

    public void verifyWidgetGoToFlowName(String flowName) throws InterruptedException {
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
