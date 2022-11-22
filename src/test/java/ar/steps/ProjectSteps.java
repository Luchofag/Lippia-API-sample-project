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

    @And("un workspace y un userId")
    public void addIdWspaceAndUserId(){
        BaseService.addParams("wSpace","63793764211dc7053733b8bd");
        BaseService.addParams("userId","633f5b0b89bf9c24493edfee");
    }
    @And("un workspace y un Time entry Id")
    public void addIdWspaceAndTimeId(){
        BaseService.addParams("wSpace","63793764211dc7053733b8bd");
        BaseService.addParams("Time_Entry_Id","63793cb9f570a5720b63baf6");
    }

    @Given("un id project de la respuesta")
    public void unIdProjectDeLaRespuesta() {
        ProjectResponse[] idProject = (ProjectResponse[])APIManager.getLastResponse().getResponse();
        BaseService.addParams("id_project",idProject[0].getId());
    }
}
