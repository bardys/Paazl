package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage extends AbstractPage {
    public By workAndEducationLoc = By.xpath("//span[text()='Work and Education']");
    public By optionDropdownLoc = By.xpath("//i[@class='_4rmq img sp_NSPVWWcQuqd_1_5x sx_f06746']");
    public By deleteOptionLoc = By.xpath("//span[text()='Delete']");
    public By removeRadioBtnLoc = By.xpath("//label[text()='Remove Paazl']//parent::label");
    public By saveworkplaceChangeLoc = By.xpath("//button[text()='Save']");


    public By addWorkplaceLoc = By.xpath("(//i[@class='_u09 img sp_NSPVWWcQuqd_1_5x sx_4a13ca'])[1]");
    public By companyFieldLoc = By.xpath("//input[@placeholder='Where have you worked?']");


    public AboutPage(WebDriver driver) {
        super(driver);
    }

    public AboutPage workAndeducationSection() {
        WebElement workAndEducation = driver.findElement(workAndEducationLoc);
        workAndEducation.click();
        return this;
    }

    public AboutPage removeWorkplace() throws InterruptedException {
        WebElement optionDropdown = driver.findElement(optionDropdownLoc);
        optionDropdown.click();

        WebElement deleteOption = driver.findElement(deleteOptionLoc);
        deleteOption.click();

        Thread.sleep(5000);

        WebElement removeRadioBtn = driver.findElement(removeRadioBtnLoc);
        removeRadioBtn.click();

        WebElement saveworkplaceChange = driver.findElement(saveworkplaceChangeLoc);
        saveworkplaceChange.click();

        return this;

    }
}
