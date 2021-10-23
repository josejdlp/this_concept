package com.josej;

public class Person {
    public String name;

    public Person(String name) {
        super();
        this.name = name;
        System.out.println("this from Person " +this );
        new Print().printMethod(this);
    }
}
