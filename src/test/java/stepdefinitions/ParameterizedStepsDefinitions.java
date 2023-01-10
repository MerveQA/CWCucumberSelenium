package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterizedStepsDefinitions {
    @When("Kullanici {string} arattiginda")
    public void kullaniciArattiginda(String arg0) {
    }

    @Then("Kullanici title da {string} gormelidir")
    public void kullaniciTitleDaGormelidir(String arg0) {
    }
}
