package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.AboutPage;
import pages.AccountPage;
import pages.LoginPage;
import pages.MainPage;

public class WorkAndEducationTests extends BaseTest {

    @Test
    public void deleteWokplace() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.login();
        AccountPage accountPage = mainPage.openAccountPage();
        AboutPage aboutPage = accountPage.openAboutPage();
        aboutPage.workAndeducationSection();
        aboutPage.removeWorkplace();

        Thread.sleep(5000);

        By workplaceLoc = By.xpath("//a[text()='Paazl']");

        Assert.assertFalse(isElementPresent(workplaceLoc));

    }

    public boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

}
