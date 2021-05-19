package day3.Animal.Animal1;

import day3.Animal.Animal1.Animal;

public class Dog extends Animal {
    @Override
    protected void eat() {
        int b;
        System.out.println("a=");

   // protected void eat(){

        System.out.println("dog eat");
        super.eat();
    }

    @Override
    protected void voice() {
      //  super.voice();
        System.out.println("dog voice");

    }
}
