package com.loop.step_definitions;

import com.loop.pages.SmartBearBasePage;
import com.loop.pages.SmartBearLoginPage;
import com.loop.pages.SmartBearOrderPage;
import com.loop.utilities.utilities.BrowserUtilities;
import com.loop.utilities.utilities.ConfigurationReader;
import com.loop.utilities.utilities.DocuportConstants;
import com.loop.utilities.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;



public class SmartBearStepDefs {
    SmartBearBasePage basePage = new SmartBearBasePage();
    SmartBearLoginPage loginPage = new SmartBearLoginPage();
    SmartBearOrderPage orderPage = new SmartBearOrderPage();

    Select dropdown;

    @Given("user is already logged in and navigated to {string} page")
    public void user_is_already_logged_in_and_navigated_to_order_page(String menuName) {
        Driver.getDriver().get(ConfigurationReader.getProperty("smart.bear.url"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("smart.username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("smart.password"));
        BrowserUtilities.waitForClickable(loginPage.loginButton, DocuportConstants.small).click();
        basePage.navigateMenu("Order");
    }


    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        dropdown = new Select(orderPage.selectProduct);
        dropdown.selectByValue("FamilyAlbum");
    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer quantity) {
        orderPage.quantity.sendKeys(Keys.BACK_SPACE);
        orderPage.quantity.sendKeys(quantity.toString() + Keys.ENTER);
        orderPage.quantity.click();
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        orderPage.customerName.sendKeys(string);
    }

    @When("user enters street {string}")
    public void user_enters_street(String string) {
        orderPage.street.sendKeys(string);
    }

    @When("user enters city {string}")
    public void user_enters_city(String string) {
        orderPage.city.sendKeys(string);
    }

    @When("user enters state {string}")
    public void user_enters_state(String string) {
        orderPage.state.sendKeys(string);
    }

    @When("user enters zip {string}")
    public void user_enters_zip(String string) {
        orderPage.zipCode.sendKeys(string);
    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
        orderPage.cardTypeAmEx.click();

    }

    @When("user enters credit car number {string}")
    public void user_enters_credit_car_number(String string) {
        orderPage.cardNumber.sendKeys(string);
    }

    @When("user enters expiration date {string}")
    public void user_enters_expiration_date(String string) {
        orderPage.cardExpDate.sendKeys(string);
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        BrowserUtilities.waitForClickable(orderPage.processButton, DocuportConstants.small).click();
        //orderPage.processButton.click();

    }

    @Then("user should see {string} in the first row of the table")
    public void user_should_see_in_the_first_row_of_the_table(String customerName) {
        orderPage.viewAllOrders.click();
        BrowserUtilities.takeScreenshot();
        assertEquals("The actual name" + orderPage.firstNameInOrderTable.getText() + " does not match the expected name: " + customerName,orderPage.firstNameInOrderTable.getText(),customerName);
//        String actual = orderPage.firstNameInOrderTable.getText();
//        String expected = "Chuck Norris";
//        Assert.assertEquals("Test Fail--> Actual does not match expected", expected, actual);

    }
}
