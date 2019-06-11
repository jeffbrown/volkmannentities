package volkmannentities

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller('/people')
class PersonController {

    private final PersonService personService

    PersonController(PersonService personService) {
        this.personService = personService
    }

    @Get('/')
    List<Person> index() {
        personService.list()
    }

    @Get('/{id}')
    Person get(long id) {
        personService.get id
    }
}
