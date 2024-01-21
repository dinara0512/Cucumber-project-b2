package com.loop.pages;

import com.loop.utilities.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DocuportBasePage {
    public DocuportBasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='v-list-item__title']//span")
    List<WebElement> allModules;



    @FindBy (xpath = "//div[@class='v-data-footer__pagination']")
    WebElement totalResultCount; //1-10 of 869



    public void navigateModule (String moduleName) {
        for (WebElement each : allModules) {
            if(each.getText().equals(moduleName)){
                each.click();
            }
        }
    }
}
