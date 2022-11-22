package api.model.Project;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class TimeEntriesResponse {

    private String id;
    private String description;
    private String tagIds;
    private String userId;
    private boolean billable;
    private String taskId;
    private String projectId;
    private String workspaceId;
    private String isLocked;
    private String custom;
}