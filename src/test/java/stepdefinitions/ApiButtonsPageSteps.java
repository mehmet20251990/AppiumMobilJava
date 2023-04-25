package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.ApiButtonsPage;
import pages.ApiCategoriesPage;
import utils.DriverManager;
public class ApiButtonsPageSteps {
    ApiButtonsPage categoriesPage = new ApiButtonsPage(DriverManager.getDriver());
    @Then("should see Buttons Page")
    public void shouldSeeButtonsPage() {

    }
}
