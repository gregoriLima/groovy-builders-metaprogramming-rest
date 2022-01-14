package features

// Classes and Methods in groovy are public by default
// Properties by default are private in groovy
// Classes do not need to have same name o file

@groovy.transform.ToString
class Developer {
    String firstName
    String lastName
    def age

    void work(){
        println "$firstName $lastName is working"
    }
}

class SecondClass{
}

class OtherClass{
}
// Groovy will create one new file for each class here

Developer d = new Developer()
d.setFirstName("Greg")
d.lastName = "Lima"
d.setAge(36)

d.work()
println d

