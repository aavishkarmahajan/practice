package com.scaler.SampleDemo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    String name;
    int age;
    String message;

    public Person(String name, int age, String message) {
        this.name = name;
        this.age = age;
        this.message = message;
    }
}
