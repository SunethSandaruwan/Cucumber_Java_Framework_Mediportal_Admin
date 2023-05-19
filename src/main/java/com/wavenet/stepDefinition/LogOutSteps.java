package com.wavenet.stepDefinition;

import com.wavenet.util.Config;
import com.wavenet.pages.Login;
import com.wavenet.pages.LogOut;
import cucumber.api.java.en.Then;

public class LogOutSteps {

    private Login login = new Login();
    private Config config = new Config();

    private LogOut logOut = new LogOut();

    @Then("^Log out$")
    public void log_out() throws Throwable {
        logOut.log_out();
    }
}
