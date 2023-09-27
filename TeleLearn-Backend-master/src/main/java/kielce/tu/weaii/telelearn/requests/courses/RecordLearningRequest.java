package kielce.tu.weaii.telelearn.requests.courses;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import kielce.tu.weaii.telelearn.requests.TimeSpanRequest;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalTime;

import static kielce.tu.weaii.telelearn.utilities.Constants.TIME_FORMATTER;
import static kielce.tu.weaii.telelearn.utilities.Utils.isStringNullOrEmpty;

@Valid
@Getter
@EqualsAndHashCode
public class RecordLearningRequest {
    private LocalTime startTime;

    @Valid
    @NotNull(message = "You must specify the time.")
    private TimeSpanRequest duration;

    @JsonCreator
    @Valid
    public RecordLearningRequest(@JsonProperty(value = "startTime", required = true) String startTime,
                                 @JsonProperty(value = "duration", required = true) TimeSpanRequest duration) {
        if (isStringNullOrEmpty(startTime)) {
            throw new IllegalArgumentException("You must enter a start time.");
        }
        this.startTime = LocalTime.parse(startTime, TIME_FORMATTER);
        this.duration = duration;
    }
}
