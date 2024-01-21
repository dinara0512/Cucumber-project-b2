package com.loop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SmartBearOrderPage extends SmartBearBasePage {

    @FindBy(xpath = "//a[text()='View all orders' ]")
    public WebElement viewAllOrders;

    @FindBy(xpath = "//a[@href='Process.aspx']")
    public WebElement order;

    @FindBy(xpath = "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement selectProduct;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']")
    public WebElement quantity;

    @FindBy(xpath = "//input[@value='Calculate'] ")
    public WebElement calculateButton;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtName']")
    public WebElement customerName;

    @FindBy(xpath = " //input[@name='ctl00$MainContent$fmwOrder$TextBox2']")
    public WebElement street;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox3']")
    public WebElement city;

    @FindBy(xpath = "//input[@name ='ctl00$MainContent$fmwOrder$TextBox4']")
    public WebElement state;

    @FindBy(xpath = "//input[@name = 'ctl00$MainContent$fmwOrder$TextBox5']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement cardTypeVisa;

    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement cardTypeAmEx;


    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox6']")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")
    public WebElement cardExpDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(xpath = "//div[@class='buttons_process']/strong")
    public WebElement successMessage;

    @FindBy(xpath = "//td[text()='Chuck Norris']")
    public WebElement firstNameInOrderTable;
}



