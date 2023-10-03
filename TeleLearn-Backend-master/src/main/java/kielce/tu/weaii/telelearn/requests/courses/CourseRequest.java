package kielce.tu.weaii.telelearn.requests.courses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Validated
@Getter
public class CourseRequest {

    @NotNull(message = "The owner of the course was not provided")
    private Long ownerId;

    @NotBlank(message = "The name field cannot be empty.")
    private String name;

    private String welcomePageHtmlContent;

    @NotNull(message = "It must be specified whether the course is public.")
    private boolean publicCourse;

    @NotNull(message = "It must be specified whether users are accepted automatically.")
    private boolean autoAccept;

    @NotNull(message = "It must be specified whether students can add posts.")
    private boolean studentsAllowedToPost;

    public CourseRequest(@JsonProperty(value = "ownerId", required = true) Long ownerId,
                         @JsonProperty(value = "name", required = true) String name,
                         @JsonProperty(value = "welcomePageHtmlContent") String welcomePageHtmlContent,
                         @JsonProperty(value = "isPublicCourse", required = true) boolean publicCourse,
                         @JsonProperty(value = "isAutoAccept", required = true) boolean autoAccept,
                         @JsonProperty(value = "areStudentsAllowedToPost", required = true) boolean studentsAllowedToPost) {
        this.ownerId = ownerId;
        this.name = name;
        this.welcomePageHtmlContent = welcomePageHtmlContent;
        this.publicCourse = publicCourse;
        this.autoAccept = autoAccept;
        this.studentsAllowedToPost = studentsAllowedToPost;
    }
}
