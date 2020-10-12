package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCart extends Util{
    private By _HTCTouchHDAddToCartAddSuccessfully=By.xpath("//div[@class=&quot;table-responsive&quot;]/table/tbody/tr[1]/td[2]/a");
    private By _iPhoneAddToCartAddSuccessfully=By.xpath("//div[@class=&quot;table-responsive&quot;]/table/tbody/tr[2]/td[2]/a");
    private By _shopingCart=By.linkText("Shopping Cart");
    String expectedText1="HTC Touch HD";
    String expectedText2="iPhone";
    private String expectedText= "MacBook";
    private By actualText= By.linkText("MacBook");
    public void userAbleToClickOnShoppingCartButton(){
        clickOnElement(_shopingCart);

    }


    public void verifyUserCanAbleToSeeOnShoppingCartButton(){
        Assert.assertEquals(_HTCTouchHDAddToCartAddSuccessfully,expectedText1);
        Assert.assertEquals(_iPhoneAddToCartAddSuccessfully,expectedText2);

    }
    public void userabletoseeproductinshoppingcartsucessfully(){
        Assert.assertEquals(getTextFromElement(actualText),expectedText);
    }

}
