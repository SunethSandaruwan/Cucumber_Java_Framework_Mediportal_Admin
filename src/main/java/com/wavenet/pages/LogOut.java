package com.wavenet.pages;


import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;
public class LogOut {

    public static WebDriver driver;

    private By ClickLogoutButton = By.xpath("");

    private By ClickOnSignOut = By.xpath("//span[normalize-space()='Logout']");

    public void log_out()throws Throwable{

           // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
           //WebElement ClickProfile = driver.findElement(By.xpath("//span[normalize-space()='account_circle']"));

            //driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
           // WebElement ClickOnLogoutButton = driver.findElement(ClickLogoutButton);
           // ClickOnLogoutButton.click();
            WebElement ClickSignOut = driver.findElement(ClickOnSignOut);
            ClickSignOut.click();

           // ClickProfile.click();
//            WebElement ClickLogOut = driver.findElement(By.xpath("//span[normalize-space()='Logout']"));
//            ClickLogOut.click();
    }
}
