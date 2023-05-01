package com.wavenet.stepDefinition;

import com.wavenet.pages.Intent;
import com.wavenet.util.Config;
import cucumber.api.java.en.Given;

public class IntentSteps {

    private Config config = new Config();

    private Intent intent = new Intent();

    String composeUrl = config.getComposeUrl();

    String composeUsername = config.getComposeUsername();

    String composePassword = config.getComposePassword();

    @Given("^Login to Compose Successfully$")
    public void login_to_compose_successfully() throws Throwable
    {
        intent.composeLogin(composeUrl,composeUsername,composePassword);
    }

}
