package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ApiCategoriesPage;
import pages.PopupMenuPage;
import utils.DriverManager;
public class PopupMenuPageSteps {
    PopupMenuPage popupMenuPage = new PopupMenuPage(DriverManager.getDriver());
    ApiCategoriesPage categoriesPage = new ApiCategoriesPage(DriverManager.getDriver());
    @Then("should see Title {string} on Popup Menu Page")
    public void shouldSeeTitleOnPopupMenuPage(String title) {
        String currentTitle = popupMenuPage.getTitle();
        Assert.assertEquals(currentTitle, title);
    }
    @Given("user is on the Popup Menu Page")
    public void userIsOnThePopupMenuPage() {
        categoriesPage.clickCategory("Views");
        categoriesPage.clickCategory("Popup Menu");
    }
    @Then("should Make Popup Button {string} on Popup Menu Page")
    public void shouldMakePopupButtonOnPopupMenuPage(String button) {
        String currentButton = popupMenuPage.getMakePopupButtonText();
        Assert.assertEquals(currentButton, button);
    }
    @When("taps Make Popup Button on Popup Menu Page")
    public void tapsMakePopupButtonOnPopupMenuPage() {
        popupMenuPage.clickMakePopupButton();
    }
    @Then("should see Popup Element {string} on Popup Menu Page")
    public void shouldSeePopupElementOnPopupMenuPage(String popupElement) {
        popupMenuPage.checkPopupElement(popupElement);
    }
    @When("taps Popup Element {string} on Popup Menu Page")
    public void tapsPopupElementOnPopupMenuPage(String popupElement) {
        popupMenuPage.clickPopupElement(popupElement);
    }
    @Then("should see Popup Menu Title {string} on Popup Menu Page")
    public void shouldSeePopupMenuTiteOnPopupMenuPage(String title) {
        String currentTitle = popupMenuPage.getPopupTitle();
        Assert.assertEquals(currentTitle, title);
    }
}