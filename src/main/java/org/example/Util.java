package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class Util extends BasePage {
    public static void waituntilElementIsclickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);

        wait.until(elementToBeClickable(by));

    }

    //reusable method to click on elements
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //reusable method to type text elements
    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //reusable method to get text from elements
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //Time stamp
    public static long timestamp() {
        return (System.currentTimeMillis());

    }

    //reusable method for select from dropdown by visible text
    public static void selectFromDropDownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static String getUrl() {
        return driver.getCurrentUrl();
    }

    public static void JavaScriptclickonElement(By by) { //reusable method for click on element in case of other clickble method not work
        WebElement element = driver.findElement(by);
        JavascriptExecutor javascript = (JavascriptExecutor) driver;
        javascript.executeScript("arguments[0].click();", element);

    }
}