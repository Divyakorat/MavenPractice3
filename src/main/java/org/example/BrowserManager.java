package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util{
    public static LoadProp loadProp=new LoadProp();
    public static String browser=loadProp.getProperty("Browser");
    public void chromeBrowser(){


        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\BrowserDrivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(loadProp.getProperty("Url"));

    }
    public void closeBrowser(){
        driver.close();
    }

}
