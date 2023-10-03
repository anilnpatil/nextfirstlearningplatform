package kielce.tu.weaii.telelearn.requests.courses;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Valid
public class TaskRequest {
    @NotBlank(message = "No task name provided.")
    private String name;

    private String description;

    @Min(value = 0, message = "The value of hours cannot be negative.")
    private int learningTimeHours;

    @Min(value = 0, message = "The minutes value cannot be negative.")
    @Max(value = 60, message = "The minutes value cannot be greater than 60.")
    private int learningTimeMinutes;

    @NotNull(message = "No end date was given for the task.")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;

    @NotNull(message = "No path provided.")
    private Long courseId;

    private List<Long> attachmentIdsToDelete = new ArrayList<>();

    private List<Long> previousTaskIds = new ArrayList<>();
}
