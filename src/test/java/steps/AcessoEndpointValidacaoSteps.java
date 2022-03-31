package steps;

import components.Components;
import io.cucumber.java.en.*;

public class AcessoEndpointValidacaoSteps {
    Components components;

    @Given("que seja acessado API {string}")
    public void queSejaAcessadoAPI(String url) {
        components = new Components(url);
//        components.endpointReturn();
    }
    @When("for validado o valor do campo name que seja igual a {string}")
    public void forValidadoOValorDoCampoNameQueSejaIgualA(String value) {
        components.validationPath("data.first_name", value);
    }
    @Then("efetuado o teste de contrato ou schema")
    public void efetuadoOTesteDeContratoOuSchema() {
        components.validationSchema();
    }
}
