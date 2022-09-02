package shapes.two_dimensional;

public class Circle implements TwoDimensionalShape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "radius is " + getRadius() + ", so area is "
                + calculateArea() + " and perimeter is " + calculatePerimeter();
    }
}
