package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.WikipediaHomePage;
import utilities.Config;
import utilities.Driver;

public class Wikipedia_Steps {
    WikipediaHomePage wikipediaHomePage = new WikipediaHomePage();
    @Given("User is on Wikipedia Home Page")
    public void user_is_on_Wikipedia_Home_Page() {
        Driver.getDriver().get(Config.getProperties("wikipediaURL"));
    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        wikipediaHomePage.searchBox.sendKeys(string);

    }
    @When("User clicks search button")
    public void user_clicks_search_button() {
    wikipediaHomePage.searchButton.click();
    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().equalsIgnoreCase(string+" - Wikipedia"));
    }
    @Then("User sees {string} is in the main header")
    public void user_sees_Steve_Jobs_is_in_the_main_header(String string) {
        Assert.assertTrue(wikipediaHomePage.mainHeader.getText().equalsIgnoreCase(string));
    }
    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String string) {
        Assert.assertTrue(wikipediaHomePage.imageHeader.getText().equalsIgnoreCase(string));
    }



}
