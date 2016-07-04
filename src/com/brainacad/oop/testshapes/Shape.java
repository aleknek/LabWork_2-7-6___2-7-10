package com.brainacad.oop.testshapes;

public class Shape {

    private String shapeColor;
    double area;

    public double calcArea() {
        return 0.0;
    }

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
}
