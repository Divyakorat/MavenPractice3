package org.example;

import org.testng.asserts.SoftAssert;

public class RegisterSuccess extends Util {
    SoftAssert softAssert=new SoftAssert();
    private String expectedUrl="http://tutorialsninja.com/demo/index.php?route=account/success";
    public void registerSuccssMessage(){
        String actualUrl=driver.getCurrentUrl();
        softAssert.assertEquals((actualUrl),expectedUrl,"expected with actual");

    }

}
