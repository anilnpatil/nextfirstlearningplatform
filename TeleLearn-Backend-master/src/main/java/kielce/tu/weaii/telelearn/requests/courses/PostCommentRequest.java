package kielce.tu.weaii.telelearn.requests.courses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Valid
@Getter
@EqualsAndHashCode
public class PostCommentRequest {
    @NotBlank(message = "The comment must contain content.")
    private String content;

    public PostCommentRequest(@JsonProperty(value = "content", required = true) String content) {
        this.content = content;
    }
}
