package shapes.two_dimensional;

import forms.Shape;

public class Semicircle implements Shape {
    private int radius;

    public Semicircle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
