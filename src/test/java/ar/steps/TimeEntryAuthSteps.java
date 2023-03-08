package ar.steps;

import api.model.TimeEntries.TimeEntriesResponse;
import ar.validator.TimeEntriesValidator;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TimeEntryAuthSteps {
    TimeEntriesValidator validator = new TimeEntriesValidator();

    @Then("Obtengo los datos de mi Time entry")
    public void obtengoLosDatosDeMiTimeEntry() {
        validator.validate();
    }
    @Then("Verifico que el campo descripcion tenga la leyenda '(.+)'")
    public void verificoQueElCampoDescripcionTengaLaLeyendaDescription(String desc) {
        TimeEntriesValidator.validatePutChange(desc);
    }

    @Then("verifico que el time entry id no exista")
    public void verificoQueElTimeEntryIdNoExista() {
        TimeEntriesValidator.validateDeleteTimeEntry();
    }
}
