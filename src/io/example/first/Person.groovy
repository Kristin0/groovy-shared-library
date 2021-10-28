package io.example.first
 
class Person {

    String name
    Integer age

    Person(String name, Integer age){
        this.name = name
        this.age = age
    }

    def personAbout(){
        return "Name: ${name}, age: ${age}" 
    }
}

