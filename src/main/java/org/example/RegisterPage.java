package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Util {
    private By _firstName=By.xpath("//input[@name=\"firstname\"]");
    private By _lastName=By.xpath("//input[@name=\"lastname\"]");
    private By _Email=By.xpath("//input[@name=\"email\"]");
    private By _Telephone=By.xpath("//input[@name=\"telephone\"]");
    private By _Password=By.xpath("//input[@name=\"password\"]");
    private By _ConfirmPassword=By.xpath("//input[@name=\"confirm\"]");
    private By _NewSelter=By.xpath("//div[@class=\"col-sm-10\"]/label[2]/input");
    private By _PrivacyPolicy=By.xpath("//input[@name=\"agree\"]");
    private By _ContinueButton=By.xpath("//input[@type=\"submit\"]");
    LoadProp loadProp=new LoadProp();
    public void UserEnterRegistrationDetails(){
        typeText(_firstName,loadProp.getProperty("FirstName"));
        typeText(_lastName,loadProp.getProperty("LastName"));
        typeText(_Email,loadProp.getProperty("Email"));
        typeText(_Telephone,loadProp.getProperty("Telephone"));
        typeText(_Password,loadProp.getProperty("Password"));
        typeText(_ConfirmPassword,loadProp.getProperty("ConfirmPassword"));
        clickOnElement(_PrivacyPolicy);
        clickOnElement(_ContinueButton);

    }

}
