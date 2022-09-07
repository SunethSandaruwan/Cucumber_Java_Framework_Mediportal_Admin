package com.wavenet.stepDefinition;

import com.wavenet.pages.Hospitals;
import com.wavenet.pages.OrganizationGroup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OrganizationGroupSteps {
    private OrganizationGroup organizationGroup = new OrganizationGroup();


    @Given("^Click on Organization Group$")
    public void click_on_Organization_Group() throws Throwable {
        organizationGroup.click_on_Organization_Group();
    }

    @Given("^Select organization group as '(.*?)'$")
    public void select_organization_group(String group) throws Throwable {
        organizationGroup.select_organization_group(group);
    }

    @Given("^Click on delete button$")
    public void click_on_delete_button() throws Throwable {
        organizationGroup.click_on_delete_button();
    }

    @Given("^Click on delete button for the yes prompt$")
    public void click_on_delete_button_for_the_yes_prompt() throws Throwable {
        organizationGroup.click_on_delete_button_for_the_yes_prompt();
    }

    @Then("^Display the success message for delete organization group as '(.*?)'$")
    public void display_the_success_message_for_delete_organization_group(String successMsg) throws Throwable {
        organizationGroup.display_the_success_message_for_delete_organization_group(successMsg);
    }


    @Given("^Click on update button for organization$")
    public void click_on_update_button_for_organization() throws Throwable {
        organizationGroup.click_on_update_button_for_organization();
    }

    @Then("^Display the success message for update organization group as '(.*?)'$")
    public void display_the_success_message_for_update_organization_group(String successMsg) throws Throwable {
        organizationGroup.display_the_success_message_for_update_organization_group(successMsg);
    }
}
