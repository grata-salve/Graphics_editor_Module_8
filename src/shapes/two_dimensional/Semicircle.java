package shapes.two_dimensional;

public class Semicircle implements TwoDimensionalShape {
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
