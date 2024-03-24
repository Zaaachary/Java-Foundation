package com.zrawberry;

public class Demo05Super {
    public static void main(String[] args) {
        Teacher s = new Teacher("Xiao Ming", 12, 89);
    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    protected int score;

    public Teacher(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
}
