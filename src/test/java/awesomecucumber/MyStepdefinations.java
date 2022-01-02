package awesomecucumber;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MyStepdefinations {

    @Given("I am on Store page")
    public void i_am_on_store_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I add {string} to the cart")
    public void i_add_to_the_cart(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I see {int} {string} to the cart")
    public void i_see_to_the_cart(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Please Take my credentials")
    public void takeMyCredentials(DataTable dataTable){
        List<String> creds=dataTable.asList();
        System.out.println("Username= "+ creds.get(0) + "And Password is " + creds.get(1));


    }

}
