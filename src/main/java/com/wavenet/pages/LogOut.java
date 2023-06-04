package com.wavenet.pages;


import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;
public class LogOut {

    public static WebDriver driver;

    public void log_out()throws Throwable{

            Thread.sleep(5000);
           // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
           //WebElement ClickProfile = driver.findElement(By.xpath("//span[normalize-space()='account_circle']"));
            driver.findElement(By.xpath("//span[normalize-space()='account_circle']")).click();

           // ClickProfile.click();
//            WebElement ClickLogOut = driver.findElement(By.xpath("//span[normalize-space()='Logout']"));
//            ClickLogOut.click();
    }
}
