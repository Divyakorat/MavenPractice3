package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepDef {
    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    RegisterSuccess registerSussess=new RegisterSuccess();
    PhoneCatogery phoneCatogery = new PhoneCatogery();
    ShoppingCart shoppingCart=new ShoppingCart();
    LapTopsNotebooks lapTopsNotebooks=new LapTopsNotebooks();
    @Given("^User is on homepage$")
    public void user_is_on_homepage()  {
        homePage.verifyUserIsOnHomePage();


    }

    @When("^user click on my Account$")
    public void user_click_on_my_Account()  {
        homePage.userClickOnMyAccount();


    }

    @When("^user click on register$")
    public void user_click_on_register()  {
        homePage.userclickonregister();

    }

    @When("^user Enter all details$")
    public void user_Enter_all_details()  {
        registerPage.UserEnterRegistrationDetails();

    }

    @Then("^user should be able see success message successfully$")
    public void user_should_be_able_see_success_message_successfully()  {
        registerSussess.registerSuccssMessage();

    }
    @Given("^user is on homepage$")
    public void user_is_on_homepage2()  {
        homePage.verifyUserIsOnHomePage();

    }

    @When("^user click on \"([^\"]*)\" link on top menu$")
    public void user_click_on_link_on_top_menu(String categoryLink) {
        homePage.userClickOnCategoryLink(categoryLink);

    }

    @Then("^user should be navigate to category \"([^\"]*)\" successfully$")
    public void user_should_be_navigate_to_category_successfully(String expectedURL)  {
        Assert.assertEquals(Util.getUrl(),expectedURL);

    }
    @When("^user click on PhoneAndPDS$")
    public void user_click_on_PhoneAndPDS()  {
        homePage.clickOnPhoneAndPDAS();

    }

    @When("^user click on HTCTouchHDAddToCart button$")
    public void user_click_on_HTCTouchHDAddToCart_button()  {
        phoneCatogery.userAbleToAddToCartBothProductSuccsfully();

    }

    @When("^user click on iPhoneAddToCart button$")
    public void user_click_on_iPhoneAddToCart_button()  {
        phoneCatogery.userabletoaddproductSuccessfully();

    }

    @When("^user click on Shopping cart button$")
    public void user_click_on_Shopping_cart_button()  {
        shoppingCart.userAbleToClickOnShoppingCartButton();

    }

    @Then("^user should be able to see both product in shopping cart$")
    public void user_should_be_able_to_see_both_product_in_shopping_cart()  {
        shoppingCart.verifyUserCanAbleToSeeOnShoppingCartButton();

    }
    @When("^user click and see laptopd & Notebook category$")
    public void user_click_and_see_laptopd_Notebook_category()  {
        homePage.userClickOnLapTopsNotebook();

    }

    @When("^user can see all add to cart button on all laptops product$")
    public void user_can_see_all_add_to_cart_button_on_all_laptops_product() {
        homePage.userClickOnShowAllLaptopsNotebooks();

    }

    @When("^user click on selected add to cart button$")
    public void user_click_on_selected_add_to_cart_button()  {
        lapTopsNotebooks.userclickonmacbookaddtocartbutton();
        shoppingCart.userAbleToClickOnShoppingCartButton();

    }

    @Then("^user able to see and add product to add cart button successfully$")
    public void user_able_to_see_and_add_product_to_add_cart_button_successfully()  {
        shoppingCart.userabletoseeproductinshoppingcartsucessfully();

    }



}
