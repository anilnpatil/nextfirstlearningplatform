package kielce.tu.weaii.telelearn.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Validated
@Getter
@EqualsAndHashCode
public class StudentRegisterRequest {
    @NotBlank(message = "Login cannot be empty")
    private String username;
    @NotNull(message = "The password cannot be empty")
    private char[] password;
    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Please enter a valid email address")
    private String email;
    @NotBlank(message = "The first name cannot be empty")
    private String name;
    @NotBlank(message = "The last name cannot be empty")
    private String surname;
    private String unit;

    public StudentRegisterRequest(@JsonProperty(value = "username") String username,
                                  @JsonProperty(value = "password") char[] password,
                                  @JsonProperty(value = "email") String email,
                                  @JsonProperty(value = "name") String name,
                                  @JsonProperty(value = "surname") String surname,
                                  @JsonProperty(value = "unit", defaultValue = "null") String unit) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.unit = unit;
    }
}
