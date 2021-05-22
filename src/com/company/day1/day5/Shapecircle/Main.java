package com.company.day1.day5.Shapecircle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(6);
        shapes[1]=new Rectangle(2,6);
        shapes[2]=new Square(5);
        System.out.println(shapes[0].square());
        System.out.println(shapes[0].perimeter());
        System.out.println(shapes[1].square());
        System.out.println(shapes[1].perimeter());
        System.out.println(shapes[2].square());
        System.out.println(shapes[2].perimeter());
    }
}
