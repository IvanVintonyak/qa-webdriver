package ua.it.ui.browser;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WebDriverProviderLazy lazy =   WebDriverProviderLazy.getInstance();
        Object driver =  lazy.getDriver();

        System.out.println(driver);
        WebDriverProviderLazy lazy1 =   WebDriverProviderLazy.getInstance();
        Object driver1 =  lazy.getDriver();

        System.out.println(driver1);
        WebDriverProviderLazy lazy2 =   WebDriverProviderLazy.getInstance();
        Object driver2 =  lazy.getDriver();

        System.out.println(driver2);
    }
}
