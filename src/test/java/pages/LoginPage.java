package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {
    By loginLoc = By.id("email");
    By passwordLoc = By.id("pass");
    By loginBtnLoc = By.id("u_0_2");

    public LoginPage (WebDriver driver){
        super(driver);
    }

    public MainPage login(){
        WebElement login = driver.findElement(loginLoc);
        login.sendKeys("login");

        WebElement password = driver.findElement(passwordLoc);
        password.sendKeys("password");

        WebElement loginBtn = driver.findElement(loginBtnLoc);
        loginBtn.click();

        return new MainPage(driver);
    }
}
