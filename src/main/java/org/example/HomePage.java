package org.example;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class HomePage extends Util {
    private By _myAccount=By.xpath("//a[@title=\"My Account\"]");
    private By _Register=By.xpath("//a[text()=\"Register\"]");
    private String _ExpectedURL="http://tutorialsninja.com/demo/";
    SoftAssert softAssert=new SoftAssert();
    private By _PhoneAndPDS=By.linkText("Phones & PDAs");
   // private String ExpectedUrlHomePage="http://tutorialsninja.com/demo/";
    private By _PhoneAndPDAs=By.xpath("//a[text()=\"Phones & PDAs\"]");
   // private By _LapTopsNotebooks=By.linkText("Laptops & Notebooks");
   // private By _ShowAllLaptops=By.linkText()
   private By _laptopsNotebooks = By.linkText("Laptops & Notebooks");
    private By _showAllLaptopsNotebooks = By.linkText("Show All Laptops & Notebooks");
    public void verifyUserIsOnHomePage(){
        String ActualUrl=driver.getCurrentUrl();
        softAssert.assertEquals((ActualUrl),_ExpectedURL,"expected with Actual");
    }


    public void userClickOnMyAccount(){
        clickOnElement(_myAccount);
        //clickOnElement(_Register);
    }

    public void userclickonregister() {
        clickOnElement(_Register);
    }
    public void userClickOnCategoryLink(String categoryLink){
        clickOnElement(By.linkText(categoryLink));
    }
    public void clickOnPhoneAndPDAS(){
        clickOnElement(_PhoneAndPDS);

    }
    public void userClickOnLapTopsNotebook(){
        clickOnElement(_laptopsNotebooks);}
        public void userClickOnShowAllLaptopsNotebooks(){

        clickOnElement(_showAllLaptopsNotebooks);
    }

}
