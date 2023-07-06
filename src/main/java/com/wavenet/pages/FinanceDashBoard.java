package com.wavenet.pages;

import com.wavenet.util.Config;
import com.wavenet.util.InitializeDriver;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

public class FinanceDashBoard {

    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Config config = new Config();
    String url = config.getUrl();

    private By FinanceMainMenu = By.xpath("//span[normalize-space()='Finance']"); //Finance Main menu xpath locator Xpath
    private By FinanceDashBoard = By.xpath("//span[normalize-space()='Finance Dashboard']"); //Click on Finance Main menu and get Dropdown in Finance Dashboard Xpath

    private By SelectMedicalCenter = By.xpath("//div[@id='mat-select-value-1']"); //Click on medical Center
    private By MedicalCenterListBox = By.xpath("//div[@class='mat-form-field-infix ng-tns-c68-53']"); //Select medical center in Finance Dashboard Xpath
    private By LebFinanceDashboard = By.xpath("//span[normalize-space()='Finance Dashboard']"); //Finance Dashboard top of label name Xpath

    //Finance Dashboard Today financial details Xpath
    private By TodayLabel = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[1]/div/div[1]/div/span[text()=\"Today\"]"); //Today label Xpath
    private By TodayPatientsSeen = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[1]/div/div[2]/div/div[1]/div/p"); //Financial Dashboard in today patient seen label name Xpath
    private By TotalBilled = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[1]/div/div[2]/div/div[2]/div/p[text()=\"Total Billed\"]"); //Financial Dashboard in today total billed label name Xpath
    private By GroupAverage = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[1]/div/div[2]/div/div[3]/div/p[text()=\"Group Average\"]"); //Financial Dashboard in today group average label name Xpath
    private By MedicalCenterFee = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[1]/div/div[2]/div/div[4]/div/p"); //Financial Dashboard in today medical center fee label name Xpath
    private By NewPatient = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[1]/div/div[2]/div/div[5]/div/p[text()=\"New Patient\"]"); //Financial Dashboard in today New patient label name Xpath
    private By DidNotAttend = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[1]/div/div[2]/div/div[6]/div/p[text()=\"Did not Attend\"]"); //Finance Dashboard in today Did not attend label name Xpath
    private By AppointmentsPublished = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[1]/div/div[2]/div/div[7]/div/p[text()=\"Appointments Published\"]"); //Finance Dashboard in today Appointments Published label name Xpath
    private By AppointmentsBooked = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[1]/div/div[2]/div/div[8]/div/p[text()=\"Appointments Booked\"]"); //Finance Dashboard in toady Appointments Booked label name Xpath

    //Finance Dashboard Yesterday financial details Xpath
    private By YesterdayLabel = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[2]/div/div[1]/div/span[text()=\"Yesterday\"]"); //Yesterday label Xpath
    private By YesterdayPatientSeen = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[2]/div/div[2]/div/div[1]/div/p[text()=\"Patients Seen\"]"); //Financial Dashboard in yesterday patient seen label name Xpath
    private By YesterdayTotalBilled = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[2]/div/div[2]/div/div[2]/div/p[text()=\"Total Billed\"]"); //Financial Dashboard in yesterday total billed label name Xpath
    private By YesterdayGroupAverage = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[2]/div/div[2]/div/div[3]/div/p[text()=\"Group Average\"]"); //Financial Dashboard in yesterday group average label name Xpath
    private By YesterdayMedicalCenterFee = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[2]/div/div[2]/div/div[4]/div/p[text()=\"Medical Centre Fee\"]"); //Financial Dashboard in yesterday medical center fee label name Xpath
    private By YesterdayNewPatient = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[2]/div/div[2]/div/div[5]/div/p[text()=\"New Patient\"]"); //Financial Dashboard in yesterday New patient label name Xpath
    private By YesterdayDidNotAttend = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[2]/div/div[2]/div/div[7]/div/p[text()=\"Appointments Published\"]"); //Finance Dashboard in yesterday Did not attend label name Xpath
    private By YesterdayAppointmentsPublished = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[2]/div/div[2]/div/div[7]/div/p[text()=\"Appointments Published\"]"); //Finance Dashboard in yesterday Appointments Published label name Xpath
    private By YesterdayAppointmentsBooked = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[2]/div/div[2]/div/div[8]/div/p[text()=\"Appointments Booked\"]"); //Finance Dashboard in yesterday Appointments Booked label name Xpath

    //Finance Dashboard Last Week financial details Xpath
    private By LastWeekLabel = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[3]/div/div[1]/div/span"); //Last week Xpath
    private By LastWeekPatientSeen = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[3]/div/div[2]/div/div[1]/div/p[text()=\"Patients Seen\"]"); //Financial Dashboard in Last Week patient seen label name Xpath
    private By LastWeekTotalBilled = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[3]/div/div[2]/div/div[2]/div/p[text()=\"Total Billed\"]"); //Financial Dashboard in Last Week total billed label name Xpath
    private By LastWeekGroupAverage = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[3]/div/div[2]/div/div[3]/div/p"); //Financial Dashboard in Last Week group average label name Xpath
    private By LastWeekMedicalCenterFee = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[3]/div/div[2]/div/div[3]/div/p"); //Financial Dashboard in Last Week medical center fee label name Xpath
    private By LastWeekNewPatient = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[3]/div/div[2]/div/div[5]/div/p"); //Financial Dashboard in Last Week New patient label name Xpath
    private By LastWeekDidNotAttend = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[3]/div/div[2]/div/div[6]/div/p"); //Finance Dashboard in Last Week Did not attend label name Xpath
    private By LastWeekAppointmentsPublished = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[3]/div/div[2]/div/div[7]/div/p"); //Finance Dashboard in Last Week Appointments Published label name Xpath
    private By LastWeekAppointmentsBooked = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[3]/div/div[2]/div/div[7]/div/p"); //Finance Dashboard in Last Week Appointments Booked label name Xpath

    //Finance Dashboard Last month financial details Xpath
    private By LastMonthLabel = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[4]/div/div[1]/div/span"); //Last Month Xpath
    private By LastMonthPatientSeen = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[4]/div/div[2]/div/div[1]/div/p"); //Financial Dashboard in Last Month patient seen label name Xpath
    private By LastMonthTotalBilled = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[4]/div/div[2]/div/div[2]/div/p"); //Financial Dashboard in Last Month total billed label name Xpath
    private By LastMonthGroupAverage = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[4]/div/div[2]/div/div[3]/div/p"); //Financial Dashboard in Last Month group average label name Xpath
    private By LastMonthMedicalCenterFee = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[4]/div/div[2]/div/div[4]/div/p"); //Financial Dashboard in Last Month medical center fee label name Xpath
    private By LastMonthNewPatient = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[4]/div/div[2]/div/div[5]/div/p"); //Financial Dashboard in Last Month New patient label name Xpath
    private By LastMonthDidNotAttend = By.xpath("//div[@class='col-md-6 col-lg-6 col-xl-6 col-xxl-3']//p[@class='static-grid-card-title mb-2'][normalize-space()='Did not Attend']"); //Finance Dashboard in Last Month Did not attend label name Xpath
    private By LastMonthAppointmentsPublished = By.xpath("//div[@class='col-md-6 col-lg-6 col-xl-6 col-xxl-3']//p[@class='static-grid-card-title mb-2 text-break'][normalize-space()='Appointments Published']"); //Finance Dashboard in Last Month Appointments Published label name Xpath
    private By LastMonthAppointmentsBooked = By.xpath("//div[@class='col-md-6 col-lg-6 col-xl-6 col-xxl-3']//p[@class='static-grid-card-title mb-2 text-break'][normalize-space()='Appointments Booked']"); //Finance Dashboard in Last Month Appointments Booked label name Xpath

