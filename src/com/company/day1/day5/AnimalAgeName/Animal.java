package com.company.day1.day5.AnimalAgeName;

public class Animal {
    private   int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void sound()
    {

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
