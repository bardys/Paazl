package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage extends AbstractPage {
    public By aboutTabLoc = By.xpath("//a[text()='About']");

    public AccountPage (WebDriver driver){
        super(driver);
    }

    public AboutPage openAboutPage (){
        WebElement aboutTab = driver.findElement(aboutTabLoc);
        aboutTab.click();
        return new AboutPage(driver);
    }
}
