package steps;

import components.Components;
import io.cucumber.java.en.*;

public class CrudApiSteps {

    Components components;

    @Given("que for acessado o endpoint {string}")
    public void queForAcessadoOEndpoint(String url) {
        components = new Components(url);
    }

    @When("seja efetuado o CREATE")
    public void sejaEfetuadoOCREATE() {
        components.postEndpoint();
    }

    @When("seja efetuado o UPDATED")
    public void sejaEfetuadoOUPDATED() {
        components.updateEndpoint();
    }

    @Then("seja efetuado o DELETE")
    public void sejaEfetuadoODELETE() {
        components.deleteEndpoint();
    }
}
