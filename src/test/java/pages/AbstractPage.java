package pages;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
    public static final String BASE_URL = "https://www.facebook.com/a.bardys";
    public WebDriver driver;

    public AbstractPage(WebDriver driver){
        this.driver = driver;
    }
}
