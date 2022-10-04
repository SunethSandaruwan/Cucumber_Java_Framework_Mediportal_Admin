package com.wavenet.pages;

import com.wavenet.util.Config;
import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MyDoctor {
    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Config config = new Config();
    String url = config.getUrl();


    public MyDoctor(){
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }
    public void click_on_Doctors () throws Throwable{
        Thread.sleep(5000);
        WebElement ClickDoctors = driver.findElement(By.xpath("//mat-icon[normalize-space()='perm_contact_calendar']"));
        ClickDoctors.click();
    }

     public void click_on_My_Doctors () throws Throwable{
        Thread.sleep(5000);
        WebElement ClickMyDoctors = driver.findElement(By.xpath("//span[normalize-space()='My doctors']"));
        ClickMyDoctors.click();
     }

     public void verify_the_My_Doctors_page () throws Throwable{
        Thread.sleep(5000);
        boolean VerifyMyDoctor = driver.findElement(By.xpath("//h1[normalize-space()='My Doctors']")).isDisplayed();
         Assert.assertEquals(true,VerifyMyDoctor);

     }
     //Select on MyDoctor Field hospital search bar
     public void select_the_Hospital_Search_Field (String SearchName) throws Throwable{
      //  WebElement ClickHospitalField = driver.findElement(By.xpath("//*[@id="mat-input-1"]"));
      //  ClickHospitalField.click();
        WebElement EnterHospitalName = driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]"));
        EnterHospitalName.sendKeys(SearchName);
        Thread.sleep(3000);
        List<WebElement> listOfElements= driver.findElements(By.xpath(""));

         for (WebElement webElement : listOfElements) {
             if (webElement.getText().trim().equals(SearchName)){
                 webElement.click();
                 break;
             }
         }
        Thread.sleep(5000);


      //    SelectSearchFieldList = driver.findElement(By.xpath(""));
     }
     //Click on Assign button
     public void click_on_Assign_Doctor_Button () throws Throwable{
        WebElement Assignbtn = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/manage-doctors-selector/div/button/span[1]"));
        Assignbtn.click();
     }
     //Select the un assigend Doctor name in gred
    public void select_the_unassigned_Doctor_Name () throws Throwable{
        WebElement SelectUnassignedDoctor = driver.findElement(By.xpath("//*[@id=\"mat-input-158\"]"));
        SelectUnassignedDoctor.click();
    }
    //Select the Click on save button
    public void click_on_Save_Button () throws Throwable{
        WebElement ClickSaveBtn = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/manage-doctors-selector/mat-sidenav-container[3]/mat-sidenav/div/div/div[2]/form/div[5]/button/span[2]"));
        ClickSaveBtn.click();
    }
    //Click on cancel button
    public void click_on_Cancel_button () throws Throwable{
        WebElement ClickCancelBtn = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/manage-doctors-selector/mat-sidenav-container[3]/mat-sidenav/div/div/div[2]/form/div[5]/button/span[1]"));
        ClickCancelBtn.click();
    }
    //Verify the assign doctor name in Hospital
    public void verify_the_Assign_Doctor_name_in_Hospital() throws Throwable{
        WebElement VerifyAssign  =  driver.findElement(By.xpath(""));


    }
}
