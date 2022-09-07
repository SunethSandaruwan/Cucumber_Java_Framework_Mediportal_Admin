package com.wavenet.pages;


import com.wavenet.util.Config;
import com.wavenet.util.InitializeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Login {
    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Config config = new Config();
    String url = config.getUrl();


    int a3 = 3;

    public Login() {
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }

    public void click_on_LogIn_Button() throws Throwable {
        Thread.sleep(3000);
        WebElement loginBtn = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        loginBtn.click();
    }

    public void enter_Mobile_Number_for_login(String mobileNo) throws Throwable {
        WebElement mobileNoField = driver.findElement(By.xpath("//input[@id='username']"));
        mobileNoField.sendKeys(mobileNo);
    }

    public void enter_Password_for_login(String password) throws Throwable {
        WebElement pwdField = driver.findElement(By.xpath("//input[@id='password']"));
        pwdField.sendKeys(password);
    }

    public void redirect_to_next_page() throws Throwable {
        driver.manage().timeouts().implicitlyWait(a3, TimeUnit.SECONDS);
//        WebElement menuBtn = driver.findElement(By.xpath("//body/app-root[1]/app-top-navbar[1]/div[1]/nav[1]/div[1]/ul[1]/li[1]"));
//        menuBtn.click();
        Thread.sleep(1000);
        WebElement mobileNoBtn = driver.findElement(By.xpath("//h1[contains(text(),'Lorem ipsum dolor sit amet, consectetur.')]"));
        Assert.assertEquals(true,mobileNoBtn.isDisplayed());
    }

    public void enter_Invalid_Mobile_Number() throws Throwable {
        WebElement MobileNoField = driver.findElement(By.xpath("//input[@id='username']"));
        MobileNoField.sendKeys("0712222222");
    }


    public void display_toast_as_Invalid_mobile_number_or_password(String toast) throws Throwable {
        WebElement validationText1 = driver.findElement(By.xpath("//span[@id='input-error']"));
        Assert.assertEquals(toast, validationText1.getText());
    }

    public void check_whether_the_password_is_masked() throws Throwable {
        WebElement pwdField = driver.findElement(By.xpath("//input[@id='password']"));
        Assert.assertEquals("password", pwdField.getAttribute("type"));
    }


    public void click_on_Forgot_Password_button() throws Throwable {
        WebElement forgotPwd = driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']"));
        forgotPwd.click();
    }

    public void redirect_to_forgot_password_page() throws Throwable {
        WebElement forgotPwd = driver.findElement(By.xpath("//h1[@id='kc-page-title']"));
        Assert.assertEquals(true,forgotPwd.isDisplayed());
    }

    public void click_on_Register_button() throws Throwable {
        WebElement registerBtn = driver.findElement(By.xpath(" //a[normalize-space()='Register']"));
        registerBtn.click();
    }


    public void click_on_Logout_button() throws Throwable {
        Thread.sleep(3000);
        WebElement logInBtn = driver.findElement(By.xpath("//body/app-root[1]/app-top-navbar[1]/div[1]/nav[1]/div[1]/button[1]"));
        logInBtn.click();
        WebElement logoutBtn = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
        logoutBtn.click();
    }
    //--------------------BAP--------------------
    public void enter_for_log_in_as_suneth(String name) throws Throwable{
        WebElement pwdField = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
        pwdField.sendKeys(name);
    }
    public void enter_for_password_as_Test(String password) throws Throwable{
        WebElement pwdField = driver.findElement(By.xpath("//input[@type='password']"));
        pwdField.sendKeys(password);
    }
    public void click_on_the_signin_button() throws Throwable {
        WebElement loginBtn = driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
        loginBtn.click();
    }
    public void navigate_to_the_home_page() throws Throwable {
        boolean status = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav[1]/div/app-sidenav/mat-nav-list/h2/img")).isDisplayed();
        Assert.assertEquals(true,status);
    }

    public void driver_Close() throws Throwable{
        driver.close(); //closes the browser
    }

}