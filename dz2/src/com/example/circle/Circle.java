package com.example.circle;

public class Circle {
    protected double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("cant be lower than 0");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("cant be lower than 0");
        }
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * 2 * Math.PI;
    }


}
