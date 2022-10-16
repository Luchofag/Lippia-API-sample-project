package services;
import api.model.Project.ProjectResponse;
import com.crowdar.api.rest.Response;

public class ProjectsService extends BaseService {
    public static Response get(String jsonName) {
        return get(jsonName, ProjectResponse[].class,PARAMS.get());
    }
}
