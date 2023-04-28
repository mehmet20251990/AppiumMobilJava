package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ApiCategoriesPage;
import pages.RadioButtonPage;
import utils.DriverManager;
public class RadioButtonPageSteps {
    RadioButtonPage radioButtonPage = new RadioButtonPage(DriverManager.getDriver());
    ApiCategoriesPage categoriesPage = new ApiCategoriesPage(DriverManager.getDriver());
    @Then("should see Title {string} on Radio Button Page")
    public void shouldSeeTitleOnRadioButtonPage(String title) {
        String currentTitle = radioButtonPage.getTitle();
        Assert.assertEquals(currentTitle, title);
    }
    @Given("user is on the Radio Button Page")
    public void userIsOnTheRadioButtonPage() {
        categoriesPage.clickCategory("Views");
        categoriesPage.clickCategory("Radio Group");
    }
    @Then("should see Radio Button {string} on Radio Button Page")
    public void shouldSeeRadioButtonOnRadioButtonPage(String radioButton) {
        radioButtonPage.checkRadioButton(radioButton);
    }
    @Then("should see Clear Button {string} on Radio Button Page")
    public void shouldSeeClearButtonOnRadioButtonPage(String button) {
        String currentButton = radioButtonPage.getClearButton();
        Assert.assertEquals(currentButton, button);
    }
    @When("taps to Radio Button {string} on Radio Button Page")
    public void tapsToRadioButtonOnRadioButtonPage(String radioButton) {
        radioButtonPage.clickRadioButton(radioButton);
    }
    @Then("should see Selected Text {string} on Radio Button Page")
    public void shouldSeeSelectedTextOnRadioButtonPage(String text) {
        String currentText = radioButtonPage.getSelectedText();
        Assert.assertTrue(currentText.contains(text));
    }
}