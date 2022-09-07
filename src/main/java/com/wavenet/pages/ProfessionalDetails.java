package com.wavenet.pages;

import com.wavenet.util.Config;
import com.wavenet.util.InitializeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ProfessionalDetails {
    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Config config = new Config();
    String url = config.getUrl();

    public ProfessionalDetails() {
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }

    public void click_on_Professional_Details_button() throws Throwable {
        WebElement professionalDetailsBtn = driver.findElement(By.xpath("//a[normalize-space()='Professional Details']"));
        professionalDetailsBtn.click();
    }

    public void click_on_update_button() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement professionalDetailsBtn = driver.findElement(By.xpath("//button[@type='submit']")); //button[contains(text(),'Update')]
        professionalDetailsBtn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void click_on_update_button_with_empty_input_fields() throws Throwable {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        WebElement scroll = driver.findElement(By.xpath("//html"));
        scroll.sendKeys(Keys.PAGE_DOWN);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement updateBtn = driver.findElement(By.xpath("//body/app-root[1]/main[1]/div[1]/app-doc-professional-details[1]/div[1]/div[2]/div[2]/section[1]/mat-stepper[1]/div[2]/div[2]/app-doc-professional-details-edit[1]/form[1]/div[7]/button[2]")); //span[contains(text(),'Update')][preceding::span[contains(text(),'Cancel')]]
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        updateBtn.click();

//        JavascriptExecutor js1 = (JavascriptExecutor) driver;
//        js1.executeScript("arguments[0].scrollIntoView();", updateBtn);
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

//        WebElement scroll = driver.findElement(By.xpath("//html"));
//        scroll.sendKeys(Keys.PAGE_DOWN);
    }

    public void display_validation_for_list_of_practice(String validationMsg) throws Throwable {
        WebElement listOfPractisesField = driver.findElement(By.xpath("//body/app-root[1]/main[1]/div[1]/app-doc-professional-details[1]/div[1]/div[2]/div[2]/section[1]/mat-stepper[1]/div[2]/div[2]/app-doc-professional-details-edit[1]/form[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/div[1]/div[1]"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", listOfPractisesField);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Assert.assertEquals(validationMsg, listOfPractisesField.getText());
    }

    public void display_validation_for_languages_accepted(String validationMsg) throws Throwable {
        WebElement languagesAccepted = driver.findElement(By.xpath("//body/app-root[1]/main[1]/div[1]/app-doc-professional-details[1]/div[1]/div[2]/div[2]/section[1]/mat-stepper[1]/div[2]/div[2]/app-doc-professional-details-edit[1]/form[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/div[1]/div[1]"));
        Assert.assertEquals(validationMsg, languagesAccepted.getText());
    }

    public void display_validation_for_bank_name_field_outline_colour() throws Throwable {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement bankName = driver.findElement(By.xpath("//body/app-root[1]/main[1]/div[1]/app-doc-professional-details[1]/div[1]/div[2]/div[2]/section[1]/mat-stepper[1]/div[2]/div[2]/app-doc-professional-details-edit[1]/form[1]/div[4]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[2]"));

        String textColour = bankName.getCssValue("color");
        System.out.println(textColour);
//        String[] arrColor = textColour.split("#");
//        Assert.assertTrue(arrColor.equals("f44336"));
//        Assert.assertTrue(textColour.equals("#f44336"));
        Assert.assertTrue(textColour.equals("rgba(244, 67, 54, 1)"));  // #f44336
    }

    public void display_validation_for_account_number(String validationMsg) throws Throwable {
        WebElement accountNumber = driver.findElement(By.xpath("//body/app-root[1]/main[1]/div[1]/app-doc-professional-details[1]/div[1]/div[2]/div[2]/section[1]/mat-stepper[1]/div[2]/div[2]/app-doc-professional-details-edit[1]/form[1]/div[4]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/div[1]/div[1]"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", accountNumber);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Assert.assertEquals(validationMsg, accountNumber.getText());
    }



    public void enter_first_list_of_practises() throws Throwable {
        Thread.sleep(8000);
        WebElement input = driver.findElement(By.xpath("//input[@id='mat-chip-list-input-0']"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        input.click();
        WebElement practiceField1 = driver.findElement(By.xpath("//input[@placeholder='Search bank...']"));
        practiceField1.sendKeys("Cardiologist", Keys.ENTER);
        WebElement practice1 = driver.findElement(By.xpath("//span[contains(text(),'Cardiologist')]"));
//        JavascriptExecutor je = (JavascriptExecutor) driver;
//        je.executeScript("arguments[0].scrollIntoView();", practice1);
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        practice1.click();
//        input.sendKeys("Cardiologist");
    }

    public void enter_second_list_of_practises() throws Throwable {
        Thread.sleep(3000);
        WebElement listOfPractisesField = driver.findElement(By.xpath("//input[@id='mat-chip-list-input-0']"));
        listOfPractisesField.sendKeys("Endocrinologists");
        listOfPractisesField.sendKeys(Keys.ARROW_DOWN);
        listOfPractisesField.sendKeys(Keys.ENTER);
    }

    public void enter_third_list_of_practises() throws Throwable {
        WebElement listOfPractisesField = driver.findElement(By.xpath("//input[@id='mat-chip-list-input-0']"));
        listOfPractisesField.sendKeys("Anesthesiologists");
        WebElement listOfPractisesField3 = driver.findElement(By.xpath("//span[normalize-space()='Anesthesiologists']"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", listOfPractisesField3);
        Thread.sleep(250);
        listOfPractisesField3.click();
    }

    public void enter_fourth_list_of_practises() throws Throwable {
        WebElement listOfPractisesField = driver.findElement(By.xpath("//input[@id='mat-chip-list-input-0']"));
        listOfPractisesField.sendKeys("Obstetricians and gynecologistss");
        WebElement listOfPractisesField4 = driver.findElement(By.xpath("//span[normalize-space()='Obstetricians and gynecologistss']"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", listOfPractisesField4);
        Thread.sleep(250);
        listOfPractisesField4.click();
    }

    public void enter_fifth_list_of_practises() throws Throwable {
        WebElement listOfPractisesField = driver.findElement(By.xpath("//input[@id='mat-chip-list-input-0']"));
        listOfPractisesField.sendKeys("Dermatologist");
        WebElement listOfPractisesField5 = driver.findElement(By.xpath("//span[normalize-space()='Dermatologist']"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", listOfPractisesField5);
        Thread.sleep(250);
        listOfPractisesField5.click();
    }

    public void enter_sixth_list_of_practises() throws Throwable {
        WebElement listOfPractisesField = driver.findElement(By.xpath("//input[@id='mat-chip-list-input-0']"));
        listOfPractisesField.sendKeys("doctor name");
        WebElement listOfPractisesField5 = driver.findElement(By.xpath("//span[normalize-space()='doctor name']"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", listOfPractisesField5);
        Thread.sleep(250);
        listOfPractisesField5.click();
    }

    public void display_validation_text_for_list_of_practices(String validationMsg) throws Throwable {
        WebElement validationText = driver.findElement(By.xpath("//span[normalize-space()='Maximum of 5 Practices can be select']"));
        Assert.assertEquals(validationMsg, validationText.getText());
    }


//1324

    public void enter_languages_accepted() throws Throwable {
        WebElement languagesAcceptedField1 = driver.findElement(By.xpath("//input[@id='mat-chip-list-input-1']"));
        languagesAcceptedField1.click();
        WebElement dropdownLanguage = driver.findElement(By.xpath("//span[normalize-space()='English']"));
        dropdownLanguage.click();
    }

    public void select_qualifications() throws Throwable {
        WebElement qulificationField = driver.findElement(By.id("mat-select-0"));
        qulificationField.click();
        Thread.sleep(10000);
        WebElement dropDownElement = driver.findElement(By.id("mat-option-15"));
        dropDownElement.click();
    }

    public void enter_practice_ID() throws Throwable {
        WebElement practiceIdField = driver.findElement(By.xpath("//input[@id='mat-input-6']"));
        practiceIdField.sendKeys("123abc");
    }

    public void select_bank_name() throws Throwable {
        WebElement bankNameField = driver.findElement(By.id("mat-select-value-3"));
        bankNameField.click();
        WebElement bankNameField1 = driver.findElement(By.xpath("//input[@placeholder='Search bank...']"));
        bankNameField1.sendKeys("Hatton", Keys.ENTER);
        WebElement dropdown = driver.findElement(By.xpath("//span[contains(text(),'Hatton National Bank')]"));
//        JavascriptExecutor je = (JavascriptExecutor) driver;
//        je.executeScript("arguments[0].scrollIntoView();", dropdown);
//        Thread.sleep(250);
        dropdown.click();
    }


    public void enter_account_number() throws Throwable {
        WebElement accountNumber = driver.findElement(By.xpath("//input[@id='mat-input-7']"));
        accountNumber.sendKeys("53234560");
    }

    public void enter_Branch_ID() throws Throwable {
        WebElement branchId = driver.findElement(By.xpath("//input[@id='mat-input-8']"));
        branchId.sendKeys("123");
    }

    public void enter_beneficiary_name() throws Throwable {
        WebElement beneficiaryName = driver.findElement(By.xpath("//input[@id='mat-input-9']"));
        beneficiaryName.sendKeys("Sapuni");
    }

    public void enter_bank_address() throws Throwable {
        WebElement bankAddress = driver.findElement(By.xpath("//input[@id='mat-input-10']"));
        bankAddress.sendKeys("No 2, Galle rd, Colombo");
    }

    public void enter_IBAN_or_SWIFT() throws Throwable {
        WebElement ibanSwift = driver.findElement(By.xpath("//input[@id='mat-input-11']"));
        ibanSwift.sendKeys("12345");
    }

    public void click_on_update_button_to_update() throws Throwable {
        WebElement scroll = driver.findElement(By.xpath("//html"));
        scroll.sendKeys(Keys.PAGE_DOWN);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement updateBtn = driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-button mat-flat-button mat-button-base mat-primary cdk-focused cdk-mouse-focused']//span[@class='mat-button-wrapper'][normalize-space()='Update']")); //button[@class='mat-focus-indicator mat-button mat-flat-button mat-button-base mat-primary cdk-focused cdk-mouse-focused']//span[@class='mat-button-wrapper'][normalize-space()='Update']
        updateBtn.click(); //button[@class='mat-focus-indicator mat-button mat-flat-button mat-button-base mat-primary cdk-focused cdk-mouse-focused']//span[@class='mat-button-wrapper'][normalize-space()='Update']
    }

    public void display_success_message(String successMsg) throws Throwable {
        WebDriverWait wait= new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//div[@class='d-flex align-items-start pe-4']")));
        WebElement input = driver.findElement(By.xpath("//div[@class='d-flex align-items-start pe-4']"));
        Assert.assertEquals(successMsg, input.getText());
    }

    public void wait_some_time() throws Throwable {
        Thread.sleep(10000);
    }
}



