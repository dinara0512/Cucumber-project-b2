package com.loop.pages;

import com.loop.utilities.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia_search {
    @FindBy (xpath = "//input[@id='searchInput']")
    public WebElement searchBox;

    @FindBy (xpath= "//button[@type='submit']")
    public WebElement submitButton;

 @FindBy (xpath = "//h1[@id='firstHeading']")
 public WebElement wikiTitle;

 @FindBy (xpath = "//span[@class='mw-page-title-main']")
 public WebElement wikiHeader;

 @FindBy (xpath = "//div[@style='display:inline-block']")
 public WebElement imageHeader;

    public Wikipedia_search() {
        PageFactory.initElements(Driver.getDriver(),this);}
    }

