package com.company.day1.day5.AnimalAgeName;

import com.company.day1.day5.AnimalAgeName.Animal;
import com.company.day1.day5.AnimalAgeName.Cat;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal(18,"AName");
        Animal animal1=new Cat(19,"Barsik");
        Cat cat=new Cat(20,"barsik2");


     //  animal1.setAge(20);
      //  System.out.println(animal1.getAge());
//        cat.setAge(5);
    //    System.out.println(cat.getName());
      /*  animal.ge;
        animal.getName();
        animal1.getAge();
        animal1.getName();*/
        cat.sound();
        animal.sound();
        animal1.sound();

  //      cat.sound();

    }
}
