package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Hospitals {
    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;


    public Hospitals() {
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }


    public void click_on_Main_manu_Medical_Center() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement ClickOnMainManuMedicalCenter = driver.findElement(By.xpath("//span[normalize-space()='Medical Centre']"));
        ClickOnMainManuMedicalCenter.click();
    }
    public void click_on_Hospitals() throws Throwable {
        Thread.sleep(5000);
        WebElement hospitalsElement = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/app-sidenav[1]/mat-nav-list[1]/div[1]/mat-accordion[1]/app-menu-panel[4]/mat-expansion-panel[1]"));
        // WebElement hospitalsBtn = driver.findElement(By.xpath("//span[normalize-space()='Institute']"));
       // WebElement hospitalsBtn = driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-19\"]/span[1]/mat-panel-title/span"));
        hospitalsElement.click();
    }

    public void click_on_All_Medical_Center() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement allHospitalsBtn = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav[1]/div/app-sidenav/mat-nav-list/div/mat-accordion/app-menu-panel[5]/mat-expansion-panel/div/div/app-menu-panel[1]/span/mat-list-item/span/span[3]"));
        allHospitalsBtn.click();
        Thread.sleep(4000);
    }

    public void click_on_Add_New_Medical_Center() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(5000);
        WebElement addHospitalBtn = driver.findElement(By.xpath("//span[normalize-space()='Add New Medical Centre']"));
        addHospitalBtn.click();
    }

    public void click_on_Create_new_organization_group_button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Thread.sleep(3000);
        WebElement createOrganizationBtn = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/all-hospitals-selector/div[1]/mat-sidenav-container/mat-sidenav/div/app-sidebar-right/div[2]/div/div/div[3]/button/span[1]"));
        createOrganizationBtn.click();
    }

    public void enter_name_for_the_organization(String name) throws Throwable {
        WebElement nameElement = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/all-hospitals-selector/div[1]/mat-sidenav-container/mat-sidenav/div/app-sidebar-right/div[2]/form[1]/div/div/div[1]/mat-form-field/div/div[1]/div[3]/input"));
        nameElement.sendKeys(name);
    }

    public void upload_logo_image_for_organization() throws Throwable {
        WebElement uploadBtn = driver.findElement(By.xpath("//label[@for='uploadOrganizationLogo']"));
        uploadBtn.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Runtime.getRuntime().exec("resources/OrganizationLogoUploadScript.exe");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement scrollbar = driver.findElement(By.xpath("//body/ngb-modal-window[1]"));
        scrollbar.sendKeys(Keys.PAGE_DOWN);
        WebElement applyBtn = driver.findElement(By.xpath("//span[normalize-space()='Save & Proceed']"));
        applyBtn.click();
        Thread.sleep(6000);
    }

    public void click_on_save_and_proceed_button() throws Throwable {
        WebElement saveProceedBtn = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/all-hospitals-selector[1]/div[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/form[1]/div[1]/div[1]/div[4]/button[1]"));
        saveProceedBtn.click();
        Thread.sleep(3000);
    }

    public void select_language_for_hospital() throws Throwable {
        Thread.sleep(6000);
        WebElement language = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/all-hospitals-selector[1]/div[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]"));
        language.click();
        Thread.sleep(5000);
        WebElement eng = driver.findElement(By.xpath("//mat-option[@id='mat-option-44']"));
        eng.click();
        Thread.sleep(3000);
    }

    public void enter_hospital_name(String name) throws Throwable {
        Thread.sleep(3000);
        WebElement hospital = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/all-hospitals-selector[1]/div[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
        hospital.sendKeys(name);
    }

    public void click_on_Add_language_button_for_hospital() throws Throwable {
        WebElement addLanguage = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/all-hospitals-selector[1]/div[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/div[1]/div[2]/button[1]"));
        addLanguage.click();
    }

    public void select_another_language_for_hospital() throws Throwable {
        WebElement dropdown = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/all-hospitals-selector[1]/div[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]"));
        dropdown.click();

        WebElement language = driver.findElement(By.xpath("//span[contains(text(),'Sinhala')]"));
        language.click();
    }

    public void enter_another_hospital_name(String name) throws Throwable {
        WebElement hospitalName = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/all-hospitals-selector[1]/div[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
        hospitalName.sendKeys(name);
    }

    public void enter_hospital_code(String code) throws Throwable {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        Thread.sleep(6000);
        WebElement hospitalCode = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/all-hospitals-selector[1]/div[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]/textarea[1]"));
        hospitalCode.sendKeys(code);
    }

    public void upload_logo_image_for_hospital() throws Throwable {
        WebElement uploadBtn = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/all-hospitals-selector[1]/div[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/div[1]/div[4]"));
        uploadBtn.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Runtime.getRuntime().exec("resources/HospitalLogoUploadScript.exe");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement scrollbar = driver.findElement(By.xpath("//body/ngb-modal-window[1]"));
        scrollbar.sendKeys(Keys.PAGE_DOWN);
        WebElement applyBtn = driver.findElement(By.xpath("//button[contains(text(),'Apply')]"));
        applyBtn.click();
        Thread.sleep(6000);
    }

    public void click_on_save_button_for_hospital() throws Throwable {
        WebElement saveBtn = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/all-hospitals-selector[1]/div[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/div[1]/div[6]/button[1]"));
        saveBtn.click();
    }

    public void display_the_success_message_for_adding_hospital(String successMsg) throws Throwable {
        WebDriverWait wait= new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//span[@class='mat-simple-snack-bar-content']")));
        WebElement input = driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
        Assert.assertEquals(successMsg, input.getText());
    }


    public void select_a_organization_from_dropdown() throws Throwable {
        WebElement dropdown = driver.findElement(By.xpath("//html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/app-organization-groups/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input"));
        dropdown.click();
        WebElement organization = driver.findElement(By.xpath("//span[contains(text(),'ABCD')]"));
        organization.click();
    }

    public void click_on_Next_button() throws Throwable {
        WebElement button = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/all-hospitals-selector[1]/div[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/div[1]/div[2]/button[1]"));
        button.click();
    }

    public void display_the_success_message_for_adding_hospital_with_exiting_organization_group(String successMsg) throws Throwable {
        WebDriverWait wait= new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//span[@class='mat-simple-snack-bar-content']")));
        WebElement input = driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
        Assert.assertEquals(successMsg, input.getText());
    }

    public void click_on_Update_button_for_the_hospital() throws Throwable {
        Thread.sleep(3000);
        WebElement updateBtn = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/button[2]"));
        updateBtn.click();
    }

    public void click_on_configurations_for_the_hospital() throws Throwable {
        Thread.sleep(3000);
        WebElement configBtn = driver.findElement(By.xpath("//div[contains(text(),'Configurations')]"));
        configBtn.click();
    }

    public void click_on_print_configurations_for_the_hospital() throws Throwable {
        Thread.sleep(3000);
        WebElement printConfigBtn = driver.findElement(By.xpath("//span[contains(text(),'Print Configurations')]"));
        printConfigBtn.click();
    }

    public void click_on_Add_template_button() throws Throwable {
        WebElement addTemplateBtn = driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/button[1]"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", addTemplateBtn);
        Thread.sleep(3000);
        addTemplateBtn.click();
    }

    public void enter_template_name_for_the_template(String name) throws Throwable {
        WebElement templateName = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-hospital-detail[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/app-add-print-template[1]/form[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
        templateName.sendKeys(name);
    }

    public void select_print_job_for_the_template() throws Throwable {
        WebElement element = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-hospital-detail[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/app-add-print-template[1]/form[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]"));
        element.click();
        WebElement templateJob = driver.findElement(By.xpath("//span[contains(text(),'Print job 1')]"));
        templateJob.click();
    }

    public void enter_content_for_the_template(String content) throws Throwable {
        WebElement templateContent = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-hospital-detail[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/app-add-print-template[1]/form[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/textarea[1]"));
        templateContent.sendKeys(content);
    }

    public void upload_logo_image_for_the_template() throws Throwable {
        Thread.sleep(3000);
        WebElement uploadBtn = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-hospital-detail[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/app-add-print-template[1]/form[1]/div[1]/div[3]/div[1]/div[1]/label[1]"));
        uploadBtn.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Runtime.getRuntime().exec("resources/DoctorImageUploadScript.exe");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement scrollbar = driver.findElement(By.xpath("//body/ngb-modal-window[1]"));
        scrollbar.sendKeys(Keys.PAGE_DOWN);
        WebElement applyBtn = driver.findElement(By.xpath("//button[contains(text(),'Apply')]"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", applyBtn);
        Thread.sleep(3000);
        applyBtn.click();
        Thread.sleep(6000);
    }

    public void enter_caption_for_the_template(String caption) throws Throwable {
        WebElement templateCaption = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-hospital-detail[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/app-add-print-template[1]/form[1]/div[1]/div[3]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
        templateCaption.sendKeys(caption);
    }

    public void click_on_add_another_image_button() throws Throwable {
        WebElement addAnotherImageBtn = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-hospital-detail[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/app-add-print-template[1]/form[1]/div[1]/button[1]"));
        addAnotherImageBtn.click();
    }

    public void upload_logo_image_again_for_the_template() throws Throwable {
        Thread.sleep(3000);
        WebElement uploadBtn = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-hospital-detail[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/app-add-print-template[1]/form[1]/div[1]/div[3]/div[1]/div[1]/label[1]"));
        uploadBtn.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Runtime.getRuntime().exec("resources/HospitalLogoUploadScript.exe");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement scrollbar = driver.findElement(By.xpath("//body/ngb-modal-window[1]"));
        scrollbar.sendKeys(Keys.PAGE_DOWN);
        WebElement applyBtn = driver.findElement(By.xpath("//button[contains(text(),'Apply')]"));
        applyBtn.click();
        Thread.sleep(6000);
    }

    public void enter_caption2_for_the_template(String caption2) throws Throwable {
        WebElement templateCaption = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-hospital-detail[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/app-add-print-template[1]/form[1]/div[1]/div[3]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
        templateCaption.sendKeys(caption2);
    }

    public void mark_as_active_for_the_template() throws Throwable {
        WebElement btn = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-hospital-detail[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/app-add-print-template[1]/form[1]/div[1]/div[4]/div[1]/mat-slide-toggle[1]/label[1]/span[1]/input[1]"));
        btn.click();
    }

    public void click_on_save_button() throws Throwable {
        WebElement saveBtn = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-hospital-detail[1]/mat-sidenav[1]/div[1]/app-sidebar-right[1]/div[2]/div[1]/app-add-print-template[1]/form[1]/div[1]/div[4]/button[1]"));
        saveBtn.click();
    }

    public void display_the_added_template_on_the_page() throws Throwable {
        WebElement template = driver.findElement(By.xpath(""));
        Assert.assertEquals(true,template.isDisplayed());
    }

    public void display_table_of_templates_available() throws Throwable {
        WebElement table = driver.findElement(By.xpath(""));
        Assert.assertEquals(true,table.isDisplayed());
    }

    public void change_the_number_of_pages_to_twenty() throws Throwable {
        WebElement noOfPages = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/all-doctors-selector[1]/div[2]/div[2]/mat-paginator[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", noOfPages);
        Thread.sleep(2000);
        noOfPages.click();
        WebElement noOfPages20 = driver.findElement(By.xpath("//span[contains(text(),'20')]"));
        noOfPages20.click();
    }

    public void display_the_twenty_or_less_than_twenty_entries_for_the_templates() throws Throwable {
        Thread.sleep(3000);
        WebElement table = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/all-doctors-selector[1]/table[1]/tbody"));
//        Assert.assertEquals(true,table.isDisplayed());

//        rows = driver.findElement(By.xpath("//body/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/all-doctors-selector[1]/table[1]/tbody/tr"));
//        int count = rows.size();
//        if (count <= 20){
//            Assert.assertEquals(true,table.isDisplayed());
//        }
//        len(table);
    }

    public void click_on_next_button() throws Throwable {
        WebElement nextBtn = driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/mat-paginator[1]/div[1]/div[1]/div[2]/button[3]"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", nextBtn);
        Thread.sleep(2000);
        nextBtn.click();
    }

    public void click_on_previous_button() throws Throwable {
        WebElement previousBtn = driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/mat-paginator[1]/div[1]/div[1]/div[2]/button[2]"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", previousBtn);
        Thread.sleep(2000);
        previousBtn.click();
    }

    public void click_on_multi_next_button() throws Throwable {
        WebElement multiNextBtn = driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/mat-paginator[1]/div[1]/div[1]/div[2]/button[4]"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", multiNextBtn);
        Thread.sleep(2000);
        multiNextBtn.click();
    }

    public void click_on_multi_previous_button() throws Throwable {
        WebElement multiPreviousBtn = driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/mat-paginator[1]/div[1]/div[1]/div[2]/button[1]"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView();", multiPreviousBtn);
        Thread.sleep(2000);
        multiPreviousBtn.click();
    }
    public void verify_Delete_conformation_message() throws Throwable {
        WebElement VerifyDeleteConformationMessage = driver.findElement(By.xpath("//h3[text()='Are you sure you want to Delete?']"));
        Alert DeleteConformation = driver.switchTo().alert();
        System.out.println(DeleteConformation.getText());
        Thread.sleep(2000);
        DeleteConformation.accept();
        Thread.sleep(2000);

        WebElement ClickOnDeleteVerificationPopUPButton = driver.findElement(By.xpath("//span[text()='Delete']"));
        ClickOnDeleteVerificationPopUPButton.click();
    }

    public void click_on_Institutes_delete_Button_in_All_Institutes_Page() throws Throwable {
        WebElement ClickOnInstitutesDeleteButton = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/div/all-hospitals-selector/div[3]/div[3]/table/tbody/tr[1]/td[2]/button[3]/span[1]/mat-icon"));
        ClickOnInstitutesDeleteButton.click();
    }

}
