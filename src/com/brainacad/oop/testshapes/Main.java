package com.brainacad.oop.testshapes;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        double sumArea = 0.0;
        double sumRectArea = 0.0;
        double sumTriangleArea = 0.0;
        double sumCircleArea = 0.0;

//        // Lab Work 2-7-6
//        Shape shape = new Shape("RED");
//        System.out.println(shape.toString());
//        System.out.println("Shape area is " + shape.calcArea());

        addEmptySpace();

        // Lab Work 2-7-7
        Circle circle = new Circle("GREEN", 10f);
        System.out.println(circle.toString());
        System.out.println("Shape area is: " + circle.calcArea());

        addEmptySpace();

        // Lab Work 2-7-8
        Rectangle rectangle = new Rectangle("RED", 5, 5);
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

        addEmptySpace();

        System.out.println("******************** Lab Work 2-8-2 **********************************");

        for (Shape item : arr) {
            item.draw();
        }

        addEmptySpace();

        System.out.println("******************** Lab Work 2-8-3 **********************************");

        int resultCompare = rectangle.compareTo(new Rectangle("RED", 15, 25));
        if (resultCompare == 1) {
            System.out.println("Compare two different rectangle instances - area rectangle № 1 is more than rectangle № 2");
        }
        if (resultCompare == -1) {
            System.out.println("Compare two different rectangle instances - area rectangle № 1 is less than rectangle № 2");
        } else {
            System.out.println("Compare two different rectangle instances - areas rectangles equally");
        }

        addEmptySpace();

        System.out.println("******************** Lab Work 2-8-4 **********************************");
        Rectangle[] arr2 = {rectangle, new Rectangle("RED", 6, 6), new Rectangle("WHITE", 5, 5), new Rectangle("BLACK", 3, 3),
                new Rectangle("YELLOW", 20, 20), new Rectangle("RED", 10, 10)};

        Arrays.sort(arr2);
        Shape.iterateShapeInArray(arr2);

        addEmptySpace();
        System.out.println("******************** Lab Work 2-10-3 **********************************");

        Shape rectangle1 = Shape.parseShape("Rectangle:RED:10,20");
        if (rectangle1 != null) {
            System.out.println(rectangle1.toString());
        } else {
            System.out.println("Invalid string for create rectangle");
        }

        Shape triangle1 = Shape.parseShape("Triangle:GREEN:9,7,12");
        if (triangle1 != null) {
            System.out.println(triangle1.toString());
        } else {
            System.out.println("Invalid string for create triangle");
        }

        Shape circle1 = Shape.parseShape("Circle:BLACK:10");
        if (circle1 != null) {
            System.out.println(circle1.toString());
        } else {
            System.out.println("Invalid string for create circle");
        }

        addEmptySpace();
        System.out.println("******************** Lab Work 2-10-4 **********************************");
        System.out.println(Shape.parseShapeNew("Rectangle:RED:5,6"));
        System.out.println(Shape.parseShapeNew("Rectangle:RED:10,20"));
        System.out.println(Shape.parseShapeNew("Rectangle:RED:33,44"));

        addEmptySpace();
        System.out.println("******************** Lab Work 2-10-5 **********************************");

        Integer countOfShape = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of objects to create: ");
        if (sc.hasNext()){
            countOfShape = Integer.parseInt(sc.nextLine());
        }

        Shape[] arr3 = new Shape[countOfShape];

        for (int i = 0; i < countOfShape; i++){
            System.out.print("Enter the string for create an object: ");
            sc.hasNext();
            arr3[i] = Shape.parseShapeNew(sc.nextLine());
        }
        sc.close();

        Shape.iterateShapeInArray(arr3);

    }

    public static void addEmptySpace() {
        System.out.println();
    }
}
