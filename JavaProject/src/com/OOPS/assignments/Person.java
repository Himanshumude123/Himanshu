package com.OOPS.assignments;

public class Person {
    private String name;
    private int age;

    public void sayHello(String name, int age) {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello("Ankit", 20);
    }
}

