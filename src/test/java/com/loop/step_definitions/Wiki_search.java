package com.loop.step_definitions;

import com.loop.pages.Wikipedia_search;
import com.loop.utilities.utilities.BrowserUtilities;
import com.loop.utilities.utilities.ConfigurationReader;
import com.loop.utilities.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;

public class Wiki_search {

    Wikipedia_search wikipedia_search = new Wikipedia_search();

    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wikipedia.url"));
        BrowserUtilities.takeScreenshot();
    }

    @When("user types {string} in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box(String input) {
        wikipedia_search.searchBox.sendKeys(input);
    }

    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipedia_search.searchBox.sendKeys(Keys.ENTER);
        BrowserUtilities.takeScreenshot();
    }

    @Then("user sees {string} is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title(String title) {
        String actualTitle = wikipedia_search.wikiTitle.getText();
        assertEquals("Test Fail --> expected does not match the actual", title, actualTitle);
    }

    @Then("user sees {string} is in the wiki header")
    public void user_sees_steve_jobs_is_in_the_wiki_header(String header) {
        String actualHeader = wikipedia_search.wikiHeader.getText();
        assertEquals("Test Fail --> expected does not match the actual", header, actualHeader);

    }
    @Then("user sees {string} is in the image header")
    public void user_sees_steve_jobs_is_in_the_image_header(String imagerHeader) {
String actualHeader = wikipedia_search.imageHeader.getText();
        Assert.assertEquals("Test Fail --> expected does not match the actual", imagerHeader, actualHeader + " - Wikipedia");
    }

}
