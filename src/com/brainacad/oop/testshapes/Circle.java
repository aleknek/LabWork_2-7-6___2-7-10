package com.brainacad.oop.testshapes;

public class Circle extends Shape implements Comparable{

    private double radius;

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "This is Circle, color: " + getShapeColor() + " radius=" + radius;
    }

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle)(o);
        if (this.getArea() > circle.getArea()) return 1;
        if (this.getArea() < circle.getArea()) return -1;
        return 0;
       }

    public static Circle parseCircle(String str) {
        String[] numericalParameters = parseNumericalParameters(str);
        return new Circle(parseColor(str), Double.parseDouble(numericalParameters[0]));
    }
}
