package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;
public class SearchViewPage {
    ElementHelper elementHelper;
    By title = By.className("android.widget.TextView");
    By searchArea = By.id("android:id/search_src_text");
    By searchButton = By.id("io.appium.android.apis:id/action_search");
    By result = By.id("io.appium.android.apis:id/txt_query");
    public SearchViewPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }
    public String getTitle() {
        return elementHelper.getText(title);
    }
    public String getResult() {
        return elementHelper.getText(result);
    }
    public void sendKeySearchArea(String text) {
        elementHelper.sendKeys(searchArea, text);
        elementHelper.pressEnter();
    }
    public void clickSearchButton() {
        elementHelper.click(searchButton);
    }
    public void checkSearchButton() {
        elementHelper.checkElement(searchButton);
    }
}