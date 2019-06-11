package volkmannentities

import grails.gorm.annotation.Entity

@Entity
class Person {
    String name
    Address homeAddress

    static mapping = {
        homeAddress lazy: false
    }
}
