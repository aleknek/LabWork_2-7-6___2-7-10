package com.brainacad.oop.testshapes;


public class Rectangle extends Shape {

    private double width;
    private double height;

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color: " + getShapeColor() + ", width=" + width + ", height=" + height;
    }

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
