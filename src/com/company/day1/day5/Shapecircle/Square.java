package com.company.day1.day5.Shapecircle;

public class Square implements  Shape{
   int side;
    public Square(int side) {
this.side=side;
    }

    @Override
    public double square() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }
}