    //Highest Billed Details Xpath
    private By HighestBilledDetails = By.xpath("By.xpath(\"//h2[normalize-space()='Highest Billed Details']\")");
    private By HighestBilledDetailsTodayDetailsXpath = By.xpath("//div[@class='text-muted']//span[contains(text(),'Today')]"); //HighestBilledDetails Today Details Xpath
    private By HighestBilledDetailsYesterdayXpath = By.xpath("//div[@class='text-muted']//span[contains(text(),'Yesterday')]"); //HighestBilledDetails Yesterday Details Xpath
    private By HighestBilledDetailsCurrentMonthXpath = By.xpath("//span[normalize-space()='Current month']"); //HighestBilledDetails Current Month Details Xpath
    private By HighestBilledPrevMonthDetailsXpath = By.xpath("//span[normalize-space()='Prev month']");
    private By WeeklyChartButtonXpath = By.xpath("//span[normalize-space()='Weekly']");
    private By MonthlyChartButtonXpath = By.xpath("//span[normalize-space()='Monthy']");
    private By YearlyChartButtonXpath = By.xpath("//span[normalize-space()='Yearly']");
    private By PreviousYearMonthlyXpath = By.xpath("//span[normalize-space()='Previous Year (Monthly)']");
    private By PreviousYearWeeklyXpath = By.xpath("//span[normalize-space()='Previous Year (Weekly)']");

    private By BilledTrendChartTitleXpath = By.xpath("//*[@id=\"raphael-paper-2\"]/g[2]/g[20]/text");
    private By TotalBilledTitleXpath = By.xpath("//*[@id=\"raphael-paper-2\"]/g[2]/g[3]/g[1]/g/text");

    //Financial Year Xpath

    private By FinancialYearTitleXpath = By.xpath("//h2[normalize-space()='Financial Year (July-June)']");
    private By FinancialYearTotalAppointments = By.xpath("//div[@class='card static-card static-flat-card green']//div[@class='card-title']");
    private By FinancialYearTotalBilled = By.xpath("//div[@class='card static-card static-flat-card red']//div[@class='card-title']");
    private By FinancialYearGroupAverage = By.xpath("//div[@class='card static-card static-flat-card blue']//div[@class='card-title']");
    private By FinancialYearTotalMedicalCenterFees = By.xpath("//div[@class='card static-card static-flat-card purple']//div[@class='card-title']");

    //Finance Dashboard Today Xpath Values

    private By TodayPatientSeenValues = By.xpath("/html[1]/body[1]/app-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/app-home[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]");
    private By TodayPatientAverage = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[1]/div/div[2]/div/div[3]/div/span");
    private By TodayTotalBilledValue = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[1]/div/div[2]/div/div[2]/div/span");

    //Finance Dashboard Yesterday Xpath values

    private By YesterdayPatientsSeenValuesXpath = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[2]/div/div[2]/div/div[1]/div/span");

    private By YesterdayPatientAverageValuesXpath = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[2]/div/div[2]/div/div[3]/div/span");

    private By YesterdayTotalBilledValueXpath = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[2]/div/div[2]/div/div[2]/div/span");

    private By TodayMedicalCenterFeeXpath = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[1]/div/div[2]/div/div[4]/div/span");

    //Finance DashBoard Last week Field Xpath

    private By LastWeekPatientsSeenXpath = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[3]/div/div[2]/div/div[1]/div/span");

    private By LastWeekPatinetAverageXpath = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[3]/div/div[2]/div/div[3]/div/span");

    private By LastWeekTotalBilledValuesXpath = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[3]/div/div[2]/div/div[2]/div/span");

    //Finance DashBoard Last month Field Xpath

    private By LastMonthPatientsSeenXpath = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[4]/div/div[2]/div/div[1]/div/span");

    private By LastMonthPatientAverageXpath = By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[4]/div/div[2]/div/div[3]/div/span");

    private By LastMonthTotalBilledValuesXpath =By.xpath("//*[@id=\"contentToConvert\"]/section[1]/div/div[4]/div/div[2]/div/div[2]/div/span");

    //Financial year (July - June)

    private By FinancialYearTotalAppointmentsValuesXpath = By.xpath("//*[@id=\"contentToConvert\"]/div[2]/div[1]/div/div[2]/span");

    private By FinancialYearTotalBilledValuesXpath = By.xpath("//*[@id=\"contentToConvert\"]/div[2]/div[2]/div/div[2]/span");

    private By FinancialYearPatientAverageValuesXpath = By.xpath("//*[@id=\"contentToConvert\"]/div[2]/div[3]/div/div[2]/span");

    //Scroll in your page Down

    private By FinanceYearScrollDown = By.xpath("//h2[@class='mb-0']");

    public FinanceDashBoard(){
        driver = InitializeDriver.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }

