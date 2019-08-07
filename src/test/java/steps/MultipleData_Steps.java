package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.Driver;

import java.util.List;

public class MultipleData_Steps {
    @Given("User goes on amazon")
    public void user_goes_on_amazon() {
       Driver.getDriver().get("https://amazon.com");
    }

    @Given("User verifies following search departments")
    public void user_verifies_following_search_departments(List<String> options) {
        System.out.println(options.size());
        System.out.println(options);
    }

    @Then("User closes the amazon")
    public void user_closes_the_amazon() {
        Driver.quitDriver();
    }

}
