package com.loop.step_definitions;

import com.loop.pages.DocuportBasePage;
import com.loop.pages.DocuportClientsPage;
import com.loop.pages.DocuportLoginPage;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;

public class ClientsStepdefs {

  DocuportClientsPage clientPage = new DocuportClientsPage();
 DocuportLoginPage docuportLoginPage = new DocuportLoginPage();
 DocuportBasePage docuportBasePage = new DocuportBasePage();

  private SoftAssertions softAssertions = new SoftAssertions();

  private static final org.apache.logging.log4j.Logger LOG = org.apache.logging.log4j.LogManager.getLogger();
  @Then("user validates {string} text is displayed")
  public void user_validates_text_is_displayed(String text) {
    //assertTrue(loginPage.getElement(text).isDisplayed());
    //String actual = DocuportBasePage.get;
    // assertEquals("Actual text: " + actual + " does NOT match expected: " + text, actual, text);
    //softAssertions.assertThat(actual).isEqualTo(text);
  }


  @Then("user clicks {string} button")
  public void user_clicks_button(String button) {
    clientPage.clickButton(button);
  }
}


