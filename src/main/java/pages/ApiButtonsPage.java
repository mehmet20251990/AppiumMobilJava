package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;
public class ApiButtonsPage {
    ElementHelper elementHelper;
    public ApiButtonsPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }
    By title = By.className("android.widget.TextView");
    By normalButton = By.id("io.appium.android.apis:id/button_normal");
    By smallButton = By.id("io.appium.android.apis:id/button_small");
    By switchButton = By.id("io.appium.android.apis:id/button_toggle");
    public String getTitle() {
        return elementHelper.getText(title);
    }
    public void checkButonsPage() {
        elementHelper.checkElement(title);
    }
    public void checkNormalButton() {
        elementHelper.checkElement(normalButton);
    }
    public String getTextNormalButton() {
        return elementHelper.getText(normalButton);
    }
    public String getTextSmallButton() {
        return elementHelper.getText(smallButton);
    }
    public String getTextSwitchButton() {
        return elementHelper.getText(switchButton);
    }
    public void clickSwitchButton() {
        elementHelper.click(switchButton);
    }
}
