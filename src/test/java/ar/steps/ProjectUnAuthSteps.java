package ar.steps;

import ar.validator.ProjectValidator;
import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;

public class ProjectUnAuthSteps extends PageSteps {

    @Given("Que tengo mi cuenta en clockify y mi X-Api-Key generada")
    public void apiKeyGenerated(){
        BaseService.PARAMS.get().put("api-key", PropertyManager.getProperty("valid-api-key"));
    }

    @Then("Obtengo los datos de mi Workspace")
    public void obtengoLosDatosDeMiWorkspace() {
        ProjectValidator.validate();
    }

    @Given("X-Api-Key invalido")
    public void xApiKeyInvalido() {
        BaseService.PARAMS.get().put("api-key",PropertyManager.getProperty("invalid-api-key"));
    }
}
