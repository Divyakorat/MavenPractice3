package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class LapTopsNotebooks extends Util {
    private By _MacBookAddToCart=By.xpath("//div[@class=\"row\"]/div[2]/div/div[2]/div[2]/button[1]");


    public void userAbleToSeeAddToCartButtonOnAllProduct() {
        List<WebElement> productlist = driver.findElements(By.xpath("//div[@class=\"row\"]/div/div/div[2]/div[2]/button[1]"));
        System.out.println(productlist.size());
//get each product name
        for (WebElement product : productlist) {
            System.out.println(product.getText());

        }
    }
    public void userclickonmacbookaddtocartbutton(){
        clickOnElement(_MacBookAddToCart);
    }

}