package ar.steps;

import ar.validator.ProjectValidator;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;

public class ProjectUnAuthSteps extends PageSteps {

    @Given("Mi cuenta en clockify y mi X-Api-Key geneada")
    public void miCuentaCreadaEnClockifyYMiXApiKeyGeneada() {
        BaseService.PARAMS.get().put("api-key","NzE0ZTA0YTYtNmZhNi00ZDM2LTkyZjEtMDAzNWY4N2QzMTFl");
    }

    @Then("Obtengo los datos de mi Workspace")
    public void obtengoLosDatosDeMiWorkspace() {
        ProjectValidator.validate();
    }

    @Given("X-Api-Key invalido")
    public void xApiKeyInvalido() {
        BaseService.PARAMS.get().put("api-key","NzE0ZTA0YTYtNmZhNi00ZDM2LTkyZjEtMDAzNWY4N2QzMTFl123");
    }
}
