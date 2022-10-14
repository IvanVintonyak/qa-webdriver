package ua.it.ui.browser.singleton;

public class WebDriverProviderLazy {
    private static  WebDriverProviderLazy instance;
    private  Object driver;

    private WebDriverProviderLazy () {
        driver = new Object();

    }
    public static WebDriverProviderLazy getInstance(){
        if (instance == null){
            instance = new WebDriverProviderLazy();

        }
        return instance;
    }

    public Object getDriver(){
        return driver;
    }
}
