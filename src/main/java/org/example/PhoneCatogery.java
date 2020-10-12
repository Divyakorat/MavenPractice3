package org.example;

import org.openqa.selenium.By;

public class PhoneCatogery extends Util{
    private By _HTCTouchHDAddToCart = By.xpath("//div[@class=\"row\"]/div[1]/div[1]/div[2]/div[2]/button/span");
    //private By _HTCTouchHDAddToCart=By.xpath("//div[@class=&quot;row&quot;]/div[1]/div[1]/div[2]/div[2]/button/span");
   // private By _iPhoneAddToCart=By.xpath("//div[@class=&quot;row&quot;]/div[2]/div[1]/div[2]/div[2]/button/span");
    private By _iPhoneAddToCart = By.xpath("//div[@class=\"row\"]/div[2]/div[1]/div[2]/div[2]/button/span");
    //private By _shopingCart=By.linkText("Shopping Cart");
    private By _shoppingCart = By.xpath("//span[text()=\"Shopping Cart\"]");

    public void userAbleToAddToCartBothProductSuccsfully() {
        //waituntilElementIsclickable(_HTCTouchHDAddToCart,20);
       // JavaScriptclickonElement(_HTCTouchHDAddToCart);
        clickOnElement(_HTCTouchHDAddToCart);
    }
    public void userabletoaddproductSuccessfully(){
       // waituntilElementIsclickable(_iPhoneAddToCart,20);
       // JavaScriptclickonElement(_iPhoneAddToCart);
        clickOnElement(_iPhoneAddToCart);
    }
    public void userAbleToClickOnShoppingCartButton(){
        clickOnElement(_shoppingCart);

    }
}
