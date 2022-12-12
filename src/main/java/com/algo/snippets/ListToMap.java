package com.algo.snippets;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("shiva", 12,"AA"),new Person("krishna", 12, "BB"),new Person("ram", 12, "BB"));

        persons.stream()
                .collect(Collectors.groupingBy(Person::getDept));
    }
}
 class Person {

    private String name;
    private int age;
    private String dept;

     public Person(String name, int age, String dept) {
         this.name = name;
         this.age = age;
         this.dept = dept;
     }

     public String getName() {
         return name;
     }

     public Person setName(String name) {
         this.name = name;
         return this;
     }

     public int getAge() {
         return age;
     }

     public Person setAge(int age) {
         this.age = age;
         return this;
     }

     public String getDept() {
         return dept;
     }

     public Person setDept(String dept) {
         this.dept = dept;
         return this;
     }
 }