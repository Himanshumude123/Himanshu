package com.OOPS.assignments;

public class Initilize_Refrance {
    private String name;
    private int age;

//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public void sayHello(String name, int age) {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        Initilize_Refrance ref1 = new Initilize_Refrance();
        Initilize_Refrance ref2 = ref1; // initialize person2 through reference to person1
        ref2.sayHello("Allice", 18); 
    }
}
