package io.example.first
 
class Person {

    Person(def name, def age){
        this.name = name
        this.age = age
    }

    def personAbout(def name, def age){
        return "Name: ${name}, age: ${age}" 
    }
}

