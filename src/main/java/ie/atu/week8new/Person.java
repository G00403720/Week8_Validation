package ie.atu.week8new;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;
public class Person {

    @NotBlank
    private String name;
    @NotBlank
    private String title;
    @NotBlank
    private String employeeId;
    @NotBlank
    private String age;
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String position;
    @NotBlank
    private String department;
}
