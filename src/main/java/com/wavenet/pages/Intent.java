package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
       // login.ClickLogIn();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

    public void login_to_Admin_Successfully(String composeUrl, String composeUsername, String composePassword ) throws Throwable {
        login.loadComposeLogin(composeUrl);
        login.enterComposeLoginData(composeUsername,composePassword);
        login.clickLogIn();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement verifyLocation = driver.findElement(By.xpath("//h1[contains(text(),'Finance Dashboard')]"));
        verifyLocation.isDisplayed();
        Thread.sleep(20000);
    }
}
