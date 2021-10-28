package io.example.first
 
class Person {

    String name
    Integer age

    Person(String name, Integer age){
        this.name = name
        this.age = age
    }

    def personAbout(def name, def age){
        return "Name: ${name}, age: ${age}" 
    }
}

