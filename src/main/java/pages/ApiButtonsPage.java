package pages;

import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ApiButtonsPage {
    ElementHelper elementHelper;
    public ApiButtonsPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

}
