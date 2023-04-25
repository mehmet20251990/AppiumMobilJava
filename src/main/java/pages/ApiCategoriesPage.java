package pages;

import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ApiCategoriesPage {
    ElementHelper elementHelper;
    public ApiCategoriesPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

}
