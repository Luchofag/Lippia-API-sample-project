package ar.steps;

import api.model.Project.ProjectResponse;
import ar.validator.ProjectValidator;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.ProjectService;

public class ProjectSteps extends PageSteps {
    ProjectValidator validator = new ProjectValidator();
    @Then("se valida que el id no sea null")
    public void seValidaQueElIdNoSeaNull() {
        validator.validate();
    }

    @And("un id_WSpace")
    public void unId_WSpace() {
        ProjectService.ID_W_SPACE.set("614b795a8fc8f836af59328a");
    }

    @Given("un id project de la respuesta")
    public void unIdProjectDeLaRespuesta() {
        ProjectResponse[] idProject = (ProjectResponse[])APIManager.getLastResponse().getResponse();
        ProjectService.ID_PROJECT.set(idProject[1].getId());
    }

    @And("un nombre '(.*)'")
    public void unNombreName(String name) {
        ProjectService.NAME.set(name);
    }

    @And("se valida que el nombre fue editado '(.*)'")
    public void seValidaQueElNombreFueEditadoName(String name) {
        validator.validateNombre(name);
    }
}
