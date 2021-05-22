package day3.AnimalDog;

import day3.Animal;

public class Dog extends Animal {

//int b=a*4;

    @Override
    protected void voice() {
        int b=a;
       // System.out.println("b=" + b);
        System.out.println("Dog voice");
        super.voice();
    }

    @Override
    protected void eat() {
        System.out.println("Dog eat");
        int d=a*4;
        super.eat();
    }
}
