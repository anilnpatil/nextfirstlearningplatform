package kielce.tu.weaii.telelearn.requests.courses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Valid
@Getter
@EqualsAndHashCode
public class TaskProgressPatchRequest {
    @NotNull(message = "You must provide your student ID.")
    private Long studentId;

    @NotNull(message = "You must enter the percentage of completion.")
    @Min(value = 0, message = "Progress cannot be less than 0.")
    @Max(value = 100, message = "Progress cannot be greater than 100.")
    private Integer progress;

    public TaskProgressPatchRequest(@JsonProperty(value = "studentId", required = true) Long studentId,
                                    @JsonProperty(value = "progress", required = true) Integer progress) {
        this.studentId = studentId;
        this.progress = progress;
    }
}
