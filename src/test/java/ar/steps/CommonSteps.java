package ar.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import services.BaseService;
import java.util.HashMap;

public class CommonSteps extends PageSteps {

    @Given("se inicializan los parametros")
    public void seInicializanLosParametros() {
        BaseService.PARAMS.set(new HashMap<>());
    }
}
