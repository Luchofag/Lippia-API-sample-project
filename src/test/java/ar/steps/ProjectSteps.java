package ar.steps;

import api.model.Project.ProjectResponse;
import api.model.TimeEntries.TimeEntriesResponse;
import ar.validator.ProjectValidator;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;

public class ProjectSteps extends PageSteps {

    ProjectValidator validator = new ProjectValidator();

    @Then("se valida que el id no sea null")
    public void obtengoLosDatosDeMiWorkspace() {
        ProjectValidator.validate();
    }

    @And("un workspaceID '(.+)' y un '(.+)'")
    public void addIdWspaceAndUserId(String wSpaceId, String userId){
        BaseService.addParams("wSpace",wSpaceId);
        BaseService.addParams("userId",userId);
    }
    @And("un workspaceID y un Time entry Id")
    public void addIdWspaceAndTimeId(){
        BaseService.addParams("wSpace","63793764211dc7053733b8bd");
        BaseService.addParams("Time_Entry_Id","63793cb9f570a5720b63baf6");
    }

    @Given("un id project de la respuesta")
    public void unIdProjectDeLaRespuesta() {
        ProjectResponse[] idProject = (ProjectResponse[])APIManager.getLastResponse().getResponse();
        BaseService.addParams("id_project",idProject[0].getId());
    }
    @And("un workspaceID '(.+)'")
    public void unWorkspaceID(String wspaceid) {
        BaseService.addParams("wSpace",wspaceid);
    }

    @And("Guardo el id del time entry generado")
    public void guardoElIdDelTimeEntryGenerado() {
        TimeEntriesResponse response = (TimeEntriesResponse) APIManager.getLastResponse().getResponse();
        BaseService.addParams("Time_Entry_Id",response.getId());
    }

    @And("Asigno la nueva '(.+)' del time entry")
    public void asignoLaNuevaDescripcionDelTimeEntry(String description) {
        BaseService.addParams("Description",description);
    }
}
