package shapes.three_dimensional;

public class Cube implements ThreeDimensionalShape {
    private int side;

    public Cube(int side) {
        this.side = side;
    }

    public Cube() {
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 3);
    }

    @Override
    public double calculatePerimeter() {
        return 12 * side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "side is " + side + ", so area is " + calculateArea() +
                " and perimeter is " + calculatePerimeter();
    }
}
