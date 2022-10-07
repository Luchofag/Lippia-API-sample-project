package ar.steps;

import ar.validator.ProjectValidator;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;

public class ProjectSteps extends PageSteps {
    ProjectValidator validator = new ProjectValidator();
    @Then("se valida que el id no sea null")
    public void seValidaQueElIdNoSeaNull() {
        validator.validate();
    }
}
