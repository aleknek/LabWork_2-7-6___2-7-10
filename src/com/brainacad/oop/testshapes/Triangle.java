package com.brainacad.oop.testshapes;

import java.util.StringTokenizer;

public class Triangle extends Shape implements Comparable {

    private double a;
    private double b;
    private double c;

    @Override
    public double calcArea() {
        double s;
        s = ((a + b + c) / 2);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "This is Triangle, color: " + getShapeColor() + ", a=" + a + ", b=" + b + ", c=" + c;
    }

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int compareTo(Object o) {
        Triangle triangle = (Triangle) (o);
        if (this.getArea() > triangle.getArea()) return 1;
        if (this.getArea() < triangle.getArea()) return -1;
        return 0;
    }

    public static Triangle parseTriangle(String str) {
        String[] numericalParameters = parseNumericalParameters(str);
        return new Triangle(parseColor(str), Double.parseDouble(numericalParameters[0]), Double.parseDouble(numericalParameters[1]), Double.parseDouble(numericalParameters[2]));
    }

}
