package com.wavenet.stepDefinition;

import com.wavenet.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;

public class HomePageSteps {

    private HomePage hoempage = new HomePage();

    @Given("^Verify the homepage title$")
    public void verify_the_homepage_title() throws Throwable {

    }
    @Given("^Wait some time ImplicitlyWait$")
    public void wait_some_time_ImplicitlyWait() throws Throwable {

    }
    @Given("^Page Scroll Down$")
    public void page_Scroll_Down() throws Throwable {
        hoempage.page_Scroll_Down();
    }

}
