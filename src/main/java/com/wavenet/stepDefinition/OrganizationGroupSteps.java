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

    @Then("^Verify the Organization Title$")
    public void verify_the_Organization_Title() throws Throwable {
        organizationGroup.verify_the_Organization_Title();
    }

    @Then("^Verify the Search Organization Search Box '(.*?)'$")
    public void verify_the_Search_Organization_Search_Box(String Organization) throws Throwable {
        organizationGroup.verify_the_Search_Organization_Search_Box(Organization);
    }

    @Then("^Verify the Item per page$")
    public void verify_the_Item_per_page() throws Throwable {
        organizationGroup.verify_the_Item_per_page();
    }

    @Then("^Verify the Navigation Button$")
    public void verify_the_Navigation_Button() throws Throwable {
        organizationGroup.verify_the_Navigation_Button();
    }

    @Then("^Verify the Table Name Column Title$")
    public void verify_the_Table_Name_Column_Title() throws Throwable {
        organizationGroup.verify_the_Table_Name_Column_Title();
    }

    @Then("^Verify the Table Action Column Title$")
    public void verify_the_Table_Action_Column_Title() throws Throwable {
        organizationGroup.verify_the_Table_Action_Column_Title();
    }

    @Given("^Delete On default Value in Text Box$")
    public void delete_On_default_Value_in_Text_Box() throws Throwable {
        organizationGroup.delete_On_default_Value_in_Text_Box();
    }
    @Then("^Verify the Add New Organization Group Title$")
    public void verify_the_Add_New_Organization_Group_Title() throws Throwable {
        organizationGroup.verify_the_Add_New_Organization_Group_Title();
    }

    @Then("^Enter Name of the organization group '(.*?)'$")
    public void enter_Name_of_the_organization_group(String OrganizationGroup) throws Throwable {
        organizationGroup.enter_Name_of_the_organization_group(OrganizationGroup);
    }

    @Then("^Display the success message for Added new organization group as '(.*?)'$")
    public void display_the_success_message_for_Added_new_organization_group(String OrganizationSuccessfulMessage) throws Throwable {
        organizationGroup.display_the_success_message_for_Added_new_organization_group(OrganizationSuccessfulMessage);
    }

    @Then("^Click on Medical Center details Close Button$")
    public void click_on_Medical_Center_details_Close_Button() throws Throwable {
        organizationGroup.click_on_Medical_Center_details_Close_Button();
    }

    @Given("^Verify the organization Group Delete Conformation PopUp Box Title$")
    public void verify_the_organization_Group_Delete_Conformation_PopUp_Box_Title() throws Throwable {
        organizationGroup.verify_the_organization_Group_Delete_Conformation_PopUp_Box_Title();
    }

    @Then("^Verify the Organization Group Delete Conformation PopUP Box Description$")
    public void verify_the_Organization_Group_Delete_Conformation_PopUP_Box_Description() throws Throwable {
        organizationGroup.verify_the_Organization_Group_Delete_Conformation_PopUP_Box_Description();
    }

    @Then("^Click on Add organization group Save and proceed Button$")
    public void click_on_Add_organization_group_Save_and_proceed_Button() throws Throwable {
        organizationGroup.click_on_Add_organization_group_Save_and_proceed_Button();
    }


}
