package com.wavenet.pages;

import com.wavenet.util.Config;
import com.wavenet.util.InitializeDriver;
import cucumber.api.java.en.Given;
//import jdk.nashorn.internal.scripts.JS;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.sql.DriverManager.getDriver;

public class PersonalInfo {
    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Config config = new Config();
    String url = config.getUrl();

    int a = 2;

    public PersonalInfo() {
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }

    public void click_on_the_name_button() throws Throwable {
        WebElement nameBtn = driver.findElement(By.xpath("//img[@alt='icon-correct-mark']"));
        nameBtn.click();
    }

    public void redirect_to_profile_page() throws Throwable {
        WebElement personalInfoLabelElement = driver.findElement(By.xpath("//h2[normalize-space()='My Personal Info']"));
        Assert.assertEquals(true,personalInfoLabelElement.isDisplayed());
    }

    public void click_on_personal_info_edit_button() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        WebElement editBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        editBtn.click();
    }

    public void check_first_name(String firstName) throws Throwable {
        System.out.println(firstName);
        WebElement firstNameElement = driver.findElement(By.xpath("//input[contains(@formcontrolname,'firstname')]"));
        Assert.assertEquals(firstName, firstNameElement.getAttribute("value"));
    }
    public void check_last_name(String lastName) throws Throwable {
        WebElement lastNameElement = driver.findElement(By.xpath("//input[contains(@formcontrolname,'lastname')]"));
        Assert.assertEquals(lastName, lastNameElement.getAttribute("value"));
    }

    public void check_email(String email) throws Throwable {
        WebElement emailElement = driver.findElement(By.xpath("//input[contains(@formcontrolname,'email')]"));
        Assert.assertEquals(email, emailElement.getAttribute("value"));
    }

    public void check_mobile_number(String mobileNo) throws Throwable {
        WebElement mobileNoElement = driver.findElement(By.xpath("//input[contains(@formcontrolname,'mobileNumber')]"));
        Assert.assertEquals(mobileNo, mobileNoElement.getAttribute("value"));
    }

    public void select_date_of_birth() throws Throwable {
        Thread.sleep(3000);
        WebElement birthday = driver.findElement(By.xpath("//input[@id='mat-input-10']"));
        birthday.click();
        WebElement selectedBday = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M19 3h-1V1')]"));
        selectedBday.click();
        WebElement selectDate = driver.findElement(By.xpath("//div[normalize-space()='3']"));
        selectDate.click();
    }
    public void select_gender() throws Throwable {
        Thread.sleep(6000);
        WebElement gender = driver.findElement(By.xpath("//mat-select[@id='mat-select-0']"));
        gender.click();
        WebElement gender1 = driver.findElement(By.xpath("//span[normalize-space()='Female']"));
        gender1.click();
    }

    public void select_nationality() throws Throwable {
        Thread.sleep(3000);
        WebElement nationality = driver.findElement(By.xpath("//body/app-root[1]/main[1]/div[1]/app-doc-personal-info[1]/div[1]/div[2]/div[2]/section[1]/mat-stepper[1]/div[2]/div[2]/app-doc-personal-info-edit[1]/form[1]/div[5]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]"));
        nationality.click();
        WebElement nationality1 = driver.findElement(By.xpath("//span[normalize-space()='Sri Lankan']"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", nationality1);
        Thread.sleep(3000);
        nationality1.click();
    }

    public void enter_national_identification_number(String idNumber) throws Throwable {
        WebElement nationality = driver.findElement(By.xpath("//input[@id='mat-input-11']"));
        nationality.sendKeys(idNumber);
    }

    public void click_on_personal_info_update_button() throws Throwable {
        WebElement personalInfoUpdateBtn = driver.findElement(By.xpath("//body/app-root[1]/main[1]/div[1]/app-doc-personal-info[1]/div[1]/div[2]/div[2]/section[1]/mat-stepper[1]/div[2]/div[2]/app-doc-personal-info-edit[1]/form[1]/div[6]/button[2]"));
        personalInfoUpdateBtn.click();
    }

    public void display_success_message_for_Personal_Info_Update(String successMsg) throws Throwable {
        WebDriverWait wait= new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//div[@class='d-flex align-items-start pe-4']")));
        WebElement input = driver.findElement(By.xpath("//div[@class='d-flex align-items-start pe-4']"));
        Assert.assertEquals(successMsg, input.getText());
    }

    public void edit_first_name(String editFirstName) throws Throwable {
        Thread.sleep(3000);
        WebElement firstNameElement = driver.findElement(By.xpath("//input[@id='mat-input-6']"));
        firstNameElement.clear();
        firstNameElement.sendKeys(editFirstName);
    }

    public void edit_last_name(String editLastName) throws Throwable {
        WebElement lastNameElement = driver.findElement(By.xpath("//input[@id='mat-input-7']"));
        lastNameElement.clear();
        lastNameElement.sendKeys(editLastName);
    }

    public void edit_email(String editEmail) throws Throwable {
        WebElement email = driver.findElement(By.xpath("//input[@id='mat-input-8']"));
        email.clear();
        email.sendKeys(editEmail);
    }

    public void edit_date_of_birth() throws Throwable {
        WebElement birthday = driver.findElement(By.xpath("//input[@id='mat-input-10']"));
        birthday.click();
        WebElement toSelectedBday = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M19 3h-1V1')]"));
        toSelectedBday.click();
        WebElement selectDate = driver.findElement(By.xpath("//div[normalize-space()='5']"));
        selectDate.click();
    }

    public void edit_gender() throws Throwable {
        WebElement genederElement = driver.findElement(By.xpath("//div[@id='mat-select-value-1']"));
        genederElement.click();
        WebElement newGender = driver.findElement(By.xpath("//span[normalize-space()='Male']"));
        newGender.click();
    }

    public void edit_nationality() throws Throwable {
        WebElement nationalityElement = driver.findElement(By.xpath("//div[@id='mat-select-value-3']"));
        nationalityElement.click();
        WebElement newNationality = driver.findElement(By.xpath("//span[normalize-space()='American']"));
        newNationality.click();
    }

    public void edit_national_identification_number(String editIdNo) throws Throwable {
        WebElement nationality = driver.findElement(By.xpath("//input[@id='mat-input-11']"));
        nationality.clear();
        nationality.sendKeys(editIdNo);
    }



    public void display_First_Name(String displayFirstName) throws Throwable {
        Thread.sleep(1000);
        WebElement firstNameElement = driver.findElement(By.xpath("//input[contains(@formcontrolname,'firstname')]"));
        Assert.assertEquals(displayFirstName, firstNameElement.getAttribute("value"));
    }

    public void display_Last_Name(String displayLastName) throws Throwable {
        WebElement lastNameElement = driver.findElement(By.xpath("//input[contains(@formcontrolname,'lastname')]"));
        Assert.assertEquals(displayLastName, lastNameElement.getAttribute("value"));
    }

    public void display_Email(String displayEmail) throws Throwable {
        WebElement emailElement = driver.findElement(By.xpath("//input[contains(@formcontrolname,'email')]"));
        Assert.assertEquals(displayEmail, emailElement.getAttribute("value"));
    }

    public void display_DOB(String displayDob) throws Throwable {
        WebElement dobElement = driver.findElement(By.xpath("//input[contains(@formcontrolname,'dob')]"));
        Assert.assertEquals(displayDob, dobElement.getAttribute("value"));
    }

    public void display_Gender(String displayGender) throws Throwable {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement genderElement = driver.findElement(By.xpath("//span[contains(text(),'Male')]"));
        Assert.assertEquals(displayGender, genderElement.getText());
    }

    public void display_MSISDN(String displayMSISDN) throws Throwable {
        WebElement msisdnElement = driver.findElement(By.xpath("//input[contains(@formcontrolname,'mobileNumber')]"));
        Assert.assertEquals(displayMSISDN, msisdnElement.getAttribute("value"));
    }

    public void display_Nationality(String displayNationality) throws Throwable {
        driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
        WebElement nationalityElement = driver.findElement(By.xpath("//span[contains(text(),'American')]"));
        Assert.assertEquals(displayNationality, nationalityElement.getText());
    }
    public void display_National_Identification_Number(String displayIdNo) throws Throwable {
        WebElement nationalIdentificationNumberElement = driver.findElement(By.xpath("//input[contains(@formcontrolname,'nationalIdNumber')]"));
        Assert.assertEquals(displayIdNo, nationalIdentificationNumberElement.getAttribute("value"));
    }

    public void click_on_camera_icon_and_upload_an_image() throws Throwable {
        WebElement cameraIcon = driver.findElement(By.xpath("//img[@alt='upload-icon']"));
        cameraIcon.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Runtime.getRuntime().exec("resources/FileUploadScript.exe");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement scrollbar = driver.findElement(By.xpath("//html")); //body/ngb-modal-window[1]
        scrollbar.sendKeys(Keys.PAGE_DOWN);
        WebElement applyBtn = driver.findElement(By.xpath("//button[contains(text(),'Apply')]"));
        applyBtn.click();
    }

    public void edit_profile_image() throws Throwable {
        WebElement cameraBtn = driver.findElement(By.xpath("//img[@alt='upload-icon']"));
        cameraBtn.click();
    }

    public void display_success_message_for_profile_image_upload(String successMsg) throws Throwable {
        WebDriverWait wait= new WebDriverWait(driver, 6);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//div[@class='d-flex align-items-start pe-4']")));
        WebElement input = driver.findElement(By.xpath("//div[@class='d-flex align-items-start pe-4']"));
        Assert.assertEquals(successMsg, input.getText());
        WebDriverWait wait1 = new WebDriverWait(driver, 2);
    }

    public void click_on_camera_icon_and_edit_profile_image() throws Throwable {
        WebElement cameraIcon = driver.findElement(By.xpath("//img[@alt='upload-icon']"));
        cameraIcon.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Runtime.getRuntime().exec("resources/FileUploadScript1.exe");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement scrollbar = driver.findElement(By.xpath("//body/ngb-modal-window[1]"));
        scrollbar.sendKeys(Keys.PAGE_DOWN);
        WebElement applyBtn = driver.findElement(By.xpath("//button[contains(text(),'Apply')]"));
        applyBtn.click();
    }

    public void display_profile_image() throws Throwable {
        WebElement cameraImg = driver.findElement(By.xpath("//img[@alt='profile-img']"));
        String src = cameraImg.getAttribute("src");
        Assert.assertEquals(true,src.contains("http://10.0.0.94/HealthWorkerRegistry/ProfileImages/"));
        Assert.assertEquals(true,src.contains(".jpeg"));
    }



    public void click_on_camera_icon_and_select_one_profile_image() throws Throwable {
        WebElement cameraIcon = driver.findElement(By.xpath("//img[@alt='upload-icon']"));
        cameraIcon.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Runtime.getRuntime().exec("resources/SingleImageSelectionScript.exe");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void select_another_profile_image() throws Throwable {
    }


    public void click_on_camera_icon_and_crop_profile_image() throws Throwable {
        WebElement cameraIcon = driver.findElement(By.xpath("//img[@alt='upload-icon']"));
        cameraIcon.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Runtime.getRuntime().exec("resources/FileUploadScript1.exe");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement scrollbar = driver.findElement(By.xpath("//html"));//body/ngb-modal-window[1]
        scrollbar.sendKeys(Keys.PAGE_DOWN);
        WebElement cropBtn = driver.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/div[2]/*[1]"));
        cropBtn.click();

        WebElement cropperSelection1 = driver.findElement(By.xpath("//span[@class='cropper-point point-nw']"));
        Actions crop = new Actions(driver);
        crop.clickAndHold(cropperSelection1).moveByOffset(30, 50).release().build().perform();
        WebElement cropperSelection2 = driver.findElement(By.xpath("//span[@class='cropper-point point-ne']"));
        crop.clickAndHold(cropperSelection2).moveByOffset(30, 50).release().build().perform();
        WebElement cropperSelection3 = driver.findElement(By.xpath("//span[@class='cropper-point point-sw']"));
        crop.clickAndHold(cropperSelection3).moveByOffset(30, 50).release().build().perform();
        WebElement cropperSelection4 = driver.findElement(By.xpath("//span[@class='cropper-point point-se']"));
        crop.clickAndHold(cropperSelection4).moveByOffset(30, 50).release().build().perform();

        WebElement applyBtn = driver.findElement(By.xpath("//button[contains(text(),'Apply')]"));
        applyBtn.click();
    }

    public void click_on_image_delete_icon() throws Throwable {
        Thread.sleep(2000);
        WebElement imageDeleteIcon = driver.findElement(By.xpath("//img[@alt='delete-icon']"));
        imageDeleteIcon.click();
        Thread.sleep(2000);
    }

    public void display_the_delete_success_message(String deleteMsg) throws Throwable {
        WebElement deleteMsgElement = driver.findElement(By.xpath("//div[@role='alert']"));
        Assert.assertEquals(deleteMsg, deleteMsgElement.getText());
    }

}
