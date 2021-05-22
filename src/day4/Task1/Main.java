package day4.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Circle circle=new Circle();
        Square square=new Square();
        System.out.println("input circle radius");
        double radius= scanner.nextDouble();
        circle.getArea(radius);
        circle.getPerimeter(radius);
        System.out.println("input square side");
        double side=scanner.nextDouble();
        square.getArea(side);
        square.getPerimeter(side);


    }
}
