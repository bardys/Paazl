package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends AbstractPage {

    By profileBtnLoc = By.xpath("//a[@title='Profile']");

    public MainPage (WebDriver driver){
        super(driver);
    }

    public AccountPage openAccountPage(){
        WebElement profileBtn = driver.findElement(profileBtnLoc);
        profileBtn.click();

        return new AccountPage(driver);
    }
}
