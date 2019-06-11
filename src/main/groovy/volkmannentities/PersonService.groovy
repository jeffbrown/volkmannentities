package volkmannentities

import grails.gorm.services.Service

@Service(Person)
interface PersonService {

    List<Person> list()

    Person save(Person person)

    Person get(long id)
}
