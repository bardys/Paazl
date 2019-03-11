package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.AbstractPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    private static final String BROWSER = System.getProperty("browser");

    @Before
    public void setUp(){
        if (BROWSER == null || BROWSER.equalsIgnoreCase("Firefox") || BROWSER.equalsIgnoreCase("")){
            this.driver = new FirefoxDriver();
        }else if (BROWSER.equalsIgnoreCase("Chrome")) {
            this.driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navigateTo(AbstractPage.BASE_URL);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    public void navigateTo(String url){
        driver.navigate().to(url);
    }

}
