package com.wavenet.pages;

import com.wavenet.util.Config;
import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralConfigurations {

    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Config config = new Config();
    String url = config.getUrl();
    JavascriptExecutor js= (JavascriptExecutor)driver;

    public GeneralConfigurations(){
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }
    public void click_on_Configuration() throws Throwable{
        Thread.sleep(5000);
        WebElement ClickConfigurations = driver.findElement(By.xpath("//span[text()=' Configuration']"));
        ClickConfigurations.click();
    }
    public void click_on_Hospital() throws Throwable{
        Thread.sleep(5000);
        WebElement ClickHospital = driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-9\"]/span[1]/mat-panel-title/span"));
        ClickHospital.click();
        //Scroll down in web page
        js.executeScript("argument[0].scrollIntoView();", ClickHospital);

    }
    public void click_on_Business_Hours() throws Throwable{
        Thread.sleep(5000);
        WebElement ClickBusinessHours = driver.findElement(By.xpath("//span[contains(text(),'Business Hours')]"));
        ClickBusinessHours.click();
    }
    public void verify_the_General_Configurations() throws  Throwable{
        Thread.sleep(5000);
        boolean VGConfigurations = driver.findElement(By.xpath("//h1[contains(text(),'General Configurations')]")).isDisplayed();
        Assert.assertEquals(true,VGConfigurations);
        System.out.println("Verify Configurations");
    }
    public void click_on_the_General_Configurations_Search_Hospital_Field() throws Throwable{
        Thread.sleep(5000);
        WebElement SearchHospitalField = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
        SearchHospitalField.click();
    }
    public void select_or_Enter_Hospital_Name(String HospitalName) throws Throwable{
        Thread.sleep(5000);
        WebElement EnterHospitalName = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
        EnterHospitalName.sendKeys("KOKO");
    }
    public void select_the_x_Operations_Radio_Button() throws Throwable{
        Thread.sleep(5000);
        WebElement Click24x = driver.findElement(By.xpath("//span[contains(text(),'24x7 Operations ')]"));
        Click24x.click();
    }
    public void select_the_Custom_hours_Radio_Button() throws Throwable{
        Thread.sleep(5000);
        WebElement CustomHours = driver.findElement(By.xpath("//span[contains(text(),'Custom hours')]"));
        CustomHours.click();
    }
}
