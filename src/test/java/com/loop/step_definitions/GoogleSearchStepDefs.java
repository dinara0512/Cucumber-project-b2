package com.loop.step_definitions;

import com.loop.pages.GoogleSearchPage;
import com.loop.utilities.utilities.BrowserUtilities;
import com.loop.utilities.utilities.ConfigurationReader;
import com.loop.utilities.utilities.DocuportConstants;
import com.loop.utilities.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import javax.swing.plaf.IconUIResource;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GoogleSearchStepDefs {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

    }

    @When("user types Loop Academy in the google search box and clicks enter")
    public void user_types_loop_academy_in_the_google_search_box_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("Loop Academy" + Keys.ENTER);
        BrowserUtilities.takeScreenshot();
    }

    @Then("user should see Loop Academy - Google Search in the google title")
    public void user_should_see_loop_academy_google_search_in_the_google_title() {
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals("expected does not match the actual", "Loop Academy - Google Search", actualTitle);
    }


    @Then("user should see {string} in the google title")
    public void user_should_see_in_the_google_title(String title) {
        assertEquals("expected does not match actual", title, Driver.getDriver().getTitle());

    }

    @When("user types {string} in the google search box and clicks enter")
    public void user_types_in_the_google_search_box_and_clicks_enter(String input) {
        googleSearchPage.searchBox.sendKeys(input + Keys.ENTER);
    }
    @Then("user searches the following item")
    public void user_searches_the_following_item(List<String> items) {
//        items.forEach (p-> {
//            googleSearchPage.searchBox.clear();
//            googleSearchPage.searchBox.sendKeys(p+Keys.ENTER);
//assertEquals(p+" - Google Search", Driver.getDriver().getTitle());
//        });

        for (String s : items) {
            googleSearchPage.searchBox.clear();
            googleSearchPage.searchBox.sendKeys(s + Keys.ENTER);
            assertEquals(s + " - Google Search", Driver.getDriver().getTitle());
        }

    }
        @When("user searches for the {string}")
        public void user_searches_for_the(String country) {
            googleSearchPage.searchBox.sendKeys("What is the capital of " + country + Keys.ENTER);
         //BrowserUtilities.justWait(DocuportConstants.small);
        }
        @Then("user should see the {string} in the result")
        public void user_should_see_the_in_the_result(String capital) {
        assertEquals("Expected capital city:" + capital + " does not match with actual: " + googleSearchPage.capital.getText(),googleSearchPage.capital.getText(),capital);

        }

    }
