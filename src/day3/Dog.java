package day3;

public class Dog extends Animal {
    @Override
    protected void eat() {
        int b=a;
        System.out.println("b="+a*10);
        System.out.println("dog eat");
        super.eat();
    }

    @Override
    protected void voice() {
      //  super.voice();
        System.out.println("dog voice");

    }
}
