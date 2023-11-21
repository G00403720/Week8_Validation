package ie.atu.week8new;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/{employeeId}")
    public Person getPerson(@PathVariable String employeeId){
        if (employeeId.length() > 5 || employeeId.isBlank()){
            return Person();
        }
    }

    Person person = personService.getPersonByEmployeeId(employeeId);

    if(person == null){
       return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(person)
}
