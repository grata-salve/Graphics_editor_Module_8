package shapes.three_dimensional;

import forms.ThreeDimensionalShape;

public class Sphere implements ThreeDimensionalShape {
    int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public Sphere() {
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculatePerimeter() {
        return (4 * 3) * Math.PI * Math.pow(radius, 3);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
