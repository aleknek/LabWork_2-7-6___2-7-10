package com.brainacad.oop.testshapes;

public class Main {

    public static void main(String[] args) {

        double sumArea = 0.0;
        double sumRectArea = 0.0;
        double sumTriangleArea = 0.0;
        double sumCircleArea = 0.0;

        // Lab Work 2-7-6
        Shape shape = new Shape("RED");
        System.out.println(shape.toString());
        System.out.println("Shape area is " + shape.calcArea());

        addEmptySpace();

        // Lab Work 2-7-7
        Circle circle = new Circle("GREEN", 10f);
        System.out.println(circle.toString());
        System.out.println("Shape area is: " + circle.calcArea());

        addEmptySpace();

        // Lab Work 2-7-8
        Rectangle rectangle = new Rectangle("RED", 11, 22);
        System.out.println(rectangle.toString());
        System.out.println("Shape area is: " + rectangle.calcArea());

        addEmptySpace();

        // Lab Work 2-7-9
        Triangle triangle = new Triangle("BLACK", 5, 5, 5);
        System.out.println(triangle.toString());
        System.out.println("Shape area is: " + triangle.calcArea());

        addEmptySpace();

        // Lab Work 2-7-10
        Shape[] arr = {rectangle, new Rectangle("RED", 15, 25), new Rectangle("WHITE", 5, 8), new Rectangle("BLACK", 18, 12),
                new Rectangle("YELLOW", 10, 10), circle, new Circle("WHITE", 15f), triangle, new Triangle("RED", 7, 7, 5)};

        for (Shape item : arr) {
            sumArea = sumArea + item.calcArea();

            if (item instanceof Triangle) {
                sumTriangleArea = sumTriangleArea + item.calcArea();
            } else if (item instanceof Rectangle) {
                sumRectArea = sumRectArea + item.calcArea();
            } else {
                sumCircleArea = sumCircleArea + item.calcArea();
            }
            System.out.println(item.toString() + " area is: " + item.calcArea());
        }

        addEmptySpace();
        System.out.println("Sum all shapes: " + sumArea);
        System.out.println("Rectangles total area: " + sumRectArea);
        System.out.println("Circle total area: " + sumCircleArea);
        System.out.println("Triangle total area: " + sumTriangleArea);
    }

    public static void addEmptySpace() {
        System.out.println();
    }
}
