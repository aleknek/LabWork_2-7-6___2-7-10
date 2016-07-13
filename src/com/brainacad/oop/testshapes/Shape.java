package com.brainacad.oop.testshapes;

import java.util.StringTokenizer;

public abstract class Shape implements Drawable {

    private String shapeColor;
    double area;

    public abstract double calcArea();

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "Shape, color is " + shapeColor;
    }

    public Shape() {
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    public static Shape parseShape(String str) {

        StringTokenizer stringTokenizer1 = new StringTokenizer(str, ":");
        StringTokenizer stringTokenizer2 = new StringTokenizer(str.substring(str.lastIndexOf(":") + 1, str.length()), ",");

        String[] parametersOfIncomingLine = new String[stringTokenizer1.countTokens()];
        String[] numericalParameters = new String[stringTokenizer2.countTokens()];

        int counter1 = 0;
        while (stringTokenizer1.hasMoreElements()) {
            parametersOfIncomingLine[counter1] = String.valueOf(stringTokenizer1.nextElement());
            counter1 = counter1 + 1;
        }

        int counter2 = 0;
        while (stringTokenizer2.hasMoreElements()) {
            numericalParameters[counter2] = String.valueOf(stringTokenizer2.nextElement());
            counter2 = counter2 + 1;
        }

        String typeObject = parametersOfIncomingLine[0];

        if (typeObject.equals("Rectangle")) {
            return new Rectangle(parametersOfIncomingLine[1],
                    Double.valueOf(numericalParameters[0]), Double.valueOf(numericalParameters[1]));
        }
        if (typeObject.equals("Triangle")) {
            return new Triangle(parametersOfIncomingLine[1],
                    Double.valueOf(numericalParameters[0]), Double.valueOf(numericalParameters[1]), Double.valueOf(numericalParameters[2]));
        }
        if (typeObject.equals("Circle")) {
            return new Circle(parametersOfIncomingLine[1], Double.valueOf(numericalParameters[0]));
        }

        return null;

    }
}
