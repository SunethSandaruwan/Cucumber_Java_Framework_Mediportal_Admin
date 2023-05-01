package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class Login {
    public static WebDriver driver;

    public Login(){
        driver = InitializeDriver.getInstance().getDriver();
    }

    public void loadUrl(String loginUrl){
        try {
            driver.get(loginUrl);
            driver.manage().window().maximize();

        } catch (UnhandledAlertException f) {

            try {

                Alert alert = driver.switchTo().alert();
                alert.accept();

            } catch (NoAlertPresentException e) {

                e.printStackTrace();

            }

        }
    }

    public void enterLoginData(String username,String password){
        WebElement elementUsername = driver.findElement(By.xpath("//input[contains(@formcontrolname, 'userName')]"));
        elementUsername.sendKeys(username);
        WebElement elementPassword = driver.findElement(By.xpath("//input[contains(@formcontrolname, 'password')]"));
        elementPassword.sendKeys(password);
    }

    public void clickSignIn(){
        driver.findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
    }

    public void clickCompose() throws InterruptedException {

        Thread.sleep(7000);
        WebElement element = driver.findElement(By.xpath("//body/div[1]/div[2]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click()", element);
    }

    public void verifySuccessfulLogin(){
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebElement verifyLocation = driver.findElement(By.xpath("//body/div[1]/div[2]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
        verifyLocation.isDisplayed();
    }

    public void verifyUnsuccessfulLogin(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement verifyMessage = driver.findElement(By.xpath("//*[contains(text(),'We cannot find an account with this username, please check and try again')]"));
        Assert.assertEquals(true, verifyMessage.isDisplayed());
    }

    public void verifyErrorMessage(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement verifyMessage = driver.findElement(By.xpath("//*[contains(text(),'Invalid Password')]"));
        Assert.assertEquals(true, verifyMessage.isDisplayed());
    }

    public void verifyErrorPopup(){
        WebElement verifyMessage = driver.findElement(By.xpath("//*[contains(text(),'* This field is required')]"));
        Assert.assertEquals(true, verifyMessage.isDisplayed());
    }

    public void enterLoginUsername(String username){
        WebElement elementUsername = driver.findElement(By.name("user_id_log"));
        elementUsername.sendKeys(username);
    }

    public void loadComposeLogin(String composeUrl)
    {
        try {

            driver.get(composeUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } catch (UnhandledAlertException f) {

            try {

                Alert alert = driver.switchTo().alert();
                alert.accept();

            } catch (NoAlertPresentException e) {

                e.printStackTrace();

            }

        }
    }

    public void enterComposeLoginData(String composeUsername,String composePassword)
    {
        WebElement elementUsername = driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/mat-card[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]"));
        elementUsername.sendKeys(composeUsername);
        WebElement elementPassword = driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/mat-card[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/input[1]"));
        elementPassword.sendKeys(composePassword);
    }

    public void clickLogIn()
    {
        driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/mat-card[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[2]/button[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void loadComposeHomePage()
    {
        boolean eleSelected= driver.findElement(By.xpath("//body/app-root[1]/app-shell[1]/div[1]/div[1]/div[1]/app-left-navbar[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).isDisplayed();
    }

    public void verifyErrorMessageInLogin()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //WebElement verifyMessage = driver.findElement(By.xpath("//div[contains(text(),'Username or password incorrect.')]"));
        //Assert.assertEquals(true, verifyMessage.isDisplayed());
        boolean eleSelected= driver.findElement(By.xpath("//div[contains(text(),'Username or password incorrect.')]")).isDisplayed();
    }

    public void checkLoginButton()
    {
        Assert.assertFalse(driver.findElement(By.xpath("//body/app-root[1]/app-login[1]/div[1]/mat-card[1]/div[1]/div[2]/div[1]/form[1]/div[4]/div[2]/button[1]")).isEnabled());
    }

}
