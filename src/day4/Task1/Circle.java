package day4.Task1;

public class Circle extends Shape {
    @Override
    protected void getArea(double radius) {
        double circle;
        circle=2*radius*radius*Math.PI;
        System.out.println("circleGetArea=" + circle);
    }

    @Override
    protected void getPerimeter(double radius) {
double perimeter;
perimeter=2*Math.PI*radius;
        System.out.println("circleGetPerimeter="+perimeter);
    }


}
