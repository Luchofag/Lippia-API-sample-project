package ar.steps;

import ar.validator.TimeEntriesValidator;
import io.cucumber.java.en.Then;

public class TimeEntryAuthSteps {
    TimeEntriesValidator validator = new TimeEntriesValidator();

    @Then("Obtengo los datos de mi Time entry")
    public void obtengoLosDatosDeMiTimeEntry() {
        validator.validate();
    }
}
