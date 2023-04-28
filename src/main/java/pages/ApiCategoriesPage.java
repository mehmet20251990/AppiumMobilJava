package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;
public class ApiCategoriesPage {
    ElementHelper elementHelper;
    public ApiCategoriesPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }
    By title = By.id("android:id/action_bar");
    By categories = By.id("android:id/text1");
    public void checkCategoriesPage() {
        elementHelper.checkElement(title);
    }
    public void clickCategory(String category) {
        elementHelper.clickElementWithText(categories,category);
    }
}
