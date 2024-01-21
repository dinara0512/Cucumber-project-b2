package com.loop.pages;

import com.loop.utilities.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage extends SmartBearBasePage{

//because it is a child class of BasePage there is no need to call a new constructor to initialize WebElements
    @FindBy(xpath = "//input[@name='ctl00$MainContent$username']")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement loginButton;
}
