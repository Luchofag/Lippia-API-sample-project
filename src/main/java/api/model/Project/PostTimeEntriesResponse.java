package api.model.Project;


import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Setter @Getter
public class PostTimeEntriesResponse {

    private boolean billable;
    private String description;
    private String id;
    private boolean isLocked;
    private String projectId;
    private String taskId;

    private String userId;
    private String workspaceId;

}
