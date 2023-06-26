package com.wavenet.stepDefinition;

import com.wavenet.pages.Intent;
import com.wavenet.pages.Login;
import com.wavenet.util.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    private Login login = new Login();
    private Config config = new Config();

    private Intent intent = new Intent();

    String loginUrl = config.getLoginUrl();
    String adminUser = config.getAdminUser();
    String adminPassword = config.getAdminPassword();
    String composeUrl = config.getComposeUrl();
    String composeUsername = config.getComposeUsername();
    String composePassword = config.getComposePassword();

    @Given("^Login to Admin Successfully$")
    public void login_to_Admin_Successfully() throws Throwable
    {
        intent.composeLogin(composeUrl,composeUsername,composePassword);
    }
    @Given("^Open the browser and launch the application$")
    public void Open_the_browser_and_launch_the_application() throws Throwable
    {
        login.loadUrl(loginUrl);
    }

    @When("^Enter a valid email and valid password$")
    public void enter_valid_username_and_valid_password() throws Throwable
    {
        login.enterLoginData(adminUser,adminPassword);
    }

    @When("^Enter a invalid email '(.*?)' and valid password '(.*?)'$")
    public void enter_invalid_username_and_valid_password(String username, String password) throws Throwable
    {
        login.enterLoginData(username,password);
    }

    @When("^Click SignIn$")
    public void click_SignIn() throws Throwable
    {
        login.clickSignIn();
    }

    @And("^Click on Compose$")
    public void click_compose() throws Throwable
    {
        login.clickCompose();
    }

    @And("^Load the Compose Home Page$")
    public void load_the_compose_home_page() throws Throwable
    {
        login.loadComposeHomePage();
    }

    @Then("^Load the CAM Admin Home Page$")
    public void load_The_CAM_Admin_Home_Page() throws Throwable
    {
        login.verifySuccessfulLogin();
    }

    @Then("^Verify Error Message$")
    public void verify_Error_Message() throws Throwable
    {
        login.verifyUnsuccessfulLogin();
    }

    @When("^Enter a valid email '(.*?)' and invalid password '(.*?)'$")
    public void enter_valid_username_and_invalid_password(String username, String password) throws Throwable
    {
        login.enterLoginData(username,password);
    }

    @Then("^Verification of Error Message$")
    public void verification_of_Error_Message() throws Throwable
    {
        login.verifyErrorMessage();
    }

    @When("^Enter a invalid email '(.*?)' and invalid password '(.*?)'$")
    public void enter_invalid_username_and_invalid_password(String username, String password) throws Throwable
    {
        login.enterLoginData(username,password);
    }

    @When("^Enter empty username '(.*?)' and password '(.*?)'$")
    public void enter_empty_username_and_password(String username, String password) throws Throwable
    {
        login.enterLoginData(username,password);
    }

    @Then("^Verify Error Popup$")
    public void verify_error_popup() throws Throwable
    {
        login.verifyErrorPopup();
    }

    @When("^Enter username '(.*?)' and empty password (.*?)$")
    public void enter_username_and_empty_password(String username, String password) throws Throwable
    {
        login.enterLoginData(username,password);
    }

    @When("^Enter empty username '(.*?)' and empty password '(.*?)'$")
    public void enter_empty_username_and_empty_password(String username, String password) throws Throwable
    {
        login.enterLoginData(username,password);
    }

    @When("^Enter username '(.*?)' and empty password$")
    public void enter_username_and_empty_password(String username) throws Throwable
    {
        login.enterLoginUsername(username);
    }

    @Given("^Open the browser and launch the compose login page$")
    public void Open_the_browser_and_launch_compose_login_page() throws Throwable
    {
        login.loadComposeLogin(composeUrl);
    }

    @When("^Enter a valid email and valid password in compose login page$")
    public void enter_valid_username_and_valid_password_in_compose_login() throws Throwable
    {
        login.enterComposeLoginData(composeUsername,composePassword);
    }

    @When("^Click Log In Button$")
    public void click_LogIn() throws Throwable
    {
        login.clickLogIn();
    }

    @When("^Enter a invalid email '(.*?)' and valid password '(.*?)' in compose login page$")
    public void enter_invalid_username_and_valid_password_in_compose_login(String username, String password) throws Throwable
    {
        login.enterComposeLoginData(username,password);
    }

    @Then("^Verify Error Message in Compose Login Page$")
    public void verify_error_message_in_compose_login_page()
    {
        login.verifyErrorMessageInLogin();
    }

    @When("^Enter a valid email '(.*?)' and invalid password '(.*?)' in compose login page$")
    public void enter_valid_username_and_invalid_password_in_compose_login(String username, String password) throws Throwable
    {
        login.enterComposeLoginData(username,password);
    }

    @When("^Enter a invalid email '(.*?)' and invalid password '(.*?)' in compose login page$")
    public void enter_invalid_username_and_invalid_password_in_compose_login(String username, String password) throws Throwable
    {
        login.enterComposeLoginData(username,password);
    }

    @When("^Enter empty username '(.*?)' and password '(.*?)' in compose login page$")
    public void enter_empty_username_and_password_in_compose_login(String username, String password) throws Throwable
    {
        login.enterComposeLoginData(username,password);
    }

    @Then("^Verify LogIn Button is Disabled$")
    public void verify_login_button_is_disabled()
    {
        login.checkLoginButton();
    }

    @When("^Enter username '(.*?)' and password empty '(.*?)' in compose login page$")
    public void enter_username_and_empty_password_in_compose_login(String username, String password) throws Throwable
    {
        login.enterComposeLoginData(username,password);
    }

    @When("^Enter username empty '(.*?)' and password empty '(.*?)' in compose login page$")
    public void enter_empty_username_and_empty_password_in_compose_login(String username, String password) throws Throwable
    {
        login.enterComposeLoginData(username,password);
    }

    @Then("^Driver Quit$")
    public void driver_Quit() throws Throwable {
        login.driver_Quit();

    }

}
