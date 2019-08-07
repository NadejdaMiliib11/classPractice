package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.EtsyHomePage;
import utilities.Config;
import utilities.Driver;

public class Etsy_Steps {
    EtsyHomePage etsyHomePage = new EtsyHomePage();
    @Given("User is on Etsy Homepage")
    public void user_is_on_Etsy_Homepage() {
        Driver.getDriver().get(Config.getProperties("etsyURL"));
    }

    @When("User types {string} in the search box")
    public void user_types_wooden_spoon_in_the_search_box(String string) {
     etsyHomePage.searchBox.sendKeys(string);
    }

    @When("User clicks seach button")
    public void user_clicks_seach_button() {
     etsyHomePage.searchBoxButton.click();
    }

    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = string+" | Etsy";
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
    }

}
