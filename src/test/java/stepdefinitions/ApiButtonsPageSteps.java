package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ApiButtonsPage;
import pages.ApiCategoriesPage;
import utils.DriverManager;
public class ApiButtonsPageSteps {
    ApiButtonsPage buttonsPage = new ApiButtonsPage(DriverManager.getDriver());
    ApiCategoriesPage categoriesPage = new ApiCategoriesPage(DriverManager.getDriver());
    @Then("should see Title {string} on Buttons Page")
    public void shouldSeeTitleOnButtonsPage(String title) {
        String currentTitle = buttonsPage.getTitle();
        Assert.assertEquals(currentTitle, title);
    }
    @Given("user is on the Buttons Page")
    public void userIsOnTheButtonsPage() {
        categoriesPage.clickCategory("Views");
        categoriesPage.clickCategory("Buttons");
        buttonsPage.checkButonsPage();
    }
    @Then("should Normal Button {string} on Buttons Page")
    public void shouldNormalButtonOnButtonsPage(String button) {
        String currentButton = buttonsPage.getTextNormalButton();
        Assert.assertEquals(currentButton,button);
    }
    @Then("should Small Button {string} on Buttons Page")
    public void shouldSmallButtonOnButtonsPage(String button) {
        String currentButton = buttonsPage.getTextSmallButton();
        Assert.assertEquals(currentButton,button);
    }
    @Then("should Switch Button {string} on Buttons Page")
    public void shouldSwitchButtonOnButtonsPage(String button) {
        String currentButton = buttonsPage.getTextSwitchButton();
        Assert.assertEquals(currentButton,button);
    }
    @When("taps Switch Button on Buttons Page")
    public void tapsSwitchButtonOnButtonsPage() {
        buttonsPage.clickSwitchButton();
    }
}
