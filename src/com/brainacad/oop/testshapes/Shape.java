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

    public String getShapeColor() {
        return shapeColor;
    }

    public double getArea() {
        return area;
    }

    public static String parseColor(String str){
        return  str.substring(0, str.indexOf(":"));
    }

    public static String[] parseNumericalParameters(String str){

        StringTokenizer stringTokenizer = new StringTokenizer(str.substring(str.lastIndexOf(":") + 1, str.length()), ",");

        String[] numericalParameters = new String[stringTokenizer.countTokens()];

        int counter = 0;
        while (stringTokenizer.hasMoreElements()) {
            numericalParameters[counter] = String.valueOf(stringTokenizer.nextElement());
            counter = counter + 1;
        }
        return numericalParameters;
    }

    public static void iterateShapeInArray(Shape arr[]){
        for (Shape item : arr) {
            System.out.println(item.toString() + " area is: " + item.calcArea());
        }
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    // Lab Work 2-10-3
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

    // Lab Work 2-10-4
    public static Shape parseShapeNew(String str) {

        String typeObject = str.substring(0, str.indexOf(":"));
        String stringForParse = str.substring(str.indexOf(":")+1, str.length());

        if (typeObject.equals("Rectangle")) {
            return Rectangle.parseRectangle(stringForParse);
        }
        if (typeObject.equals("Triangle")) {
            return Triangle.parseTriangle(stringForParse);
        }
        if (typeObject.equals("Circle")) {
            return Circle.parseCircle(stringForParse);
        }

        return null;
    }
}
