package com.loop.pages;

import com.loop.utilities.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearBasePage {
    //Base page will contain all the common elements that appear on all pages,eg.logo, side bar, account setting logo, etc.
//Create a constructor
//Call PageFactory that helps to initialize webElements
public SmartBearBasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//ul[@id='ctl00_menu']//a")
        List <WebElement> menuList;
public void navigateMenu (String menuName) {
    for (WebElement each:menuList){
        if (each.getText().equals(menuName)) {
            each.click();
        }
    }
}

@FindBy (xpath="//h1[.='Web Orders']")
    public WebElement logo;

@FindBy (xpath ="//div[@class='login_info']")
    public WebElement welcomeMessage;

@FindBy (xpath = "//a[@id='ctl00_logout']")
    public WebElement logOutButton;

}

