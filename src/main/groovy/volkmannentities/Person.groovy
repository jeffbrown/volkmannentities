package volkmannentities

import com.fasterxml.jackson.annotation.JsonIgnore
import grails.gorm.annotation.Entity

@Entity
class Person {
    String name

    @JsonIgnore
    Address homeAddress

    static mapping = {
        homeAddress lazy: false
    }
}
