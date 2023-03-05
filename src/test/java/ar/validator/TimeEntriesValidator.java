package ar.validator;

import api.model.TimeEntries.TimeEntriesResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class TimeEntriesValidator {
    public static void validate(){
        TimeEntriesResponse[] response = (TimeEntriesResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].getId(), "El id es nulo");
    }
}
