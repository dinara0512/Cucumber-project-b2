package com.loop.pages;

import com.loop.utilities.utilities.BrowserUtilities;
import com.loop.utilities.utilities.DocuportConstants;
import com.loop.utilities.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocuportLoginPage extends DocuportBasePage{

    @FindBy(className = "v-btn__content" )
    public WebElement loginButton;
    @FindBy(xpath = "//input[@id='input-14']")
    public WebElement loginInput;

    @FindBy(xpath = "//input[@id='input-15']")
    public WebElement passwordInput;


    @FindBy(xpath = "//button[@type='submit']//span")
    public WebElement continueButton;

    @FindBy(xpath = "//span[@class='body-1 white--text']")
    public WebElement homePage;


    public void loginDocuport(String username, String password){
        //BrowserUtilities.waitForVisibility(loginInput, DocuportConstants.small);
        loginInput.clear();
        loginInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        loginButton.click();
        if (BrowserUtilities.waitForVisibility(continueButton, DocuportConstants.small).isDisplayed()){
            continueButton.click();
        }
    }
    //    @FindBy(xpath = "//label[text()='Username or email']/following-sibling::input")
//    public WebElement emailBox;
//
//    @FindBy(xpath = "//label[text()='Password']/following-sibling::input")
//    public WebElement passwordBox;




//    public void login ( String userType) {
//
//        String username  = ConfigurationReader.getProperty(userType+"_username");
//        String password  = ConfigurationReader.getProperty(userType+"_password");
//
//
//        emailBox.sendKeys(username);
//        passwordBox.sendKeys(password);
//        loginButton.click();
//
//    }

    //    @FindBy(xpath = "//button[@type='submit']")
//    public WebElement loginButton;



}
