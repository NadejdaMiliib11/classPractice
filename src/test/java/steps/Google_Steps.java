package steps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Driver;

public class Google_Steps {
    @When("User is on Google search page")
    public void user_is_on_Google_search_page() {

        Driver.getDriver().get("https://google.com");
    }

    @When("User searches for apples")
    public void user_searches_for_apples() {
        Driver.getDriver().findElement(By.name("q")).sendKeys("apples"+ Keys.ENTER);
    }

    @Then("User should see apples inside of the title")
    public void user_should_see_apples_inside_of_the_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("apples"));
    }
    @When("User searches for a word {string}")
    public void user_searches_for_a_word(String word) {
        Driver.getDriver().findElement(By.name("q")).sendKeys(word+ Keys.ENTER);
        Assert.fail();
    }

    @Then("User should see a word {string} inside of the title")
    public void user_should_see_a_word_inside_of_the_title(String word) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(word));
    }

}

