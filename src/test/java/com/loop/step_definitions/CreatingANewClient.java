package com.loop.step_definitions;

import com.loop.pages.DocuportClientsPage;
import com.loop.pages.LoginPage;
import io.cucumber.java.eo.Do;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.loop.pages.DocuportBasePage;
import com.loop.pages.DocuportLoginPage;
import com.loop.utilities.utilities.BrowserUtilities;
import com.loop.utilities.utilities.ConfigurationReader;
import com.loop.utilities.utilities.DocuportConstants;
import com.loop.utilities.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

public class CreatingANewClient {
    private static final Logger LOG = LogManager.getLogger();
    DocuportLoginPage docuportLoginPage = new DocuportLoginPage();
    DocuportBasePage docuportBasePage = new DocuportBasePage();

    DocuportClientsPage docuportClientsPage = new DocuportClientsPage();
    LoginPage loginPage = new LoginPage();
    @Given("user logins as {string}")
    public void user_logins_as(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("dev"));
       // BrowserUtilities.waitForClickable(loginPage.loginButton, DocuportConstants.large);
        docuportLoginPage.loginDocuport(DocuportConstants.USERNAME_ADVISOR,DocuportConstants.VALID_PASSWORD);
        docuportBasePage.usersMenu.click();
       // DocuportBasePage.navigateMenu("Users");
    }
    @When("user goes to {string}")
    public void user_goes_to(String string) {
        docuportBasePage.clientsMenu.click();
    }

    @When("create a new personal client")
    public void create_a_new_personal_client (Map<String,String>credentials){
        docuportClientsPage.createNewClient(credentials);

    }
    @Then("user search for the created profile")
    public void user_search_for_the_created_profile(Map<String,String> credentials) {
       BrowserUtilities.justWait(DocuportConstants.medium);
        docuportBasePage.usersMenu.click();
        docuportBasePage.search.click();
        docuportClientsPage.email.sendKeys(credentials.get("email"), Keys.ENTER);
        docuportBasePage.searchButton.click();
        docuportBasePage.searchForTheClient(credentials);
        Assert.assertTrue(docuportClientsPage.userTable.getText().contains(credentials.get("email")));
        System.out.println("New clients email: " + docuportClientsPage.userTable.getText());

    }
    @Then("user logs out")
    public void user_logs_out() {
      docuportClientsPage.logOutMenu.click();
      docuportClientsPage.logOutButton.click();
    }
    @Then("user logs in as a new client")
    public void user_logs_in_as_a_new_client(Map<String,String> inputs) {
        BrowserUtilities.justWait(DocuportConstants.small);
        docuportLoginPage.loginInput.sendKeys(inputs.get("email"), Keys.ENTER);
        BrowserUtilities.justWait(DocuportConstants.small);
        docuportLoginPage.passwordInput.sendKeys(inputs.get("password"),Keys.ENTER);

    }


}
