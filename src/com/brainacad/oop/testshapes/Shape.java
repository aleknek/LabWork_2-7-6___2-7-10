package com.brainacad.oop.testshapes;

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
}
