package ar.validator;

import api.model.TimeEntries.TimeEntriesResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
import services.BaseService;


public class TimeEntriesValidator extends BaseService {
    public static void validate(){
        TimeEntriesResponse[] response = (TimeEntriesResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].getId(), "El id es nulo");
    }
    public static void validatePutChange(String desc){
        TimeEntriesResponse response = (TimeEntriesResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(response.getDescription(), desc);
    }

    public static void validateDeleteTimeEntry(){
        TimeEntriesResponse[] response = (TimeEntriesResponse[]) APIManager.getLastResponse().getResponse();
        for (int i = 0; i < response.length; i++) {
            Assert.assertNotEquals(response[i].getId(),PARAMS.get().get("Time_Entry_Id"));
        }
    }
}
