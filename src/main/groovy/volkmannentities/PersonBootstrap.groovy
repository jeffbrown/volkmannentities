package volkmannentities

import io.micronaut.runtime.event.annotation.EventListener
import io.micronaut.runtime.server.event.ServerStartupEvent

class PersonBootstrap {

    private final PersonService personService

    PersonBootstrap(PersonService personService) {
        this.personService = personService
    }

    @EventListener
    void saveData(ServerStartupEvent evt) {
        Address stCharles = new Address(town: 'St. Charles')
        Address ofallon = new Address(town: 'OFallon')

        personService.save new Person(name: 'Jeff', homeAddress: ofallon)
        personService.save new Person(name: 'Mark', homeAddress: stCharles)
    }
}
