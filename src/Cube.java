public class Cube extends Square {
    public Cube(int side) {
        super(side);
    }

    public Cube() {
    }

    @Override
    public String figureName() {
        return "Cube";
    }

    @Override
    public double calculateArea() {
        return Math.pow(super.side, 3);
    }

    @Override
    public double calculatePerimeter() {
        return 12 * super.side;
    }
}