    public void click_on_Finance_main_menu() throws Throwable {
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement ClickOnFinanceMainMenu = driver.findElement(FinanceMainMenu);
        ClickOnFinanceMainMenu.click();
    }
    public void click_on_Finance_Dashboard() throws Throwable {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement ClickOnFinanceDashboard = driver.findElement(FinanceDashBoard);
        ClickOnFinanceDashboard.click();
    }
    public void verify_on_Finance_Dashboard() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String lebFinanceDashboard = driver.findElement(LebFinanceDashboard).getText(); // Is for get Finance Dashboard label
        String VerifyLabelName = "Finance Dashboard";
//        if (lebFinanceDashboard == VerifyLabelName){
//            System.out.println("Finance Dashboard is verified");
//        }else{
//            System.out.println("Finance Dashboard verify is fails ");
//        }
    }

    public void select_Medical_Center_in_DropDown() throws Throwable {
       // Select select = new Select(driver.findElement(MedicalCenterListBox)); //Get all the option n the dropdown
       // List<WebElement> options = select.getOptions();
        //-----------------------------------------------------
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(5000);
        WebElement ClickMedicalCenter = driver.findElement(SelectMedicalCenter);
        ClickMedicalCenter.click();
       // WebElement dropMedicalCenter=driver.findElement(MedicalCenterListBox);
       // Select drpMedicalCenter=new Select(dropMedicalCenter);
        //drpMedicalCenter.selectByVisibleText("Main surgery - Ellen Stirling");
    }

    public void verify_the_select_medical_center_finance_dashboard_today_details() throws Throwable {
        Thread.sleep(5000);

        boolean FinanceTodayLabel = driver.findElement(TodayLabel).isDisplayed();
        Assert.assertEquals(true,FinanceTodayLabel);
        //String LabelTodayPatientsSeen = driver.findElement(TodayPatientsSeen).getText();
        boolean LabelTodayPatientsSeen = driver.findElement(TodayPatientsSeen).isDisplayed();
        Assert.assertEquals(true,LabelTodayPatientsSeen);
        //Verify the Test present or mot in UserInterface
        boolean TodayPatientsSeen = driver.getPageSource().contains("Patients Seen");
        if (TodayPatientsSeen){
            System.out.println("Test is present ");
        }else {
            System.out.println("Test is not present");
        }
       // String LabelTotalBilled = driver.findElement(TotalBilled).getText();
        boolean LabelTotalBilled = driver.findElement(TotalBilled).isDisplayed();
        Assert.assertEquals(true,LabelTotalBilled);

        //String LabelGroupAverages = driver.findElement(GroupAverage).getText();
        boolean LabelGroupAverages = driver.findElement(GroupAverage).isDisplayed();
        Assert.assertEquals(true,LabelGroupAverages);

        //String LabelMedicalCenterFee = driver.findElement(MedicalCenterFee).getText();
        boolean LabelMedicalCenterFee = driver.findElement(MedicalCenterFee).isDisplayed();
        Assert.assertEquals(true,LabelMedicalCenterFee);

        //String LabelNewPatient = driver.findElement(NewPatient).getText();
        boolean LabelNewPatient = driver.findElement(NewPatient).isDisplayed();
        Assert.assertEquals(true,LabelNewPatient);

        //String LabelDidNotAttend = driver.findElement(DidNotAttend).getText();
        boolean LabelDidNotAttend = driver.findElement(DidNotAttend).isDisplayed();
        Assert.assertEquals(true,LabelDidNotAttend);

        //String LabelAppointmentsPublished = driver.findElement(AppointmentsPublished).getText();
        boolean LabelAppointmentsPublished = driver.findElement(AppointmentsPublished).isDisplayed();
        Assert.assertEquals(true,LabelAppointmentsPublished);

        //String LabelAppointmentBooked = driver.findElement(AppointmentsBooked).getText();
        boolean LabelAppointmentBooked = driver.findElement(AppointmentsBooked).isDisplayed();
        Assert.assertEquals(true,LabelAppointmentBooked);
    }

    public void verify_the_select_medical_center_finance_dashboard_yesterday_details() throws Throwable {

        Thread.sleep(3000);

        boolean FinanceYesterdayLabel = driver.findElement(YesterdayLabel).isDisplayed();
        Assert.assertEquals(true,FinanceYesterdayLabel);

        boolean YesterdayLabelPatientsSeen = driver.findElement(YesterdayPatientSeen).isDisplayed();
        Assert.assertEquals(true,YesterdayLabelPatientsSeen);

        boolean YesterdayLabelTotalBilled = driver.findElement(YesterdayTotalBilled).isDisplayed();
        Assert.assertEquals(true,YesterdayLabelTotalBilled);

        boolean YesterdayLabelGroupAverages = driver.findElement(YesterdayGroupAverage).isDisplayed();
        Assert.assertEquals(true,YesterdayLabelGroupAverages);

        boolean YesterdayLabelMedicalCenterFee = driver.findElement(YesterdayMedicalCenterFee).isDisplayed();
        Assert.assertEquals(true,YesterdayLabelMedicalCenterFee);

        boolean YesterdayLabelNewPatient = driver.findElement(YesterdayNewPatient).isDisplayed();
        Assert.assertEquals(true,YesterdayLabelNewPatient);

        boolean YesterdayLabelDidNotAttend = driver.findElement(YesterdayDidNotAttend ).isDisplayed();
        Assert.assertEquals(true,YesterdayLabelDidNotAttend);

        boolean YesterdayLabelAppointmentsPublished = driver.findElement(YesterdayAppointmentsPublished ).isDisplayed();
        Assert.assertEquals(true,YesterdayLabelAppointmentsPublished);

        boolean YesterdayLabelAppointmentBooked = driver.findElement(YesterdayAppointmentsBooked).isDisplayed();
        Assert.assertEquals(true,YesterdayLabelAppointmentBooked);

    }

    public void verify_the_select_last_week_medical_center_finance_dashboard_last_week_details() throws Throwable {

        Thread.sleep(3000);

        boolean FinanceLastWeekLabel = driver.findElement(LastWeekLabel).isDisplayed();
        Assert.assertEquals(true,FinanceLastWeekLabel);

        boolean LastWeekLabelPatientsSeen = driver.findElement(LastWeekPatientSeen).isDisplayed();
        Assert.assertEquals(true,LastWeekLabelPatientsSeen);

        boolean LastWeekLabelTotalBilled = driver.findElement(LastWeekTotalBilled).isDisplayed();
        Assert.assertEquals(true,LastWeekLabelTotalBilled);

        boolean LastWeekLabelGroupAverages = driver.findElement(LastWeekGroupAverage).isDisplayed();
        Assert.assertEquals(true,LastWeekLabelGroupAverages);

        boolean LastWeekLabelMedicalCenterFee = driver.findElement(LastWeekMedicalCenterFee).isDisplayed();
        Assert.assertEquals(true,LastWeekLabelMedicalCenterFee);

        boolean LastWeekLabelNewPatient = driver.findElement(LastWeekNewPatient).isDisplayed();
        Assert.assertEquals(true,LastWeekLabelNewPatient);

        boolean LastWeekLabelDidNotAttend = driver.findElement(LastWeekDidNotAttend ).isDisplayed();
        Assert.assertEquals(true,LastWeekLabelDidNotAttend);

        boolean LastWeekLabelAppointmentsPublished = driver.findElement(LastWeekAppointmentsPublished ).isDisplayed();
        Assert.assertEquals(true,LastWeekLabelAppointmentsPublished);

        boolean LastWeekLabelAppointmentBooked = driver.findElement(LastWeekAppointmentsBooked).isDisplayed();
        Assert.assertEquals(true,LastWeekLabelAppointmentBooked);

    }

    public void verify_the_select_last_month_medical_center_finance_dashboard_last_month_details() throws Throwable {
        Thread.sleep(3000);

        boolean FinanceLastMonthLabel = driver.findElement(LastMonthLabel).isDisplayed();
        Assert.assertEquals(true,FinanceLastMonthLabel);

        boolean LastMonthLabelPatientsSeen = driver.findElement(LastMonthPatientSeen).isDisplayed();
        Assert.assertEquals(true,LastMonthLabelPatientsSeen);

        boolean LastWeekLabelTotalBilled = driver.findElement(LastMonthTotalBilled).isDisplayed();
        Assert.assertEquals(true,LastWeekLabelTotalBilled);

        boolean LastMonthLabelGroupAverages = driver.findElement(LastMonthGroupAverage).isDisplayed();
        Assert.assertEquals(true,LastMonthLabelGroupAverages);

        boolean LastMonthLabelMedicalCenterFee = driver.findElement(LastMonthMedicalCenterFee).isDisplayed();
        Assert.assertEquals(true,LastMonthLabelMedicalCenterFee);

        boolean LastMonthLabelNewPatient = driver.findElement(LastMonthNewPatient).isDisplayed();
        Assert.assertEquals(true,LastMonthLabelNewPatient);

        boolean LastMonthLabelDidNotAttend = driver.findElement(LastMonthDidNotAttend ).isDisplayed();
        Assert.assertEquals(true,LastMonthLabelDidNotAttend);

        boolean LastMonthLabelAppointmentsPublished = driver.findElement(LastMonthAppointmentsPublished ).isDisplayed();
        Assert.assertEquals(true,LastMonthLabelAppointmentsPublished);

        boolean LastMonthLabelAppointmentBooked = driver.findElement(LastMonthAppointmentsBooked).isDisplayed();
        Assert.assertEquals(true,LastMonthLabelAppointmentBooked);

    }
    public void verify_the_Highest_Billed_Details_Title(String GetTitleHighestBilled) throws Throwable {

        String TitleHighestBilled = driver.findElement(HighestBilledDetails).getText();

       if(GetTitleHighestBilled == TitleHighestBilled){
           boolean VerifyTitleHighestBilled = driver.findElement(HighestBilledDetails).isDisplayed();
           Assert.assertEquals(true,VerifyTitleHighestBilled);
       }else{
           System.out.println("Fails");
       }
    }
    public void verify_the_Highest_Billed_Today_Details() throws Throwable {

        boolean HighestBilledTodayDetails = driver.findElement(HighestBilledDetailsTodayDetailsXpath).isDisplayed();
        Assert.assertEquals(true,HighestBilledTodayDetails);

    }
    public void verify_the_Highest_Billed_Yesterday_Details() throws Throwable {
        boolean HighestBilledYesterdayDetails = driver.findElement(HighestBilledDetailsYesterdayXpath).isDisplayed();
        Assert.assertEquals(true,HighestBilledYesterdayDetails);
    }

    public void verify_the_Highest_Billed_Current_month_Details() throws Throwable {

        boolean HighestBilledCurrentMonthDetails = driver.findElement(HighestBilledDetailsCurrentMonthXpath).isDisplayed();
        Assert.assertEquals(true,HighestBilledCurrentMonthDetails);
    }

    public void verify_the_Highest_Billed_prev_month_details() throws Throwable {
        boolean HighestBilledPrevMonthDetails = driver.findElement(HighestBilledPrevMonthDetailsXpath).isDisplayed();
        Assert.assertEquals(true,HighestBilledPrevMonthDetails );
    }

    public void check_on_Weekly_Chart_button() throws Throwable {
        boolean WeeklyChartButton = driver.findElement(WeeklyChartButtonXpath).isDisplayed();
        Assert.assertEquals(true,WeeklyChartButton);
        WebElement ClickWeeklyButton = driver.findElement(WeeklyChartButtonXpath);
        ClickWeeklyButton.click();
    }

    public void check_on_Monthly_Chart_button() throws Throwable {
        boolean MonthlyChartButton = driver.findElement(MonthlyChartButtonXpath).isDisplayed();
        Assert.assertEquals(true,MonthlyChartButton);
        WebElement ClickMonthlyCHartButton = driver.findElement(MonthlyChartButtonXpath);
        ClickMonthlyCHartButton.click();
    }

    public void check_on_Yearly_Chart_button() throws Throwable {
        boolean YearlyChartButton = driver.findElement(YearlyChartButtonXpath).isDisplayed();
        Assert.assertEquals(true,YearlyChartButton);
        WebElement ClickYearlyChartButton = driver.findElement(YearlyChartButtonXpath);
        ClickYearlyChartButton.click();
    }
    public void check_on_Previous_Year_Monthly() throws Throwable {
        boolean PreviousYearMonthly = driver.findElement(PreviousYearMonthlyXpath).isDisplayed();
        Assert.assertEquals(true,PreviousYearMonthly);
        WebElement ClickPreviousYearMonthly = driver.findElement(PreviousYearMonthlyXpath);
        ClickPreviousYearMonthly.click();
    }

    public void check_on_Previous_Year_Weekly() throws Throwable {
        boolean PreviousYearWeekly = driver.findElement(PreviousYearWeeklyXpath).isDisplayed();
        Assert.assertEquals(true,PreviousYearWeekly);
        WebElement ClickPreviousYearWeekly = driver.findElement(PreviousYearWeeklyXpath);
        ClickPreviousYearWeekly.click();
    }
    public void verify_the_Billed_Trend_Chart_Title() throws Throwable {
        boolean BilledTrendChartTitle = driver.findElement(BilledTrendChartTitleXpath).isDisplayed();
        Assert.assertEquals(true,BilledTrendChartTitle);
    }

    public void check_on_Total_Billed_Title() throws Throwable {
        boolean TotalBilledTitle = driver.findElement(TotalBilledTitleXpath).isDisplayed();
        Assert.assertEquals(true,TotalBilledTitle);
    }

    public void verify_the_Financial_Year_Title() throws Throwable {
        boolean FinancialYearTitle = driver.findElement(FinancialYearTitleXpath).isDisplayed();
        Assert.assertEquals(true,FinancialYearTitle);
    }

    public void verify_the_Total_Appointments_details() throws Throwable {
        boolean FinancialYearTotalAppointmentsDetails = driver.findElement(FinancialYearTotalAppointments).isDisplayed();
        Assert.assertEquals(true,FinancialYearTotalAppointmentsDetails);
    }

    public void verify_the_Total_Billed_details() throws Throwable {
        boolean FinancialYearTotalBilledDetails = driver.findElement(FinancialYearTotalBilled).isDisplayed();
        Assert.assertEquals(true,FinancialYearTotalBilledDetails);
    }

    public void verify_the_Group_Average_details() throws Throwable {
        boolean FinancialYearGroupAverageDetails = driver.findElement(FinancialYearGroupAverage).isDisplayed();
        Assert.assertEquals(true,FinancialYearGroupAverageDetails);
    }

    public void verify_the_Total_Medical_Centre_fees() throws Throwable {
        boolean FinancialYearTotalMedicalCentreFees = driver.findElement(FinancialYearTotalMedicalCenterFees).isDisplayed();
        Assert.assertEquals(true,FinancialYearTotalMedicalCentreFees);
    }

    //--------------------Finance medical center Sync button------------------

    public void click_on_Sync_Button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Thread.sleep(10000);
        WebElement verifyFinanceSyncBtn = driver.findElement(By.xpath("//mat-icon[normalize-space()='update']"));
        //WebElement verifyFinanceSyncBtn = driver.findElement(By.xpath("//button[@class='mat-focus-indicator d-flex align-items-center justify-content-center ms-sm-3 mt-1 mt-md-0 mat-flat-button mat-button-base mat-primary']//span[@class='mat-button-wrapper']"));
        //verifyFinanceSyncBtn.isDisplayed();
        verifyFinanceSyncBtn.click();

    }

    public void click_on_Finance_Dashboard_Download_button() throws Throwable {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(10000);
        WebElement verifyFinanceDownloadBtn = driver.findElement(By.xpath("//button[@class='mat-focus-indicator d-flex align-items-center justify-content-center ms-2 mt-1 mt-md-0 mat-stroked-button mat-button-base mat-primary']//span[@class='mat-button-wrapper']"));
        verifyFinanceDownloadBtn.isDisplayed();
        verifyFinanceDownloadBtn.click();
    }

    public void click_on_Medical_Center() throws Throwable {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement ClickOnMedicalCenter = driver.findElement(By.xpath("//span[normalize-space()='Main surgery - Ellen Stirling']"));
        ClickOnMedicalCenter.click();
    }

    //-----------------------------Calculating Finance Dashboard Today Values-------------------------------------------

    //Today Patients seen Calculating and stored the Values
    public void verify_the_Finance_Dashboard_Total_Billed_Today() throws Throwable{
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Patient Seen Count store the "StoreTheTodayPatientSeen" Object

        WebElement StoreTheTodayPatientsSeen = driver.findElement(TodayPatientSeenValues);

        // System.out.println("Values enters: " +StoreTheTodayPatientsSeen.getAttribute("values"));

        String TodayPatientSeen = StoreTheTodayPatientsSeen.getText();

        double TdayPatientSeen = Double.parseDouble(TodayPatientSeen); //returns double primitive in Today Patient seen

        System.out.println("Patient Seen Test Double Date : "+TdayPatientSeen);

        System.out.println("Today Patient seen Text attribute value is : "+ TodayPatientSeen);

        //Patient Average Values store the "StoreTheTodayPatientAverage " object

        WebElement StoreTheTodayPatientAverage = driver.findElement(TodayPatientAverage);

        String PatientAverage = StoreTheTodayPatientAverage.getText();

        double TdayPatientAverage = Double.parseDouble(PatientAverage); //returns double primitive in Today Patient Average

        System.out.println("Patient Average Test Double Data : "+TdayPatientAverage);

        System.out.println("Today Patient Average Text attribute values is : "+PatientAverage);

        //Total Billed Values on Today

        WebElement TodayTotalBilled = driver.findElement(TodayTotalBilledValue);

        String SelectMedicalCenterTotalBilled = TodayTotalBilled.getText();

        double TDayTotalBilled = Double.parseDouble(SelectMedicalCenterTotalBilled); //returns double primitive in Today Total Billed

        System.out.println("Patient Total Bill Text attribute values is : "+SelectMedicalCenterTotalBilled);

        System.out.println("Total Billed double values is : "+TDayTotalBilled);

        if(TdayPatientSeen*TdayPatientAverage == TDayTotalBilled){
            System.out.println("Total Values is successfully ");
        }
    }

    //Today Patients Average Calculating and stored the Values
    public void verify_the_Finance_Dashboard_Group_Average() throws Throwable {

        //Today

        Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement TodayPatientsValues = driver.findElement(TodayPatientsSeen);

        String SelectTodayPatientsValues = TodayPatientsValues.getText();

        float TDayPatientsValues = Float.parseFloat(SelectTodayPatientsValues);

        System.out.println("Patients Seen Test attribute values is : "+SelectTodayPatientsValues);

        System.out.println("Patients Seen double values is : "+TDayPatientsValues);

        //Today

        WebElement TotalBilledValues = driver.findElement(TodayTotalBilledValue);

        String SelectTotalBillingValues = TotalBilledValues.getText();

        float TDayTotalBilled = Float.parseFloat(SelectTotalBillingValues);

        System.out.println("Total Billed Test attribute values is : "+SelectTotalBillingValues);

        System.out.println("Total Billed double values is : "+TDayTotalBilled);

        //

        WebElement PatientAverageValues = driver.findElement(TodayPatientAverage);

        String SelectPatientAverageValues = PatientAverageValues.getText();

        float TDayPatientAverageValues = Float.parseFloat(SelectPatientAverageValues);

        System.out.println("Patient Average Values attribute values is : "+SelectPatientAverageValues);

        System.out.println("Patients Average float values is : "+TDayPatientAverageValues);

        if (TDayTotalBilled / TDayPatientsValues == TDayPatientAverageValues){
            System.out.println("patient Averages Values is successfully ");
        }

    }

    //Calculating the Financial Dashboard Today Medical center Fees
    public void validating_in_the_Financial_DashBoard_Today_Medical_Center_Fee() throws Throwable {

        //Store the Today Total Billed

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement TodayTotalBilledValues = driver.findElement(TodayTotalBilledValue);

        String SelectTodayBilledValues = TodayTotalBilledValues.getText();

        float TDayBilledValues = Float.parseFloat(SelectTodayBilledValues);

        System.out.println("Verify the Today Billed Values : "+SelectTodayBilledValues);

        System.out.println("Total Billed Values float values is"+TDayBilledValues);

        //Store the Medical Center Fee

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement TodayMedicalCenterFeeValues = driver.findElement(TodayMedicalCenterFeeXpath);

        String SelectTodayMedicalCenterFeeValues = TodayMedicalCenterFeeValues.getText();

        float TDayMedicalCenterValues = Float.parseFloat(SelectTodayMedicalCenterFeeValues);

        System.out.println("Verify the Medical Center Values : "+SelectTodayMedicalCenterFeeValues);

        System.out.println(" Values float values is"+TDayBilledValues);


    }
    //---------------------------Yesterday Patients seen Calculating and stored the Values------------------------------

    public void verify_the_Finance_Dashboard_Total_Billed_in_Yesterday() throws Throwable {

        //Yesterday Patient seen Values
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement YesterdayPatientsSeenValues = driver.findElement(YesterdayPatientsSeenValuesXpath);

        String SelectYesterdayPatientSeenValues = YesterdayPatientsSeenValues.getText();

        float YDayPatientSeenValues = Float.parseFloat(SelectYesterdayPatientSeenValues);

        System.out.println("Yesterday Patient Seen Values is : "+SelectYesterdayPatientSeenValues);

        System.out.println("Yesterday Patient float values is : "+YDayPatientSeenValues);

        //Yesterday Patient Average Values

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement YesterdayPatientsAverageValues = driver.findElement(YesterdayPatientAverageValuesXpath);

        String SelectYesterdayPatientAverageValues = YesterdayPatientsAverageValues.getText();

        float YDayPatientAverageValues = Float.parseFloat(SelectYesterdayPatientAverageValues);

        System.out.println("Yesterday Patient Average Values is : "+SelectYesterdayPatientAverageValues);

        System.out.println("Yesterday Patient Average float values is : "+YDayPatientAverageValues);

        //Yesterday Total billed Values

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement YesterdayTotalBilledValues = driver.findElement(YesterdayTotalBilledValueXpath);

        String SelectYesterdayTotalBilledValues = YesterdayTotalBilledValues.getText();

        float YDayTotalBilledValues = Float.parseFloat(SelectYesterdayTotalBilledValues);

        System.out.println("Yesterday Total billed Values is : "+SelectYesterdayTotalBilledValues);

        System.out.println("Yesterday Total billed float values is : "+YDayTotalBilledValues);

        if (YDayPatientSeenValues*YDayPatientAverageValues == YDayTotalBilledValues) {
            System.out.println("Yesterday total Values is successfully ");
        }
    }

    //---------------------------Yesterday Patient Average Calculating and stored the Values----------------------------
    public void verify_the_Finance_Dashboard_Group_Average_in_Yesterday() throws Throwable {

        //Yesterday Patients Seen Values

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement YesterdayPatientsSeenValues = driver.findElement(YesterdayPatientsSeenValuesXpath);

        String SelectYesterdayPatientSeenValues = YesterdayPatientsSeenValues.getText();

        float YDayPatientsSeenValues = Float.parseFloat(SelectYesterdayPatientSeenValues);

        System.out.println("Yesterday Patient Seen Values is : "+SelectYesterdayPatientSeenValues);

        System.out.println("Yesterday Patient Seen float values is : "+YDayPatientsSeenValues);

        //Yesterday Patient Average Values

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement YesterdayPatientAverageValues = driver.findElement(YesterdayPatientAverageValuesXpath);

        String SelectYesterdayPatientAverageValues = YesterdayPatientAverageValues.getText();

        float YDayPatientAverageValues = Float.parseFloat(SelectYesterdayPatientAverageValues);

        System.out.println("Yesterday Patient Average Values is : "+SelectYesterdayPatientAverageValues);

        System.out.println("Yesterday Patient Average float values is : "+YDayPatientAverageValues);

        //Yesterday Total Billed Values

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement YesterdayTotalBilledValues = driver.findElement(YesterdayTotalBilledValueXpath);

        String SelectYesterdayTotalBilledValues = YesterdayTotalBilledValues.getText();

        float YDayTotalBilledValues = Float.parseFloat(SelectYesterdayTotalBilledValues);

        System.out.println("Yesterday Total Billed Values is : "+SelectYesterdayTotalBilledValues);

        System.out.println("Yesterday Total Billed float Values is : "+YDayTotalBilledValues);

        if (YDayTotalBilledValues % YDayPatientsSeenValues == YDayPatientAverageValues){
            System.out.println("Yesterday Patient Average Values is successfully");
        }
    }

    //---------------------------Last Week Patient Average Calculating and stored the Values----------------------------

    public void validating_in_the_Financial_DashBoard_Last_Week_Total_Billed_Values() throws Throwable {

        //Store the Last week Patients Seen

        Thread.sleep(10000);

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement LastWeekPatientSeen = driver.findElement(LastWeekPatientsSeenXpath);

        String SelectLastWeekPatientSeenValues = LastWeekPatientSeen.getText();

        float LWeekPatientSeenValues = Float.parseFloat(SelectLastWeekPatientSeenValues);

        System.out.println("Last Week Patient Seen Values is : "+SelectLastWeekPatientSeenValues);

        System.out.println("Last Week Patient Seen float Values is : "+LWeekPatientSeenValues);

        //Store the Last Week Patient Average

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement LastWeekPatientAverage = driver.findElement(LastWeekPatinetAverageXpath);

        String SelectLastWeekPatientAverageValues = LastWeekPatientAverage.getText();

        float LWeekPatientAverageValues = Float.parseFloat(SelectLastWeekPatientAverageValues);

        System.out.println("Last Week Patient Average Values is : "+ SelectLastWeekPatientAverageValues);

        System.out.println("Last Week Patient Average float Values is : "+ LWeekPatientAverageValues);

        //Store the Last Week Total Billed Values

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        Thread.sleep(5000);

        WebElement LastWeekTotalBilled = driver.findElement(LastWeekTotalBilledValuesXpath);

        String SelectLastWeekTotalBilledValues = LastWeekTotalBilled.getText();

        float LWeekTotalBilledValues = Float.parseFloat(SelectLastWeekTotalBilledValues);

        System.out.println("Last Week Total Billed Values is :  "+ SelectLastWeekTotalBilledValues);

        System.out.println("Last Week Total Billed float Values is : "+ LWeekTotalBilledValues);

        if (LWeekPatientSeenValues * LWeekPatientAverageValues == LWeekTotalBilledValues) {
            System.out.println("Last Week Total Billed Values is Successfully correct ");
        }
    }

    //-------------------------------Last Week Group Average Values ----------------------------------------------------
    public void validating_in_the_Financial_DashBoard_Last_Week_Group_Average_Values() throws Throwable {

        //Store the Last week Group Average

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement LastWeekPatientsSeenValues = driver.findElement(LastWeekPatientsSeenXpath);

        String SelectLastWeekPatientSeenValues = LastWeekPatientsSeenValues.getText();

        float LWeekPatientsSeenValues = Float.parseFloat(SelectLastWeekPatientSeenValues);

        System.out.println("Last Week Patient Seen Values is : "+SelectLastWeekPatientSeenValues);

        System.out.println("Last Week Patient Seen float values is : "+LWeekPatientsSeenValues);

        //Last Week Patient Average Values

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement LastWeekPatientAverageValues = driver.findElement(LastWeekPatinetAverageXpath);

        String SelectLastWeekPatientAverageValues = LastWeekPatientAverageValues.getText();

        float LWeekPatientAverageValues = Float.parseFloat(SelectLastWeekPatientAverageValues);

        System.out.println("Last Week Patient Average Values is : "+SelectLastWeekPatientAverageValues);

        System.out.println("Last Week Patient Average float values is : "+LWeekPatientAverageValues);

        //Store the Last Week Total Billed Values

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        Thread.sleep(5000);

        WebElement LastWeekTotalBilled = driver.findElement(LastWeekTotalBilledValuesXpath);

        String SelectLastWeekTotalBilledValues = LastWeekTotalBilled.getText();

        float LWeekTotalBilledValues = Float.parseFloat(SelectLastWeekTotalBilledValues);

        System.out.println("Last Week Total Billed Values is :  "+ SelectLastWeekTotalBilledValues);

        System.out.println("Last Week Total Billed float Values is : "+ LWeekTotalBilledValues);

        if (LWeekPatientsSeenValues % LWeekPatientAverageValues == LWeekTotalBilledValues){
            System.out.println("Last Week Patient Average Values is successfully");
        }
    }

    //-------------------------Validating in the Finance Dashboard last month Values------------------------------------
    public void validating_in_the_Financial_DashBoard_Last_Month_Total_Billed_Values() throws Throwable {

        //Store the Last Month Patients Seen

        Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement LastMonthPatientSeen = driver.findElement(LastMonthPatientsSeenXpath);

        String SelectLastMonthPatientSeenValues = LastMonthPatientSeen.getText();

        float LMonthPatientSeenValues = Float.parseFloat(SelectLastMonthPatientSeenValues);

        System.out.println("Last Month Patient Seen Values is : "+SelectLastMonthPatientSeenValues);

        System.out.println("Last Month Patient Seen float Values is : "+LMonthPatientSeenValues);

        //Store the Last Month Patient Average

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement LastMonthPatientAverage = driver.findElement(LastMonthPatientAverageXpath);

        String SelectLastMonthPatientAverageValues = LastMonthPatientAverage.getText();

        float LMonthPatientAverageValues = Float.parseFloat(SelectLastMonthPatientAverageValues);

        System.out.println("Last Month Patient Average Values is : "+ SelectLastMonthPatientAverageValues);

        System.out.println("Last Month Patient Average float Values is : "+ LMonthPatientAverageValues);

        //Store the Last Month Total Billed Values

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        Thread.sleep(5000);

        WebElement LastMonthTotalBilled = driver.findElement(LastMonthTotalBilledValuesXpath);

        String SelectLastMonthTotalBilledValues = LastMonthTotalBilled.getText();

        String cleanedString = SelectLastMonthTotalBilledValues.replace(",","");

        //double LMonthTotalBilledValues = Double.parseDouble(SelectLastMonthTotalBilledValues);

        float LMonthTotalBilledValues = Float.parseFloat(cleanedString);

        System.out.println("Last Month Total Billed Values is :  "+ SelectLastMonthTotalBilledValues);

        System.out.println("Last Month Total Billed float Values is : "+ SelectLastMonthTotalBilledValues);

        double CalculatingValuesInBilledValues = LMonthPatientSeenValues * LMonthPatientAverageValues;

        String formattedNumber = String.format("%.2f",CalculatingValuesInBilledValues);

        float LastMonthInBilledValuesAnswer = Float.parseFloat(formattedNumber);

        if (LastMonthInBilledValuesAnswer == LMonthTotalBilledValues) {
            System.out.println("Last Month Total Billed Values is Successfully correct ");
        }
        else {
            System.out.println("failed");
        }

    }

    //------------------------Validating in the Finance Dashboard last month Group Average Values-----------------------

    public void validating_in_the_Financial_DashBoard_Last_Month_Group_Average_Values() throws Throwable {

        //Store the Last Month Group Average

        Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement LastMonthPatientsSeenValues = driver.findElement(LastMonthPatientsSeenXpath);

        String SelectLastMonthPatientSeenValues = LastMonthPatientsSeenValues.getText();

        float LMonthPatientsSeenValues = Float.parseFloat(SelectLastMonthPatientSeenValues);
        //LMonthPatientsSeenValues

        System.out.println("Last Month Patient Seen Values is : "+SelectLastMonthPatientSeenValues);

        System.out.println("Last Month Patient Seen float values is : "+LMonthPatientsSeenValues);

        //Last Month Patient Average Values

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement LastMonthPatientAverageValues = driver.findElement(LastMonthPatientAverageXpath);

        String SelectLastMonthPatientAverageValues = LastMonthPatientAverageValues.getText();

        float LMonthPatientAverageValues = Float.parseFloat(SelectLastMonthPatientAverageValues);
        //LMonthPatientAverageValues

        System.out.println("Last Month Patient Average Values is : "+SelectLastMonthPatientAverageValues);

        System.out.println("Last Month Patient Average float values is : "+LMonthPatientAverageValues);

        //Store the Last Month Total Billed Values

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        Thread.sleep(5000);

        WebElement LastMonthTotalBilled = driver.findElement(LastMonthTotalBilledValuesXpath);

        String SelectLastMonthTotalBilledValues = LastMonthTotalBilled.getText();

        String cleanedString = SelectLastMonthTotalBilledValues.replace(",", "");

        float LMonthTotalBilledValues = Float.parseFloat(cleanedString);
        //LMonthTotalBilledValues

        System.out.println("Last Month Total Billed Values is :  "+ SelectLastMonthTotalBilledValues);

        System.out.println("Last Month Total Billed float Values is : "+ LMonthTotalBilledValues);

        double CalculatingValuesInLastMonth = LMonthTotalBilledValues / LMonthPatientsSeenValues;

        String formattedNumber = String.format("%.2f",CalculatingValuesInLastMonth);

        float LastMonthCalculatingAnswer = Float.parseFloat(formattedNumber);

        if (LastMonthCalculatingAnswer == LMonthPatientAverageValues){
            System.out.println("Last Month Patient Average Values is successfully");
        }
    }

    //--------------------------Validating Financial Year Total Billed--------------------------------------------------
    public void financial_Year_Total_Billed_Values_Validating() throws Throwable {

        //Store the Financial Year Total Appointments

        Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement FinanceYearTotalAppointmentsValues = driver.findElement(FinancialYearTotalAppointmentsValuesXpath);

        String SelectFinancialYearTotalAppointments = FinanceYearTotalAppointmentsValues.getText();

        String cleanedStringTotalAppointments = SelectFinancialYearTotalAppointments.replace(",", "");

        float FinancialYearTotalAppointments = Float.parseFloat(cleanedStringTotalAppointments);

        System.out.println("Financial Year Total Appointments Values is :  "+ SelectFinancialYearTotalAppointments);

        System.out.println("Financial Year Total Appointments float Values is : "+ FinancialYearTotalAppointments);

        //Store the Financial year Total Billed

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement FinancialYearTotalBilledValues = driver.findElement(FinancialYearTotalBilledValuesXpath);

        String SelectFinancialYearTotalBilled = FinancialYearTotalBilledValues.getText();

        String cleanedStringTotalBilled= SelectFinancialYearTotalBilled.replace(",","");

        float FinancialYearTotalBilled = Float.parseFloat(cleanedStringTotalBilled);

        System.out.println("Financial Year Total Billed Values is :  "+ SelectFinancialYearTotalBilled);

        System.out.println("Financial Year Total Billed float Values is : "+ FinancialYearTotalBilled);

        //Store the Financial Year Patient Average

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement FinancialYearPatientAverageValues = driver.findElement(FinancialYearPatientAverageValuesXpath);

        String SelectFinancialYearPatientAverage =  FinancialYearPatientAverageValues.getText();

        String cleanedStringPatientAverage= SelectFinancialYearPatientAverage.replace(",","");

        float FinancialYearPatientAverage = Float.parseFloat(cleanedStringPatientAverage);

        System.out.println("Financial Year Patient Average Values is :  "+ SelectFinancialYearPatientAverage);

        System.out.println("Financial Year Patient Average float Values is : "+ FinancialYearPatientAverage);

        //Calculation in Total billed

        double CalculatingValuesInFinancialYearTotalBilled =  FinancialYearTotalAppointments * FinancialYearPatientAverage;

        String formattedNumber = String.format("%.2f",CalculatingValuesInFinancialYearTotalBilled);

        float FinancialYearTotalBilledCalculatingAnswer = Float.parseFloat(formattedNumber);

        if (FinancialYearTotalBilledCalculatingAnswer == FinancialYearTotalBilled){
            System.out.println("FinancialYearTotalBilled Values is successfully!!!!!!");
        }
//        else {
//            System.out.println("FinancialYearTotalBilled Values is Mismatch!!!!!!!!");
//        }
    }

    //-----------------------------Validating Finance Year Total Appointment--------------------------------------------
    public void financial_Year_Total_Appointments_Values_Validating() throws Throwable {

        //Store the Financial Year Total Appointments

        Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement FinanceYearTotalAppointmentsValues = driver.findElement(FinancialYearTotalAppointmentsValuesXpath);

        String SelectFinancialYearTotalAppointments = FinanceYearTotalAppointmentsValues.getText();

        String cleanedStringTotalAppointments = SelectFinancialYearTotalAppointments.replace(",", "");

        float FinancialYearTotalAppointments = Float.parseFloat(cleanedStringTotalAppointments);

        System.out.println("Financial Year Total Appointments Values is :  "+ SelectFinancialYearTotalAppointments);

        System.out.println("Financial Year Total Appointments float Values is : "+ FinancialYearTotalAppointments);

        //Store the Financial year Total Billed

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement FinancialYearTotalBilledValues = driver.findElement(FinancialYearTotalBilledValuesXpath);

        String SelectFinancialYearTotalBilled = FinancialYearTotalBilledValues.getText();

        String cleanedStringTotalBilled= SelectFinancialYearTotalBilled.replace(",","");

        float FinancialYearTotalBilled = Float.parseFloat(cleanedStringTotalBilled);

        System.out.println("Financial Year Total Billed Values is :  "+ SelectFinancialYearTotalBilled);

        System.out.println("Financial Year Total Billed float Values is : "+ FinancialYearTotalBilled);

        //Store the Financial Year Patient Average

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement FinancialYearPatientAverageValues = driver.findElement(FinancialYearPatientAverageValuesXpath);

        String SelectFinancialYearPatientAverage =  FinancialYearPatientAverageValues.getText();

        String cleanedStringPatientAverage= SelectFinancialYearPatientAverage.replace(",","");

        float FinancialYearPatientAverage = Float.parseFloat(cleanedStringPatientAverage);

        System.out.println("Financial Year Patient Average Values is :  "+ SelectFinancialYearPatientAverage);

        System.out.println("Financial Year Patient Average float Values is : "+ FinancialYearPatientAverage);

        //----------------------------Calculating the Total Appointments------------------------------------------------

        double CalculatingValuesInFinancialYearTotalAppointments =  FinancialYearTotalBilled / FinancialYearPatientAverage;

        String formattedNumber = String.format("%.2f",CalculatingValuesInFinancialYearTotalAppointments);

        float FinancialYearTotalAppointmentsCalculatingAnswer = Float.parseFloat(formattedNumber);

        if (FinancialYearTotalAppointmentsCalculatingAnswer == FinancialYearTotalAppointments){
            System.out.println("FinancialYearTotalBilled Values is successfully!!!!!!");
        }
        else {
            System.out.println("FinancialYearTotalBilled Values is Mismatch!!!!!!!!");
        }
    }

    //--------------------------------Validating Finance Year Patient Average-------------------------------------------
    public void financial_Year_Patient_Average_Values_Validating() throws Throwable {

        //Store the Financial Year Patient Average

        Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement FinanceYearTotalAppointmentsValues = driver.findElement(FinancialYearTotalAppointmentsValuesXpath);

        String SelectFinancialYearTotalAppointments = FinanceYearTotalAppointmentsValues.getText();

        String cleanedStringTotalAppointments = SelectFinancialYearTotalAppointments.replace(",", "");

        float FinancialYearTotalAppointments = Float.parseFloat(cleanedStringTotalAppointments);

        System.out.println("Financial Year Total Appointments Values is :  "+ SelectFinancialYearTotalAppointments);

        System.out.println("Financial Year Total Appointments float Values is : "+ FinancialYearTotalAppointments);

        //Store the Financial year Total Billed

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement FinancialYearTotalBilledValues = driver.findElement(FinancialYearTotalBilledValuesXpath);

        String SelectFinancialYearTotalBilled = FinancialYearTotalBilledValues.getText();

        String cleanedStringTotalBilled= SelectFinancialYearTotalBilled.replace(",","");

        float FinancialYearTotalBilled = Float.parseFloat(cleanedStringTotalBilled);

        System.out.println("Financial Year Total Billed Values is :  "+ SelectFinancialYearTotalBilled);

        System.out.println("Financial Year Total Billed float Values is : "+ FinancialYearTotalBilled);

        //Store the Financial Year Patient Average

        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        WebElement FinancialYearPatientAverageValues = driver.findElement(FinancialYearPatientAverageValuesXpath);

        String SelectFinancialYearPatientAverage =  FinancialYearPatientAverageValues.getText();

        String cleanedStringPatientAverage= SelectFinancialYearPatientAverage.replace(",","");

        float FinancialYearPatientAverage = Float.parseFloat(cleanedStringPatientAverage);

        System.out.println("Financial Year Patient Average Values is :  "+ SelectFinancialYearPatientAverage);

        System.out.println("Financial Year Patient Average float Values is : "+ FinancialYearPatientAverage);

        //----------------------------Calculating the Patient Average------------------------------------------------

        double CalculatingValuesInFinancialYearPatientAverage =  FinancialYearTotalBilled / FinancialYearTotalAppointments;

        String formattedNumber = String.format("%.2f",CalculatingValuesInFinancialYearPatientAverage);

        float FinancialYearPatientAverageCalculatingAnswer = Float.parseFloat(formattedNumber);

        if (FinancialYearPatientAverageCalculatingAnswer == FinancialYearPatientAverage){
            System.out.println("FinancialYearPatientAverage Values is successfully!!!!!!");
        }
        else {
            System.out.println("FinancialYearPatientAverage Values is Mismatch!!!!!!!!");
        }

    }
}


