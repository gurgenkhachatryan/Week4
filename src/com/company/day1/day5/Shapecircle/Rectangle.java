package com.company.day1.day5.Shapecircle;

public class Rectangle implements  Shape{
    int x,y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double square() {
        return x*y;
    }

    @Override
    public double perimeter() {
        return 2*x+2*y;
    }
}
