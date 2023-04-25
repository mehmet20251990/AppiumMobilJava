package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ApiCategoriesPage;
import utils.DriverManager;
public class ApiCategoriesPageSteps {
    ApiCategoriesPage categoriesPage = new ApiCategoriesPage(DriverManager.getDriver());
    @Given("user should see the CategoriesPage")
    public void userShouldSeeTheCategoriesPage() {

    }
    @When("taps {string} on CategoriesPage")
    public void tapsOnCategoriesPage(String category) {

    }
}
