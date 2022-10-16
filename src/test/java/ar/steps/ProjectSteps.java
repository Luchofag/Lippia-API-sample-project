package ar.steps;

import api.model.Project.ProjectResponse;
import ar.validator.ProjectValidator;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;
import services.ProjectService;

public class ProjectSteps extends PageSteps {

    ProjectValidator validator = new ProjectValidator();

    @Then("se valida que el id no sea null")
    public void obtengoLosDatosDeMiWorkspace() {
        ProjectValidator.validate();
    }

    @And("un id_WSpace")
    public void unId_wSpace(){
        BaseService.addParams("wSpace","633f5b0b89bf9c24493edfef");
    }

    @Given("un id project de la respuesta")
    public void unIdProjectDeLaRespuesta() {
        ProjectResponse[] idProject = (ProjectResponse[])APIManager.getLastResponse().getResponse();
        BaseService.addParams("id_project",idProject[0].getId());
    }
}
