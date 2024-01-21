package com.loop.pages;

import com.loop.utilities.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    public void clickCategory (String category) throws InterruptedException {
        Thread.sleep(5000);
        Driver.getDriver().findElement(By.xpath("//a[contains(.,'" + category + "')]")).click();

        }



        public String getProductPrice(String productName) throws InterruptedException  {
        Thread.sleep(5000);
           // return Driver.getDriver().findElement(By.xpath("//a[contains(.,'" + productName + "')]/..//following-sibling::h5")).getText();
            String actualPrice = Driver.getDriver().findElement(By.xpath("//a[normalize-space(.)='"+productName+"']/../../h5")).getText();
            return actualPrice.substring(1);
        }


    public ProductPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
}

