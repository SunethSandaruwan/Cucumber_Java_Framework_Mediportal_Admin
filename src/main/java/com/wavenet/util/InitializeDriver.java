package com.wavenet.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import javax.swing.text.html.Option;
import java.util.concurrent.TimeUnit;

public class InitializeDriver {
    public static WebDriver driver;
    public static InitializeDriver initializeDriver;

    private InitializeDriver()
    {
        getInitializeDriver();
    }

    public static InitializeDriver getInstance(){
        if(initializeDriver == null){
            initializeDriver = new InitializeDriver();
        }
        return initializeDriver;
    }

    private void getInitializeDriver(){
        String userDir = System.getProperty("user.dir");
        //System.setProperty("webdriver.chrome.driver",userDir + "/src/main/resources/Drivers/chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("disable-gpu");

        //driver = new ChromeDriver();
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        System.out.println("Initialize Browser : Browser is initialized");
    }

    public WebDriver getDriver(){
        return driver;
    }

    @Before
    public void openBrowser() {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("openBrowser: Browser is opened");
    }

    @After
    public void closeBrowser() {
        driver.quit();
        System.out.println("closeBrowser: Browser is closed");
    }

}


