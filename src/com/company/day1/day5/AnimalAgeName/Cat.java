package com.company.day1.day5.AnimalAgeName;

import com.company.day1.day5.AnimalAgeName.Animal;

public class Cat extends Animal {
    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    void sound() {
      //  super.sound();
        System.out.println("cat " + getAge() + "   name=" + getName());
    }


}
