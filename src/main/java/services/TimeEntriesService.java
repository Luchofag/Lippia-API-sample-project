package services;

import api.model.TimeEntries.TimeEntriesResponse;
import com.crowdar.api.rest.Response;

public class TimeEntriesService extends BaseService {
    public static Response get(String jsonName) {
        return get(jsonName, TimeEntriesResponse[].class,PARAMS.get());
    }
    public static Response post(String jsonName) {
        return post(jsonName, TimeEntriesResponse.class,PARAMS.get());
    }
    public static Response put(String jsonName) {
        return put(jsonName, TimeEntriesResponse.class,PARAMS.get());
    }
    public static Response delete(String jsonName) {
        return delete(jsonName, TimeEntriesResponse.class,PARAMS.get());
    }
}