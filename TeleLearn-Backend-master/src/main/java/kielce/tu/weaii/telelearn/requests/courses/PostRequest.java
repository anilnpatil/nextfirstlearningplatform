package kielce.tu.weaii.telelearn.requests.courses;

import kielce.tu.weaii.telelearn.models.courses.PostVisibility;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Valid
@Data
public class PostRequest {
    @NotNull(message = "No course ID provided.")
    private Long courseId;
    @NotBlank(message = "The post must have content")
    private String content;
    @NotNull(message = "Post visibility not specified.")
    private PostVisibility postVisibility;
    @NotNull(message = "No comments allowed.")
    private boolean commentingAllowed;
    private List<Long> attachmentIdsToDelete = new ArrayList<>();
}
