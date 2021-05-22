package day4.Task1;

public class Square extends Shape {
    @Override
    protected void getArea(double radius) {
double squareGetArea;
squareGetArea=Math.pow(radius,2);
        System.out.println("squareGetArea=" + squareGetArea);
    }

    @Override
    protected void getPerimeter(double radius) {
double squareGetPerimeter;
squareGetPerimeter=4*radius;
        System.out.println("squareGetPerimeter=" + squareGetPerimeter);

    }
}
