package com.wavenet.stepDefinition;

import com.wavenet.pages.Login;
import com.wavenet.util.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps {
    private Login login = new Login();
    private Config config = new Config();
    String url = config.getUrl();

    @And("^Click on LogIn Button$")
    public void click_on_LogIn_Button() throws Throwable {
        login.click_on_LogIn_Button();
    }

    @Given("^Enter Mobile Number for login as '(.*?)'$")
    public void enter_Mobile_Number_for_login(String mobileNo) throws Throwable {
        login.enter_Mobile_Number_for_login(mobileNo);
    }

    @Given("^Enter Password for login as '(.*?)'$")
    public void enter_Password_for_login(String password) throws Throwable {
        login.enter_Password_for_login(password);
    }


    @Then("^Redirect to next page$")
    public void redirect_to_next_page() throws Throwable {
        login.redirect_to_next_page();
    }

    @Given("^Enter Invalid Mobile Number$")
    public void enter_Invalid_Mobile_Number() throws Throwable {
        login.enter_Invalid_Mobile_Number();
    }



    @Then("^Display toast as '(.*?)'$")
    public void display_toast_as_Invalid_mobile_number_or_password(String toast) throws Throwable {
        login.display_toast_as_Invalid_mobile_number_or_password(toast);
    }

    @Then("^Check whether the password is masked$")
    public void check_whether_the_password_is_masked() throws Throwable {
        login.check_whether_the_password_is_masked();
    }

    @Given("^Click on Forgot Password button$")
    public void click_on_Forgot_Password_button() throws Throwable {
        login.click_on_Forgot_Password_button();
    }

    @Then("^Redirect to forgot password page$")
    public void redirect_to_forgot_password_page() throws Throwable {
        login.redirect_to_forgot_password_page();
    }

    @Given("^Click on Register button$")
    public void click_on_Register_button() throws Throwable {
        login.click_on_Register_button();
    }


    @Given("^Click on Logout button$")
    public void click_on_Logout_button() throws Throwable {
        login.click_on_Logout_button();
    }

    //------------------BAP Project---------------
    @When("^Enter for login as '(.*?)'$")
    public void enter_for_login_as_suneth(String name) throws Throwable {
        login.enter_for_log_in_as_suneth(name);
    }

    @When("^Enter for password as'(.*?)'$")
    public void enter_for_password_as_Test(String password) throws Throwable {
        login.enter_for_password_as_Test(password);

    }

    @When("^Click on the signin button$")
    public void click_on_the_signin_button() throws Throwable {
        login.click_on_the_signin_button();
    }

    @Then("^Navigate to the home page$")
    public void navigate_to_the_home_page() throws Throwable {
        login.navigate_to_the_home_page();
    }
    @Given("^Driver Close$")
    public void driver_Close() throws Throwable {
        login.driver_Close();
    }
}




